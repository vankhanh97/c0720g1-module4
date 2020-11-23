<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>App</title>
</head>
<body>
<form action="/home">
    <input type="text" placeholder="NUMBER 1" name="num1">
    <select name="operator">
        <option value="+">+</option>
        <option value="-">-</option>
        <option value="*">*</option>
        <option value="/">/</option>
    </select>
    <input type="text" placeholder="NUMBER 2" name="num2">
    <input type="submit" value="Calculate">
</form>
<h1>${result}</h1>
</body>
</html>
