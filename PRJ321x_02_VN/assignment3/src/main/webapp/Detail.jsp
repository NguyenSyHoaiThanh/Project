<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/detail.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css" integrity="sha512-1ycn6IcaQQ40/MKBW2W4Rhis/DbILU74C1vSrLJxCq57o941Ym01SwNsOMqvEBFlcgUa6xLiPY/NS5R+E6ztJQ==" crossorigin="anonymous" referrerpolicy="no-referrer" />
</head>
<body>

    <div class="container">
		<jsp:include page="Header.jsp" />
		
		 <div class = "main-wrapper" >
        <div class = "container">
            <div class = "product-div">
                <div class = "product-div-left">
                    <div class = "img-container">
                        <img src = "${detail.src}" alt = "phone">
                    </div>
                    <div class = "hover-container">
                        <div><img src = "${detail.src}"></div>
                        <div><img src = "img/cat-logo.png"></div>
                        <div><img src = "img/cat-logo.png"></div>
                        <div><img src = "img/cat-logo.png"></div>
                        <div><img src = "img/cat-logo.png"></div>
                    </div>
                </div>
                <div class = "product-div-right">
                    <span class = "product-name">${detail.name}</span>
                    <span class = "product-price">${detail.price}</span>
                    <div class = "product-rating">
                        <span><i class = "fas fa-star"></i></span>
                        <span><i class = "fas fa-star"></i></span>
                        <span><i class = "fas fa-star"></i></span>
                        <span><i class = "fas fa-star"></i></span>
                        <span><i class = "fas fa-star-half-alt"></i></span>
                        <span>(350 ratings)</span>
                    </div>
                    <p class = "product-description">${detail.description}</p>
                    <div class = "btn-groups">
                        <button type = "button" class = "add-cart-btn"><i class = "fas fa-shopping-cart" onclick="buy('${o.id}')"></i>add to cart</button>
                        <button type = "button" class = "buy-now-btn"><i class = "fas fa-wallet"></i>buy now</button>
                    </div>
                </div>
            </div>
        </div>
    </div>
		
        <jsp:include page="Footer.jsp" />
    </div>

    
  
    <script src="js/detail.js"></script>
 	
</body>
</html>
<script type="text/javascript">
	function buy(id) {
		document.f.action ="buy?id=" + id;
		document.f.submit();
	}
</script>