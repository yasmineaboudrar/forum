<%@ page language="java" contentType="text/html;  charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<link rel="stylesheet" type="text/css"
	href="../ForumProject/css/bootstrap.css" />
<link rel="stylesheet" type="text/css"
	href="../ForumProject/css/btn.css" />
<link rel="stylesheet" type="text/css"
	href="../ForumProject/mycss.css" />

<title>LOGIN</title>
</head>

<body>

	<!-- fin navbar -->
	<!--contenue -->
	<br />
	<div class="container ">
		<h1 class="d-flex justify-content-center">Connectez-vous</h1>
		<div class="container d-flex justify-content-center"
			style="background-color: rgba(51, 170, 51, .1); width: 600px; border-radius: 20px; padding: 20px;">
			<form method="POST" action="">
				<div class="form-group">
					<label for="exampleInputEmail1">email</label> <input type="text"
						class="form-control " name="email" id="exampleInputEmail1"
						aria-describedby="emailHelp" placeholder="Username"
						required="required">
				</div>
				<div class="form-group">
					<label for="exampleInputPassword1">Password</label> <input
						required="required" type="password" class="form-control"
						name="password" id=" exampleInputPassword1" placeholder="Password">
				</div>
				<div class="form-check">
					<input type="checkbox" class="form-check-input" id="exampleCheck1">
					<label class="form-check-label" for="exampleCheck1">Check
						me out</label>
				</div>
				<button type="submit" class="button "  style="width: 100px;">LOGIN</button>
				<span style="padding-left: 30px; padding-right: 30px;"> or </span>
				<a class="btn btn-success" href="Register"  style="width: 100px;">SIGN UP</a>
			</form>

		</div>
		
		
		
		<c:if test='${err=="true"}'>
			<br>
			<div class="row">
				<div class="col-sm-4"></div>
				<div class="col-sm-4 alert alert-danger" role="alert">Username ou password incorrect !</div>
			</div>
		</c:if>
	</div>
	</div>
	<!--Fin-->
	<!-- script -->
	<script src="../ForumProject/js/jquery.js"></script>
	<script src="../ForumProject/js/bootstrap.js"></script>
	<!-- btn jcript -->		
	</script>
</body>

</html>