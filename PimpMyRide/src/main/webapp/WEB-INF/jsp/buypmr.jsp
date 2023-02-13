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
    <link rel="stylesheet" href="/css/buypmr.css">
    <link rel="stylesheet" href="/css/admin.css">
</head>
<body class="flex-col">
    <c:choose>
    <c:when test="${pimp != null}">
        <div class="header flex-row">
            <div class="half-width">
            <h2 class="h2-pimp">PIMP MY RIDE</h2>
                <a href="/" class="header-link">Home</a>
                <a href="/buypmr" class="header-link">Buy a PMR</a>
            </div>
                <div class="half-width justify-right">
                    <a href="/profile" class="header-link-two">Profile</a>
                    <a href="/logoff" class="header-link-two">Log Out</a>
                    <h2 class="Logged-in-text">Welcome ${pimp.getName()}</h2>
                </div>
        </div>
    </c:when>
    <c:otherwise>
        <div class="header flex-row">
            <div class="half-width">
            <h2 class="h2-pimp">PIMP MY RIDE</h2>
                <a href="/" class="header-link">Home</a>
                <a href="/buypmr" class="header-link">Buy a PMR</a>
                <c:if test="${pimp.role == 'Admin'}">
                    <a href="/admin" class="header-link">Admin</a>
                </c:if>
            </div>
            <div class="half-width justify-right">
                <a href="/signin" class="header-link-two">Sign In</a>
                <a href="/signup" class="header-link-two">Sign Up</a>
            </div>
        </div>
    </c:otherwise>
    </c:choose>
    <div class="main-content flex-row bg3">
        <div class="pmr-one-fifth flex-col">
            <div class="pmr-half-height">
                <a href="/buypmr/new" class="buttons2" var="new">New</a>
                <a href="/buypmr/used" class="buttons2" var="used">Used</a>
            </div>
            <div class="flex-col pmr-half-height">
            <c:forEach items="${allMakes}" var="make"> 
                <a href="/buypmr/${car.getMake()}$" class="buttons2" var="make">${make}</a>
            </c:forEach>
            </div>
        </div>
        <div class="pmr-four-fifth justify-center">
        <c:forEach items="${allCars}" var="car">
            <div class="pmr-boxes flex-col">
                <div class="car-text">
                    <br>${car.year}
                    ${car.make}
                    ${car.model}
                </div>
                <div>
                    <img class ="car-image" src="${car.image}" alt="">
                </div>
                    <div class="flex-row">
                    Price: $ ${car.price}
                    <br>Vin: ${car.vin}
                    <br>Milage: ${car.milage}
                </div>
            <a href="/pmrdetails/${car.vin}" class="button-format">See Vehicle Details</a>
            </div>
        </c:forEach>
        </div>
    </div>
</body>
</html>