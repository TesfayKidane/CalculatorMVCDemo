<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML>
<html>
<head>
<title>Calculator Form</title>
<style type="text/css">
@import url(resources/css/main.css);
</style>
</head>
<body>

	<div id="global">
		<c:if test="${errors != null}">

			<p id="errors">Error(s)!
			<ul>
				<c:forEach var="error" items="${errors}">
					<li>${error}</li>
				</c:forEach>
			</ul>


		</c:if>

		<form action="calculate" method="post">
			<fieldset>
				<legend>Calculate</legend>
				<input name="add1" type="text" class="textBox" />+ <input
					name="add2" type="text" class="textBox" />= <input name="sum"
					type="text" class="textBox" /> <br> <input name="multi1"
					type="text" class="textBox" />* <input name="multi2" type="text"
					class="textBox" />= <input name="product" type="text"
					class="textBox" /> <br> <input type="submit" value="Submit" />
			</fieldset>
		</form>
	</div>
</body>
</html>