$(document).ready(function() {
	events = [
	            { name: 'Event1', description:'desc1'},
	            { name: 'Event2', description:'desc2'},
	            { name: 'Event3', description:'desc3'},
	            { name: 'Event4', description:'desc4'},
	            { name: 'Event5', description:'desc5'},
	            { name: 'Event6', description:'desc6'},
	            { name: 'Event7', description:'desc7'},
	            { name: 'Event8', description:'desc8'}
	          ];
	var string = "";
	$.each(events, function(key, value) { 
				string+="<div class='col-lg-3 col-md-6 text-center'>" +
	                 "<div class='service-box'>" +
	                 "<a href='/event'>" +
	                 "<i class='fa fa-4x fa-diamond wow bounceIn text-primary'></i>" +
	                 "</a>" +
	                 "<h3>" + value.name + "</h3>" +
	                 "<p class='text-muted'>" + value.description + "</p>" +
                     "</div>" +
                     "</div>";
	}); 
	$('#contents').html(string);
});