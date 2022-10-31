<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/layouts/user/taglib.jsp"%>
    
 <title>Đăng ký</title>
 <body>
 	<form class="mt-2">
            <div class="form-group">
              <label for="name">Họ và tên</label>
              <input type="text" class="form-control" id="name" aria-describedby="emailHelp"
                placeholder="Họ và tên" name = "name">
            </div>
            <div class="form-group">
              <label for="username">Nhập email</label>
              <input type="email" class="form-control" id="email" aria-describedby="emailHelp"
                placeholder="Nhập email" name = "email">
            </div>
            <div class="form-group">
              <label for="password">Nhập mật khẩu</label>
              <input id="password" type="password" class="form-control pr-4" placeholder="Nhập mật khẩu"
                name="password">
                <i toggle="#password" class="fa fa-fw fa-eye field-icon toggle-password pl-1"></i>
              </div>
            <div class="form-group">
              <label for="repassword">Nhập lại mật khẩu</label>
              <input id="repassword" type="password" class="form-control pr-4" placeholder="Nhập lại mật khẩu"
                name="repassword">
                <i toggle="#repassword" class="fa fa-fw fa-eye field-icon toggle-password pl-1"></i>
              </div>
            <button type="submit" class="btn btn-success w-100 mt-2 text-uppercase">Đăng ký</button>
            <a href="<c:url value = "/login-signup/login/"/>" class="btn btn-success w-100 mt-4 text-uppercase">Đăng nhập</a>
          </form>
 </body>