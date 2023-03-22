<%-- 
    Document   : addbooks
    Created on : Mar 8, 2023, 5:37:30 PM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored="false"  %>
<%@page  import="DAO.Dao"%>
<%@page  import="java.util.List"%>
<%@page  import="entity.BookDtls"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin :Add Books</title>
        <%@include file="allCss.jsp" %>
    </head>
    <body style="background-color: #f0f1f2">
        <%@include  file="home_1.jsp"%>
        <div class="container">
            <div class="row">
                <div class="col-md-4 offset-md-4">
                    <div class="card">
                        <div class="card-body">
                            <h4 class="text-center">Edit Books</h4>
                            
                           
                                <%
                                        int id =Integer.parseInt(request.getParameter("id"));
                                        Dao dao =new Dao();
                                        BookDtls b=dao.getBookById(id);
                                %>
                            <form action="../editbooks" method="POST">
                            <input type="hidden" name="id" value="<%=b.getBookId()%>">
                            <div class="form-group">
                                
                                <label for="exampleInputEmail1">Book Name</label>
                                <input name="bname" type="text" class="form-control"
                                       id="exampleInputEmail1" aria-describedbt="emailHelp" value="<%=b.getBookName()%>">
                            </div>
                            
                            <div class="form-group">
                                <label for="exampleInputEmail1">Author Name</label>
                                <input name="author" type="text" class="form-control"
                                       id="exampleInputEmail1" aria-describedbt="emailHelp" value="<%=b.getAuthor()%>">
                            </div>
                            
                            <div class="form-group">
                                <label for="exampleInputPassword1">Price</label>
                                <input name="price" type="number" class="form-control"
                                       id="exampleInputEmail1" aria-describedbt="emailHelp" value="<%=b.getPrice()%>">
                            </div>
                           
                            
                          
                            
                            
                             <div class="form-group">
                                <label for="inputState">Book Status</label>
                                <select id="inputState" name="status" class="form-control">
                                   <% if("Active".equals(b.getStatus())){%>
                                    <option value="Active">Active</option>
                                    <option value="Inactive">Inactive</option>
                                   
                                  <%}
                                        else{ %>
                                           <option value="Inactive">Inactive</option>
                                           <option value="Active">Active</option>
                                        <%}
                                  %>
                                    
                                    
                                </select>
                            </div>
                            
                           
                            
                            <button type="submit" class="btn btn-primary">Update</button>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
