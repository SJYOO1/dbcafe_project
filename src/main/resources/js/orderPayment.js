google.charts.load("current", {packages:["corechart"]});
google.charts.setOnLoadCallback(getordertypeWeek);
google.charts.setOnLoadCallback(getordertypeMonth);
google.charts.setOnLoadCallback(getordertypeYear);

function getordertypeWeek() {
  // Some raw data (not necessarily accurate)
  var data = google.visualization.arrayToDataTable([
    ['Date', '온라인주문', '오프라인주문', '온라인주문 매출', '오프라인주문 매출'],
    ['23/01/23',  22,      31,    18, 29],
    ['23/01/24',  18,      28,    14, 24],
    ['23/01/25',  24,      34,    20, 30],
    ['23/01/26',  27,      30,    24, 26],
    ['23/01/27',  20,      29,    18, 25]
  ]);

  var options = {
    seriesType: 'bars',
    isStacked : true,
    series: {2: {type: 'line'},
             3: {type: 'line'}},
    selectionMode: 'multiple',
    tooltip: {trigger: 'selection'},
    aggregationTarget: 'category',
    chartArea : {
      left : 40,
    },
    vAxis : {
      textStyle : { color : 'black',       
      fontName: 'Poppins', 
      fontSize: 12,
      baselineColor : 'blue'
     }
    },
    hAxis : {
      textStyle : { color : 'black',       
      fontName: 'Poppins', 
      fontSize: 12,
      }
    },
    tooltip : {
      textStyle : { color : 'black',       
      fontName: 'Poppins', 
      fontSize: 12
      }      
    }


  };

  var chart = new google.visualization.ComboChart(document.getElementById('ordertypeWeek'));
  chart.draw(data, options);
}

function getordertypeMonth() {
  // Some raw data (not necessarily accurate)
  var data = google.visualization.arrayToDataTable([
    ['Date', '온라인주문', '오프라인주문', '온라인주문 매출', '오프라인주문 매출'],
    ['1주차',  22,      31,    18, 29],
    ['2주차',  18,      28,    14, 24],
    ['3주차',  24,      34,    20, 30],
    ['4주차',  27,      30,    24, 26],
    ['5주차',  20,      29,    18, 25]
  ]);

  var options = {
    seriesType: 'bars',
    isStacked : true,
    series: {2: {type: 'line'},
             3: {type: 'line'}},
    selectionMode: 'multiple',
    tooltip: {trigger: 'selection'},
    aggregationTarget: 'category',
    chartArea : {
      left : 40
    },
    vAxis : {
      textStyle : { color : 'black',       
      fontName: 'Poppins', 
      fontSize: 12,
      baselineColor : 'blue'
     }
    },
    hAxis : {
      textStyle : { color : 'black',       
      fontName: 'Poppins', 
      fontSize: 12,
      }
    },
    tooltip : {
      textStyle : { color : 'black',       
      fontName: 'Poppins', 
      fontSize: 12
      }      
    }
            };

  var chart = new google.visualization.ComboChart(document.getElementById('ordertypeMonth'));
  chart.draw(data, options);
}

function getordertypeYear() {
  // Some raw data (not necessarily accurate)
  var data = google.visualization.arrayToDataTable([
    ['Date', '온라인주문', '오프라인주문', '온라인주문 매출', '오프라인주문 매출'],
    ['1월',  22,      31,    18, 29],
    ['2월',  18,      28,    14, 24],
    ['3월',  24,      34,    20, 30],
    ['4월',  27,      30,    24, 26],
    ['5월',  20,      29,    18, 25],
    ['6월',  22,      31,    18, 29],
    ['7월',  18,      28,    14, 24],
    ['8월',  24,      34,    20, 30],
    ['9월',  27,      30,    24, 26],
    ['10월',  20,      29,    18, 25],
    ['11월',  27,      30,    24, 26],
    ['12월',  20,      29,    18, 25]

  ]);

  var options = {
    seriesType: 'bars',
    isStacked : true,
    series: {2: {type: 'line'},
             3: {type: 'line'}},
    selectionMode: 'multiple',
    tooltip: {trigger: 'selection'},
    aggregationTarget: 'category',
    chartArea : {
      left : 80
    },
    vAxis : {
      textStyle : { color : 'black',       
      fontName: 'Poppins', 
      fontSize: 12,
      baselineColor : 'blue'
     }
    },
    hAxis : {
      textStyle : { color : 'black',       
      fontName: 'Poppins', 
      fontSize: 12,
      }
    },
    tooltip : {
      textStyle : { color : 'black',       
      fontName: 'Poppins', 
      fontSize: 12
      }      
    }
    
  };

  var chart = new google.visualization.ComboChart(document.getElementById('ordertypeYear'));
  chart.draw(data, options);
}

