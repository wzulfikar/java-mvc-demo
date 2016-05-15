var DATE_FORMAT = 'DD, dd MM yy';
(function($){
	
	$( ".default-datepicker" ).datepicker({
		minDate:0,
		dateFormat: DATE_FORMAT,
		changeMonth: true,
		minDate: 0,
	});

	$('.bs-datepicker').datepicker({
	  autoclose: true
	});

	$(".default-start-datepicker").datepicker({ 
	  dateFormat: DATE_FORMAT,
	  changeMonth: true,
	  minDate: 0,
	  maxDate: '+6m',
	  onSelect: function(date){
			var datepickerFor = $(this).data('datepickerFor'),
			$endDatepicker    = $('.default-end-datepicker[data-datepicker-for="' + datepickerFor + '"]'),
			selectedDate      = new Date(date),
			msecsInADay       = 86400000,
			endDate           = new Date(selectedDate.getTime() + (msecsInADay * 0)),
			selectedEndDate   = $endDatepicker.val();
			
	    $endDatepicker.datepicker( "option", "minDate", endDate );
	    $endDatepicker.datepicker( "option", "maxDate", '+6m' );
	  }
	});

	$(".default-end-datepicker").datepicker({ 
	  dateFormat: DATE_FORMAT,
	  changeMonth: true,
	  minDate: 0,
	});

	$(document).on('show.bs.modal', function(){
	  $('.default-datepicker').datepicker({ minDate:0});
	});

	$(document).ajaxStart(function() { Pace.restart(); });
	window.setInterval(Offline.check, 5000);
	$( document ).ajaxError(Offline.check);

})(jQuery);