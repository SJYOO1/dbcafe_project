$(function(){
	var today = new Date();
	var year = today.getFullYear();
	var month = ('0' + (today.getMonth() + 1)).slice(-2);
	var currentYm = year + '-' + month;
	var currentYy = year;
	$.ajax({
			url: "/month",
			contentType: "application/json;charset=utf-8",
			dataType: "json",
			type: "get",
			data: {
				currentYm: '2020-04'
			},
			success: function(cdata) {
				google.charts.load('current', { 'packages': ['corechart'] });
				google.charts.setOnLoadCallback(getMonthGoal);
				function getMonthGoal() {
					var data = new google.visualization.arrayToDataTable([
			            ['목표매출액', '달성률'],
			            ['목표 매출액',  cdata.goalMonth - cdata.sum ],
			            ['달성 매출액',  cdata.sum]
          			]);
          			/*
					data.addColumn('number', '목표매출액');
					data.addColumn('number', '달성률');
					data.addRow(cdata.goalMonth, cdata.sum);
          			*/

					var options = {
						backgroundColor : 'none',
			            pieHole: 0.4,
			            colors:['#a0eac5','#00c281'],
			            legend : {
			              position: 'right', 
			              textStyle: {
			                color: '#707070', 
			                fontSize: 23,
			                fontName :'Poppins',
			                bold : true
			              }},
			            pieSliceTextStyle : {
			              color: 'white', 
			              fontName: 'Poppins', 
			              fontSize: 18
			              },
			            chartArea : {
			            width : 600,
			            height : 500
						}
					};
					var chart = new google.visualization.PieChart(document.getElementById('goalYm'));
					chart.draw(data, options);
				}
			},
			error: function(cdata) {
				alert("Error");
			}
		});
	$.ajax({
			url: "/year",
			contentType: "application/json;charset=utf-8",
			dataType: "json",
			type: "get",
			data: {
				currentYy: '2020'
			},
			success: function(cdata) {
				google.charts.load('current', { 'packages': ['corechart'] });
				google.charts.setOnLoadCallback(getYearGoal);
				function getYearGoal() {
					var data = new google.visualization.arrayToDataTable([
			            ['목표매출액', '달성률'],
			            ['목표 매출액',  cdata.goalYear - cdata.sum ],
			            ['달성 매출액',  cdata.sum]
          			]);
					var options = {
						backgroundColor : 'none',
			            pieHole: 0.4,
			            colors:['#a0eac5','#00c281'],
			            legend : {
			              position: 'right', 
			              textStyle: {
			                color: '#707070', 
			                fontSize: 23,
			                fontName :'Poppins',
			                bold : true
			              }},
			            pieSliceTextStyle : {
			              color: 'white', 
			              fontName: 'Poppins', 
			              fontSize: 18
			              },
			            chartArea : {
			            width : 500,
			            height : 500
						}
					};
					var chart = new google.visualization.PieChart(document.getElementById('goalYy'));
					chart.draw(data, options);
				}
			},
			error: function(cdata) {
				alert("Error");
			}
		});
});


$(function() {
	$("#btn").click(function() {
		var currentYm = $("input[name='goalDate']").val();
		
		$.ajax({
			url: "/month",
			contentType: "application/json;charset=utf-8",
			dataType: "json",
			type: "get",
			data: {
				currentYm: currentYm
			},
			success: function(cdata) {
				google.charts.load('current', { 'packages': ['corechart'] });
				google.charts.setOnLoadCallback(getMonthGoal);
				function getMonthGoal() {
					var data = new google.visualization.arrayToDataTable([
			            ['목표매출액', '달성률'],
			            ['목표 매출액',  cdata.goalMonth - cdata.sum ],
			            ['달성 매출액',  cdata.sum]
          			]);
					var options = {
						backgroundColor : 'none',
			            pieHole: 0.4,
			            colors:['#a0eac5','#00c281'],
			            legend : {
			              position: 'right', 
			              textStyle: {
			                color: '#707070', 
			                fontSize: 23,
			                fontName :'Poppins',
			                bold : true
			              }},
			            pieSliceTextStyle : {
			              color: 'white', 
			              fontName: 'Poppins', 
			              fontSize: 18
			              },
			            chartArea : {
			            width : 500,
			            height : 500
						}
					};
					var chart = new google.visualization.PieChart(document.getElementById('goalYm'));
					chart.draw(data, options);
				}	
			},
			error: function(cdata) {
				alert("Error");
			}
		});
	});
});         
