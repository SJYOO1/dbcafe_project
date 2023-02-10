function check()
   {  
    if(loginForm.id.value == "") {
        alert("아이디를 입력해야 합니다.");
        loginForm.id.focus();//포커스를 id박스로 이동.
        return false;  
    };

    if (loginForm.password.value  == "")
    {
        alert("패스워드를 입력 해야 합니다.");
        loginForm.password.focus();//포커스를 Password박스로 이동.
        return false;
    }
   form.submit();   
  }