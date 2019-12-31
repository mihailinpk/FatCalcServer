<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//RU" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<body>
<h2 align="center">Простой конвертор мили-километры</h2>
<p align="center">Введите количество миль<br>и нажмите "Посчитать":</p>
<form action="/SIMPLE_CONVERTOR_war_exploded/Convert" method="GET">
    <p align="center"><input type="text" name="miles"></p>
    <p align="center"><input type="submit" value="Посчитать"></p>
</form>
<h3 align="center">${km}</h3>
</body>
</html>