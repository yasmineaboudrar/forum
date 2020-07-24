<%@ page language="java" contentType="text/html;  charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
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

<title>Inscrire</title>
</head>

<body>

	<!--contenue -->
	<br />
	<div class="container ">
		<h1 class="d-flex justify-content-center">S'inscrire</h1>
		<div class="container d-flex justify-content-center"
			style="background-color: rgba(51, 170, 51, .1); width: 500px; border-radius: 20px; padding: 20px;">
			<form method="POST" action="">
				<div class="form-row">

					<div style="padding-left: 30px; padding-right: 30px;" class="form-group">
						<label for="exampleInputEmail1">Email</label> <input type="email"
							class="form-control " id="exampleInputEmail1"
							aria-describedby="emailHelp" placeholder="Enter email"
							name="email" required>
					</div>
					<div  class="form-group">
						<label for="exampleInputPassword1">Nom de l'utilisateur</label> <input
							type="text" class="form-control" name="username"
							id="exampleInputPassword1" placeholder="Username" required>
					</div>
					<div style="padding-left: 30px; padding-right: 30px;" class="form-group">
						<label for="exampleInputPassword1">Mot de passe</label> <input 
							type="password" class="form-control" name="password"
							id="exampleInputPassword1" placeholder="Password" required>
					</div>
				</div>

				<div style="margin-left: auto; margin-right: auto;">
					<button type="submit" class="button" style="width: 100px;">SIGN
						UP!</button>
					<span style="padding-left: 30px; padding-right: 30px;"> or </span>
					<a class="btn btn-success" href="Login" style="width: 100px;">LOGIN</a>
				</div>
		</div>

		</form>

	</div>
	</div>
	</div>
	<!--Fin-->
	<!-- script -->
	<script src="../ForumProject/js/jquery.js"></script>
	<script src="../ForumProject/js/bootstrap.js"></script>
	<!-- btn jcript -->
	<script src="../ForumProject/js/btnMusic.js"></script>
	<script src="../b/js/othmanejs.js">
		
	</script>
</body>

</html>