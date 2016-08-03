<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户注册</title>
<link rel="stylesheet" href="<%=path%>/css/bootstrap.min.css"  />
</head>
<body>
	<form class="form-inline">
		<div class="form-group">
			<label for="exampleInputEmail1">Email address</label>
			<input type="email" style="width: 200px;" class="form-control" id="exampleInputEmail1" placeholder="Email">
		</div>
		<button type="submit" class="btn btn-default">Submit</button>
	</form>
	<script type="text/javascript">
	$(".btn-default").click(function (){
		
	}).clear();;
	</script>
</body>
</html>