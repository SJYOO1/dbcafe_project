function viewByTime() {
	var startDate = $("input[name='startDate']").val();
	var endDate = $("input[name='endDate']").val();
	var stNoList = new Array();
	$("input[name='stNo']:checked").each(
		function(i) {
			stNoList.push($(this).val());
		});
	if (startDate > endDate) {
		alert('날짜를 다시 선택해주세요');
		$('#test').show();
	} else if (startDate.length != endDate.length) {
		alert('날짜형식을 맞춰주세요.');
	} else if (startDate.length == 0 || endDate.length == 0) {
		alert('날짜를 입력해주세요.');
		$("input[name='startDate']").focus();
	} else if (stNoList.length == 0) {
		alert('조회할 매장을 선택해주세요.');
	} else {
		$.ajax({
			url: "./period/utime",
			type: 'GET',
			data: {
				s: startDate,
				e: endDate,
				st: stNoList
			},
			success: function(data) {
				google.charts.load('current',
					{
						packages: [
							'corechart',
							'bar']
					});
				google.charts.load('current', { 'packages': ['table'] });
				google.charts
					.setOnLoadCallback(drawColColors);

				function drawColColors() {
					var dataTable = new google.visualization.DataTable();
					dataTable.addColumn('string',
						'Time of Day');
					for (var i = 0; i < stNoList.length; i++) {
						dataTable.addColumn(
							'number',
							data[i].stNm);
					}
					if (stNoList.length == 1) {
						for (var i = 0; i < data[0].sumByTimes.length; i++) {
							dataTable
								.addRows([[
									data[0].sumByTimes[i].time,
									data[0].sumByTimes[i].sum]]);
						}
					} else if (stNoList.length == 2) {
						for (var i = 0; i < data[0].sumByTimes.length; i++) {
							dataTable
								.addRows([[
									data[0].sumByTimes[i].time,
									data[0].sumByTimes[i].sum,
									data[1].sumByTimes[i].sum]]);
						}
					} else if (stNoList.length == 3) {
						for (var i = 0; i < data[0].sumByTimes.length; i++) {
							dataTable
								.addRows([[
									data[0].sumByTimes[i].time,
									data[0].sumByTimes[i].sum,
									data[1].sumByTimes[i].sum,
									data[2].sumByTimes[i].sum]]);
						}
					}
					var options = {
						'backgroundColor': 'none',
						hAxis: {
							title: 'Time of Days',
							titleTextStyle: {
								color: "#707070",
								fontName: "Poppins"
							}
						},
						vAxis: {
							title: '시간대별 매출액 (원)',
							titleTextStyle: {
								color: "#707070",
								fontName: "Poppins"
							}
						},
						fontSize: 15,
						width: 1000,
						height: 400,

					};

					var chart = new google.visualization.ColumnChart(
						document
							.getElementById('chartView'));
					chart.draw(dataTable, options);
					var table = new google.visualization.Table(document.getElementById('tableView'));
					table.draw(dataTable, { showRowNumber: true, width: '100%', height: '100%', 'backgroundColor': 'none' });
				}
			},
			error: function() {
				alert("error");
			}
		});
	}
}
function viewByDate() {
	var startDate = $("input[name='startDate']").val();
	var endDate = $("input[name='endDate']").val();
	var stNoList = new Array();
	$("input[name='stNo']:checked").each(
		function(i) {
			stNoList.push($(this).val());
		});
	if (startDate > endDate) {
		alert('날짜를 다시 선택해주세요');
	} else if (startDate.length != endDate.length) {
		alert('날짜형식을 맞춰주세요.');
	} else if (startDate.length == 0 || endDate.length == 0) {
		alert('날짜를 입력해주세요.');
		$("input[name='startDate']").focus();
	} else if (stNoList.length == 0) {
		alert('조회할 매장을 선택해주세요.');
	} else {
		$.ajax({
			url: "./period/udate",
			type: 'GET',
			data: {
				s: startDate,
				e: endDate,
				st: stNoList
			},
			success: function(data) {
				google.charts.load('current',
					{
						packages: [
							'corechart',
							'bar']
					});
				google.charts.load('current', { 'packages': ['table'] });
				google.charts
					.setOnLoadCallback(drawColColors);

				function drawColColors() {
					var dataTable = new google.visualization.DataTable();
					dataTable.addColumn('string',
						'Time of Day');
					for (var i = 0; i < stNoList.length; i++) {
						dataTable.addColumn(
							'number',
							data[i].stNm);
					}
					if (stNoList.length == 1) {
						for (var i = 0; i < data[0].sumByTimes.length; i++) {
							dataTable
								.addRows([[
									data[0].sumByTimes[i].time,
									data[0].sumByTimes[i].sum]]);
						}
					} else if (stNoList.length == 2) {
						for (var i = 0; i < data[0].sumByTimes.length; i++) {
							dataTable
								.addRows([[
									data[0].sumByTimes[i].time,
									data[0].sumByTimes[i].sum,
									data[1].sumByTimes[i].sum]]);
						}
					} else if (stNoList.length == 3) {
						for (var i = 0; i < data[0].sumByTimes.length; i++) {
							dataTable
								.addRows([[
									data[0].sumByTimes[i].time,
									data[0].sumByTimes[i].sum,
									data[1].sumByTimes[i].sum,
									data[2].sumByTimes[i].sum]]);
						}
					}
					var options = {
						'backgroundColor': 'none',
						colors: ['#9575cd',
							'#33ac71', '#c9bb79'],
						hAxis: {
							title: 'Time of Days',
							titleTextStyle: {
								color: "#707070",
								fontName: "Poppins"
							}
						},
						vAxis: {
							title: '시간대별 매출액 (원)',
							titleTextStyle: {
								color: "#707070",
								fontName: "Poppins"
							}
						},
						fontSize: 15,
						width: 1000,
						height: 400,

					};

					var chart = new google.visualization.ColumnChart(
						document
							.getElementById('chartView'));
					chart.draw(dataTable, options);

					var table = new google.visualization.Table(document.getElementById('tableView'));
					table.draw(dataTable, { showRowNumber: true, width: '100%', height: '100%' });
				}
			},
			error: function() {
				alert("error");
			}
		});
	}
}

