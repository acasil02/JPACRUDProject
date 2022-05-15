<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Spendings</title>
</head>
<body>

	<div>
		<h5>${spending.groceries}(${spending.bills-utilities})</h5>
		<h6>${spending.shopping}</h6>
		<h6>${spending.gas}</h6>
		<h6>${spending.car}</h6>
		<h6>${spending.healthInsurance}</h6>
	</div>

</body>
</html>