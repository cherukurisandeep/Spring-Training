<%--
  Created by IntelliJ IDEA.
  User: sb-sandeep
  Date: 27/3/18
  Time: 1:22 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration Page</title>
</head>
<body>
<h2>Registration Page</h2>
<form action="users" method="post">
    <label>First Name:</label>
    <input type="text" name="firstName">
    <br>
    <label>Last Name</label>
    <input type="text" name="lastName">
    <br>
    <label>Age:</label>
    <input type="text" name="age">
    <br>
    <input type="submit" value="Submit">

</form>
</body>
</html>
