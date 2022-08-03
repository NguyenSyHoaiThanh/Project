<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri ="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/trangchu.css">
    <title>Header home page</title>
</head>
<body>
   <header>
         <a href="/assignment/Controller?action=Home"><img src="img/cat-logo.png" alt="logo" class="img-logo"></a>
             <ul>
                 <li><a href="/assignment/Controller?action=Home">Trang chủ</a></li>
                 <li>
                     <form>
                         <label>xem giá tại:</label>
                         <select>
                           <option>Miền Nam</option>
                           <option>Miền Trung</option>
                           <option>Miền Bắc</option>
                         </select>
                       </form>
                 </li>
                 <li>
                    <div class="search-container">
    					<form action="search" method="post">
      						<input type="text" placeholder="Search.." name="search" value="${txtS}">
      						<button type="submit" style="margin-top: 37px; height: 30px;"><i class="fa fa-search"></i></button>
    					</form>
  					</div>
                 </li>
                 
				 <c:set var = "size" value="${sessionScope.size}"/>
                 <c:if test="${sessionScope.acc.role == 0}">
                 	<li onclick="buy('${o.id}')"><a href="/assignment/Controller?action=cart">Giỏ hàng(${size})</a></li>
                 </c:if>
                 
                 <c:if test="${sessionScope.acc.role == 1}">
                 	<li><a href="/assignment/Controller?action=admin">admin</a></li>
                 </c:if>
                 
                 <c:if test="${sessionScope.acc.role == 2}">
                 	<li><a href="#">Bán hàng</a></li>
                 </c:if>
                 
                 <c:if test="${sessionScope.acc != null}">
                 	<li><a href="#">Hello ${sessionScope.acc.name}</a></li>
                 	<li><a href="/assignment/Controller?action=logout">Đăng xuất</a></li>
                 </c:if>
                 
                 <c:if test="${sessionScope.acc == null}">
                 	
                 		<li onclick="buy('${o.id}')"><a href="/assignment/Controller?action=cart">Giỏ hàng(${size})</a></li>
                 	
                 	
                 	<li><a href="#">Liên hệ</a></li>
                 	<li><a href="/assignment/Controller?action=login">Đăng nhập</a></li>
                 	
                 </c:if>
             </ul>
    </header>
</body>
</html>

<script type="text/javascript">
	function buy(id) {
		document.f.action ="buy?id=" + id;
		document.f.submit();
	}
</script>