<%--
  Created by IntelliJ IDEA.
  User: THC
  Date: 2/14/2023
  Time: 3:06 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Delete Users</h1>
<p>
    <a href="/users">Back to users list</a>
</p>
<form method="post">
    <h3>Are you sure?</h3>
    <fieldset>
        <legend>Users information</legend>
        <table>
            <tr>
                <td>Name:</td>
                <td>${user.name}</td>
            </tr>
            <tr>
                <td>Email:</td>
                <td>${user.email}</td>
            </tr>
            <tr>
                <td>Country:</td>
                <td>${user.country}</td>
            </tr>

            <tr>
                <td><input type="submit" value="Delete user"></td>
                <td><a href="/users">Back to Users list</a></td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>
