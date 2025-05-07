<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Patient Registration</title>
</head>
<body style="background-color:skyblue">
<center>
<h1>Patient Registration</h1>
<hr>
<form action="savepatient" method="post">
<pre>
FirstName:<input type="text" name="fname"/>
LastNmae:<input type="text" name="lname"/>
Email:<input type="email" name="email"/>
Mobile:<input type="mobile" name="mobile"/>
Age:<input type="age" name="age"/>
BloodGroup:<input type="bloodgroup" name="bloodgroup"/>
<input type="submit" value="Register Patient"/>
</pre>
</form>
</hr>

</body>
</center>
</html>