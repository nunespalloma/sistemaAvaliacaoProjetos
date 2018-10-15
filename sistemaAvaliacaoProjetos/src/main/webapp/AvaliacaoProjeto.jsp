<%-- 
    Document   : AvaliacaoProjeto
    Created on : 15/10/2018, 15:56:14
    Author     : pallo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file="head.jspf"%> 
        <title>Avaliação de Projeto</title>
    </head>
    <body>
        <%@include file="navbar.jspf"%>
        
        <br>
        <br>
        <br>
        <h1 class="text-center"><b>Formulário para Avaliação de Projetos</b></h1>
        <br>
        <br>
        <br>
        <!--Card content-->
        <div class="card-body px-lg-5 pt-0">

            <!-- Form -->
            <form action="AvaliacaoServlet" method="POST" style="color: #757575;">
                <input type="hidden" name="idProjeto" value="${requestScope.projeto.getId()}">
                <input type="hidden" name="idAvaliador" value="${requestScope.avaliador.getId()}">
                <h2><b>Dados do Projeto:</b></h2>
                
                <br>
                <h6 class="text-center" style="color: #ff0219">${requestScope.editarMsgErroIdProjeto}</h6>
                <br>
                <h6 class="text-center" style="color: #ff0219">${requestScope.editarMsgErroIdAvaliador}</h6>
                <br>
                
                <!-- Default input -->
                <div class="form-group">
                    <label for="inputNomeProjeto">Nome Projeto</label>
                    <input type="text" class="form-control" id="inputNomeProjeto" name="nomeProjeto" value="${ not empty requestScope.projeto ? requestScope.projeto.getNome() : param.nomeProjeto}" placeholder="Nome Projeto" readonly>
                </div>
                
                <br>
                
                <div class="form-row">
                    <p>Descrição do projeto</p>
                    <textarea class="form-control" id="descricaoProjeto" rows="10" name="descricaoProjeto" maxlength="2000" readonly>${not empty requestScope.projeto.getDescricao() ? requestScope.projeto.getDescricao() : param.descricaoProjeto}</textarea>          
                </div>
                
                <br>
                
                <div class="form-group">
                    <label for="inputDuracaoProjeto">Duração do Projeto</label>
                    <input type="text" class="form-control" id="inputDuracaoProjeto" name="duracaoProjeto" value="${ not empty requestScope.projeto ? requestScope.projeto.getDuracao() : param.duracaoProjeto}" placeholder="Duração do Projeto" readonly>
                </div>    
                
                <br>
                
                <div class="form-group">
                    <label for="inputAreaOrigem">Área do conhecimento do CNPq de origem do projeto</label>
                    <input type="text" class="form-control" id="inputAreaOrigem" name="areaOrigem" value="${not empty requestScope.projeto ? requestScope.projeto.getAreaOrigemProjeto() : param.areaOrigem}" placeholder="Área do conhecimento do CNPq de origem do projeto" readonly>
                </div>    
                
                <core:if test="${not empty requestScope.projeto.getDescricaoMultidisciplinar()}">
                    <br>
                    <div class="form-group">
                        <label for="inputAreaMultidisciplinar">Descrição das Multidisciplinas de Origem</label>
                        <input type="text" class="form-control" id="inputAreaMultidisciplinar" name="descricaoMultidisciplinar" value="${not empty requestScope.projeto.getDescricaoMultidisciplinar() ? requestScope.projeto.getDescricaoMultidisciplinar() : param.descricaoMultidisciplinar}" placeholder="Descrição das Multidisciplinas de Origem" readonly>
                    </div>
                </core:if>
                          
                <br>
                
                <div class="form-group">
                    <label for="inputAreaAtuacao">Grande área do conhecimento de atuação do seu projeto</label>
                    <input type="text" class="form-control" id="inputAreaAtuacao" name="areaAtuacao" value="${not empty requestScope.projeto ? requestScope.projeto.getAreaAtuacaoProjeto() : param.areaAtuacao}" placeholder="Grande área do conhecimento de atuação do seu projeto" readonly>
                </div>
                
                <br>
                
                <div class="form-group">
                    <label for="inputDestinacao">Destinação do seu projeto</label>
                    <input type="text" class="form-control" id="inputDestinacao" name="destinacao" value="${not empty requestScope.projeto ? requestScope.projeto.getDestinacaoProjeto() : param.destinacao}" placeholder="Destinação do seu projeto" readonly>
                </div>
          
                <br>
                
                <div class="form-group">
                    <label for="inputTipo">Tipo de Projeto</label>
                    <input type="text" class="form-control" id="inputTipo" name="tipo" value="${not empty requestScope.projeto ? requestScope.projeto.getTipoProjeto() : param.tipo}" placeholder="Tipo de Projeto" readonly>
                </div>
                
                <core:if test="${requestScope.projeto.getTipoProjeto() eq 'CONTINUAÇÃO'}">
                    <br>
                    <div class="form-row">
                        <p>Resultados alcançados até o momento</p>
                        <textarea class="form-control"  id="descricaoContinuacao" rows="10" name="resultadosContinuacao" maxlength="2000" readonly>${not empty requestScope.projeto.getResultadosContinuacaoProjeto() ? requestScope.projeto.getResultadosContinuacaoProjeto() : param.resultadosContinuacao}</textarea>          
                    </div>
                </core:if>
                
                <br>
                
                <div class="form-row">
                    <p>O problema de mercado ou da sociedade que o seu projeto pretende resolver</p>
                    <textarea class="form-control" id="descricaoProblema" rows="10" name="problema" maxlength="2000" readonly>${not empty requestScope.projeto.getProblemaProjeto() ? requestScope.projeto.getProblemaProjeto() : param.problema}</textarea>
                </div>
                
                <br>
                
                <div class="form-row">
                    <p>Solução desenvolvida para o problema identificado</p>
                    <textarea class="form-control" id="descricaoSolucao" rows="10" name="solucao" maxlength="2000" readonly>${not empty requestScope.projeto.getSolucaoProjeto() ? requestScope.projeto.getSolucaoProjeto() : param.solucao}</textarea>
                </div>
                
                <br>
                
                <div class="form-row">
                    <p>Potencial de transferência das tecnologias/conhecimentos para o mercado/sociedade a partir do projeto desenvolvido</p>
                    <textarea class="form-control" id="descricaoPotencial" rows="10" name="potencial" maxlength="2000" readonly>${not empty requestScope.projeto.getPotencialProjeto() ? requestScope.projeto.getPotencialProjeto() : param.potencial}</textarea>
                </div>
                
                <br>
                
                <div class="form-row">
                    <p>Apresente a sua avaliação para o projeto. (máximo de 2.000 caracteres) </p>
                    <textarea class="form-control ${requestScope.avaliacaoStatus}" id="descricaoAvaliacao" rows="10" name="avaliacao" maxlength="2000">${not empty requestScope.projeto.getAvaliacao() ? requestScope.projeto.getAvaliacao() : param.avaliacao}</textarea>
                    <div class="invalid-feedback">
                        ${requestScope.avaliacaoMsgErro}
                    </div>
                    <small id="materialRegisterFormPhoneHelpBlock" class="form-text text-muted mb-4">
                        Digite algo com máximo de 2.000 caracteres
                    </small>
                </div>
                    
                <button class="btn btn-indigo btn-block" type="submit">SUBMETER AVALIAÇÃO</button>    
            </form>    
        </div>        
        <%@include file="footer.jspf"%>
        <%@include file="finalBody.jspf"%>
    </body>
</html>
