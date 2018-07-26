<%-- 
    Document   : Login
    Created on : 25/07/2018, 00:20:58
    Author     : pallo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!-- Bootstrap Code -->
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <!-- Bootstrap Code -->
        <meta http-equiv="x-ua-compatible" content="ie=edge">
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core" %> 
        <title>Login</title>
        
        <!-- Bootstrap Code -->
        <link rel="stylesheet" href="bootstrap/css/font-awesome.min.css">
        <!-- Bootstrap core CSS -->
        <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">
        <link rel="stylesheet" href="bootstrap/css/bootstrap-datepicker.min.css" >
        <!-- Material Design Bootstrap -->
        <link href="bootstrap/css/mdb.min.css" rel="stylesheet">
        <!-- Your custom styles (optional) -->
        <link href="bootstrap/css/style.css" rel="stylesheet">
    </head>
    <body>
                <!-- Material form login -->
        <div class="card">

          <h5 class="card-header indigo white-text text-center py-4">
            <strong>Sign in</strong>
          </h5>

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
        
            <!-- BOOTSTRAP SCRIPTS -->
        <!-- JQuery -->
        <script type="text/javascript" src="bootstrap/js/jquery-3.3.1.min.js"></script>
        <!-- Bootstrap tooltips -->
        <script type="text/javascript" src="bootstrap/js/popper.min.js"></script>
        <!-- Bootstrap core JavaScript -->
        <script type="text/javascript" src="bootstrap/js/bootstrap.min.js"></script>
        <!-- MDB core JavaScript -->
        <script type="text/javascript" src="bootstrap/js/mdb.min.js"></script>
    </body>
</html>
