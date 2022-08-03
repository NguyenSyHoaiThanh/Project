<%@page import="model.Cart"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri ="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/trangchu.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css">
    <title>Card-product</title>
</head>
<body>
	<section class="container">
	<form name ="f" action="" method="post">
	<c:forEach items="${listP}" var="o">
			<div class="card">
                <div class="card-image"><a href="detail?DetailId=${o.id}"><img src="${o.src}" alt=""></a></div>
                <a href="detail?DetailId=${o.id}"><h2><b>${o.name}</b></h2></a> 
                <a href="detail?DetailId=${o.id}" style="color: red;"><p>$<span>${o.price}</span></p></a>
      			
      			
    			<input class="button_1" type="submit" onclick="buy('${o.id}')" value="Buy item"/>
    			<input type="hidden" name="num" value="1">
            </div>
	</c:forEach>
	</form>
	</section>
</body>
</html>
<script type="text/javascript">
	function buy(id) {
		document.f.action ="buy?id=" + id;
		document.f.submit();
	}
</script>