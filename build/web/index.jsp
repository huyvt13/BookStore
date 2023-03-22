<%-- 
    Document   : index
    Created on : Mar 4, 2023, 9:54:01 AM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@page  import="DAO.Dao"%>
<%@page  import="java.util.List"%>
<%@page  import="java.util.ArrayList"%>
<%@page  import="entity.BookDtls"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>BookStore: Index</title>
        <%@include file="css/allCss.jsp" %>

        <style type="text/css">
            .back-img{
                background: url("image/t.jpg");
                height: 50vh;
                width: 100%;
                background-repeat: no-repeat;
                background-size: cover;
            }

            .crd-ho:hover{
                background-color: #fcf7f7;
            }
        </style>
    </head>
    <body style="background-color:#f7f7f7 ">
        <%@include file="css/home.jsp" %>
        <div class="container-fluid back-img">
            <h2 class="text-center text-danger"> Book Store</h2>
        </div>



        <div class="container" >
            <h3 class="text-center">Recent Book </h3>
            <div class="row">
                <%
                 Dao dao2 =new Dao();
                 List<BookDtls> list2=dao2.getRecentBooks();
                 for(BookDtls b:list2) {
                %>
                <div class="col-md-3">
                    <div class="card crd-ho">
                        <div class="card-body text-center">
                            <img alt="" src="book/<%=b.getPhotoName()%>" style="width:200px;height:200px"
                                 class="img-thumblin"> 
                            <p><%=b.getBookName()%><p>
                            <p><%=b.getAuthor()%><p>

                                    <%
                                    if(b.getBookCategory().equals("Old"))
                                    {%>
                                    <p>Categories:<%=b.getBookCategory()%></p>
                            <div class="row">
                               
                               
                                <a href="" class="btn btn-success btn-sm ml-5">View Details</a><!-- comment -->
                                <a href="" class="btn btn-danger btn-sm ml-1"><%=b.getPrice()%></a>
                            </div>
                            <% } else { %>
                            <p>Categories:<%=b.getBookCategory()%></p>
                            <div class="row">
                                <a href="" class="btn btn-danger btn-sm ml-1"><i class="fa-solid fa-cart-shopping"></i>Add Cart</a>
                                <a href="" class="btn btn-success btn-sm ml-1">View Details</a> 
                                <a href="" class="btn btn-danger btn-sm ml-1"><%=b.getPrice()%></a>
                            </div>
                            <%
                             }
                            %>

                        </div>
                    </div>
                </div>
                <%  
                  }
                %>







            </div>

            <div class ="text-center mt-1">
                <a href="" class="btn btn-danger btn-sm text-white"> View All</a> 
            </div>
        </div>

        <hr>
        <!--newBOOk-->
        <div class="container" >
            <h3 class="text-center">New Book </h3>
            <div class="row">

                <%
                   Dao dao =new Dao();
                  List<BookDtls> list= dao.getNewBook();
                  for(BookDtls b:list) {
                %>
                <div class="col-md-3">
                    <div class="card crd-ho">
                        <div class="card-body text-center">
                            <img alt="" src="book/<%=b.getPhotoName()%>" style="width:200px;height:200px"
                                 class="img-thumblin"> 
                            <p><%=b.getBookName()%><p>
                            <p><%=b.getAuthor()%><p>
                            <p>Categories:<%=b.getBookCategory()%></p>
                            <div class="row">
                                <a href="" class="btn btn-danger btn-sm ml-1">Add Cart</a>
                                <a href="" class="btn btn-success btn-sm ml-1">View Details</a><!-- comment -->
                                <a href="" class="btn btn-danger btn-sm ml-1"><%=b.getPrice()%></a>
                            </div>
                        </div>
                    </div>
                </div>
                <%
                    }
                %>
            </div>
            <div class ="text-center mt-1">
                <a href="" class="btn btn-danger btn-sm text-white"> View All</a> 
            </div>
        </div>

        <hr>

        <!--Old book -->
        <div class="container" >
            <h3 class="text-center">OLd Book </h3>
            <div class="row">
                <div class="col-md-3">
                    <div class="card crd-ho">
                        <div class="card-body text-center">
                            <img alt="" src="book/book.jpg" style="width:200px;height:200px"
                                 class="img-thumblin"> 
                            <p>dac nhan tam<p>
                            <p>How to win friends &influence Pepple<p>
                            <p>Categories:New</p>
                            <div class="row text-center">

                                <a href="" class="btn btn-success btn-sm ml-5">View Details</a><!-- comment -->
                                <a href="" class="btn btn-danger btn-sm ml-1">100</a>
                            </div>
                        </div>
                    </div>
                </div>

                

                

               
            </div>

            <div class ="text-center mt-1">
                <a href="" class="btn btn-danger btn-sm text-white"> View All</a> 
            </div>
        </div>

        <%@include file="css/footer.jsp" %>
    </body>
</html>
