<%-- 
    Document   : register
    Created on : Mar 5, 2023, 8:06:51 AM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>BookStore :Register</title>
        <%@include file="css/allCss.jsp"  %>
    </head>
    <body style="background-color: #f0f1f2;">
        <%@include  file="css/home.jsp"%>
        <div class="container p-2">
            <div class="row">
                <div class="col-md-4 offset-md-4">
                    <div class="card">
                        <div class="card-body">
                            <h4 class="text-center">Registration</h4>
                            
                            <c:if test="${not empty succMsg}">
                                <p class="text-center text-success">${succMsg}</p>
                                <c:remove var="succMsg" scope="session"></c:remove>
                            </c:if>
                            
                            <c:if test="${not empty failedMsg}">
                                <p class="text-center text-danger">${failedMsg}</p>
                                <c:remove var="failedMsg" scope="session"></c:remove>
                            </c:if>
                            <form action="regis" method="post">
                                <div class="form-group">
                                    <label for="exampleInputEmail1">Enter Full Name</label>
                                    <input name="fname" type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp"
                                           placeholder="Enter Name" required="required">
                                    
                                </div>
                                
                                <div class="form-group">
                                    <label for="exampleInputEmail1">Email address</label>
                                    <input name="email" type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" 
                                           placeholder="Enter email" required="required">
                                    
                                </div>
                                
                                <div class="form-group">
                                    <label for="exampleInputEmail1">Phone number</label>
                                    <input name="phone" type="number" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" 
                                           placeholder="Enter number" required="required">
                                    
                                </div>
                                <div class="form-group">
                                    <label for="exampleInputPassword1">Password</label>
                                    <input name="password" type="password" class="form-control" id="exampleInputPassword1" 
                                           placeholder="Password" required="required">
                                </div>
                                
                                <div class="form-check">
                                    <input name="check" type="checkbox" class="form-check-input" id="exampleCheck1">
                                    <label class="form-check-label" for="exampleCheck1">Agree terms& Condition</label>
                                </div>
                                
                                <button type="submit" class="btn btn-primary">Submit</button>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        
    </body>
</html>
