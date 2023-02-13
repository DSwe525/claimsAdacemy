<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="/css/home.css">
    <link rel="stylesheet" href="/css/signin.css">
</head>
<body class="flex-col">
        <div class="header flex-row">
            <div class="half-width">
            <h2 class="h2-pimp">PIMP MY RIDE</h2>
                <a href="/" class="header-link">Home</a>
                <a href="/buypmr" class="header-link">Buy a PMR</a>
            </div>
            <div class="half-width justify-right">
                <a href="/signin" class="header-link-two">Sign In</a>
                <a href="/signup" class="header-link-two">Sign Up</a>
            </div>
        </div>
    <div class="main-content bg2">
        <form:form modelAttribute="pimp" action="signin" method="post">
            <div class="sign-up-box flex-col">
                    <h1>Sign in to PMR</h1>
                    <label>Email</label>
                    <form:input type="text" class="" path="email" />
                    <label>Password</label>
                    <form:input type="password" class="" path="password" />
                    <form:button type="submit" class="button-wrapper">Submit</form:button>
            </div>  
        </form:form>
    </div>
    </div>
</body>
</html>
