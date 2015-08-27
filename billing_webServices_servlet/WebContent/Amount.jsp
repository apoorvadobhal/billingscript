<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="biege">
<form method="get" action="ServletClientAppn">
<table align="center">
<tr bgcolor="pink">
<td>Amount</td>
<td><input type="text" name="amt"></td>
</tr>
<tr bgcolor="pink">
<td>Discount(%):</td> 
<td><input type="text" name="disc"></td>
</tr>
</table>
<center><input type="submit" value="calculate discount"></center>
</form>
</body>
</html>