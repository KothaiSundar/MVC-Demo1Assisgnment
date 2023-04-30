<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib  uri="http://www.springframework.org/tags/form" prefix="f"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee List</title>
</head>
<body>
     <f:form action="addEmployee" modelAttribute="employee" >
     <f:input path="employeeName" placeholder="Enter Employee Name"/>
     <f:input path="employeeDesignation" placeholder="Enter Employee Designation"/>
     <input type="submit" value="save">
         
     </f:form> 
</body>
</html>