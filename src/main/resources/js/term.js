
google.charts.load('current', {'packages':['bar']});
google.charts.setOnLoadCallback(getPeriod);

function getPeriod() {
  var data = google.visualization.arrayToDataTable([
    ['period', 'store1', 'store2', 'store3'],
    ['2023-01-13', 1000, 400, 600 ], 
    ['2023-01-14', 1170, 460, 700 ],
    ['2023-01-15', 660, 700, 800 ],
    ['2023-01-16', 780, 640, 600 ],
    ['2023-01-17', 800, 550, 700 ],
    ['2023-01-18', 654, 720, 500 ],
    ['2023-01-19', 940, 800, 780 ],
    ['2023-01-20', 1000, 450, 340 ]
  ]);

  var options = {
    bars: 'vertical'
  };
  var chart = new google.charts.Bar(document.getElementById('viewGraph'));

  chart.draw(data, google.charts.Bar.convertOptions(options));
}