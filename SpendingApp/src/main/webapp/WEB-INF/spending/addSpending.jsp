<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add an Expense</title>
<jsp:include page="/WEB-INF/bootstrapHead.jsp" />
</head>
<body>

	<div>	
		<form action="addSpendingForm.do" method="POST">
		<label for="groceries">Groceries: </label> <input type="number" name="groceries" min="0" required><br>
		<label for="billsUtilities">Bill-Utilities: </label> <input type="number" name="billsUtilities" min="0" required><br>
		<label for="shopping">Shopping: </label> <input type="number" name="shopping" min="0" required><br>
		<label for="gas">Gas: </label> <input type="number" name="gas" min="0" required><br>
		<label for="car">Car: </label> <input type="number" name="car" min="0" required><br>
		<label for="healthInsurance">Health Insurance: </label> <input type="number" name="healthInsurance" min="0" required><br>
		<input class="btn btn-primary" type="submit" value="Submit">
		</form>
		<a class="btn btn-primary" href="home.do" role="button">Home</a>
	</div>



	<jsp:include page="/WEB-INF/bootstrapFoot.jsp" />

</body>
</html>