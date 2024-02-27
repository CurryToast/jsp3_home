<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Header</title>
	<style type="text/css">
		ul {
			list-style: none;
			padding: 20px;
			display: flex;
			border-bottom: 3px solid gray;
		}
		
		li {
			padding: 20px;
		}
		
		a {
			text-decoration: none;
		}
		
		a > span {
			font-weight: 700;
		}
	</style>
</head>
<body>
	<ul class="header-ul">
		<li><a href="${pageContext.request.contextPath}"><span>HOME</span></a></li>
		<li><a href="${pageContext.request.contextPath}/customer/join">회원등록</a></li>
		<li><a href="${pageContext.request.contextPath}/product">상품목록</a></li>
		<li><a href="${pageContext.request.contextPath}/mypage">마이페이지</a></li>
		<li><a href="${pageContext.request.contextPath}/cart">장바구니</a></li>
		<li><a href="${pageContext.request.contextPath}/login">로그인</a></li>
	</ul>
</body>
</html>