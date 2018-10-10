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
            <div class="container-fluid">
                <h1> Projetos </h1>
            </div>
            <br>
            <core:choose>
                <core:when test="${not empty requestScope.orientador.getProjetos()}">
                    <div class="container-fluid">
                        <table class="table">
                            <thead class="black white-text"></thead>
                                <tr>
                                    <td scope="col"><h5><b> # </b></h5></td>
                                    <td scope="col"><h5><b> NOME PROJETO </b></h5></td>
                                    <td scope="col"><h5><b> ALUNO RESPONSÁVEL </b></h5></td>
                                    <td scope="col"><h5><b> DESCRIÇÃO </b></h5></td>
                                    <td scope="col"><h5><b> DURAÇÃO </b></h5></td>
                                    <td scope="col"><h5><b> Formulario </b></h5></td>
                                </tr>
                                <form action="EditarFormularioOrientadorServlet" method="POST">
                                    <core:forEach items="${requestScope.orientador.getProjetos()}" var="projeto" varStatus="status">
                                        <tr>
                                            <td scope="col">${status.count}</td>
                                            <td scope="col">${projeto.getNome()}</td>
                                            <td scope="col">${projeto.getProjetista().getNome()}</td>
                                            <td scope="col">${projeto.getDescricao()}</td>
                                            <td scope="col">${projeto.getDuracao()}</td>
                                            <td scope="col">
                                                <input type="hidden" name="idOrientador" value="${requestScope.orientador.getId()}">
                                                <button type="submit" class="btn btn-indigo btn-block" name="idProjeto" value="${projeto.getId()}">EDITAR</button></td>
                                        </tr>
                                    </core:forEach>
                                </form>

                            <h6 class="text-center" style="color: #ff0219">${requestScope.editarMsgErroIdProjeto}</h6>
                            <br>
                            <h6 class="text-center" style="color: #ff0219">${requestScope.editarMsgErroIdOrientador}</h6>
                        </table>
                    </div>
                </core:when>
                <core:otherwise>
                    <div class="container-fluid">
                        Você não possui nenhum projeto cadastrado
                    </div>
                </core:otherwise>
            </core:choose>
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
