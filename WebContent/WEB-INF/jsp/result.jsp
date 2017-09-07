<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML>
<html>
<head>
<title>Calculator Result</title>
<style type="text/css">
@import url(resources/css/main.css);
</style>
</head>
<body>
<div id="global">
	<form action="calculator" method="get">
		<fieldset>
			<legend>Calculate Result</legend>
			<input name="add1" type="text" class="textBox" readonly
				value="${calculator.add1}" />+ <input name="add2" type="text"
				class="textBox" readonly value=<c:out value="${calculator.add2}"/>>=

			<input name="sum" type="text" class="textBoxBlue" readonly
				value=<c:out value="${calculator.sum}"/>> <br> <input
				name="mult1" type="text" class="textBox" readonly
				value=<c:out value="${calculator.multi1}"/>>* <input
				name="mult2" type="text" class="textBox" readonly
				value=<c:out value="${calculator.multi2}"/>>= <input
				name=product " type="text" class="textBox" readonly
				value=<c:out value="${calculator.product}"/>> <br> <br>
			<input type="submit" value="Try Again" />
		</fieldset>
	</form>
</div>
</body>
</html>