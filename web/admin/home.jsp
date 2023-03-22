<%-- 
    Document   : home
    Created on : Mar 5, 2023, 1:38:38 PM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <%@include  file="allCss.jsp"%> 
        
        <style type="text/css">
            a{
                text-decoration: none;
                color: black;
            }
            
            a:hover{
                text-decoration: none;
                color: black;
            }
        </style>
    </head>
    <body>
        <%@include  file="home_1.jsp"%>
        <c:if test="${empty userobj}">
            <c:redirect url="../login.jsp"></c:redirect>
        </c:if>
        
        <div class="container">
            <div class="row">
                <div class="col-md-3">
                    <a href="addbooks.jsp">
                    <div class="card">
                        <div class="card-body text-center">
                            <i class="fa-solid fa-plus fa-3x "></i> <br>
                            <h4>Add Books</h4>
                           
                        </div>
                    </div>
                        </a>
                </div>
                
                
                <div class="col-md-3">
                    <a href="allbooks.jsp">
                    <div class="card">
                        <div class="card-body text-center">
                            <i class="fas fa-book-open fa-3x "></i> <br>
                            <h4>All Books</h4>
                           
                        </div>
                    </div>
                    </a>
                </div>
                
                <div class="col-md-3">
                    <a href="orders.jsp">
                    <div class="card">
                        <div class="card-body text-center">
                            <i class="fa-solid fa-plus fa-3x  "></i> <br>
                            <h4>Orders</h4>
                           
                        </div>
                    </div>
                        </a>
                </div>
                
                
                <div class="col-md-3">
                    
                    <div class="card">
                        <div class="card-body text-center">
                            <i class="fa-solid fa-right-from-bracket fa-3x"></i> <br>
                            <h4>Log Out</h4>
                           
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
