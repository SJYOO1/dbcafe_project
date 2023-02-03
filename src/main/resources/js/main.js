google.charts.load("current", {packages:["corechart"]});
        google.charts.setOnLoadCallback(getGoalMy);
        google.charts.setOnLoadCallback(getGoalYy);

        function getGoalMy() {
          var data = google.visualization.arrayToDataTable([
            ['목표매출액', '달성률'],
            ['목표 매출액',  30],
            ['달성 매출액',  70]
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
            width : 600,
            height : 500
          }                          
              
        };                     
          var chart = new google.visualization.PieChart(document.getElementById('goalYm'));
          chart.draw(data, options);
        }
        function getGoalYy() {
            var data = google.visualization.arrayToDataTable([
            ['목표 년매출액', '달성률'],
            ['목표 년매출액',    7],
            ['달성 년매출액',      3]
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
            width : 600,
            height : 500
          }                          
              
        };                     
          var chart = new google.visualization.PieChart(document.getElementById('goalYy'));
          chart.draw(data, options);
        }

