<%-- 
    Document   : Avaliador
    Created on : 23/09/2018, 19:55:00
    Author     : pallo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file="head.jspf"%> 
        <title>Avaliador</title>
    </head>
    <body>
        <%@include file="navbar.jspf"%>
        
        <!-- Material form register -->
        <div class="card">

            <h5 class="card-header indigo white-text text-center py-4">
                <font size="8" face="Arial">
                    <strong>AVALIADOR</strong>
                </font>
            </h5>
            
            <br>
            <div class="container-fluid">
                <h1> Projetos a serem avaliados </h1>
            </div>
            <br>
            
            <core:choose>
                <core:when test="${not empty requestScope.projetosParaAvaliacao}">
                    <div class="container-fluid">
                        <table class="table">
                            <thead class="white black-text" border="1">
                                <tr>
                                    <td scope="col"><h5><b> # </b></h5></td>
                                    <td scope="col"><h5><b> NOME PROJETO </b></h5></td>
                                    <td scope="col"><h5><b> DESCRIÇÃO </b></h5></td>
                                    <td scope="col"><h5><b> DURAÇÃO </b></h5></td>
                                    <td scope="col"><h5><b> AVALIAÇÃO </b></h5></td>
                                </tr>
                            </thead>
                            <tbody>
                                <core:forEach items="${requestScope.projetosParaAvaliacao}" var="projeto" varStatus="status">
                                    <tr>
                                        <form action="SubmeterProjetoAvaliacaoAvaliadorServlet" method="POST">
                                            <td scope="col">${status.count}</td>
                                            <td scope="col">${projeto.getNome()}</td>
                                            <td scope="col">${projeto.getDescricao()}</td>
                                            <td scope="col">${projeto.getDuracao()}</td>
                                            <td scope="col">
                                                <input type="hidden" name="idAvaliador" value="${sessionScope.login.getId()}">
                                                <button type="submit" class="btn btn-indigo btn-block" name="idProjeto" value="${projeto.getId()}">REALIZAR</button>
                                            </td>
                                        </form>        
                                    </tr>
                                </core:forEach>
                            </tbody>
                            <h6 class="text-center" style="color: #ff0219">${requestScope.editarMsgErroIdProjeto}</h6>
                            <br>
                            <h6 class="text-center" style="color: #ff0219">${requestScope.editarMsgErroIdAvaliador}</h6>
                        </table>
                    </div>
                </core:when>
                <core:otherwise>
                    <div class="container-fluid">
                        <br>
                        Você não possui nenhum projeto para ser avaliado.
                        <br>
                        <br>
                        <br>
                    </div>
                </core:otherwise>
            </core:choose>
            
            <br>
            <br>
            <br>
            <br>
            <br>
            
            <div class="container-fluid">
                <h1> Projetos avaliados </h1>
            </div>
            <br>
            
            <core:choose>
                <core:when test="${not empty requestScope.projetosAvaliados}">
                    <div class="container-fluid">
                        <table class="table">
                            <thead class="white black-text" border="1">
                                <tr>
                                    <td scope="col"><h5><b> # </b></h5></td>
                                    <td scope="col"><h5><b> NOME PROJETO </b></h5></td>
                                    <td scope="col"><h5><b> DESCRIÇÃO </b></h5></td>
                                    <td scope="col"><h5><b> AVALIAÇÃO </b></h5></td>
                                </tr>
                            </thead>
                            <tbody>
                                <core:forEach items="${requestScope.projetosAvaliados}" var="projeto" varStatus="status">
                                    <tr>
                                        <td scope="col">${status.count}</td>
                                            <td scope="col">${projeto.getNome()}</td>
                                            <td scope="col">${projeto.getDescricao()}</td>
                                            <td scope="col">${projeto.getAvaliacao()}</td>
                                    </tr>
                                </core:forEach>
                            </tbody>
                        </table>
                    </div>
                </core:when>
                <core:otherwise>
                    <div class="container-fluid">
                        <br>
                        Você não avaliou nenhum projeto.
                        <br>
                        <br>
                        <br>
                    </div>
                </core:otherwise>
            </core:choose>
            
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
        </div>
        
        <%@include file="footer.jspf"%>
        <%@include file="finalBody.jspf"%>
    </body>
</html>
