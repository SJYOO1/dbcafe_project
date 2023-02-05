

$(function() {
	$("#btn").click(function() {
		var startDay = $("input[name='startDay']").val();
		var endDay = $("input[name='endDay']").val();

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
						'title': '카테고리별 매출 비중 (원)',
						'width': 550,
						'height': 500
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
						'title': '카테고리별 판매량 비중 (건)',
						'width': 550,
						'height': 500
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
});         