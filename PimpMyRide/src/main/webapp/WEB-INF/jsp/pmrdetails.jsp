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
    <link rel="stylesheet" href="/css/pmrdetails.css">
</head>
<body class="flex-col">
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
                    <a href="/profile" class="header-link-two">Profile</a>
                    <a href="/logoff" class="header-link-two">Log Out</a>
                    <h2 class="Logged-in-text">Welcome ${pimp.getName()}</h2>
                </div>
        </div>
    <div class="main-content bg2">
        <div class="justify-center">
                <div class="pmr-boxes flex-col">
                    <div class="car-text-top">
                        <br>${car.year}
                        ${car.make}
                        ${car.model}
                    </div>
                    <div>
                        <img class ="car-image" src="${car.image}" alt="">
                    </div>
                    <div class="flex-row car-text">
                        Price:      $ ${car.price}
                        <br>Vin:      ${car.vin}
                        <br>Milage:      ${car.milage}
                        <br>Description:      ${car.description}
                    </div>
                    <form:form modelAttribute="car" action="/pmrdetails/${car.vin}" method="post">
                        <form:button type="submit" class="button-format">Buy This Pimped Out Ride</form:button>
                    </form:form>
                </div>
            </div>
        </div>
    </body>
    </html>