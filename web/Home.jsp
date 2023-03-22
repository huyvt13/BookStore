<%-- 
    Document   : Home
    Created on : Mar 5, 2023, 1:36:56 PM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored="false"  %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>User:Home</h1>
        
         <c:if test="${not empty userobj}">
                                    <h1>Name:${userobj.name}</h1>
                                    <h1>Email:${userobj.email}</h1>
                                </c:if>
                                   
    </body>
</html>
