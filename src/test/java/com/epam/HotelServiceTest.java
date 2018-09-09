package com.epam;

import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLEncoder;
import java.text.FieldPosition;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.epam.model.Destination;
import com.epam.model.Hotel;
import com.epam.model.HotelDeal;
import com.epam.model.HotelInfo;
import com.epam.model.HotelPricingInfo;
import com.epam.model.HotelUrls;
import com.epam.model.OfferDateRange;
import com.epam.model.OfferInfo;
import com.epam.model.Offers;
import com.epam.model.Persona;
import com.epam.model.SearchCriteria;
import com.epam.model.UserInfo;
import com.epam.service.DefaultHotelService;
import com.epam.service.HotelService;

@RunWith(MockitoJUnitRunner.class)
public class HotelServiceTest {

	private static final String ENDPOINT_URL = "https://offersvc.expedia.com/offers/v2/getOffers?scenario=deal-finder&page=foo&uid=foo&productType=Hotel";

	@Mock
	private HotelService hotelService;

	@Mock
	private RestTemplate restTemplate;

	@Mock
	private SimpleDateFormat formatter;

	@InjectMocks
	private DefaultHotelService defaultHotelService;

	@Before
	public void setup() {
		defaultHotelService.setHotelDealsUrl(ENDPOINT_URL);
		Mockito.when(formatter.format(Mockito.any(Date.class), Mockito.any(StringBuffer.class),
				Mockito.any(FieldPosition.class))).thenReturn(new StringBuffer("2017-02-06"));
	}
	
	
	@Test
	public void testUriWithCorrectParam() throws UnsupportedEncodingException {
		SearchCriteria searchCriteria = new SearchCriteria();
		searchCriteria.setDestinationName("wadi_rum");
		searchCriteria.setLengthOfStay("1");
		searchCriteria.setMinTripStartDate(new Date());
		String actualUriWithParam = defaultHotelService.buildUriWithNeededParams(searchCriteria);
		String expectedUriWithParam = new StringBuilder(ENDPOINT_URL).append("&destinationName="+searchCriteria.getDestinationName()).append("&lengthOfStay="+searchCriteria.getLengthOfStay()).append("&minTripStartDate="+formatter.format(searchCriteria.getMinTripStartDate())).toString();
		Assert.assertEquals(expectedUriWithParam, actualUriWithParam);
	}
	

//	@Test
//	public void testWhenNoSearchCriteria() {
//		HotelDeal hotelDeal = buildHotelDeal();
//		Mockito.when(restTemplate.getForObject(Mockito.anyString(), Mockito.any())).thenReturn(hotelDeal);
//		HotelDeal expectedHotelDeal = defaultHotelService.findAll();
//		UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(ENDPOINT_URL);
//		Mockito.verify(restTemplate).getForObject(builder.toUriString(), HotelDeal.class);
//		Assert.assertEquals(1, expectedHotelDeal.getOffers().getHotel().size());
//		Assert.assertEquals("26811791", expectedHotelDeal.getOffers().getHotel().get(0).getHotelInfo().getHotelId());
//	}

	@Test
	public void testWhenMinTripStartDateInSearchCriteria() {
		SearchCriteria searchCriteria = new SearchCriteria();
		searchCriteria.setMinTripStartDate(new Date());
		HotelDeal hotelDeal = buildHotelDeal();

		String uriWithParam = defaultHotelService.buildUriWithNeededParams(searchCriteria);

		Mockito.when(restTemplate.getForObject(Mockito.anyString(), Mockito.any())).thenReturn(hotelDeal);

		HotelDeal expectedHotelDeal = defaultHotelService.findByCriteria(searchCriteria);
		Mockito.verify(restTemplate).getForObject(uriWithParam, HotelDeal.class);

		Assert.assertEquals(1, expectedHotelDeal.getOffers().getHotel().size());
		Assert.assertEquals("26811791", expectedHotelDeal.getOffers().getHotel().get(0).getHotelInfo().getHotelId());
	}

	@Test
	public void testWhenDestinationNameInSearchCriteria() {
		SearchCriteria searchCriteria = new SearchCriteria();
		searchCriteria.setDestinationName("Wadi Rum");
		HotelDeal hotelDeal = buildHotelDeal();

		String uriWithParam = defaultHotelService.buildUriWithNeededParams(searchCriteria);

		Mockito.when(restTemplate.getForObject(Mockito.anyString(), Mockito.any())).thenReturn(hotelDeal);

		HotelDeal expectedHotelDeal = defaultHotelService.findByCriteria(searchCriteria);
		Mockito.verify(restTemplate).getForObject(uriWithParam, HotelDeal.class);

		Assert.assertEquals(1, expectedHotelDeal.getOffers().getHotel().size());
		Assert.assertEquals("Wadi Rum",
				expectedHotelDeal.getOffers().getHotel().get(0).getDestination().getShortName());
	}

	@Test
	public void testWhenLengthOfStayInSearchCriteria() {
		SearchCriteria searchCriteria = new SearchCriteria();
		searchCriteria.setLengthOfStay("2");
		HotelDeal hotelDeal = buildHotelDeal();

		String uriWithParam = defaultHotelService.buildUriWithNeededParams(searchCriteria);

		Mockito.when(restTemplate.getForObject(Mockito.anyString(), Mockito.any())).thenReturn(hotelDeal);

		HotelDeal expectedHotelDeal = defaultHotelService.findByCriteria(searchCriteria);
		Mockito.verify(restTemplate).getForObject(uriWithParam, HotelDeal.class);

		Assert.assertEquals(1, expectedHotelDeal.getOffers().getHotel().size());
		Assert.assertEquals("2",
				String.valueOf(expectedHotelDeal.getOffers().getHotel().get(0).getOfferDateRange().getLengthOfStay()));
	}

