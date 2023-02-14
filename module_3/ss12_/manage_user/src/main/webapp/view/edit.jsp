<%--
  Created by IntelliJ IDEA.
  User: THC
  Date: 2/14/2023
  Time: 3:07 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Edit product</h1>
<p>
    <c:if test='${requestScope["message"] != null}'>
        <span class="message">${requestScope["message"]}</span>
    </c:if>
</p>
<p>
    <a href="/users">Back to user list</a>
</p>
<form method="post">
    <fieldset>
        <legend>user information</legend>
        <table>
            <tr>
                <td>Name: </td>
                <td><input type="text" name="name" id="name" value="${user.name}"></td>
            </tr>
            <tr>
                <td>Email: </td>
                <td><input type="text" name="email" id="email" value="${user.email}"></td>
            </tr>
            <tr>
                <td>Country: </td>
                <td><input type="text" name="country" id="country" value="${user.country}"></td>
            </tr>

            <tr>
                <td></td>
                <td><input type="submit" value="Update user"></td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>
