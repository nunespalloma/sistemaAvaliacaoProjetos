<%-- 
    Document   : PreCadastro
    Created on : 25/07/2018, 21:26:17
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
        <title>Pré - Cadastro</title>
        
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
        <h5 class="card-header indigo white-text text-center py-4">
            <font size="8" face="Arial">
            <strong>Pré-Cadastro</strong>
            </font>
        </h5>

        
        <div class="container">
            <form action="PreCadastroServlet" method="POST">
                <button type="submit" class="btn btn-indigo my-4 btn-block"> Cadastro Sistema e Administrador </button>
            </form>
        </div>
        
        
        <div class="container">
            <form action="PreCadastroServlet" method="GET">
                <button type="submit" class="btn btn-indigo my-4 btn-block"> Cadastro Projetista </button>
            </form>
        </div>
        
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
