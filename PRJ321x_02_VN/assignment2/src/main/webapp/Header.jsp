<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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
                 <li><a href="#">Trang chủ</a></li>
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
                     <div>
                         <form>
                             <input type="search" placeholder="Bạn cần tìm gì?" name="search">
                             <button type="submit">tìm kiếm</button>
                           </form>
                     </div>
                 </li>
                 <li><a href="/assignment/Controller?action=cart">Giỏ hàng</a></li>
                 <li><a href="/assignment/Controller?action=login">Đăng nhập</a></li>
                 <li><a href="#">Liên hệ</a></li>
             </ul>
    </header>
</body>
</html>