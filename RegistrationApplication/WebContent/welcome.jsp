<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>welcome</title>
</head>
<body>
<h1>welcome</h1>
<s:label value="firstName"></s:label>
<s:property value="firstName"/><br/>
<s:label value="lastName"></s:label>
<s:property value="lastName"/><br/>
<s:label value="gender"></s:label>
<s:property value="gender"/><br/>
<s:label value="age"></s:label>
<s:property value="age"/><br/>
<s:label value="email"></s:label>
<s:property value="emaill"/><br/>
<s:label value="Address"></s:label>
<s:property value="address"/><br/>
<s:label value="Favourite Color"></s:label>
<s:property value="selectedColor"/><br/>


</body>
</html>