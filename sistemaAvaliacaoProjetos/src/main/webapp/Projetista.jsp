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
            <input type="hidden" name="projetista" value="${requestScope.projetista}">
            <br>
            <div class="container-fluid">
                <h1> Projetos </h1>
            </div>
            <br>
            
            <core:choose>
                <core:when test="${not empty requestScope.projetista.getProjetos()}">
                    <div class="container-fluid">
                        <table class="table">
                            <thead class="black white-text"></thead>
                                <tr>
                                    <td scope="col"><h5><b> # </b></h5></td>
                                    <td scope="col"><h5><b> NOME PROJETO </b></h5></td>
                                    <td scope="col"><h5><b> ORIENTADOR RESPONSÁVEL </b></h5></td>
                                    <td scope="col"><h5><b> DESCRIÇÃO </b></h5></td>
                                    <td scope="col"><h5><b> DURAÇÃO </b></h5></td>
                                    <td scope="col"><h5><b> EDITAR </b></h5></td>
                                </tr>
                                <form action="EditarFormularioProjetistaServlet" method="POST">
                                    <core:forEach items="${requestScope.projetista.getProjetos()}" var="projeto" varStatus="status">
                                        <core:if test="${not projeto.isAvaliado()}">
                                        
                                            <tr>
                                                <td scope="col">${status.count}</td>
                                                <td scope="col">${projeto.getNome()}</td>
                                                <td scope="col">${projeto.getOrientador().getNome()}</td>
                                                <td scope="col">${projeto.getDescricao()}</td>
                                                <td scope="col">${projeto.getDuracao()}</td>
                                                <core:choose>
                                                    <core:when test="${projeto.isSubmetido()}">
                                                        <td scope="col">
                                                            <input type="hidden" name="idProjetista" value="${requestScope.projetista.getId()}">
                                                            <input type="hidden" name="idOrientador" value="${projeto.getOrientador().getId()}">
                                                            <button type="submit" class="btn btn-indigo btn-block" name="idProjeto" value="${projeto.getId()}">VER</button>
                                                        </td>
                                                    </core:when>
                                                    <core:otherwise>
                                                        <td scope="col">
                                                            <input type="hidden" name="idProjetista" value="${requestScope.projetista.getId()}">
                                                            <input type="hidden" name="idOrientador" value="${projeto.getOrientador().getId()}">
                                                            <button type="submit" class="btn btn-indigo btn-block" name="idProjeto" value="${projeto.getId()}">EDITAR</button>
                                                        </td>
                                                    </core:otherwise>
                                                </core:choose>
                                                
                                            </tr>
                                        </core:if>
                                    </core:forEach>
                                </form>

                            <h6 class="text-center" style="color: #ff0219">${requestScope.editarMsgErroIdProjeto}</h6>
                            <br>
                            <h6 class="text-center" style="color: #ff0219">${requestScope.editarMsgErroIdProjetista}</h6>
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
