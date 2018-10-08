<%-- 
    Document   : Login
    Created on : 25/07/2018, 00:20:58
    Author     : pallo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file="head.jspf"%>
        <title>Login</title>
    </head>
    <body>
        <%@include file="navbar.jspf"%>
                <!-- Material form login -->
        <div class="card">

            <h1 class="text-center indigo-text py-4">
                <font size="10" face="Calibri">
                <strong>LOGIN</strong>
                </font>
            </h1>

          <!--Card content-->
          <div class="card-body px-lg-5 pt-0">

            <!-- Form -->
            <form action="LoginServlet" method="POST" class="text-center" style="color: #757575;">

                <!-- Email -->
                <div class="md-form">
                    <input type="email" id="materialLoginFormEmail" name="email" class="form-control ${requestScope.emailStatus}" value="${param.email}">
                    <div class="invalid-feedback">
                        ${requestScope.emailMsgErro}
                    </div>
                    <label for="materialLoginFormEmail">E-mail</label>
                </div>

                <!-- Password -->
                <div class="md-form">
                    <input type="password" id="materialLoginFormPassword" name="senha" class="form-control ${requestScope.senhaStatus}">
                    <div class="invalid-feedback">
                        ${requestScope.senhaMsgErro}
                    </div>
                    <label for="materialLoginFormPassword">Password</label>
                </div>
                <h6 class="text-center" style="color: #ff0219">${requestScope.loginMsgErro}</h6>
                <br>
                <div class="form-row">
                    <strong>Como: </strong>
                </div>
                <br>
                <div class="form-row">
                    <!-- Switch -->
                    <div class="switch mdb-color-switch">
                        <label>
                            <input type="radio" id="administrador" name="exampleRadios" value="Administrador" checked>
                            Administrador
                        </label>
                    </div>
                </div>
                <div  class="form-row">
                    <!-- Switch -->
                    <div class="switch mdb-color-switch">
                        <label>
                            <input type="radio" id="avaliador" name="exampleRadios" value="Avaliador">
                            Avaliador
                        </label>
                    </div>
                </div>
                <div  class="form-row">
                    <!-- Switch -->
                    <div class="switch mdb-color-switch">
                        <label>
                            <input type="radio" id="orientador" name="exampleRadios" value="Orientador">
                            Orientador
                        </label>
                    </div>
                </div>
                <div  class="form-row">
                    <!-- Switch -->
                    <div class="switch mdb-color-switch">
                        <label>
                            <input type="radio" id="projetista" name="exampleRadios" value="Projetista">
                            Projetista
                        </label>
                    </div>
                </div>
                    
                <!-- Sign in button -->
                <button class="btn btn-indigo my-4 btn-block" type="submit">Sign in</button>

            </form>
            <!-- Form -->

          </div>

        </div>
        <!-- Material form login -->
        <br>
        <br>
        <br>
        <br>
        <br>
        <br>
        <br>
        <br>
        <%@include file="footer.jspf"%>
        <%@include file="finalBody.jspf"%>
    </body>
</html>
