<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
<s:head/>
</head>
<body>
<h1>Registration</h1>
<s:form action="registrationAction">
<s:textfield name="firstName" label="first name"></s:textfield>
<s:textfield name="lastName" label="last name"></s:textfield>
<s:radio name="gender" list="{'Male','Female'}" label="Gender"></s:radio>
<s:textfield name="age" label="Your age"></s:textfield>
<s:textfield name="emaill" label="Email"></s:textfield>
<s:textarea name="address" cols="30" rows="7" label="Address"></s:textarea>
<s:select  list="{'Red','Blue','Green','White'}" name="selectedColor" headerKey="None" headerValue="select a color" label="favourite color"></s:select>

<s:reset value="Reset"></s:reset>
<s:submit value="Register"></s:submit>

</s:form>

</body>
</html>