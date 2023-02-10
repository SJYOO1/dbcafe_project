$(function(){
	var today = new Date();
	var year = today.getFullYear();
	var month = ('0' + (today.getMonth() + 1)).slice(-2);
	var day = ('0' + today.getDate()).slice(-2);
	var startDay = year + '-' + month  + '-' + day;
	var endDay = year + '-' + month  + '-' + day;
	$.ajax({
			url: "/category",
			contentType: "application/json;charset=utf-8",
			dataType: "json",
			type: "get",
			data: {
				startDay: '2020-03-01',
				endDay: '2020-03-01'
			},
			success: function(cdata) {
				google.charts.load('current', { 'packages': ['corechart'] });
				google.charts.setOnLoadCallback(getcategoryAccount);
				function getcategoryAccount() {
					var data = new google.visualization.DataTable();
					data.addColumn('string', '메뉴항목');
					data.addColumn('number', '매출비중');
					for (var i = 0; i < cdata.length; i++) {
						data.addRow([
							cdata[i].category, cdata[i].csum
						]);
					}
					var options = {
						'backgroundColor' : 'none',
						legend : {
                    			position: 'right', 
                    			textStyle: {
                      				color: '#707070', 
                      				fontSize: 15,
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
                  		height : 600
						}
					};
					var chart = new google.visualization.PieChart(document.getElementById('categoryAccount'));
					chart.draw(data, options);
				}
				google.charts.load('current', { 'packages': ['corechart'] });
				google.charts.setOnLoadCallback(getcategoryQuantity);
				function getcategoryQuantity() {
					var data = new google.visualization.DataTable();
					data.addColumn('string', '메뉴항목');
					data.addColumn('number', '매출비중');
					for (var i = 0; i < cdata.length; i++) {
						data.addRow([
							cdata[i].category, cdata[i].ccount
						]);
					}
					var options = {
						'backgroundColor' : 'none',
						legend : {
                    			position: 'right', 
                    			textStyle: {
                      				color: '#707070', 
                      				fontSize: 15,
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
                  		height : 600
						}
					};
					var chart = new google.visualization.PieChart(document.getElementById('categoryQuantity'));
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
		var startDay = $("input[name='startDay']").val();
		var endDay = $("input[name='endDay']").val();
		//날짜 예외처리 , 값이 없을때 예외처리
		if(startDay>endDay){
			alert('날짜를 다시 선택해주세요');
		}else{
		$.ajax({
			url: "/category",
			contentType: "application/json;charset=utf-8",
			dataType: "json",
			type: "get",
			data: {
				startDay: startDay,
				endDay: endDay
			},
			success: function(cdata) {
				google.charts.load('current', { 'packages': ['corechart'] });
				google.charts.setOnLoadCallback(getcategoryAccount);
				function getcategoryAccount() {
					var data = new google.visualization.DataTable();
					data.addColumn('string', '메뉴항목');
					data.addColumn('number', '매출비중');
					for (var i = 0; i < cdata.length; i++) {
						data.addRow([
							cdata[i].category, cdata[i].csum
						]);
					}

					var options = {
						'backgroundColor' : 'none',
						legend : {
                    			position: 'right', 
                    			textStyle: {
                      				color: '#707070', 
                      				fontSize: 15,
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
                  		height : 600
						}
					};
					var chart = new google.visualization.PieChart(document.getElementById('categoryAccount'));
					chart.draw(data, options);
				}

				google.charts.load('current', { 'packages': ['corechart'] });
				google.charts.setOnLoadCallback(getcategoryQuantity);
				function getcategoryQuantity() {
					var data = new google.visualization.DataTable();
					data.addColumn('string', '메뉴항목');
					data.addColumn('number', '매출비중');
					for (var i = 0; i < cdata.length; i++) {
						data.addRow([
							cdata[i].category, cdata[i].ccount
						]);
					}
					var options = {
						'backgroundColor' : 'none',
						legend : {
                    			position: 'right', 
                    			textStyle: {
                      				color: '#707070', 
                      				fontSize: 15,
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
                  		height : 600
						}
					};
					var chart = new google.visualization.PieChart(document.getElementById('categoryQuantity'));
					chart.draw(data, options);
				}
			},
			error: function(cdata) {
				alert("Error");
			}
		});
		}
	});
});         