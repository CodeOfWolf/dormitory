<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<!-- saved from url=(0053)https://getbootstrap.com/docs/4.1/examples/dashboard/ -->
<html lang="en" xmlns:th="http://www.thymeleaf.org">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />

    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
    <meta name="description" content="" />
    <meta name="author" content="" />
    <link rel="icon" href="images/jmuxh.jpg" />

    <title>学生信息</title>

    <!-- Bootstrap core CSS -->
    <link href="./dashboard_files/bootstrap.min.css" rel="stylesheet" />

    <!-- Custom styles for this template -->
    <link href="./dashboard_files/dashboard.css" rel="stylesheet" />
    <style type="text/css">/* Chart.js */
    @-webkit-keyframes chartjs-render-animation{from{opacity:0.99}to{opacity:1}}@keyframes chartjs-render-animation{from{opacity:0.99}to{opacity:1}}.chartjs-render-monitor{-webkit-animation:chartjs-render-animation 0.001s;animation:chartjs-render-animation 0.001s;}</style></head>

<body th:inline="text">
    <nav class="navbar navbar-dark fixed-top bg-dark flex-md-nowrap p-0 shadow">
        <a class="navbar-brand col-sm-3 col-md-2 mr-0" href="https://getbootstrap.com/docs/4.1/examples/dashboard/#">Company name</a>
        <input class="form-control form-control-dark w-100" type="text" placeholder="Search" aria-label="Search">
        <ul class="navbar-nav px-3">
          <li class="nav-item text-nowrap">
            <a class="nav-link" href="https://getbootstrap.com/docs/4.1/examples/dashboard/#">注销</a>
          </li>
        </ul>
      </nav>
<div class="container-fluid">
    <div class="row">
        <nav class="col-md-2 d-none d-md-block bg-light sidebar">
            <div class="sidebar-sticky">
              <ul class="nav flex-column">
              <li class="nav-item">
                <a class="nav-link active" href="https://getbootstrap.com/docs/4.1/examples/dashboard/#" >
                  <svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="feather feather-users"><path d="M17 21v-2a4 4 0 0 0-4-4H5a4 4 0 0 0-4 4v2"></path><circle cx="9" cy="7" r="4"></circle><path d="M23 21v-2a4 4 0 0 0-3-3.87"></path><path d="M16 3.13a4 4 0 0 1 0 7.75"></path></svg>
                  	<h3>学生信息管理</h3><span class="sr-only">(current)</span>
                </a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="https://getbootstrap.com/docs/4.1/examples/dashboard/#">
                  <svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="feather feather-file"><path d="M13 2H6a2 2 0 0 0-2 2v16a2 2 0 0 0 2 2h12a2 2 0 0 0 2-2V9z"></path><polyline points="13 2 13 9 20 9"></polyline></svg>
                 	<h3>维修信息管理</h3>
                </a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="https://getbootstrap.com/docs/4.1/examples/dashboard/#">
                  <svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="feather feather-shopping-cart"><circle cx="9" cy="21" r="1"></circle><circle cx="20" cy="21" r="1"></circle><path d="M1 1h4l2.68 13.39a2 2 0 0 0 2 1.61h9.72a2 2 0 0 0 2-1.61L23 6H6"></path></svg>
                  	<h3>水电信息管理</h3>
                </a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="https://getbootstrap.com/docs/4.1/examples/dashboard/#">
                  <svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="feather feather-home"><path d="M3 9l9-7 9 7v11a2 2 0 0 1-2 2H5a2 2 0 0 1-2-2z"></path><polyline points="9 22 9 12 15 12 15 22"></polyline></svg>
                 	<h3>晚归信息管理</h3>  
                </a>
              </li>
            </ul>
      		</nav>

        <main role="main" class="col-md-9 ml-sm-auto col-lg-10 px-2"><div class="chartjs-size-monitor" style="position: absolute; left: 0px; top: 0px; right: 0px; bottom: 0px; overflow: hidden; pointer-events: none; visibility: hidden; z-index: -1;"><div class="chartjs-size-monitor-expand" style="position:absolute;left:0;top:0;right:0;bottom:0;overflow:hidden;pointer-events:none;visibility:hidden;z-index:-1;"><div style="position:absolute;width:1000000px;height:1000000px;left:0;top:0"></div></div><div class="chartjs-size-monitor-shrink" style="position:absolute;left:0;top:0;right:0;bottom:0;overflow:hidden;pointer-events:none;visibility:hidden;z-index:-1;"><div style="position:absolute;width:200%;height:200%;left:0; top:0"></div></div></div>
			<form action="" method="post">
			  <div class="form-group col-md-3">
			    <label for="sno">学号</label>
			    <input type="text" class="form-control" id="sno" name="sno" placeholder="学号">
			  </div>
			  <div class="form-group col-md-3">
			    <label for="sname">姓名</label>
			    <input type="text" class="form-control" id="sname" name="sname" placeholder="姓名">
			  </div>
			  <div class="form-group col-md-3">
			    <label for="did">房间号</label>
			    <input type="text" class="form-control" id="did" name="did" placeholder="房间号">
			  </div>
			  <div class="form-group col-md-3">
			    <label for="sex">性别</label>
			    <input type="text" class="form-control" id="sex" name="sex" placeholder="性别">
			  </div>
			  <div class="form-group col-md-3">
			    <label for="password">密码</label>
			    <input type="text" class="form-control" id="password" name="password" placeholder="密码">
			  </div>
			  <div class="form-group col-md-3">
			    <label for="tel">手机号</label>
			    <input type="text" class="form-control" id="tel" name="tel" placeholder="手机号">
			  </div>
			  <div class="form-group col-md-3">
			    <label for="institute">学院</label>
			    <input type="text" class="form-control" id="institute" name="institute" placeholder="学院">
			  </div>
			  <div class="form-group col-md-3">
			    <label for="majorname">专业</label>
			    <input type="text" class="form-control" id="majorname" name="majorname" placeholder="专业">
			  </div>
			  <div class="form-group col-md-3">
			    <label for="grade">年级</label>
			    <input type="text" class="form-control" id="grade" name="grade" placeholder="年级">
			  </div>
			  <div class="form-group col-md-3">
			    <label for="classname">班级</label>
			    <input type="text" class="form-control" id="classname" name="classname" placeholder="班级">
			  </div>
			  <div class="form-group col-md-3">
			    <label for="dname">宿舍楼</label>
			    <input type="text" class="form-control" id="dname" name="dname" placeholder="宿舍楼">
			  </div>
			  <button type="submit" class="btn btn-primary">添 加</button>
			</form>
        </main>
        <form id="deleteEmpForm" method="post">
            <input type="hidden" name="_method" value="delete">
        </form>
    </div>
</div>

<!-- Bootstrap core JavaScript
================================================== -->
<!-- Placed at the end of the document so the pages load faster -->
<script src="./dashboard_files/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="./dashboard_files/popper.min.js"></script>
<script src="./dashboard_files/bootstrap.min.js"></script>

<!-- Icons -->
<script src="./dashboard_files/feather.min.js"></script>
<script>
    feather.replace()
</script>

<script>
    $(".deleteBtn").click(function () {
        $("#deleteEmpForm").attr("action",$(this).attr("del_uri")).submit();

    })
</script>

</body></html>