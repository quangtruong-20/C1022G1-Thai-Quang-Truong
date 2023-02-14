<%--
  Created by IntelliJ IDEA.
  User: THC
  Date: 2/13/2023
  Time: 8:56 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>product details</h1>
<p>
    <a href="/products">Back to product list</a>
</p>
<table>
    <tr>
        <td>Name: </td>
        <td>${requestScope["product"].getName()}</td>
    </tr>
    <tr>
        <td>Price: </td>
        <td>${requestScope["product"].getPrice()}</td>
    </tr>
    <tr>
        <td>Detail: </td>
        <td>${requestScope["product"].getDetail()}</td>
    </tr>
    <tr>
        <td>NSX: </td>
        <td>${requestScope["product"].getNsx()}</td>
    </tr>

</table>
</body>
</html>
