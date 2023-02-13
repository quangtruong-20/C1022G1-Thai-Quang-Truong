<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create new product</title>
    <style>
        .message{
            color:green;
        }
    </style>
</head>
<body>
<h1>Create new products</h1>
<p>
<c:if test='${requestScope["message"] != null}'>
<span class="message">${requestScope["message"]}</span>
</c:if>
</p>
<p><a href="/products">Back to product list</a></p>
<form method="post">
    <fieldset >
        <legend>Product information</legend>
        <table>
        <tr>
            <td>Name: </td>
            <td><input name="name" id="name"  type="text" ></td>
        </tr>
        <tr>
            <td>Price: </td>
            <td><input name="price" id="price"  type="text" ></td>
        </tr>
        <tr>
            <td>Detail: </td>
            <td><input name="detail" id="detail"  type="text" ></td>
        </tr>
        <tr>
            <td>Nsx: </td>
            <td><input name="nsx" id="nsx"  type="nsx" ></td>
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
