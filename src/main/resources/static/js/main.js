$("#mainForm").submit(function() {
	
	var minTotalRate = $("#minTotalRate").val();
	var maxTotalRate = $("#maxTotalRate").val();

	var minGuestRating = $("#minGuestRating").val();
	var maxGuestRating = $("#maxGuestRating").val();

	var minStarRating = $("#minStarRating").val();
	var maxStarRating = $("#maxStarRating").val();

    var minTripStartDate = $("#minTripStartDate").val();
    var maxTripStartDate = $("#maxTripStartDate").val();
	
    
	if (minStarRating && maxStarRating) {
		if (minStarRating > maxStarRating) {
			alert("maxStarRating should be greater than minStarRating");
			return false;
		}
	}

	if (minTotalRate  && maxTotalRate) {
		if (minTotalRate > maxTotalRate) {
			alert("maxTotalRate should be greater than minTotalRate");
			return false;
		}
	}

	if (minGuestRating && maxGuestRating) {
		if (minGuestRating > maxGuestRating) {
			alert("maxGuestRating should be greater than minGuestRating");
			return false;
		}
	}
	
	if(minTripStartDate  && maxTripStartDate){
		if(Date.parse(minTripStartDate) > Date.parse(maxTripStartDate)){
			alert("maxTripStartDate should be greater than minTripStartDate");
			return false;
		}
    }
	return true;
});

function isEmpty(value){
	  return (value == null || value.length === 0);
}


$('#destinationName').on(
		'keypress',
		function(event) {
			var regex = new RegExp("^[0-9a-zA-Z_ \b]+$");
			var key = String.fromCharCode(!event.charCode ? event.which
					: event.charCode);
			if (!regex.test(key)) {
				event.preventDefault();
				return false;
			}
});
$('#destinationCity').on(
		'keypress',
		function(event) {
			var regex = new RegExp("^[0-9a-zA-Z_ \b]+$");
			var key = String.fromCharCode(!event.charCode ? event.which
					: event.charCode);
			if (!regex.test(key)) {
				event.preventDefault();
				return false;
			}
});


$("#btnClear").click(function(){
	$('#mainForm').trigger("reset");
});


function openHotelSite(url){
	window.open(decodeURIComponent(url));
}