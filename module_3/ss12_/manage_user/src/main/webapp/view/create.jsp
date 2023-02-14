<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Create new users</h1>
<p>
    <c:if test='${requestScope["message"] != null}'>
        <span class="message">${requestScope["message"]}</span>
    </c:if>
</p>
<p><a href="/users">Back to users list</a></p>
<form method="post">
    <fieldset >
        <legend>Users information</legend>
        <table>
            <tr>
                <td>Name: </td>
                <td><input name="name" id="name"  type="text" ></td>
            </tr>
            <tr>
                <td>Email: </td>
                <td><input name="email" id="email"  type="text" ></td>
            </tr>
            <tr>
                <td>Country: </td>
                <td><input name="country" id="country"  type="text" ></td>
            </tr>

            <tr>
                <td></td>
                <td><input type="submit" value="Create product"></td>
            </tr>
        </table>
    </fieldset>
</form>

</body>
</html>
