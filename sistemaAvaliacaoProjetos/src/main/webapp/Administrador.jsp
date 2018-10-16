<%-- 
    Document   : Administador
    Created on : 26/07/2018, 19:39:45
    Author     : palloma
--%>

<%@page import="br.com.uff.sistemaAvaliacaoProjetos.controller.AvaliadorController"%>
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
            
            <core:choose>
                <core:when test="${empty requestScope.projetosParaEnviar and empty requestScope.projetosEnviados}">
                    <div class="container-fluid">
                        <br>
                        <br>
                        <p>Você não possui nenhum projeto cadastrado</p>
                        <br>
                        
                    </div>
                </core:when>
                <core:otherwise>
                    <br>
                    <div class="container-fluid">
                        <h1> Projetos para serem enviados </h1>
                    </div>
                    <br>

                    <core:choose>
                        <core:when test="${not empty requestScope.projetosParaEnviar}">
                            <div class="container-fluid">
                                <table class="table">
                                    <thead class="white black-text" border="1">
                                        <tr>
                                            <td scope="col"><h5><b> # </b></h5></td>
                                            <td scope="col"><h5><b> NOME PROJETO </b></h5></td>
                                            <td scope="col"><h5><b> ORIENTADOR </b></h5></td>
                                            <td scope="col"><h5><b> ALUNO RESPONSÁVEL </b></h5></td>
                                            <td scope="col"><h5><b> DESCRIÇÃO </b></h5></td>
                                            <td scope="col"><h5><b> AVALIADOR </b></h5></td>
                                            <td scope="col"><h5><b> ENVIAR PARA AVALIAÇÃO </b></h5></td>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <core:forEach items="${requestScope.projetosParaEnviar}" var="projeto" varStatus="status">
                                            <tr>
                                                <form action="SubmeterProjetoAvaliacaoAdministradorServlet" method="POST">
                                                    <td scope="col">${status.count}</td>
                                                    <td scope="col">${projeto.getNome()}</td>
                                                    <td scope="col">${projeto.getOrientador().getNome()}</td>
                                                    <td scope="col">${projeto.getProjetista().getNome()}</td>
                                                    <td scope="col">${projeto.getDescricao()}</td>
                                                    <td scope="col">
                                                    <core:choose>
                                                        <core:when test="${not empty requestScope.avaliadores}">                                                            
                                                            <select class="browser-default custom-select" name="idAvaliador">        
                                                                <core:forEach var="avaliador" items="${requestScope.avaliadores}" varStatus="status">
                                                                    <option value="${avaliador.getId()}">${avaliador.getNome()}</option>
                                                                </core:forEach>        
                                                            </select>
                                                        </core:when>
                                                        <core:otherwise>
                                                            NÃO HÁ AVALIADORES DISPONIVEIS
                                                        </core:otherwise>
                                                    </core:choose>
                                                    </td>
                                                    <td scope="col">
                                                        <input type="hidden" name="idAdministrador" value="${sessionScope.login.getId()}">
                                                        <button type="submit" class="btn btn-indigo btn-block" name="idProjeto" value="${projeto.getId()}" ${not empty requestScope.avaliadores ? '' : 'disabled'}>SUBMETER</button>
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
                                Você não possui nenhum projeto submetido para enviar para avaliação
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
                    <div class="container-fluid">
                        <h1> Projetos enviados </h1>
                    </div>
                    <br>

                    <core:choose>
                        <core:when test="${not empty requestScope.projetosEnviados}">
                            <div class="container-fluid">
                                <table class="table">
                                    <thead class="white black-text" border="1">
                                        <tr>
                                            <td scope="col"><h5><b> # </b></h5></td>
                                            <td scope="col"><h5><b> NOME PROJETO </b></h5></td>
                                            <td scope="col"><h5><b> ORIENTADOR </b></h5></td>
                                            <td scope="col"><h5><b> ALUNO RESPONSÁVEL </b></h5></td>
                                            <td scope="col"><h5><b> DESCRIÇÃO </b></h5></td>
                                            <td scope="col"><h5><b> AVALIADOR </b></h5></td>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <core:forEach items="${requestScope.projetosEnviados}" var="projeto" varStatus="status">
                                            <tr>
                                                <td scope="col">${status.count}</td>
                                                <td scope="col">${projeto.getNome()}</td>
                                                <td scope="col">${projeto.getOrientador().getNome()}</td>
                                                <td scope="col">${projeto.getProjetista().getNome()}</td>
                                                <td scope="col">${projeto.getDescricao()}</td>
                                                <td scope="col">${AvaliadorController.buscarAvaliadorPorProjetoAvaliacao(projeto).getNome()}</td>        
                                            </tr>
                                        </core:forEach>
                                    </tbody>
                                </table>
                            </div>
                        </core:when>
                        <core:otherwise>
                            <div class="container-fluid">
                                <br>
                                Você não possui nenhum projeto enviado para avaliação
                                <br>
                                <br>
                                <br>
                            </div>
                        </core:otherwise>
                    </core:choose>
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
