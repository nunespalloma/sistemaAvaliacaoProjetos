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
            <form class="text-center" style="color: #757575;">

              <!-- Email -->
              <div class="md-form">
                <input type="email" id="materialLoginFormEmail" class="form-control">
                <label for="materialLoginFormEmail">E-mail</label>
              </div>

              <!-- Password -->
              <div class="md-form">
                <input type="password" id="materialLoginFormPassword" class="form-control">
                <label for="materialLoginFormPassword">Password</label>
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
