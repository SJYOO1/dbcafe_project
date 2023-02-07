$(function() {
	$("#btn1")
		.click(
			function() {
				// alert("콜성공!!!");
				var startDay = $("input[name='startDay']").val();
				var endDay = $("input[name='endDay']").val();
				var stNoList = new Array();
				$("input[name='day-stNo']:checked").each(
					function(i) {
						stNoList.push($(this).val());
					});
				if (startDay > endDay) {
					alert('날짜를 다시 선택해주세요');
				} else {
					$.ajax({
						url: "./period/utime",
						type: 'GET',
						data: {
							s: startDay,
							e: endDay,
							st: stNoList
						},
						success: function(data) {
							google.charts.load('current',
								{
									packages: [
										'corechart',
										'bar']
								});
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
									colors: ['#9575cd',
										'#33ac71', '#c9bb79'],
									hAxis: {
										title: 'Time of Days'
									},
									vAxis: {
										title: 'Rating (scale of 1-10)'
									}
								};

								var chart = new google.visualization.ColumnChart(
									document
										.getElementById('chartByTime'));
								chart.draw(dataTable, options);
							}
						},
						error: function() {
							alert("error");
						}
					});
				}
			});



	$("#btn2")
		.click(
			function() {
				// alert("콜성공!!!");
				var startMonth = $("input[name='startMonth']").val();
				var endMonth = $("input[name='endMonth']").val();
				var stNoList = new Array();
				$("input[name='month-stNo']:checked").each(
					function(i) {
						stNoList.push($(this).val());
					});
				for (var i = 0; i < stNoList.length; i++) {
					alert(stNoList[i]);
				}
				if (startMonth > endMonth) {
					alert('날짜를 다시 선택해주세요');
				} else {
					$.ajax({
						url: "./period/utime",
						type: 'GET',
						data: {
							s: startMonth,
							e: endMonth,
							st: stNoList
						},
						success: function(data) {
							google.charts.load('current',
								{
									packages: [
										'corechart',
										'bar']
								});
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
									colors: ['#9575cd',
										'#33ac71', '#c9bb79'],
									hAxis: {
										title: 'Time of Days'
									},
									vAxis: {
										title: 'Rating (scale of 1-10)'
									}
								};

								var chart = new google.visualization.ColumnChart(
									document
										.getElementById('chartByTime'));
								chart.draw(dataTable, options);
							}
						},
						error: function() {
							alert("error");
						}
					});
				}
			});




	$("#btn3")
		.click(
			function() {
				// alert("콜성공!!!");
				var startYear = $("input[name='startYear']").val();
				var endYear = $("input[name='endYear']").val();
				var stNoList = new Array();
				$("input[name='year-stNo']:checked").each(
					function(i) {
						stNoList.push($(this).val());
					});
				for (var i = 0; i < stNoList.length; i++) {
					alert(stNoList[i]);
				}
				if (startYear > endYear) {
					alert('날짜를 다시 선택해주세요');
				} else {
					$.ajax({
						url: "./period/utime",
						type: 'GET',
						data: {
							s: startYear,
							e: endYear,
							st: stNoList
						},
						success: function(data) {
							google.charts.load('current',
								{
									packages: [
										'corechart',
										'bar']
								});
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
									colors: ['#9575cd',
										'#33ac71', '#c9bb79'],
									hAxis: {
										title: 'Time of Days'
									},
									vAxis: {
										title: 'Rating (scale of 1-10)'
									}
								};

								var chart = new google.visualization.ColumnChart(
									document
										.getElementById('chartByTime'));
								chart.draw(dataTable, options);
							}
						},
						error: function() {
							alert("error");
						}
					});
				}
			});
});