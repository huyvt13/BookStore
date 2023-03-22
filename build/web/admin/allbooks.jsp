<%-- 
    Document   : allbooks
    Created on : Mar 8, 2023, 5:45:13 PM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page  import="DAO.Dao"%>
<%@page  import="java.util.List"%>
<%@page  import="entity.BookDtls"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin :All Books</title>
        <%@include file="allCss.jsp" %>
    </head>
    <body>
        <%@include file="home_1.jsp" %>
        
         <c:if test="${empty userobj}">
            <c:redirect url="../login.jsp"></c:redirect>
        </c:if>
        <h3 class="text-center">Hello Admin</h3>
        
        <c:if test="${not empty succMsg}">
            <p class="text-center text-success">${succMsg}</p> 
            <c:remove var="succMsg" scope="session"/>
        </c:if>

        <c:if test="${not empty failedMsg}">
            <p class="text-center text-danger">${failedMsg}</p> 
            <c:remove var="failedMsg" scope="session"/>
        </c:if>
        <table class="table table-striped ">
            <thead class="bg-primary text-white " >
                <tr>
                    <th scope="col" >ID</th>
                    <th scope="col" >Image</th>
                    <th scope="col">Book Name</th>
                    <th scope="col">Author</th>
                    <th scope="col">Price</th>
                    <th scope="col">Categories</th><!-- comment -->
                    <th scope="col">Status</th><!-- comment -->
                    <th scope="col">Action</th><!-- comment -->
                    
                </tr>
            </thead>
            <tbody>
                
                <% 
                  Dao  dao =new Dao();
                  List<BookDtls> list=dao.getAllBooks();
                  for(BookDtls b:list){
                %>
               <tr>
                   <td><%=b.getBookId()%></td>
                   <td><img src="../book/<%=b.getPhotoName()%>" style="width: 100px; height: 100px" ></td>
                    <td><%=b.getBookName()%></td>
                    <td><%=b.getAuthor()%></td>
                    <td><%=b.getPrice()%></td>
                    <td><%=b.getBookCategory()%></td>
                    <td><%=b.getStatus()%></td>
                    <td>
                        <a href="editbook.jsp?id=<%=b.getBookId()%>" class="btn btn-sm btn-primary">Edit</a>
                         <a href="../delete?id=<%=b.getBookId()%>" class="btn btn-sm btn-danger">Delete</a>
                    </td>
                </tr>
                   <%
                       }
                   %> 
                
            </tbody>
        </table>
    </body>
</html>
