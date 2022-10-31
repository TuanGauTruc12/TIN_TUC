$(".toggle-password").click(function() {

    $(this).toggleClass("fa-eye fa-eye-slash");
    var input = $($(this).attr("toggle"));
    if (input.attr("type") == "password") {
      input.attr("type", "text");
    } else {
      input.attr("type", "password");
    }
  });

  $("#login").click(function() {
	const email = $('#email').val();
	const password = $('#password-field').val();
	location.href = `http://localhost:8080/TinTuc/login-signup/login/email=${email}&password=${password}`;
  });

 