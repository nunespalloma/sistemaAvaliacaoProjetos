<%-- 
    Document   : Projetista
    Created on : 26/07/2018, 20:35:43
    Author     : palloma
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file="head.jspf"%> 
        <title>Projetista</title>
    </head>
    <body>
        <%@include file="navbar.jspf"%>
                <!-- Material form register -->
        <div class="card">

            <h5 class="card-header indigo white-text text-center py-4">
                <font size="8" face="Arial">
                    <strong>Projetista</strong>
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
                            <td scope="col"><h5><b> SISTEMA AO QUAL PERTENCE </b></h5></td>
                        </tr>
                        <tr>
                            <td scope="col">XXX</td>
                            <td scope="col">XXX</td>
                            <td scope="col">XXX</td>
                            <td scope="col">XXX</td>
                        </tr>
                </table>
            </div>
            
            <br>
            <br>
            <br>
            <div class="container-fluid">
                <h1>Requisitos solicitados</h1>
            </div>
            
            
            
            <br>
            <br>
        </div>
        <%@include file="footer.jspf"%>
        <%@include file="finalBody.jspf"%>
    </body>
</html>
