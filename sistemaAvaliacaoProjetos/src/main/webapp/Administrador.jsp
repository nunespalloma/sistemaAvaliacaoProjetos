<%-- 
    Document   : Administador
    Created on : 26/07/2018, 19:39:45
    Author     : palloma
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file="head.jspf"%> 
        <title>Administrador</title>
    </head>
    <body>
        <%@include file="navbar.jspf"%>
                <!-- Material form register -->
        <div class="card">

            <h5 class="card-header indigo white-text text-center py-4">
                <font size="8" face="Arial">
                    <strong>ADMINISTRADOR</strong>
                </font>
            </h5>
            
            <br>
            <div class="container-fluid">
                <h1> Projetos </h1>
            </div>
            <br>
            
            <div class="container-fluid">
                <table class="table">
                    <thead class="black white-text"></thead>
                        <tr>
                            <td scope="col"><h5><b> NOME PROJETO </b></h5></td>
                            <td scope="col"><h5><b> ALUNO RESPONSÁVEL </b></h5></td>
                            <td scope="col"><h5><b> DESCRIÇÃO </b></h5></td>
                            <td scope="col"><h5><b> DURAÇÃO </b></h5></td>
                        </tr>
                        <tr>
                            <td scope="col">XXX</td>
                            <td scope="col">XXX</td>
                            <td scope="col">XXX</td>
                            <td scope="col">XXX</td>
                        </tr>
                    </table>
                </table>
            </div>
            
            <br>
            <br>
            <br>
            <div class="container-fluid">
                <h1> Preferências </h1>
            </div>
            <br>
            
            <div class="container-fluid">
                <h4> Requisitos para os alunos</h4>
            </div>
            
            <br>
            <br>
        <%@include file="footer.jspf"%>
        <%@include file="finalBody.jspf"%>
    </body>
</html>
