<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update</title>
<jsp:include page="/WEB-INF/bootstrapHead.jsp"/>
</head>
<body>

	<div>
		<h3>Expense ID: ${spending.id}</h3>
		<form action="updateSpendingForm.do" method="POST">
		<input type="hidden" name="id" value="${spending.id}">
		<label for="groceries">Groceries: </label> <input type="number" name="groceries" value="${spending.groceries}" min="0" required><br>
		<label for="billsUtilities">Bill-Utilities: </label> <input type="number" name="billsUtilities" value="${spending.billsUtilities}" min="0" required><br>
		<label for="shopping">Shopping: </label> <input type="number" name="shopping" value="${spending.shopping}" min="0" required><br>
		<label for="gas">Gas: </label> <input type="number" name="gas" value="${spending.gas}" min="0" required><br>
		<label for="car">Car: </label> <input type="number" name="car"  value="${spending.car}" min="0" required><br>
		<label for="healthInsurance">Health Insurance: </label> <input type="number" name="healthInsurance" value="${spending.healthInsurance}" min="0" required><br>
		<input class="btn btn-primary" type="submit" value="Submit">
		</form>
		<a class="btn btn-primary" href="home.do" role="button">Home</a>
	</div>



	<jsp:include page="/WEB-INF/bootstrapFoot.jsp"/>

</body>
</html>