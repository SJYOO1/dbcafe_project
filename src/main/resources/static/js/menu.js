load();

function load() {
  let noList = $(".menuList").find(".toggleSwitch");

    for(let i=0;i<noList.length;i++) {
      if($(noList[i]).attr('data-value') == 'N'){
        $(noList[i]).addClass('active');
        $(noList[i]).find('#onBtn').css('display','none');
        $(noList[i]).find('#offBtn').css('display','block');
    }
  }
}

$(".toggleSwitch").off().on('click', function(){
  
  if($(this).find('#onBtn').css("display")=='block'){          
  $(this).find('#onBtn').css('display','none');
} else if ($(this).find('#onBtn').css("display")=='none'){ 
  $(this).find('#onBtn').css('display','block');
};
if($(this).find('#offBtn').css("display")=='block'){          
  $(this).find('#offBtn').css('display','none');
} else if ($(this).find('#onBtn').css("display")=='none'){ 
  $(this).find('#offBtn').css('display','block');
};

  if($(this).hasClass('active')) {
      $(this).removeClass('active');
      $(this).attr('data-value','Y');
    }
  else  {
      $(this).addClass('active')
      $(this).attr('data-value','N');
      }
    
      console.log($(this).attr('data-value'))
      let menuData = {
      "gdYn" : $(this).attr('data-value'),
      "gdNo" : $(this).parent().attr('data-value')
     }   

     $.ajax({
         type: "put",
         url : "http://localhost/menu",
         headers: {'Content-Type': 'application/json'},
         data : JSON.stringify(menuData),
         success : function (menuData){
            console.log(menuData);
         },
         error : function(e){
         }
 })

}); 


 
