google.charts.load("current", {packages:["corechart"]});
  google.charts.setOnLoadCallback(getCategoryDay);
  google.charts.setOnLoadCallback(getCategoryWeek);
  google.charts.setOnLoadCallback(getCategoryMonth);
  google.charts.setOnLoadCallback(getCategoryYear);

function getCategoryDay() {
  var data = google.visualization.arrayToDataTable([
    ['메뉴 항목', '매출비중'],
    ['커피',  25],
    ['브루드커피',  15],
    ['스무디',  7],
    ['착즙주스',  8],
    ['케이크',  5],
    ['머핀',  10],
    ['마카롱',  18],
    ['쿠키',  12]
  ]);

  var options = {
    backgroundColor : 'none',
    legend : {
      position: 'right', 
      textStyle: {
        color: '#707070', 
        fontSize: 15,
        fontName :'Poppins',
        bold : true
      }},
    pieSliceTextStyle : {
      color: 'none', 
      fontName: 'Poppins', 
      fontSize: 18
      },
    chartArea : {
    width : 350,
    height : 200
  }                          
};                     
  var chart = new google.visualization.PieChart(document.getElementById('categoryDay'));
  chart.draw(data, options);
}

function getCategoryWeek() {
  var data = google.visualization.arrayToDataTable([
    ['메뉴 항목', '매출비중'],
    ['커피',  30],
    ['브루드커피',  20],
    ['스무디',  12],
    ['착즙주스',  4],
    ['케이크',  10],
    ['머핀',  5],
    ['마카롱',  5],
    ['쿠키',  12]
  ]);

  var options = {
    backgroundColor : 'none',
    legend : {
      position: 'right', 
      textStyle: {
        color: '#707070', 
        fontSize: 15,
        fontName :'Poppins',
        bold : true
      }},
    pieSliceTextStyle : {
      color: 'none', 
      fontName: 'Poppins', 
      fontSize: 18
      },
    chartArea : {
    width : 350,
    height : 200
  }                          
};                     
  var chart = new google.visualization.PieChart(document.getElementById('categoryWeek'));
  chart.draw(data, options);
}

function getCategoryMonth() {
  var data = google.visualization.arrayToDataTable([
    ['메뉴 항목', '매출비중'],
    ['커피',  22],
    ['브루드커피',  14],
    ['스무디',  10],
    ['착즙주스',  8],
    ['케이크',  15],
    ['머핀',  6],
    ['마카롱',  6],
    ['쿠키',  8]
  ]);

  var options = {
    backgroundColor : 'none',
    legend : {
      position: 'right', 
      textStyle: {
        color: '#707070', 
        fontSize: 15,
        fontName :'Poppins',
        bold : true
      }},
    pieSliceTextStyle : {
      color: 'none', 
      fontName: 'Poppins', 
      fontSize: 18
      },
    chartArea : {
    width : 350,
    height : 200
  }                          
};                     
  var chart = new google.visualization.PieChart(document.getElementById('categoryMonth'));
  chart.draw(data, options);
}

function getCategoryYear() {
  var data = google.visualization.arrayToDataTable([
    ['메뉴 항목', '매출비중'],
    ['커피',  25],
    ['브루드커피',  15],
    ['스무디',  7],
    ['착즙주스',  8],
    ['케이크',  5],
    ['머핀',  10],
    ['마카롱',  18],
    ['쿠키',  12]
  ]);

  var options = {
    backgroundColor : 'none',
    legend : {
      position: 'right', 
      textStyle: {
        color: '#707070', 
        fontSize: 15,
        fontName :'Poppins',
        bold : true
      }},
    pieSliceTextStyle : {
      color: 'none', 
      fontName: 'Poppins', 
      fontSize: 18
      },
    chartArea : {
    width : 350,
    height : 200
  }                          
};                     
  var chart = new google.visualization.PieChart(document.getElementById('categoryYear'));
  chart.draw(data, options);
}