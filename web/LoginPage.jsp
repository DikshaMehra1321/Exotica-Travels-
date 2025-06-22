<%-- 
    Document   : LoginPage
    Created on : Jun 28, 2012, 4:09:13 PM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<title>Login Page</title>
</head>
<body>
    <jsp:include page="Template.jsp"></jsp:include>
<td valign="top">
<form action='ValidationServlet' method='Post'>
<table cellspacing='10' align='center'>
<tr>
<td><font color='darkblue' size='+2'>Login Form
</tr>
</td>
</table>
<table cellspacing='10' align='center'border='2' bordercolor='black'>
<tr><td bordercolor='white'>User Id:<td COLSPAN='2'bordercolor='white'><input type='text' name='uid'>
<tr><td bordercolor='white'>Password:<td COLSPAN='2' bordercolor='white'><input type='password' name='pwd'>
<tr><td bordercolor='white'>Role:<td bordercolor='white'><input type='Radio'value='administrator'name='r1'>Administrator
<td bordercolor='white'><input type='Radio'value='customer'name='r1'>Customer
<tr><td bordercolor='white'></br>
<tr><td bordercolor='white'><input type='Submit'value='Submit'>
<td bordercolor='white'><input type='RESET'text='Reset'>
</table>
</form>
</body>
</html>