	private HotelDeal buildHotelDeal() {
		HotelDeal hotelDeal = new HotelDeal();
		OfferInfo offerInfo = buildOfferInfo();
		hotelDeal.setOfferInfo(offerInfo);
		UserInfo userInfo = buildUserInfo();
		Persona persona = new Persona();
		persona.setPersonaType("OTHERS");
		userInfo.setPersona(persona);
		hotelDeal.setUserInfo(userInfo);

		Offers offers = new Offers();
		Hotel hotel = new Hotel();
		hotel.setDestination(buildDestination());
		hotel.setHotelInfo(buildHotelInfo());
		hotel.setHotelPricingInfo(buildHotelPricingInfo());
		hotel.setOfferDateRange(buildOfferDateRange());
		hotel.setHotelUrls(buildHotelUrls());
		offers.setHotel(Arrays.asList(hotel));
		hotelDeal.setOffers(offers);
		return hotelDeal;
	}

	private UserInfo buildUserInfo() {
		UserInfo userInfo = new UserInfo();
		userInfo.setUserId("foo");
		return userInfo;
	}

	private OfferInfo buildOfferInfo() {
		OfferInfo offerInfo = new OfferInfo();
		offerInfo.setCurrency("USD");
		offerInfo.setLanguage("en_US");
		offerInfo.setSiteID("1");
		offerInfo.setUserSelectedCurrency("USD");
		return offerInfo;
	}

	private OfferDateRange buildOfferDateRange() {
		OfferDateRange offerDateRange = new OfferDateRange();
		offerDateRange.setLengthOfStay(2);
		offerDateRange.setTravelEndDate(Arrays.asList(2018, 9, 8));
		offerDateRange.setTravelStartDate(Arrays.asList(2018, 9, 7));
		return offerDateRange;
	}

	private HotelUrls buildHotelUrls() {
		HotelUrls hotelUrls = new HotelUrls();
		hotelUrls.setHotelInfositeUrl(
				"https%3A%2F%2Fwww.expedia.com%2Fgo%2Fhotel%2Finfo%2F26811791%2F2018-09-07%2F2018-09-08");
		hotelUrls.setHotelSearchResultUrl(
				"https%3A%2F%2Fwww.expedia.com%2Fgo%2Fhotel%2Fsearch%2FDestination%2F2018-09-07%2F2018-09-08%3FSearchType%3DDestination%26CityName%3DWadi+Rum%26RegionId%3D6126616%26Selected%3D26811791");
		return hotelUrls;
	}

	private HotelPricingInfo buildHotelPricingInfo() {
		HotelPricingInfo hotelPricingInfo = new HotelPricingInfo();
		hotelPricingInfo.setAveragePriceValue(Double.parseDouble("12.75"));
		hotelPricingInfo.setCrossOutPriceValue(Double.parseDouble("18.22"));
		hotelPricingInfo.setCurrency("USD");
		hotelPricingInfo.setDrr(false);
		hotelPricingInfo.setOriginalPricePerNight(Double.parseDouble("18.22"));
		hotelPricingInfo.setPercentSavings(Double.parseDouble("30.02"));
		hotelPricingInfo.setTotalPriceValue(Double.parseDouble("12.75"));
		return hotelPricingInfo;
	}

	private HotelInfo buildHotelInfo() {
		HotelInfo hotelInfo = new HotelInfo();

		hotelInfo.setHotelCity("Wadi Rum");
		hotelInfo.setHotelCountryCode("JOR");
		hotelInfo.setHotelDestination("Wadi Rum");
		hotelInfo.setHotelDestinationRegionID("6126616");
		hotelInfo.setHotelGuestReviewRating(Double.valueOf("0.0"));
		hotelInfo.setHotelId("26811791");
		hotelInfo.setHotelImageUrl(
				"https://images.trvl-media.com/hotels/27000000/26820000/26811800/26811791/e2bbafc4_t.jpg");
		hotelInfo.setHotelLatitude(Double.valueOf("29.53467"));
		hotelInfo.setHotelLongDestination("Wadi Rum,Governorate of Aqaba,JOR");
		hotelInfo.setHotelName("Salem Desert Camp");
		hotelInfo.setHotelProvince("Governorate of Aqaba");
		hotelInfo.setHotelReviewTotal(Integer.parseInt("0"));
		hotelInfo.setHotelReviewTotal(Integer.parseInt("0"));
		hotelInfo.setHotelStarRating("1.0");
		hotelInfo.setHotelStreetAddress("Wadi Rum protected area");
		hotelInfo.setIsOfficialRating(false);
		hotelInfo.setLocalizedHotelName("Salem Desert Camp ");
		hotelInfo.setVipAccess(false);
		return hotelInfo;

	}

	private Destination buildDestination() {
		Destination destination = new Destination();
		destination.setAssociatedMultiCityRegionId("6126616");
		destination.setCity("Wadi Rum");
		destination.setCountry("Jordan");
		destination.setLongName("Wadi Rum, Jordan");
		destination.setNonLocalizedCity("Wadi Rum");
		destination.setProvince("Aqaba Governorate");
		destination.setRegionID("6126616");
		destination.setShortName("Wadi Rum");
		destination.setTla("AQJ");
		return destination;
	}

}
