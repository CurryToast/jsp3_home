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
	<ul>
		<li><a href="<%= request.getContextPath() %>"><span>HOME</span></a></li>
		<li><a href="${pageContext.request.contextPath}/customer/list">회원목록</a></li>
		<li><a href="${pageContext.request.contextPath}/customer/join">회원등록</a></li>
		<li><a href="${pageContext.request.contextPath}/product/list">상품목록</a></li>
		<li><a href="${pageContext.request.contextPath}/product/register">상품등록</a></li>
	</ul>
</body>
</html>