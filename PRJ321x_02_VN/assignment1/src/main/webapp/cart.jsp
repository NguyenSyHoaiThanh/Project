<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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
            <tr>
                <td>
                    <div class="cart-info">
                        <img src="<%= request.getContextPath()%>/img/iphone_12.png" alt="iphone 12">
                        <div>
                            <p>iPhone 12 Pro Max 128GB Chính hãng</p>
                            <small>Price: 18.990.000<sup>đ</sup></small>
                            <br>
                            <a href="#">remove</a>
                        </div>
                    </div>
                </td>
                <td><input type="number" value="1"></td>
                <td><span>18.990.000</span><sup>đ</sup></td>
            </tr>
            <tr>
                <td>
                    <div class="cart-info">
                        <img src="<%= request.getContextPath()%>/img/iphone_13.png" alt="iphone 13">
                        <div>
                            <p>iPhone 13 128GB Chính hãng</p>
                            <small>Price: 20,490,000<sup>đ</sup></small>
                            <br>
                            <a href="#">remove</a>
                        </div>
                    </div>
                </td>
                <td><input type="number" value="1"></td>
                <td><span>20,490,000</span><sup>đ</sup></td>
            </tr>
            <tr>
                <td>
                    <div class="cart-info">
                        <img src="<%= request.getContextPath()%>/img/samsung_s22_plus.png" alt="samsung_s22_plus">
                        <div>
                            <p>Samsung Galaxy S22 Plus (8GB + 128GB)</p>
                            <small>Price: 25.990.000<sup>đ</sup></small>
                            <br>
                            <a href="#">remove</a>
                        </div>
                    </div>
                </td>
                <td><input type="number" value="1"></td>
                <td><span>25.990.000</span><sup>đ</sup></td>
            </tr>
        </table>
        <div class="total-price">
            <table>
                <tr>
                    <td>subtotal</td>
                    <td>65.470.000 <sup>đ</sup></td>
                </tr>
                <tr>
                    <td>tax</td>
                    <td>6.547.000 <sup>đ</sup></td>
                </tr>
                <tr>
                    <td>total</td>
                    <td>72.017.000 <sup>đ</sup></td>
                </tr>
            </table>
        </div>
    </div>
        <jsp:include page="Footer.jsp" />
    </div>
</body>
</html>