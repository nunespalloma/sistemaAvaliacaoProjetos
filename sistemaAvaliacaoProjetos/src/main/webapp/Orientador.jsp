<%-- 
    Document   : Orientador
    Created on : 23/09/2018, 19:22:40
    Author     : pallo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file="head.jspf"%> 
        <title>Orientador</title>
    </head>
    <body>
        <%@include file="navbar.jspf"%>
        <div class="card">

            <h5 class="card-header indigo white-text text-center py-4">
                <font size="8" face="Arial">
                    <strong>Orientador</strong>
                </font>
            </h5>
            <input type="hidden" name="orientador" value="${requestScope.orientador}">
            <br>
            <core:choose>
                <core:when test="${empty requestScope.projetosNaoAvaliados and empty requestScope.projetosAvaliados}">
                    <div class="container-fluid">
                        <br>
                        <br>
                        <p>Você não possui nenhum projeto cadastrado</p>
                        <br>
                        
                    </div>
                </core:when>
                <core:otherwise>
                    <div class="container-fluid">
                        <h1> Projetos ainda não avaliados </h1>
                    </div>
                    <br>
                    <core:choose>
                        <core:when test="${not empty requestScope.projetosNaoAvaliados}">
                            <div class="container-fluid">
                                <table class="table">
                                    <thead class="white black-text" border="1">
                                        <tr>
                                            <td scope="col"><h5><b> # </b></h5></td>
                                            <td scope="col"><h5><b> NOME PROJETO </b></h5></td>
                                            <td scope="col"><h5><b> ALUNO RESPONSÁVEL </b></h5></td>
                                            <td scope="col"><h5><b> DESCRIÇÃO </b></h5></td>
                                            <td scope="col"><h5><b> DURAÇÃO </b></h5></td>
                                            <td scope="col"><h5><b> EDITAR </b></h5></td>
                                            <td scope="col"><h5><b> SUBMETER </b></h5></td>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <core:forEach items="${requestScope.projetosNaoAvaliados}" var="projeto" varStatus="status">
                                            <tr>
                                                <td scope="col">${status.count}</td>
                                                <td scope="col">${projeto.getNome()}</td>
                                                <td scope="col">${projeto.getProjetista().getNome()}</td>
                                                <td scope="col">${projeto.getDescricao()}</td>
                                                <td scope="col">${projeto.getDuracao()}</td>
                                                <core:choose>
                                                    <core:when test="${projeto.isSubmetido()}">
                                                        <form action="EditarFormularioOrientadorServlet" method="POST">
                                                            <td scope="col">
                                                                <input type="hidden" name="idOrientador" value="${requestScope.orientador.getId()}">
                                                                <button type="submit" class="btn btn-indigo btn-block" name="idProjeto" value="${projeto.getId()}">VER</button></td>
                                                        </form>
                                                        <form action="SubmeterProjetoOrientadorServlet" method="POST">
                                                            <td scope="col">
                                                                <input type="hidden" name="idOrientador" value="${requestScope.orientador.getId()}">
                                                                <button type="submit" class="btn btn-indigo btn-block" name="idProjeto" value="${projeto.getId()}" disabled>SUBMETER</button></td>
                                                        </form>
                                                    </core:when>
                                                    <core:otherwise>
                                                        <form action="EditarFormularioOrientadorServlet" method="POST">
                                                            <td scope="col">
                                                                <input type="hidden" name="idOrientador" value="${requestScope.orientador.getId()}">
                                                                <button type="submit" class="btn btn-indigo btn-block" name="idProjeto" value="${projeto.getId()}">EDITAR</button></td>
                                                        </form>
                                                        <form action="SubmeterProjetoOrientadorServlet" method="POST">
                                                            <td scope="col">
                                                                <input type="hidden" name="idOrientador" value="${requestScope.orientador.getId()}">
                                                                <button type="submit" class="btn btn-indigo btn-block" name="idProjeto" value="${projeto.getId()}">SUBMETER</button></td>                                                
                                                        </form>
                                                    </core:otherwise>
                                                </core:choose>
                                            </tr>
                                        </core:forEach>
                                    </tbody>
                                    <h6 class="text-center" style="color: #ff0219">${requestScope.editarMsgErroIdProjeto}</h6>
                                    <br>
                                    <h6 class="text-center" style="color: #ff0219">${requestScope.editarMsgErroIdOrientador}</h6>
                                </table>
                            </div>
                        </core:when>
                        <core:otherwise>
                            <div class="container-fluid">
                                Você não possui nenhum projeto ainda não avaliado
                            </div>
                        </core:otherwise>
                    </core:choose>

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
                                            <td scope="col"><h5><b> ALUNO RESPONSÁVEL </b></h5></td>
                                            <td scope="col"><h5><b> DESCRIÇÃO </b></h5></td>
                                            <td scope="col"><h5><b> DURAÇÃO </b></h5></td>
                                            <td scope="col"><h5><b> EDITAR </b></h5></td>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <core:forEach items="${requestScope.projetosAvaliados}" var="projeto" varStatus="status">
                                            <tr>
                                                <td scope="col">${status.count}</td>
                                                <td scope="col">${projeto.getNome()}</td>
                                                <td scope="col">${projeto.getProjetista().getNome()}</td>
                                                <td scope="col">${projeto.getDescricao()}</td>
                                                <td scope="col">${projeto.getDuracao()}</td>
                                                <form action="EditarFormularioOrientadorServlet" method="POST">
                                                    <td scope="col">
                                                        <input type="hidden" name="idOrientador" value="${requestScope.orientador.getId()}">
                                                        <button type="submit" class="btn btn-indigo btn-block" name="idProjeto" value="${projeto.getId()}">EDITAR</button>
                                                    </td>
                                                </form>
                                            </tr>
                                        </core:forEach>
                                    </tbody>
                                    <h6 class="text-center" style="color: #ff0219">${requestScope.editarMsgErroIdProjeto}</h6>
                                    <br>
                                    <h6 class="text-center" style="color: #ff0219">${requestScope.editarMsgErroIdOrientador}</h6>
                                </table>
                            </div>
                        </core:when>
                        <core:otherwise>
                            <div class="container-fluid">
                                Você não possui nenhum projeto avaliado
                            </div>
                        </core:otherwise>
                    </core:choose>
                </core:otherwise>
            </core:choose>
            <br>
            <br>
            <br>
            <br>
            <form action="OrientadorServlet" method="POST">
                <input type="hidden" name="idOrientador" value="${requestScope.orientador.getId()}">
                <button class="btn btn-indigo my-4 btn-block" type="submit">Novo Formulário</button>
            </form>
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
