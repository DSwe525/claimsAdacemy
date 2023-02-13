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
    <link rel="stylesheet" href="/css/profile.css">
</head>
<body class="flex-col">
    <div class="header flex-row">
        <div class="half-width">
            <h2 class="h2-pimp">PIMP MY RIDE</h2>
            <a href="/" class="header-link">Home</a>
            <a href="/buypmr" class="header-link">Buy a PMR</a>
            <c:if test="${pimp.role == 'Admin'}" >
                <a href="/admin" class="header-link">Admin</a>
            </c:if>
        </div>
        <div class="half-width justify-right">
            <a href="/profile" class="header-link-two">Profile</a>
            <a href="/logoff" class="header-link-two">Log Out</a>
            <h2 class="Logged-in-text">Welcome ${pimp.getName()}</h2>
        </div>
    </div>
    <div class="main-content bg2">
        <form:form modelAttribute="pimp" action="profile" method="post">
            <div class="sign-up-box flex-col">
                <h1>Account Info</h1>
                <label>Name</label>
                <form:input type="text" class="" path="name" />
                <label>Phone Number</label>
                <form:input type="text" class="" path="phoneNumber" />
                <label>Email</label>
                <form:input type="text" class="" path="email" />
                <label>Password</label>
                <form:input type="password" class="" path="password" />
                <form:button type="submit" class="button-wrapper">Submit</form:button>
            </div>
        </form:form>
    </div>
</body>
</html>