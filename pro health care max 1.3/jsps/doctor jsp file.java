<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Doctor Registration</title>
</head>
<body style="background-color:skyblue">
<center>
<h1>Doctor Registration</h1>
<hr>
<form action="saveview" method="post">
<pre>
FirstName:<input type="text" name="fname"/>
LastNmae:<input type="text" name="lname"/>
Email:<input type="email" name="email"/>
Mobile:<input type="mobile" name="mobile"/>
<input type="submit" value="Register Doctor"/>
</pre>
</form>
</hr>

</body>
</center>
</html>