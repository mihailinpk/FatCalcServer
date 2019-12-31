<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//RU" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<c:set var="x" value="JSTL is working !!!"/>
<html>
<head>
    <meta charset="UTF-8">
    <title>Вычисление жирности тела</title>
</head>
<body bgcolor="#ff6600">
<h2 align="center">Приветствую, данная программа поможет вам вычислить жирность своего тела</h2>
<h3 align="center">Пожалуйста, заполните форму и нажмите кнопку "вычислить"</h3>
<form action="/IDEAL_WEIGHT_war_exploded/Calculate" method="GET">
    <table align="center" width="500" height="200" border="0" cellpadding="5" cellspacing="0">
        <tr>
            <td align="center">
                <fieldset align="center">
                    <legend>Пол</legend>
                    Мужской <input type="radio" name="sex" value="1" checked>
                    Женский <input type="radio" name="sex" value="2">
                </fieldset>
            </td>
            <td align="left">
                <p><input type="number" min="0" max="100" value="0" name="age"></input> Возраст</p>
                <p><input type="number" min="0" max="300" value="0" name="height"></input> Рост</p>
                <p><input type="number" min="0" max="300" value="0" name="weight"></input> Вес</p>
            </td>
        </tr>
        <tr>
            <td align="center" colspan="2"><h3 align="center">${bodyFatText}</h3></td>
        </tr>
        <tr>
            <td align="center" colspan="2">
                <input type="submit" value="Вычислить" style="height:30px; width:100px">
            </td>
        </tr>
    </table>
</form>
</body>
</html>