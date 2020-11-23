
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<html>
<head>
    <title>App</title>
</head>
<body>
<h2>Sandwich Condiments</h2>
<form action="/home">
    <p>Lettuce:</p>
<input type="checkbox" name="name" value="Lettuce "><br>
    <p>Tomato:</p>
<input type="checkbox" name="name" value="Tomato "><br>
    <p>Mustard:</p>
<input type="checkbox" name="name" value="Mustard "><br>
    <p>Sprouts:</p>
<input type="checkbox" name="name" value="Sprouts "><br>
    <input type="submit" value="save">
</form>

<p>${list}</p>
</body>
</html>
