<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
<meta charset="UTF-8">
<title>JSP3 Join</title>
</head>
<body>
	<main>
		<form action="" method="post">
			<div>
				<p>아이디 : </p>
				<input type="text" name="custom_id" placeholder="고객 아이디" required>
			</div>
			<div>
				<p>이름 : </p>
				<input type="text" name="name" placeholder="이름" required>
			</div>
			<div>
				<p>이메일 : </p>
				<input type="email" name="email" placeholder="이메일">
			</div>
			<div>
				<p>나이 : </p>
				<input type="number" name="age" min="0">
			</div>
			<button>등록</button>
		</form>
	</main>
</body>
</html>