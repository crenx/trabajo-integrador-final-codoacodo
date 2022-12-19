<%--
  Created by IntelliJ IDEA.
  User: exequ
  Date: 18/12/2022
  Time: 18:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<main>
    <!-- ACA VA EL NAVBAR  -->
    <%@include file="navbar.jsp" %>
    <div class="container">
        <section>
            <h1>Alta</h1>
            <!--  JSP -->
            <form method="post"
                  action="<%=request.getContextPath()%>/CreateController">
                <div class="mb-3">
                    <label for="exampleFormControlInput1" class="form-label">id</label>
                    <input name="id"  type="number" class="form-control" id="exampleFormControlInput1" placeholder="id" maxlength="50">
                </div>
                <div class="mb-3">
                    <label for="exampleFormControlTextarea1" class="form-label">nombre</label>
                    <input name="nombre" type="text" class="form-control" id="exampleFormControlTextarea1">
                </div>
                <div class="mb-3">
                    <label for="exampleFormControlTextarea1" class="form-label">apellido</label>
                    <input name="apellido" type="text" class="form-control" id="exampleFormControlTextarea1">
                </div>
                <div class="mb-3">
                    <label for="exampleFormControlTextarea1" class="form-label">edad</label>
                    <input name="edad" type="text" class="form-control" id="exampleFormControlTextarea1" maxlength="7">
                </div>
                <div class="mb-3">
                    <label for="exampleFormControlTextarea1" class="form-label">fecha</label>
                    <input name="fecha" type="number" class="form-control" id="exampleFormControlTextarea1">
                </div>
                <div class="mb-3">
                    <label for="exampleFormControlTextarea1" class="form-label">provincia</label>
                    <input name="provincia" type="text" class="form-control" id="exampleFormControlTextarea1">
                </div>

                <button class="btn btn-primary">
                    Dar de alta
                </button>
            </form>
        </section>
    </div>
</main>

</body>
</html>
