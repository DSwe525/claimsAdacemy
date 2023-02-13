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
    <link rel="stylesheet" href="/css/addcar.css">
</head>
<body class="flex-col">
        <div class="header flex-row">
            <div class="half-width">
            <h2 class="h2-pimp">PIMP MY RIDE</h2>
                <a href="/" class="header-link">Home</a>
                <a href="/buypmr" class="header-link">Buy a PMR</a>
                <a href="/admin" class="header-link">Admin</a>
            </div>
                <div class="half-width justify-right">
                    <a href="/profile" class="header-link-two">Profile</a>
                    <a href="/logoff" class="header-link-two">Log Out</a>
                    <h2 class="Logged-in-text">Welcome ${pimp.getName()}</h2>
                </div>
        </div>
    <div class="main-content bg">
        <form:form modelAttribute="car" action="addcar" method="post">
            <div class="sign-up-box flex-col">
                <h1>Add A New Ride</h1>
                <form:select path="newOrUsed">
                <form:option value="new">New</form:option>
                <form:option value="used">Used</form:option>
                </form:select>
                <label>Price</label>
                <form:input type="text" class="" path="price" />
                <label>Make</label>
                <form:input type="text" class="" path="make" />
                <label>Model</label>
                <form:input type="text" class="" path="model" />
                <label>Year</label>
                <form:input type="text" class="" path="year" />
                <label>Vin Number</label>
                <form:input type="text" class="" path="vin" />
                <label>Milage</label>
                <form:input type="text" class="" path="milage" />
                <label>Description</label>
                <form:input type="text" class="" path="description" />
                <label>Image</label>
                <form:input type="text" class="" path="image" />
                <form:button type="submit" class="button-wrapper">Submit</form:button>
            </div>
        </form:form>
    </div>
</body>
</html>