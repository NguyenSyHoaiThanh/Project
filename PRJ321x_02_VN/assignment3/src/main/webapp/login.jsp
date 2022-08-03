<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/login.css">
    <title>Login</title>
</head>
<body>
	
	<div class="container">
		<form action="login" class="login active" method="post">
			<h2 class="title">Login with your account</h2>
			<p class="text-danger" style="color:red;">${ErrorMess}</p>
			<div class="form-group">
				<label for="email">Email</label>
				<div class="input-group">
					<input type="email" id="email" name="email" placeholder="Email address">
					<i class='bx bx-envelope'></i>
				</div>
			</div>
			<div class="form-group">
				<label for="password">Password</label>
				<div class="input-group">
					<input type="password" pattern=".{8,}" id="password" placeholder="Your password" name="password">
					<i class='bx bx-lock-alt' ></i>
				</div>
				<span class="help-text">At least 8 characters</span>
			</div>
			<button type="submit" class="btn-submit">Login</button>
			<a href="#">Forgot password?</a>
			<p>I don't have an account. <a href="#" onclick="switchForm('register', event)">Register</a></p>
		</form>

		<form action="signup" class="register" method="post">
			<h2 class="title">Register your account</h2>
			<div class="form-group">
				<label for="email">Email</label>
				<div class="input-group">
					<input type="email" id="email" name="email" placeholder="Email address">
					<i class='bx bx-envelope'></i>
				</div>
			</div>
			<div class="form-group">
				<label for="name">Name</label>
				<div class="input-group">
					<input type="text" id="email" name="name" placeholder="Name">
					<i class='bx bx-envelope'></i>
				</div>
			</div>
			<div class="form-group">
				<label for="password">Password</label>
				<div class="input-group">
					<input type="password" pattern=".{8,}" id="password" name="password" placeholder="Your password">
					<i class='bx bx-lock-alt' ></i>
				</div>
				<span class="help-text">At least 8 characters</span>
			</div>
			<div class="form-group">
				<label for="confirm-pass">Confirm password</label>
				<div class="input-group">
					<input type="password" id="confirm-pass" name="confirm-pass" placeholder="Enter password again">
					<i class='bx bx-lock-alt' ></i>
				</div>
				<span class="help-text">Confirm password must be same with password</span>
			</div>
			<button type="submit" class="btn-submit">Register</button>
			<p>I already have an account. <a href="#" onclick="switchForm('login', event)">Login</a></p>
		</form>
	</div>

	<script src="js/login.js"></script>
</html>