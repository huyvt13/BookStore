<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div class="continer-fluid" style="height: 10px;background-color: #29b6f6"></div>

<div class="continer-fluid p-3 bg-light">
    <div class="row"> 
        <div class="col-md-3">
        <h3>
            <i class="fa-solid fa-book"></i>BookStore
        </h3> 
    </div>
    
    <div class="col-md-3"> 
        <c:if test="${not empty userobj}">
            <a class="btn btn-success text-white">${userobj.name}</a> 
            <a href="../logout" class="btn btn-primary text-white">Logout</a>
             
        </c:if>
        <c:if test= "${ empty userobj}">
            <a href="../login.jsp" class="btn btn-success">Login</a> 
        <a href="../register.jsp" class="btn btn-primary text-white">Register</a>
        </c:if>
        
    </div>
</div>
</div>



<nav class="navbar navbar-expand-lg navbar-dark bg-custom"/>
  <a class="navbar-brand" href=""><i class="fas fa-home"></i></a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item active">
        <a class="nav-link" href="home.jsp">Home <span class="sr-only">(current)</span></a>
      </li>
    </form>
  </div>
</nav>