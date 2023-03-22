<%-- 
    Document   : login
    Created on : Mar 5, 2023, 9:11:51 AM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>BookStore: login</title>
        <%@include file="css/allCss.jsp"  %>
    </head>
    <body style="background-color: #f0f1f2;">
        <%@include  file="css/home.jsp"%>
        <div class="container">
            <div class="row mt-2">
                <div class="col-md-4 offset-md-4">
                    <div class="card">
                        <div class="card-body">
                            <h5 class="text-center"></h5>
                            
                            <c:if test="${not empty failedMsg}">
                                <h5 class="text-center text-danger">${failedMsg}</h5>
                                <c:remove var="failedMsg" scope="session"/>
                            </c:if>
                            
                                 <c:if test="${not empty succMsg}">
                                <h5 class="text-center text-success">${succMsg}</h5>
                                <c:remove var="succMsg" scope="session"/>
                            </c:if>
                                
                            <form action="login" method="post">
                                <div class="form-group">
                                    <label for="exampleInputEmail1">UerName</label>
                                    <input name="email" type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" required="required">
                                    
                                </div>
                                <div class="form-group">
                                    <label for="exampleInputPassword1">Password</label>
                                    <input name="password" type="password" class="form-control" id="exampleInputPassword1" required="required">
                                </div>
                                <div class="text-center">
                                     <button type="submit" class="btn btn-primary">Login</button><br>
                                     <a href="register.jsp">Create Account</a>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
