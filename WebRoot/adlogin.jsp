<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<!-- saved from url=(0051)https://getbootstrap.com/docs/4.1/examples/sign-in/ -->
<html lang="en"><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="images/jmuxh.jpg">

    <title>管理员登录</title>

    <!-- Bootstrap core CSS -->
    <link href="./login_files/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="./login_files/signin.css" rel="stylesheet">
  </head>

  <body class="text-center">
    <form class="form-signin" action="${pageContext.request.contextPath}/adlogin.do" method="post">
      <img class="mb-4" src="images/jmuxh.jpg" alt="" width="100" height="100">
      <h1 class="h3 mb-3 font-weight-normal">请登录</h1>
      <label for="inputEmail" class="sr-only">账号</label>
      <input type="text" name="mno" class="form-control" placeholder="账号" required="" autofocus="">
      <label for="inputPassword" class="sr-only">密码</label>
      <input type="password" name="password" class="form-control" placeholder="密码" required="">
      <button class="btn btn-lg btn-primary btn-block" type="submit">登录</button>
      <p class="mt-5 mb-3 text-muted">© 2019-2020</p>
    </form>
  

</body></html>