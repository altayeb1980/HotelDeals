$("#mainForm").submit(function() {
	
	var minTotalRate = $("#minTotalRate").val();
	var maxTotalRate = $("#maxTotalRate").val();

	var minGuestRating = $("#minGuestRating").val();
	var maxGuestRating = $("#maxGuestRating").val();

	var minStarRating = $("#minStarRating").val();
	var maxStarRating = $("#maxStarRating").val();

    var minTripStartDate = $("#minTripStartDate").val();
    var maxTripStartDate = $("#maxTripStartDate").val();
	
	if (minStarRating != null && maxStarRating != null) {
		if (minStarRating > maxStarRating) {
			alert("maxStarRating should be greater than minStarRating");
			return false;
		}
	}

	if (minTotalRate != null && maxTotalRate != null) {
		if (minTotalRate > maxTotalRate) {
			alert("maxTotalRate should be greater than minTotalRate");
			return false;
		}
	}

	if (minGuestRating != null && maxGuestRating != null) {
		if (minGuestRating > maxGuestRating) {
			alert("maxGuestRating should be greater than minGuestRating");
			return false;
		}
	}
	
	if(minTripStartDate != null && maxTripStartDate != null){
		if(Date.parse(minTripStartDate) > Date.parse(maxTripStartDate)){
			alert("maxTripStartDate should be greater than minTripStartDate");
			return false;
		}
    }
	return true;
});

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
