$(document).ready(function() {
/* $("#submit").click(function(e) {
		e.preventDefault();
		$.post("/",function( data ) {
			  $( "#result" ).html( data );
		});
    }); */
    
    $(".date-chooser").datepicker({
        maxDate: new Date(),
        autoClose: true,
    });

});