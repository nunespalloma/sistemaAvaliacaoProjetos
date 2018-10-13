<%@page import="br.com.uff.sistemaAvaliacaoProjetos.model.entity.Projeto"%>
<%@page import="br.com.uff.sistemaAvaliacaoProjetos.model.entity.Projetista"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file="head.jspf"%>
        <title>Formulário</title>
    </head>
    <body>
        <%@include file="navbar.jspf"%>
        <br>
        <br>
        <br>
        <h1 class="text-center"><b>Formulário para Elaboração de Projeto de Inovação</b></h1>
        <br>
        <br>
        <br>
        
        <!--Card content-->
        <div class="card-body px-lg-5 pt-0">

            <!-- Form -->
            <form action="FormularioServlet" method="POST" style="color: #757575;">
                <input type="hidden" name="idOrientador" value="${requestScope.orientador.getId()}">
                <input type="hidden" name="idProjeto" value="${requestScope.projeto.getId()}">
                <h2><b>Dados do Orientador:</b></h2>
                <br>
                <!-- Default input -->
                <div class="form-group">
                    <label for="inputNomeCompleto">Nome Completo</label>
                    <input type="text" class="form-control" id="inputNomeCompleto" name="nomeOrientador" value="${ not empty requestScope.orientador ? requestScope.orientador.getNome() : param.nomeOrientador}" placeholder="Nome Completo" ${ not empty requestScope.orientador ? 'disabled': ''}>
                </div>
                
                <!-- Default input -->
                <div class="form-group">
                    <label for="inputAddress">Email</label>
                    <input type="email" class="form-control" id="inputEmail4" name="emailOrientador" value="${ not empty requestScope.orientador ? requestScope.orientador.getEmail() : param.emailOrientador}" placeholder="Email" ${ not empty requestScope.orientador ? 'disabled': ''}>
                </div>
                
                <!-- Grid row -->
                <div class="form-row">
                    <!-- Default input -->
                    <div class="form-group col-md-6">
                        <label for="inputMatrículaSIAPE">Matrícula SIAPE</label>
                        <input type="text" class="form-control" id="inputMatrículaSIAPE" name="matriculaOrientador" value="${ not empty requestScope.orientador ? requestScope.orientador.getMatricula() : param.matriculaOrientador}" placeholder="Matrícula SIAPE" ${ not empty requestScope.orientador ? 'disabled': ''}>
                    </div>
                    <!-- Default input -->
                    <div class="form-group col-md-6">
                        <label for="inputCPF">CPF</label>
                        <input type="text" class="form-control" id="inputCPF" name="cpfOrientador" value="${ not empty requestScope.orientador ? requestScope.orientador.getCpf() : param.cpfOrientador}" placeholder="CPF" ${ not empty requestScope.orientador ? 'disabled': ''}>
                    </div>
                </div>
                <!-- Grid row -->
                
                <!-- Grid row -->
                <div class="form-row">
                    <!-- Default input -->
                    <div class="form-group col-md-6">
                        <label for="inputIdentidade">Identidade</label>
                        <input type="text" class="form-control" id="inputIdentidade" name="identidadeOrientador" value="${ not empty requestScope.orientador ? requestScope.orientador.getIdentidade() : param.identidadeOrientador}" placeholder="Identidade" ${ not empty requestScope.orientador ? 'disabled': ''}>
                    </div>
                    <!-- Default input -->
                    <div class="form-group col-md-6">
                        <label for="inputTelefone">Telefone</label>
                        <input type="text" class="form-control" id="inputTelefone" name="telefoneOrientador" value="${ not empty requestScope.orientador ? requestScope.orientador.getTelefone() : param.telefoneOrientador}" placeholder="Telefone" ${ not empty requestScope.orientador ? 'disabled': ''}>
                    </div>
                </div>
                <!-- Grid row -->
                
                <!-- Default input -->
                <div class="form-group">
                    <label for="inputLinkLattes">Link do Currículo Lattes</label>
                    <input type="text" class="form-control" id="inputLinkLattes" name="urlCurriculoLattesOrientador" value="${ not empty requestScope.orientador ? requestScope.orientador.getUrlCurriculoLattes() : param.urlCurriculoLattesOrientador}" placeholder="Link do Currículo Lattes" ${ not empty requestScope.orientador ? 'disabled': ''}>
                </div>
                
                <!-- Default input -->
                <div class="form-group">
                    <label for="inputDepartamento">Departamento</label>
                    <input type="text" class="form-control" id="inputDepartamento" name="departamentoOrientador" value="${ not empty requestScope.orientador ? requestScope.orientador.getDepartamento() : param.departamentoOrientador}" placeholder="Departamento" ${ not empty requestScope.orientador ? 'disabled': ''}>
                </div>
                
                <h6 class="text-danger">${requestScope.msgErroIdOrientador}</h6>
                
                <br>
                <br>
                <br>
                <h2><b>Dados do Projetista:</b></h2>
                <br>
                
                <!-- Grid row -->
                <div class="form-row">
                    <!-- Default input -->
                    <div class="input-group col">
                        <label class="input-group" for="matriculaProjetista">Matrícula do Projetista</label>
                        
                        <input type="text" class="input-group form-control ${matriculaProjetistaStatus}" id="matriculaProjetista" name="matriculaProjetista" value="${ not empty requestScope.projeto ? requestScope.projeto.getProjetista().getMatricula() : param.matriculaProjetista}" placeholder="Matrícula do Projetista" ${fn:containsIgnoreCase(sessionScope.login.getClass().getName() , "Projetista") ? 'readonly' : ''}>
                        <span class="input-group-btn"> 
                            <button type="button" class="btn btn-info btn-block form-control" name="btnProcurarProjetistaPorMatricula" onclick="javascript:ProcurarProjetistaPorMatricula()" ${fn:containsIgnoreCase(sessionScope.login.getClass().getName() , "Projetista") ? 'disabled' : ''}>BUSCAR</button>
                        </span>
                    </div>
                    <!-- Default input -->
                    <div class="input-group col">
                        <label class="input-group" for="nomeProjetista">Nome do Projetista</label>
                        <input type="text" class="input-group form-control" id="nomeProjetista" name="nomeProjetista" value="${ not empty requestScope.projeto ? requestScope.projeto.getProjetista().getNome() : param.nomeProjetista}" placeholder="Nome do Projetista" readonly>
                    </div>
                </div>
                <!-- Grid row -->    
                
                <h6 class="text-danger" id="msgErroIdProjetista">${msgErroIdProjetista}</h6>    
                
                <input type="hidden" name="idProjetista" id="idProjetista" value="${ not empty requestScope.projeto ? requestScope.projeto.getProjetista().getId() : param.idProjetista}">
                
                <br>
                <br>
                <br>
                <h2><b>Dados do Projeto:</b></h2>
                <br>
                
                <!-- Default input -->
                <div class="form-group">
                    <label for="inputNomeProjeto">Nome Projeto</label>
                    <input type="text" class="form-control ${requestScope.nomeProjetoStatus}" id="inputNomeProjeto" name="nomeProjeto" value="${ not empty requestScope.projeto ? requestScope.projeto.getNome() : param.nomeProjeto}" placeholder="Nome Projeto">
                    <div class="invalid-feedback">
                        ${requestScope.nomeProjetoMsgErro}
                    </div>
                </div>
                
                <div class="form-row">
                    <p>Descrição do projeto (máximo de 2.000 caracteres)</p>
                    <textarea class="form-control ${requestScope.descricaoProjetoStatus}" id="descricaoProjeto" rows="10" name="descricaoProjeto">${not empty requestScope.projeto.getDescricao() ? requestScope.projeto.getDescricao() : param.descricaoProjeto}</textarea>
                    <div class="invalid-feedback">
                        ${requestScope.descricaoProjetoMsgErro}
                    </div>
                    <small id="materialRegisterFormPhoneHelpBlock" class="form-text text-muted mb-4">
                        Digite algo com máximo de 2.000 caracteres
                    </small>
                </div>
                
                <div class="form-group">
                    <label for="inputDuracaoProjeto">Duração do Projeto</label>
                    <input type="text" class="form-control ${requestScope.duracaoProjetoStatus}" id="inputDuracaoProjeto" name="duracaoProjeto" value="${ not empty requestScope.projeto ? requestScope.projeto.getDuracao() : param.duracaoProjeto}" placeholder="Duração do Projeto">
                    <div class="invalid-feedback">
                        ${requestScope.duracaoProjetoMsgErro}
                    </div>
                </div>    
                    
                <h6>Área do conhecimento do CNPq de origem do projeto:</h6>
                
                <!-- Grid row -->
                <div class="form-row">
                    <div class="form-row">
                        <!-- Switch -->
                        <div class="switch mdb-color-switch">
                            <label>
                                <span style="padding-left:12px">
                                    <input type="radio" name="areaOrigem" value="CIÊNCIAS SOCIAIS E APLICADAS" ${not empty requestScope.projeto ? requestScope.projeto.getAreaOrigemProjeto() eq "CIÊNCIAS SOCIAIS E APLICADAS" ? 'checked' : '' : 'checked'} onclick="javascript:verificaMultidisciplinar()">
                                    <span class="lever"></span>
                                    Ciências Sociais e Aplicadas
                                </span>
                            </label>
                        </div>
                    </div>
                    <br>
                    <div class="form-row">
                        <!-- Switch -->
                        <div class="switch mdb-color-switch">
                            <label>
                                <span style="padding-left:149.8px">
                                    <input type="radio" name="areaOrigem" value="CIÊNCIAS HUMANAS" ${requestScope.projeto.getAreaOrigemProjeto() eq "CIÊNCIAS HUMANAS" ? 'checked' : ''}  onclick="javascript:verificaMultidisciplinar()">
                                    <span class="lever"></span>
                                    Ciências Humanas
                                </span>
                            </label>
                        </div>
                    </div>
                    <br>
                </div>
                    
                <!-- Grid row -->
                <div class="form-row">
                    <div  class="form-row">
                        <!-- Switch -->
                        <div class="switch mdb-color-switch">
                            <label>
                                <span style="padding-left:12px">
                                    <input type="radio" name="areaOrigem" value="CIÊNCIAS BIOLÓGICAS" ${requestScope.projeto.getAreaOrigemProjeto() eq "CIÊNCIAS BIOLÓGICAS" ? 'checked' : ''} onclick="javascript:verificaMultidisciplinar()">
                                    <span class="lever"></span>
                                    Ciências Biológicas
                                </span>
                            </label>
                        </div>
                    </div>
                    <br>
                    <div class="form-row">
                        <!-- Switch -->
                        <div class="switch mdb-color-switch">
                            <label>
                                <span style="padding-left:212.5px">
                                    <input type="radio" name="areaOrigem" value="CIÊNCIAS DA SAÚDE" ${requestScope.projeto.getAreaOrigemProjeto() eq "CIÊNCIAS DA SAÚDE" ? 'checked' : ''} onclick="javascript:verificaMultidisciplinar()">
                                    <span class="lever"></span>
                                    Ciências da Saúde 
                                </span>
                            </label>
                        </div>
                    </div>
                    <br>
                </div>
                
                <!-- Grid row -->
                <div class="form-row">
                    <div  class="form-row">
                        <!-- Switch -->
                        <div class="switch mdb-color-switch">
                            <label>
                                <span style="padding-left:12px">
                                    <input type="radio" name="areaOrigem" value="ENGENHARIA" ${requestScope.projeto.getAreaOrigemProjeto() eq "ENGENHARIA" ? 'checked' : ''} onclick="javascript:verificaMultidisciplinar()">
                                    <span class="lever"></span>
                                    Engenharia
                                </span>
                            </label>
                        </div>
                    </div>
                    <br>
                    <div class="form-row">
                        <!-- Switch -->
                        <div class="switch mdb-color-switch">
                            <label>
                                <span style="padding-left:270px">
                                    <input type="radio" name="areaOrigem" value="CIÊNCIAS EXATAS E DA TERRA" ${requestScope.projeto.getAreaOrigemProjeto() eq "CIÊNCIAS EXATAS E DA TERRA" ? 'checked' : ''} onclick="javascript:verificaMultidisciplinar()">
                                    <span class="lever"></span>
                                    Ciências Exatas e da Terra 
                                </span>
                            </label>
                        </div>
                    </div>
                    <br>
                </div>
                    
                <!-- Grid row -->
                <div class="form-row">
                    <div  class="form-row">
                        <!-- Switch -->
                        <div class="switch mdb-color-switch">
                            <label>
                                <span style="padding-left:12px">
                                    <input type="radio" name="areaOrigem" value="CIÊNCIAS AGRÁRIAS" ${requestScope.projeto.getAreaOrigemProjeto() eq "CIÊNCIAS AGRÁRIAS" ? 'checked' : ''} onclick="javascript:verificaMultidisciplinar()">
                                    <span class="lever"></span>
                                    Ciências Agrárias
                                </span>
                            </label>
                        </div>
                    </div>
                    <br>
                    <div class="form-row">
                        <!-- Switch -->
                        <div class="switch mdb-color-switch">
                            <label>
                                <span style="padding-left:227px">
                                    <input type="radio" name="areaOrigem" value="LINGUÍSTICA, LETRAS E ARTES" ${requestScope.projeto.getAreaOrigemProjeto() eq "LINGUÍSTICA, LETRAS E ARTES" ? 'checked' : ''} onclick="javascript:verificaMultidisciplinar()">
                                    <span class="lever"></span>
                                    Linguística, Letras e Artes  
                                </span>
                            </label>
                        </div>
                    </div>
                    <br>
                </div>
                
                <!-- Grid row -->
                <div class="form-row">
                    <div  class="form-row">
                        <!-- Switch -->
                        <div class="switch mdb-color-switch">
                            <label>
                                <span style="padding-left:12px">
                                    <input type="radio" name="areaOrigem" id="multidisciplinar" value="MULTIDISCIPLINAR" ${requestScope.projeto.getAreaOrigemProjeto() eq "MULTIDISCIPLINAR" ? 'checked' : ''} onclick="javascript:verificaMultidisciplinar()">
                                    <span class="lever"></span>
                                    Multidisciplinar:
                                </span>
                            </label>
                        </div>
                    </div>
                    <br>
                    <div class="form-inline">
                        <!-- Switch -->
                        <div class="switch mdb-color-switch">
                            <label>
                                <span style="padding-left:15px">
                                    <input type="text" class="form-control ${requestScope.descricaoMultidisciplinarStatus}" id="inputAreaMultidisciplinar" name="descricaoMultidisciplinar" value="${not empty requestScope.projeto.getDescricaoMultidisciplinar() ? requestScope.projeto.getDescricaoMultidisciplinar() : param.descricaoMultidisciplinar}" placeholder="" ${requestScope.projeto.getAreaOrigemProjeto() eq "MULTIDISCIPLINAR" ? '' : 'disabled'}>
                                    <div class="invalid-feedback">
                                        ${requestScope.descricaoMultidisciplinarMsgErro}
                                    </div>
                                </span>
                            </label>
                        </div>
                    </div>
                    <br>
                </div>
                                
                <br>
                <h6 class="text-danger">${requestScope.areaOrigemMsgErro}</h6>
                <core:if test="${not empty requestScope.areaOrigemMsgErro}"><br></core:if>
                <h6>Escolha a grande área do conhecimento de atuação do seu projeto:</h6>
                
                <!-- Grid row -->
                <div class="form-row">
                    <div class="form-row">
                        <!-- Switch -->
                        <div class="switch mdb-color-switch">
                            <label>
                                <span style="padding-left:12px">
                                    <input type="radio" name="areaAtuacao" value="CIÊNCIAS HUMANAS/SOCIAIS/LINGUÍSTICA" ${not empty requestScope.projeto ? requestScope.projeto.getAreaAtuacaoProjeto() eq "CIÊNCIAS HUMANAS/SOCIAIS/LINGUÍSTICA" ? 'checked' : '' : 'checked'}>
                                    <span class="lever"></span>
                                    Ciências Humanas/Sociais/Linguística
                                </span>
                            </label>
                        </div>
                    </div>
                    <br>
                    <div class="form-row">
                        <!-- Switch -->
                        <div class="switch mdb-color-switch">
                            <label>
                                <span style="padding-left:77px">
                                    <input type="radio" name="areaAtuacao" value="CIÊNCIAS EXATAS E DA TERRA/ENGENHARIA/AGRÁRIAS" ${requestScope.projeto.getAreaAtuacaoProjeto() eq "CIÊNCIAS EXATAS E DA TERRA/ENGENHARIA/AGRÁRIAS" ? 'checked' : ''}>
                                    <span class="lever"></span>
                                    Ciências Exatas e da Terra/Engenharia/Agrárias
                                </span>
                            </label>
                        </div>
                    </div>
                    <br>
                </div>
                    
                <!-- Grid row -->
                <div class="form-row">
                    <div  class="form-row">
                        <!-- Switch -->
                        <div class="switch mdb-color-switch">
                            <label>
                                <span style="padding-left:12px">
                                    <input type="radio" name="areaAtuacao" value="CIÊNCIAS BIOLÓGICAS/SAÚDE" ${requestScope.projeto.getAreaAtuacaoProjeto() eq "CIÊNCIAS BIOLÓGICAS/SAÚDE" ? 'checked' : ''}>
                                    <span class="lever"></span>
                                    Ciências Biológicas/Saúde
                                </span>
                            </label>
                        </div>
                    </div>
                    <br>
                </div>
                <h6 class="text-danger">${requestScope.areaAtuacaoMsgErro}</h6>
                
                <br>
                
                <h6>Escolha a destinação do seu projeto: </h6>
                
                <!-- Grid row -->
                <div class="form-row">
                    <div class="form-row">
                        <!-- Switch -->
                        <div class="switch mdb-color-switch">
                            <label>
                                <span style="padding-left:12px">
                                    <input type="radio" name="destinacao" value="INOVAÇÃO MERCADOLÓGICA" ${not empty requestScope.projeto ? requestScope.projeto.getDestinacaoProjeto() eq "INOVAÇÃO MERCADOLÓGICA" ? 'checked' : '' : 'checked'}>
                                    <span class="lever"></span>
                                    Inovação Mercadológica
                                </span>
                            </label>
                        </div>
                    </div>
                    <br>
                    <div class="form-row">
                        <!-- Switch -->
                        <div class="switch mdb-color-switch">
                            <label>
                                <span style="padding-left:177px">
                                    <input type="radio" name="destinacao" value="INOVAÇÃO PARA O DESENVOLVIMENTO SOCIAL" ${requestScope.projeto.getDestinacaoProjeto() eq "INOVAÇÃO PARA O DESENVOLVIMENTO SOCIAL" ? 'checked' : ''}>
                                    <span class="lever"></span>
                                    Inovação para o Desenvolvimento Social
                                </span>
                            </label>
                        </div>
                    </div>
                    <br>
                </div>
                <h6 class="text-danger">${requestScope.destinacaoMsgErro}</h6>
                
                <br>
                
                
                
                <!-- Grid row -->
                <div class="form-row">
                    <div class="form-row">
                        <!-- Switch -->
                        <div class="switch mdb-color-switch">
                            <label>
                                <span style="padding-left:12px">
                                    1)Tipo de Projeto:
                                </span>
                            </label>
                        </div>
                    </div>
                    <br>
                    <div class="form-row">
                        <!-- Switch -->
                        <div class="switch mdb-color-switch">
                            <label>
                                <span style="padding-left:20px">
                                    <input type="radio" name="tipo" value="NOVO" ${not empty requestScope.projeto ? requestScope.projeto.getTipoProjeto() eq "NOVO" ? 'checked' : '' : 'checked'} onclick="javascrip:verificaContinuacao()">
                                    <span class="lever"></span>
                                    Novo
                                </span>
                            </label>
                        </div>
                    </div>
                    <br>
                    <div class="form-row">
                        <!-- Switch -->
                        <div class="switch mdb-color-switch">
                            <label>
                                <span style="padding-left:100px">
                                    <input type="radio" id="tipoContinuacao" name="tipo" value="CONTINUAÇÃO" ${requestScope.projeto.getTipoProjeto() eq "CONTINUAÇÃO" ? 'checked' : ''} onclick="javascrip:verificaContinuacao()">
                                    <span class="lever"></span>
                                    Continuação
                                </span>
                            </label>
                        </div>
                    </div>
                    <br>
                </div>
                <h6 class="text-danger" >${requestScope.tipoMsgErro}</h6>
                
                <div class="form-row">
                    <p>Caso seja uma continuação do projeto, apresente aqui os resultados alcançados até o momento (máximo de 2.000 caracteres)</p>
                    <textarea class="form-control ${requestScope.resultadosContinuacaoStatus}"  id="descricaoContinuacao" rows="10" name="resultadosContinuacao" ${requestScope.projeto.getTipoProjeto() eq "CONTINUAÇÃO" ? '' : 'disabled'}>${not empty requestScope.projeto.getResultadosContinuacaoProjeto() ? requestScope.projeto.getResultadosContinuacaoProjeto() : param.resultadosContinuacao}</textarea>
                    <div class="invalid-feedback">
                        ${requestScope.resultadosContinuacaoMsgErro}
                    </div>
                    <small id="materialRegisterFormPhoneHelpBlock" class="form-text text-muted mb-4">
                        Digite algo com máximo de 2.000 caracteres
                    </small>
                </div>
                
                <br>
                
                <div class="form-row">
                    <p>2) Qual é o problema de mercado ou da sociedade que o seu projeto pretende resolver? (máximo de 2.000 caracteres)</p>
                    <textarea class="form-control ${requestScope.problemaStatus}" id="descricaoProblema" rows="10" name="problema">${not empty requestScope.projeto.getProblemaProjeto() ? requestScope.projeto.getProblemaProjeto() : param.problema}</textarea>
                    <div class="invalid-feedback">
                        ${requestScope.problemaMsgErro}
                    </div>
                    <small id="materialRegisterFormPhoneHelpBlock" class="form-text text-muted mb-4">
                        Digite algo com máximo de 2.000 caracteres
                    </small>
                </div>
                
                <br>
                
                <div class="form-row">
                    <p>3) Como você pretende desenvolver a solução para o problema identificado? (máximo de 2.000 caracteres)</p>
                    <textarea class="form-control ${requestScope.solucaoStatus}" id="descricaoSolucao" rows="10" name="solucao">${not empty requestScope.projeto.getSolucaoProjeto() ? requestScope.projeto.getSolucaoProjeto() : param.solucao}</textarea>
                    <div class="invalid-feedback">
                        ${requestScope.solucaoMsgErro}
                    </div>
                    <small id="materialRegisterFormPhoneHelpBlock" class="form-text text-muted mb-4">
                        Digite algo com máximo de 2.000 caracteres
                    </small>
                </div>
                
                <br>
                
                <div class="form-row">
                    <p>4) Resumo do currículo do professor orientador com foco na inovação proposta (máximo de 2.000 caracteres)</p>
                    <textarea class="form-control ${requestScope.resumoCurriculoOrientadorStatus}" id="descricaoCurriculo" rows="10" name="resumoCurriculoOrientador">${not empty requestScope.projeto.getResumoCurriculoOrientador() ? requestScope.projeto.getResumoCurriculoOrientador() : param.resumoCurriculoOrientador}</textarea>
                    <div class="invalid-feedback">
                        ${requestScope.resumoCurriculoOrientadorMsgErro}
                    </div>
                    <small id="materialRegisterFormPhoneHelpBlock" class="form-text text-muted mb-4">
                        Digite algo com máximo de 2.000 caracteres
                    </small>
                </div>
                
                <br>
                
                <div class="form-row">
                    <p>5) Apresente de forma resumida o potencial de transferência das tecnologias/conhecimentos para o mercado/sociedade a partir do projeto desenvolvido (máximo de 2.000 caracteres)</p>
                    <textarea class="form-control ${requestScope.potencialStatus}" id="descricaoPotencial" rows="10" name="potencial">${not empty requestScope.projeto.getPotencialProjeto() ? requestScope.projeto.getPotencialProjeto() : param.potencial}</textarea>
                    <div class="invalid-feedback">
                        ${requestScope.potencialMsgErro}
                    </div>
                    <small id="materialRegisterFormPhoneHelpBlock" class="form-text text-muted mb-4">
                        Digite algo com máximo de 2.000 caracteres
                    </small>
                </div>
                
                <br>
                
                <div class="form-row">
                    <p>6) Plano de trabalho do bolsista: Descrever as atividades que serão desenvolvidas pelo bolsista (até dez atividades) e os respectivos produtos associados a cada etapa. Apresentar gráfico de Gantt das atividades propostas distribuídas nos 12 meses do projeto. (máximo de 2.000 caracteres) </p>
                    <textarea class="form-control ${requestScope.planoTrabalhoBolsistaStatus}" id="descricaoPlanoAtividades" rows="10" name="planoTrabalhoBolsista">${not empty requestScope.projeto.getPlanoTrabalhoBolsista() ? requestScope.projeto.getPlanoTrabalhoBolsista() : param.planoTrabalhoBolsista}</textarea>
                    <div class="invalid-feedback">
                        ${requestScope.planoTrabalhoBolsistaMsgErro}
                    </div>
                    <small id="materialRegisterFormPhoneHelpBlock" class="form-text text-muted mb-4">
                        Digite algo com máximo de 2.000 caracteres
                    </small>
                </div>
                
                <br>
                
                <h2><b>Gráfico de Gantt</b></h2>
                
                <table width="1000" border="1px">
                        <tr>
                            <td scope="col"><h5><b>  </b></h5></td>
                            <td scope="col"><h5><b><center> Ago </center></b></h5></td>
                            <td scope="col"><h5><b><center> Set </center></b></h5></td>
                            <td scope="col"><h5><b><center> Out </center></b></h5></td>
                            <td scope="col"><h5><b><center> Nov </center></b></h5></td>
                            <td scope="col"><h5><b><center> Dez </center></b></h5></td>
                            <td scope="col"><h5><b><center> Jan </center></b></h5></td>
                            <td scope="col"><h5><b><center> Fev </center></b></h5></td>
                            <td scope="col"><h5><b><center> Mar </center></b></h5></td>
                            <td scope="col"><h5><b><center> Abr </center></b></h5></td>
                            <td scope="col"><h5><b><center> Mai </center></b></h5></td>
                            <td scope="col"><h5><b><center> Jun </center></b></h5></td>
                            <td scope="col"><h5><b><center> Jul </center></b></h5></td>
                        </tr>
                        <core:choose>
                            <core:when test="${not empty requestScope.projeto}">
                                <core:forEach items="${requestScope.projeto.getAtividades()}" var="projeto" varStatus="status">
                                    <core:if test="${projeto.getNome() eq 'ATIVIDADE 1'}">
                                        <tr>
                                            <td scope="col"><h5><b><center>At. 1</center></b></h5></td>
                                            <td scope="col"><center><input type="checkbox" name="atividade1Agosto" ${projeto.isAgosto() eq true ? 'checked' : ''}></center></td>
                                            <td scope="col"><center><input type="checkbox" name="atividade1Setembro" ${projeto.isSetembro() eq true ? 'checked' : ''}></center></td>
                                            <td scope="col"><center><input type="checkbox" name="atividade1Outubro" ${projeto.isOutubro() eq true ? 'checked' : ''}></center></td>
                                            <td scope="col"><center><input type="checkbox" name="atividade1Novembro" ${projeto.isNovembro() eq true ? 'checked' : ''}></center></td>
                                            <td scope="col"><center><input type="checkbox" name="atividade1Dezembro"${projeto.isDezembro() eq true ? 'checked' : ''}></center></td>
                                            <td scope="col"><center><input type="checkbox" name="atividade1Janeiro" ${projeto.isJaneiro() eq true ? 'checked' : ''}></center></td>
                                            <td scope="col"><center><input type="checkbox" name="atividade1Fevereiro" ${projeto.isFevereiro() eq true ? 'checked' : ''}></center></td>
                                            <td scope="col"><center><input type="checkbox" name="atividade1Marco" ${projeto.isMarco() eq true ? 'checked' : ''}></center></td>
                                            <td scope="col"><center><input type="checkbox" name="atividade1Abril" ${projeto.isAbril() eq true ? 'checked' : ''}></center></td>
                                            <td scope="col"><center><input type="checkbox" name="atividade1Maio" ${projeto.isMaio() eq true ? 'checked' : ''}></center></td>
                                            <td scope="col"><center><input type="checkbox" name="atividade1Junho" ${projeto.isJunho() eq true ? 'checked' : ''}></center></td>
                                            <td scope="col"><center><input type="checkbox" name="atividade1Julho" ${projeto.isJulho() eq true ? 'checked' : ''}></center></td>
                                        </tr>
                                    </core:if>
                                </core:forEach>
                                <core:forEach items="${requestScope.projeto.getAtividades()}" var="projeto" varStatus="status">        
                                    <core:if test="${projeto.getNome() eq 'ATIVIDADE 2'}">
                                        <tr>
                                            <td scope="col"><h5><b><center>At. 2</center></b></h5></td>
                                            <td scope="col"><center><input type="checkbox" name="atividade2Agosto" ${projeto.isAgosto() eq true ? 'checked' : ''}></center></td>
                                            <td scope="col"><center><input type="checkbox" name="atividade2Setembro" ${projeto.isSetembro() eq true ? 'checked' : ''}></center></td>
                                            <td scope="col"><center><input type="checkbox" name="atividade2Outubro" ${projeto.isOutubro() eq true ? 'checked' : ''}></center></td>
                                            <td scope="col"><center><input type="checkbox" name="atividade2Novembro" ${projeto.isNovembro() eq true ? 'checked' : ''}></center></td>
                                            <td scope="col"><center><input type="checkbox" name="atividade2Dezembro"${projeto.isDezembro() eq true ? 'checked' : ''}></center></td>
                                            <td scope="col"><center><input type="checkbox" name="atividade2Janeiro" ${projeto.isJaneiro() eq true ? 'checked' : ''}></center></td>
                                            <td scope="col"><center><input type="checkbox" name="atividade2Fevereiro" ${projeto.isFevereiro() eq true ? 'checked' : ''}></center></td>
                                            <td scope="col"><center><input type="checkbox" name="atividade2Marco" ${projeto.isMarco() eq true ? 'checked' : ''}></center></td>
                                            <td scope="col"><center><input type="checkbox" name="atividade2Abril" ${projeto.isAbril() eq true ? 'checked' : ''}></center></td>
                                            <td scope="col"><center><input type="checkbox" name="atividade2Maio" ${projeto.isMaio() eq true ? 'checked' : ''}></center></td>
                                            <td scope="col"><center><input type="checkbox" name="atividade2Junho" ${projeto.isJunho() eq true ? 'checked' : ''}></center></td>
                                            <td scope="col"><center><input type="checkbox" name="atividade2Julho" ${projeto.isJulho() eq true ? 'checked' : ''}></center></td>
                                        </tr>
                                    </core:if>
                                </core:forEach>
                                <core:forEach items="${requestScope.projeto.getAtividades()}" var="projeto" varStatus="status">        
                                    <core:if test="${projeto.getNome() eq 'ATIVIDADE 3'}">
                                        <tr>
                                            <td scope="col"><h5><b><center>At. 3</center></b></h5></td>
                                            <td scope="col"><center><input type="checkbox" name="atividade3Agosto" ${projeto.isAgosto() eq true ? 'checked' : ''}></center></td>
                                            <td scope="col"><center><input type="checkbox" name="atividade3Setembro" ${projeto.isSetembro() eq true ? 'checked' : ''}></center></td>
                                            <td scope="col"><center><input type="checkbox" name="atividade3Outubro" ${projeto.isOutubro() eq true ? 'checked' : ''}></center></td>
                                            <td scope="col"><center><input type="checkbox" name="atividade3Novembro" ${projeto.isNovembro() eq true ? 'checked' : ''}></center></td>
                                            <td scope="col"><center><input type="checkbox" name="atividade3Dezembro"${projeto.isDezembro() eq true ? 'checked' : ''}></center></td>
                                            <td scope="col"><center><input type="checkbox" name="atividade3Janeiro" ${projeto.isJaneiro() eq true ? 'checked' : ''}></center></td>
                                            <td scope="col"><center><input type="checkbox" name="atividade3Fevereiro" ${projeto.isFevereiro() eq true ? 'checked' : ''}></center></td>
                                            <td scope="col"><center><input type="checkbox" name="atividade3Marco" ${projeto.isMarco() eq true ? 'checked' : ''}></center></td>
                                            <td scope="col"><center><input type="checkbox" name="atividade3Abril" ${projeto.isAbril() eq true ? 'checked' : ''}></center></td>
                                            <td scope="col"><center><input type="checkbox" name="atividade3Maio" ${projeto.isMaio() eq true ? 'checked' : ''}></center></td>
                                            <td scope="col"><center><input type="checkbox" name="atividade3Junho" ${projeto.isJunho() eq true ? 'checked' : ''}></center></td>
                                            <td scope="col"><center><input type="checkbox" name="atividade3Julho" ${projeto.isJulho() eq true ? 'checked' : ''}></center></td>
                                        </tr>
                                    </core:if>
                                </core:forEach>
                                <core:forEach items="${requestScope.projeto.getAtividades()}" var="projeto" varStatus="status">        
                                    <core:if test="${projeto.getNome() eq 'ATIVIDADE 4'}">
                                        <tr>
                                            <td scope="col"><h5><b><center>At. 4</center></b></h5></td>
                                            <td scope="col"><center><input type="checkbox" name="atividade4Agosto" ${projeto.isAgosto() eq true ? 'checked' : ''}></center></td>
                                            <td scope="col"><center><input type="checkbox" name="atividade4Setembro" ${projeto.isSetembro() eq true ? 'checked' : ''}></center></td>
                                            <td scope="col"><center><input type="checkbox" name="atividade4Outubro" ${projeto.isOutubro() eq true ? 'checked' : ''}></center></td>
                                            <td scope="col"><center><input type="checkbox" name="atividade4Novembro" ${projeto.isNovembro() eq true ? 'checked' : ''}></center></td>
                                            <td scope="col"><center><input type="checkbox" name="atividade4Dezembro"${projeto.isDezembro() eq true ? 'checked' : ''}></center></td>
                                            <td scope="col"><center><input type="checkbox" name="atividade4Janeiro" ${projeto.isJaneiro() eq true ? 'checked' : ''}></center></td>
                                            <td scope="col"><center><input type="checkbox" name="atividade4Fevereiro" ${projeto.isFevereiro() eq true ? 'checked' : ''}></center></td>
                                            <td scope="col"><center><input type="checkbox" name="atividade4Marco" ${projeto.isMarco() eq true ? 'checked' : ''}></center></td>
                                            <td scope="col"><center><input type="checkbox" name="atividade4Abril" ${projeto.isAbril() eq true ? 'checked' : ''}></center></td>
                                            <td scope="col"><center><input type="checkbox" name="atividade4Maio" ${projeto.isMaio() eq true ? 'checked' : ''}></center></td>
                                            <td scope="col"><center><input type="checkbox" name="atividade4Junho" ${projeto.isJunho() eq true ? 'checked' : ''}></center></td>
                                            <td scope="col"><center><input type="checkbox" name="atividade4Julho" ${projeto.isJulho() eq true ? 'checked' : ''}></center></td>
                                        </tr>
                                    </core:if>
                                </core:forEach>
                                <core:forEach items="${requestScope.projeto.getAtividades()}" var="projeto" varStatus="status">
                                    <core:if test="${projeto.getNome() eq 'ATIVIDADE 5'}">
                                        <tr>
                                            <td scope="col"><h5><b><center>At. 5</center></b></h5></td>
                                            <td scope="col"><center><input type="checkbox" name="atividade5Agosto" ${projeto.isAgosto() eq true ? 'checked' : ''}></center></td>
                                            <td scope="col"><center><input type="checkbox" name="atividade5Setembro" ${projeto.isSetembro() eq true ? 'checked' : ''}></center></td>
                                            <td scope="col"><center><input type="checkbox" name="atividade5Outubro" ${projeto.isOutubro() eq true ? 'checked' : ''}></center></td>
                                            <td scope="col"><center><input type="checkbox" name="atividade5Novembro" ${projeto.isNovembro() eq true ? 'checked' : ''}></center></td>
                                            <td scope="col"><center><input type="checkbox" name="atividade5Dezembro"${projeto.isDezembro() eq true ? 'checked' : ''}></center></td>
                                            <td scope="col"><center><input type="checkbox" name="atividade5Janeiro" ${projeto.isJaneiro() eq true ? 'checked' : ''}></center></td>
                                            <td scope="col"><center><input type="checkbox" name="atividade5Fevereiro" ${projeto.isFevereiro() eq true ? 'checked' : ''}></center></td>
                                            <td scope="col"><center><input type="checkbox" name="atividade5Marco" ${projeto.isMarco() eq true ? 'checked' : ''}></center></td>
                                            <td scope="col"><center><input type="checkbox" name="atividade5Abril" ${projeto.isAbril() eq true ? 'checked' : ''}></center></td>
                                            <td scope="col"><center><input type="checkbox" name="atividade5Maio" ${projeto.isMaio() eq true ? 'checked' : ''}></center></td>
                                            <td scope="col"><center><input type="checkbox" name="atividade5Junho" ${projeto.isJunho() eq true ? 'checked' : ''}></center></td>
                                            <td scope="col"><center><input type="checkbox" name="atividade5Julho" ${projeto.isJulho() eq true ? 'checked' : ''}></center></td>
                                        </tr>
                                    </core:if>
                                </core:forEach>
                                <core:forEach items="${requestScope.projeto.getAtividades()}" var="projeto" varStatus="status">
                                    <core:if test="${projeto.getNome() eq 'ATIVIDADE 6'}">
                                        <tr>
                                            <td scope="col"><h5><b><center>At. 6</center></b></h5></td>
                                            <td scope="col"><center><input type="checkbox" name="atividade6Agosto" ${projeto.isAgosto() eq true ? 'checked' : ''}></center></td>
                                            <td scope="col"><center><input type="checkbox" name="atividade6Setembro" ${projeto.isSetembro() eq true ? 'checked' : ''}></center></td>
                                            <td scope="col"><center><input type="checkbox" name="atividade6Outubro" ${projeto.isOutubro() eq true ? 'checked' : ''}></center></td>
                                            <td scope="col"><center><input type="checkbox" name="atividade6Novembro" ${projeto.isNovembro() eq true ? 'checked' : ''}></center></td>
                                            <td scope="col"><center><input type="checkbox" name="atividade6Dezembro"${projeto.isDezembro() eq true ? 'checked' : ''}></center></td>
                                            <td scope="col"><center><input type="checkbox" name="atividade6Janeiro" ${projeto.isJaneiro() eq true ? 'checked' : ''}></center></td>
                                            <td scope="col"><center><input type="checkbox" name="atividade6Fevereiro" ${projeto.isFevereiro() eq true ? 'checked' : ''}></center></td>
                                            <td scope="col"><center><input type="checkbox" name="atividade6Marco" ${projeto.isMarco() eq true ? 'checked' : ''}></center></td>
                                            <td scope="col"><center><input type="checkbox" name="atividade6Abril" ${projeto.isAbril() eq true ? 'checked' : ''}></center></td>
                                            <td scope="col"><center><input type="checkbox" name="atividade6Maio" ${projeto.isMaio() eq true ? 'checked' : ''}></center></td>
                                            <td scope="col"><center><input type="checkbox" name="atividade6Junho" ${projeto.isJunho() eq true ? 'checked' : ''}></center></td>
                                            <td scope="col"><center><input type="checkbox" name="atividade6Julho" ${projeto.isJulho() eq true ? 'checked' : ''}></center></td>
                                        </tr>
                                    </core:if>
                                </core:forEach>
                                <core:forEach items="${requestScope.projeto.getAtividades()}" var="projeto" varStatus="status">
                                    <core:if test="${projeto.getNome() eq 'ATIVIDADE 7'}">
                                        <tr>
                                            <td scope="col"><h5><b><center>At. 7</center></b></h5></td>
                                            <td scope="col"><center><input type="checkbox" name="atividade7Agosto" ${projeto.isAgosto() eq true ? 'checked' : ''}></center></td>
                                            <td scope="col"><center><input type="checkbox" name="atividade7Setembro" ${projeto.isSetembro() eq true ? 'checked' : ''}></center></td>
                                            <td scope="col"><center><input type="checkbox" name="atividade7Outubro" ${projeto.isOutubro() eq true ? 'checked' : ''}></center></td>
                                            <td scope="col"><center><input type="checkbox" name="atividade7Novembro" ${projeto.isNovembro() eq true ? 'checked' : ''}></center></td>
                                            <td scope="col"><center><input type="checkbox" name="atividade7Dezembro"${projeto.isDezembro() eq true ? 'checked' : ''}></center></td>
                                            <td scope="col"><center><input type="checkbox" name="atividade7Janeiro" ${projeto.isJaneiro() eq true ? 'checked' : ''}></center></td>
                                            <td scope="col"><center><input type="checkbox" name="atividade7Fevereiro" ${projeto.isFevereiro() eq true ? 'checked' : ''}></center></td>
                                            <td scope="col"><center><input type="checkbox" name="atividade7Marco" ${projeto.isMarco() eq true ? 'checked' : ''}></center></td>
                                            <td scope="col"><center><input type="checkbox" name="atividade7Abril" ${projeto.isAbril() eq true ? 'checked' : ''}></center></td>
                                            <td scope="col"><center><input type="checkbox" name="atividade7Maio" ${projeto.isMaio() eq true ? 'checked' : ''}></center></td>
                                            <td scope="col"><center><input type="checkbox" name="atividade7Junho" ${projeto.isJunho() eq true ? 'checked' : ''}></center></td>
                                            <td scope="col"><center><input type="checkbox" name="atividade7Julho" ${projeto.isJulho() eq true ? 'checked' : ''}></center></td>
                                        </tr>
                                    </core:if>
                                </core:forEach>
                                <core:forEach items="${requestScope.projeto.getAtividades()}" var="projeto" varStatus="status">
                                    <core:if test="${projeto.getNome() eq 'ATIVIDADE 8'}">
                                        <tr>
                                            <td scope="col"><h5><b><center>At. 8</center></b></h5></td>
                                            <td scope="col"><center><input type="checkbox" name="atividade8Agosto" ${projeto.isAgosto() eq true ? 'checked' : ''}></center></td>
                                            <td scope="col"><center><input type="checkbox" name="atividade8Setembro" ${projeto.isSetembro() eq true ? 'checked' : ''}></center></td>
                                            <td scope="col"><center><input type="checkbox" name="atividade8Outubro" ${projeto.isOutubro() eq true ? 'checked' : ''}></center></td>
                                            <td scope="col"><center><input type="checkbox" name="atividade8Novembro" ${projeto.isNovembro() eq true ? 'checked' : ''}></center></td>
                                            <td scope="col"><center><input type="checkbox" name="atividade8Dezembro"${projeto.isDezembro() eq true ? 'checked' : ''}></center></td>
                                            <td scope="col"><center><input type="checkbox" name="atividade8Janeiro" ${projeto.isJaneiro() eq true ? 'checked' : ''}></center></td>
                                            <td scope="col"><center><input type="checkbox" name="atividade8Fevereiro" ${projeto.isFevereiro() eq true ? 'checked' : ''}></center></td>
                                            <td scope="col"><center><input type="checkbox" name="atividade8Marco" ${projeto.isMarco() eq true ? 'checked' : ''}></center></td>
                                            <td scope="col"><center><input type="checkbox" name="atividade8Abril" ${projeto.isAbril() eq true ? 'checked' : ''}></center></td>
                                            <td scope="col"><center><input type="checkbox" name="atividade8Maio" ${projeto.isMaio() eq true ? 'checked' : ''}></center></td>
                                            <td scope="col"><center><input type="checkbox" name="atividade8Junho" ${projeto.isJunho() eq true ? 'checked' : ''}></center></td>
                                            <td scope="col"><center><input type="checkbox" name="atividade8Julho" ${projeto.isJulho() eq true ? 'checked' : ''}></center></td>
                                        </tr>
                                    </core:if>
                                </core:forEach>
                                <core:forEach items="${requestScope.projeto.getAtividades()}" var="projeto" varStatus="status">
                                    <core:if test="${projeto.getNome() eq 'ATIVIDADE 9'}">
                                        <tr>
                                            <td scope="col"><h5><b><center>At. 9</center></b></h5></td>
                                            <td scope="col"><center><input type="checkbox" name="atividade9Agosto" ${projeto.isAgosto() eq true ? 'checked' : ''}></center></td>
                                            <td scope="col"><center><input type="checkbox" name="atividade9Setembro" ${projeto.isSetembro() eq true ? 'checked' : ''}></center></td>
                                            <td scope="col"><center><input type="checkbox" name="atividade9Outubro" ${projeto.isOutubro() eq true ? 'checked' : ''}></center></td>
                                            <td scope="col"><center><input type="checkbox" name="atividade9Novembro" ${projeto.isNovembro() eq true ? 'checked' : ''}></center></td>
                                            <td scope="col"><center><input type="checkbox" name="atividade9Dezembro"${projeto.isDezembro() eq true ? 'checked' : ''}></center></td>
                                            <td scope="col"><center><input type="checkbox" name="atividade9Janeiro" ${projeto.isJaneiro() eq true ? 'checked' : ''}></center></td>
                                            <td scope="col"><center><input type="checkbox" name="atividade9Fevereiro" ${projeto.isFevereiro() eq true ? 'checked' : ''}></center></td>
                                            <td scope="col"><center><input type="checkbox" name="atividade9Marco" ${projeto.isMarco() eq true ? 'checked' : ''}></center></td>
                                            <td scope="col"><center><input type="checkbox" name="atividade9Abril" ${projeto.isAbril() eq true ? 'checked' : ''}></center></td>
                                            <td scope="col"><center><input type="checkbox" name="atividade9Maio" ${projeto.isMaio() eq true ? 'checked' : ''}></center></td>
                                            <td scope="col"><center><input type="checkbox" name="atividade9Junho" ${projeto.isJunho() eq true ? 'checked' : ''}></center></td>
                                            <td scope="col"><center><input type="checkbox" name="atividade9Julho" ${projeto.isJulho() eq true ? 'checked' : ''}></center></td>
                                        </tr>
                                    </core:if>
                                </core:forEach>
                                <core:forEach items="${requestScope.projeto.getAtividades()}" var="projeto" varStatus="status">        
                                    <core:if test="${projeto.getNome() eq 'ATIVIDADE 10'}">
                                        <tr>
                                            <td scope="col"><h5><b><center>At. 10</center></b></h5></td>
                                            <td scope="col"><center><input type="checkbox" name="atividade10Agosto" ${projeto.isAgosto() eq true ? 'checked' : ''}></center></td>
                                            <td scope="col"><center><input type="checkbox" name="atividade10Setembro" ${projeto.isSetembro() eq true ? 'checked' : ''}></center></td>
                                            <td scope="col"><center><input type="checkbox" name="atividade10Outubro" ${projeto.isOutubro() eq true ? 'checked' : ''}></center></td>
                                            <td scope="col"><center><input type="checkbox" name="atividade10Novembro" ${projeto.isNovembro() eq true ? 'checked' : ''}></center></td>
                                            <td scope="col"><center><input type="checkbox" name="atividade10Dezembro"${projeto.isDezembro() eq true ? 'checked' : ''}></center></td>
                                            <td scope="col"><center><input type="checkbox" name="atividade10Janeiro" ${projeto.isJaneiro() eq true ? 'checked' : ''}></center></td>
                                            <td scope="col"><center><input type="checkbox" name="atividade10Fevereiro" ${projeto.isFevereiro() eq true ? 'checked' : ''}></center></td>
                                            <td scope="col"><center><input type="checkbox" name="atividade10Marco" ${projeto.isMarco() eq true ? 'checked' : ''}></center></td>
                                            <td scope="col"><center><input type="checkbox" name="atividade10Abril" ${projeto.isAbril() eq true ? 'checked' : ''}></center></td>
                                            <td scope="col"><center><input type="checkbox" name="atividade10Maio" ${projeto.isMaio() eq true ? 'checked' : ''}></center></td>
                                            <td scope="col"><center><input type="checkbox" name="atividade10Junho" ${projeto.isJunho() eq true ? 'checked' : ''}></center></td>
                                            <td scope="col"><center><input type="checkbox" name="atividade10Julho" ${projeto.isJulho() eq true ? 'checked' : ''}></center></td>
                                        </tr>
                                    </core:if>
                                </core:forEach>
                            </core:when>
                            <core:otherwise>
                                <tr>
                                    <td scope="col"><h5><b><center>At. 1</center></b></h5></td>
                                    <td scope="col"><center><input type="checkbox" name="atividade1Agosto"></center></td>
                                    <td scope="col"><center><input type="checkbox" name="atividade1Setembro"></center></td>
                                    <td scope="col"><center><input type="checkbox" name="atividade1Outubro"></center></td>
                                    <td scope="col"><center><input type="checkbox" name="atividade1Novembro"></center></td>
                                    <td scope="col"><center><input type="checkbox" name="atividade1Dezembro"></center></td>
                                    <td scope="col"><center><input type="checkbox" name="atividade1Janeiro"></center></td>
                                    <td scope="col"><center><input type="checkbox" name="atividade1Fevereiro"></center></td>
                                    <td scope="col"><center><input type="checkbox" name="atividade1Marco"></center></td>
                                    <td scope="col"><center><input type="checkbox" name="atividade1Abril"></center></td>
                                    <td scope="col"><center><input type="checkbox" name="atividade1Maio"></center></td>
                                    <td scope="col"><center><input type="checkbox" name="atividade1Junho"></center></td>
                                    <td scope="col"><center><input type="checkbox" name="atividade1Julho"></center></td>
                                </tr>
                                <tr>
                                    <td scope="col"><center><h5><b><center>At. 2</center></b></h5></td>
                                    <td scope="col"><center><input type="checkbox" name="atividade2Agosto"></center></td>
                                    <td scope="col"><center><input type="checkbox" name="atividade2Setembro"></center></td>
                                    <td scope="col"><center><input type="checkbox" name="atividade2Outubro"></center></td>
                                    <td scope="col"><center><input type="checkbox" name="atividade2Novembro"></center></td>
                                    <td scope="col"><center><input type="checkbox" name="atividade2Dezembro"></center></td>
                                    <td scope="col"><center><input type="checkbox" name="atividade2Janeiro"></center></td>
                                    <td scope="col"><center><input type="checkbox" name="atividade2Fevereiro"></center></td>
                                    <td scope="col"><center><input type="checkbox" name="atividade2Marco"></center></td>
                                    <td scope="col"><center><input type="checkbox" name="atividade2Abril"></center></td>
                                    <td scope="col"><center><input type="checkbox" name="atividade2Maio"></center></td>
                                    <td scope="col"><center><input type="checkbox" name="atividade2Junho"></center></td>
                                    <td scope="col"><center><input type="checkbox" name="atividade2Julho"></center></td>
                                </tr>
                                <tr>
                                    <td scope="col"><center><h5><b><center>At. 3</center></b></h5></td>
                                    <td scope="col"><center><input type="checkbox" name="atividade3Agosto"></center></td>
                                    <td scope="col"><center><input type="checkbox" name="atividade3Setembro"></center></td>
                                    <td scope="col"><center><input type="checkbox" name="atividade3Outubro"></center></td>
                                    <td scope="col"><center><input type="checkbox" name="atividade3Novembro"></center></td>
                                    <td scope="col"><center><input type="checkbox" name="atividade3Dezembro"></center></td>
                                    <td scope="col"><center><input type="checkbox" name="atividade3Janeiro"></center></td>
                                    <td scope="col"><center><input type="checkbox" name="atividade3Fevereiro"></center></td>
                                    <td scope="col"><center><input type="checkbox" name="atividade3Marco"></center></td>
                                    <td scope="col"><center><input type="checkbox" name="atividade3Abril"></center></td>
                                    <td scope="col"><center><input type="checkbox" name="atividade3Maio"></center></td>
                                    <td scope="col"><center><input type="checkbox" name="atividade3Junho"></center></td>
                                    <td scope="col"><center><input type="checkbox" name="atividade3Julho"></center></td>
                                </tr>
                                <tr>
                                    <td scope="col"><h5><b><center>At. 4</center></b></h5></td>
                                    <td scope="col"><center><input type="checkbox" name="atividade4Agosto"></center></td>
                                    <td scope="col"><center><input type="checkbox" name="atividade4Setembro"></center></td>
                                    <td scope="col"><center><input type="checkbox" name="atividade4Outubro"></center></td>
                                    <td scope="col"><center><input type="checkbox" name="atividade4Novembro"></center></td>
                                    <td scope="col"><center><input type="checkbox" name="atividade4Dezembro"></center></td>
                                    <td scope="col"><center><input type="checkbox" name="atividade4Janeiro"></center></td>
                                    <td scope="col"><center><input type="checkbox" name="atividade4Fevereiro"></center></td>
                                    <td scope="col"><center><input type="checkbox" name="atividade4Marco"></center></td>
                                    <td scope="col"><center><input type="checkbox" name="atividade4Abril"></center></td>
                                    <td scope="col"><center><input type="checkbox" name="atividade4Maio"></center></td>
                                    <td scope="col"><center><input type="checkbox" name="atividade4Junho"></center></td>
                                    <td scope="col"><center><input type="checkbox" name="atividade4Julho"></center></td>
                                </tr>
                                <tr>
                                    <td scope="col"><h5><b><center>At. 5</center></b></h5></td>
                                    <td scope="col"><center><input type="checkbox" name="atividade5Agosto"></center></td>
                                    <td scope="col"><center><input type="checkbox" name="atividade5Setembro"></center></td>
                                    <td scope="col"><center><input type="checkbox" name="atividade5Outubro"></center></td>
                                    <td scope="col"><center><input type="checkbox" name="atividade5Novembro"></center></td>
                                    <td scope="col"><center><input type="checkbox" name="atividade5Dezembro"></center></td>
                                    <td scope="col"><center><input type="checkbox" name="atividade5Janeiro"></center></td>
                                    <td scope="col"><center><input type="checkbox" name="atividade5Fevereiro"></center></td>
                                    <td scope="col"><center><input type="checkbox" name="atividade5Marco"></center></td>
                                    <td scope="col"><center><input type="checkbox" name="atividade5Abril"></center></td>
                                    <td scope="col"><center><input type="checkbox" name="atividade5Maio"></center></td>
                                    <td scope="col"><center><input type="checkbox" name="atividade5Junho"></center></td>
                                    <td scope="col"><center><input type="checkbox" name="atividade5Julho"></center></td>
                                </tr>
                                <tr>
                                    <td scope="col"><h5><b><center>At. 6</center></b></h5></td>
                                    <td scope="col"><center><input type="checkbox" name="atividade6Agosto"></center></td>
                                    <td scope="col"><center><input type="checkbox" name="atividade6Setembro"></center></td>
                                    <td scope="col"><center><input type="checkbox" name="atividade6Outubro"></center></td>
                                    <td scope="col"><center><input type="checkbox" name="atividade6Novembro"></center></td>
                                    <td scope="col"><center><input type="checkbox" name="atividade6Dezembro"></center></td>
                                    <td scope="col"><center><input type="checkbox" name="atividade6Janeiro"></center></td>
                                    <td scope="col"><center><input type="checkbox" name="atividade6Fevereiro"></center></td>
                                    <td scope="col"><center><input type="checkbox" name="atividade6Marco"></center></td>
                                    <td scope="col"><center><input type="checkbox" name="atividade6Abril"></center></td>
                                    <td scope="col"><center><input type="checkbox" name="atividade6Maio"></center></td>
                                    <td scope="col"><center><input type="checkbox" name="atividade6Junho"></center></td>
                                    <td scope="col"><center><input type="checkbox" name="atividade6Julho"></center></td>
                                </tr>
                                <tr>
                                    <td scope="col"><h5><b><center>At. 7</center></b></h5></td>
                                    <td scope="col"><center><input type="checkbox" name="atividade7Agosto"></center></td>
                                    <td scope="col"><center><input type="checkbox" name="atividade7Setembro"></center></td>
                                    <td scope="col"><center><input type="checkbox" name="atividade7Outubro"></center></td>
                                    <td scope="col"><center><input type="checkbox" name="atividade7Novembro"></center></td>
                                    <td scope="col"><center><input type="checkbox" name="atividade7Dezembro"></center></td>
                                    <td scope="col"><center><input type="checkbox" name="atividade7Janeiro"></center></td>
                                    <td scope="col"><center><input type="checkbox" name="atividade7Fevereiro"></center></td>
                                    <td scope="col"><center><input type="checkbox" name="atividade7Marco"></center></td>
                                    <td scope="col"><center><input type="checkbox" name="atividade7Abril"></center></td>
                                    <td scope="col"><center><input type="checkbox" name="atividade7Maio"></center></td>
                                    <td scope="col"><center><input type="checkbox" name="atividade7Junho"></center></td>
                                    <td scope="col"><center><input type="checkbox" name="atividade7Julho"></center></td>
                                </tr>
                                <tr>
                                    <td scope="col"><h5><b><center>At. 8</center></b></h5></td>
                                    <td scope="col"><center><input type="checkbox" name="atividade8Agosto"></center></td>
                                    <td scope="col"><center><input type="checkbox" name="atividade8Setembro"></center></td>
                                    <td scope="col"><center><input type="checkbox" name="atividade8Outubro"></center></td>
                                    <td scope="col"><center><input type="checkbox" name="atividade8Novembro"></center></td>
                                    <td scope="col"><center><input type="checkbox" name="atividade8Dezembro"></center></td>
                                    <td scope="col"><center><input type="checkbox" name="atividade8Janeiro"></center></td>
                                    <td scope="col"><center><input type="checkbox" name="atividade8Fevereiro"></center></td>
                                    <td scope="col"><center><input type="checkbox" name="atividade8Marco"></center></td>
                                    <td scope="col"><center><input type="checkbox" name="atividade8Abril"></center></td>
                                    <td scope="col"><center><input type="checkbox" name="atividade8Maio"></center></td>
                                    <td scope="col"><center><input type="checkbox" name="atividade8Junho"></center></td>
                                    <td scope="col"><center><input type="checkbox" name="atividade8Julho"></center></td>
                                </tr>
                                <tr>
                                    <td scope="col"><h5><b><center>At. 9</center></b></h5></td>
                                    <td scope="col"><center><input type="checkbox" name="atividade9Agosto"></center></td>
                                    <td scope="col"><center><input type="checkbox" name="atividade9Setembro"></center></td>
                                    <td scope="col"><center><input type="checkbox" name="atividade9Outubro"></center></td>
                                    <td scope="col"><center><input type="checkbox" name="atividade9Novembro"></center></td>
                                    <td scope="col"><center><input type="checkbox" name="atividade9Dezembro"></center></td>
                                    <td scope="col"><center><input type="checkbox" name="atividade9Janeiro"></center></td>
                                    <td scope="col"><center><input type="checkbox" name="atividade9Fevereiro"></center></td>
                                    <td scope="col"><center><input type="checkbox" name="atividade9Marco"></center></td>
                                    <td scope="col"><center><input type="checkbox" name="atividade9Abril"></center></td>
                                    <td scope="col"><center><input type="checkbox" name="atividade9Maio"></center></td>
                                    <td scope="col"><center><input type="checkbox" name="atividade9Junho"></center></td>
                                    <td scope="col"><center><input type="checkbox" name="atividade9Julho"></center></td>
                                </tr>
                                <tr>
                                    <td scope="col"><h5><b><center>At. 10</center></b></h5></td>
                                    <td scope="col"><center><input type="checkbox" name="atividade10Agosto"></center></td>
                                    <td scope="col"><center><input type="checkbox" name="atividade10Setembro"></center></td>
                                    <td scope="col"><center><input type="checkbox" name="atividade10Outubro"></center></td>
                                    <td scope="col"><center><input type="checkbox" name="atividade10Novembro"></center></td>
                                    <td scope="col"><center><input type="checkbox" name="atividade10Dezembro"></center></td>
                                    <td scope="col"><center><input type="checkbox" name="atividade10Janeiro"></center></td>
                                    <td scope="col"><center><input type="checkbox" name="atividade10Fevereiro"></center></td>
                                    <td scope="col"><center><input type="checkbox" name="atividade10Marco"></center></td>
                                    <td scope="col"><center><input type="checkbox" name="atividade10Abril"></center></td>
                                    <td scope="col"><center><input type="checkbox" name="atividade10Maio"></center></td>
                                    <td scope="col"><center><input type="checkbox" name="atividade10Junho"></center></td>
                                    <td scope="col"><center><input type="checkbox" name="atividade10Julho"></center></td>
                                </tr>
                            </core:otherwise>
                        </core:choose>
                        
                </table>
                <h6 class="text-danger">${requestScope.graficoGanttMsgErro}</h6>
                
                <font color="red"><i>Obs.: Todos os campos deste formulário são obrigatórios</i></font>
                
                
                
                <br>
                <br>
                <br>
                <br>
                
                <!-- Sign in button -->
                <button class="btn btn-indigo btn-block" type="submit">ENVIAR</button>
            
            </form>
            <!-- Form -->
        </div>
        
        
        <br>
        <br>
        <br>
        <br>
        <br>
        <br>
        <br>
        <br>
        <%@include file="footer.jspf"%>
        <%@include file="finalBody.jspf"%>
        <%@include file="scripts.jspf"%>
    </body>
</html>

<script type="text/javascript"> 
    function verificaMultidisciplinar () { 
        if( $("#multidisciplinar").is(":checked") === true ) {
            $("#inputAreaMultidisciplinar").attr("disabled", false);
        }else {
            $("#inputAreaMultidisciplinar").attr("disabled", true);
            $("#inputAreaMultidisciplinar").val("");
        }    
    }
    function verificaContinuacao () { 
        if( $("#tipoContinuacao").is(":checked") === true ) {
            $("#descricaoContinuacao").attr("disabled", false);
        }else {
            $("#descricaoContinuacao").attr("disabled", true);
            $("#descricaoContinuacao").val("");
        }    
    }
</script>
