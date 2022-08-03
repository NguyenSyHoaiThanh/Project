<%@page import="model.Cart"%>
<%@page import="model.Product"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/cart.css">
    <title>cart</title>
</head>
<body>

	<div class="container">
		<jsp:include page="Header.jsp" />
		<div class="container-md cart-page">
        <table>
            <tr>
                <th>Product</th>
                <th>Quantity</th>
                <th>Subtotal</th>
            </tr>	
            <c:set var = "o" value="${sessionScope.cart}"/>
            <c:set var = "t" value="0"/>
            <c:forEach items="${o.items}" var ="i">
            <c:set var = "t" value = "${t+1}"/>	
            <tr>
                <td>
                    <div class="cart-info">
                    	<img src = "${i.product.src}" alt="phone">
                        <div>
                            <p>${i.product.name}</p>
                            <small>Price:<fmt:formatNumber pattern="##.##" value="${i.price}"/></small>
                            <br>
                            <form action="process" method="post">
                            	<input type="hidden" name="id" value="${i.product.id}"/>
                            	<input type="submit" value="remove" style="width: 5em; height: 2em; color: red;text-align:center;"/>
                            </form>
                        </div>
                    </div>
                </td>
                <td>
                <button><a href="process?num=-1&id=${i.product.id}">-</a></button>
                <input type="text" readonly="readonly" value="${i.quantity}"/>
                <button><a href="process?num=1&id=${i.product.id}">+</a></button>
                </td>
                <td><fmt:formatNumber pattern="##.##" value="${i.quantity*i.price}"/> </td>
            </tr>
            </c:forEach>
            </table>
        	<div class="total-price">
        	
            	<table>
                <tr>
                    <td>subtotal</td>
                    <td><sup>$</sup></td>
                </tr>
                <tr>
                    <td>tax</td>
                    <td><sup>$</sup></td>
                </tr>
                <tr>
                    <td>total</td>
                    <td><sup>$</sup></td>
                </tr>
                
            </table>
            
           
        </div>
             <form action="checkout" method="post" style="text-align: right">
				<input type="submit" value="check out">
			</form>
        
    </div>
        <jsp:include page="Footer.jsp" />
    </div>
</body>
</html>