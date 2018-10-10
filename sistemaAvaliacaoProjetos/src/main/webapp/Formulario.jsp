<%@page import="br.com.uff.sistemaAvaliacaoProjetos.model.entity.Projeto"%>
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
            <form style="color: #757575;">
                <h2><b>Dados do Orientador:</b></h2>
                <br>
                <!-- Default input -->
                <div class="form-group">
                    <label for="inputNomeCompleto">Nome Completo</label>
                    <input type="text" class="form-control" id="inputNomeCompleto" name="nome" value="${ not empty requestScope.orientador ? requestScope.orientador.getNome() : param.nome}" placeholder="Nome Completo" ${ not empty requestScope.orientador ? 'disabled': ''}>
                </div>
                
                <!-- Default input -->
                <div class="form-group">
                    <label for="inputAddress">Email</label>
                    <input type="email" class="form-control" id="inputEmail4" name="email" value="${ not empty requestScope.orientador ? requestScope.orientador.getEmail() : param.email}" placeholder="Email" ${ not empty requestScope.orientador ? 'disabled': ''}>
                </div>
                
                <!-- Grid row -->
                <div class="form-row">
                    <!-- Default input -->
                    <div class="form-group col-md-6">
                        <label for="inputMatrículaSIAPE">Matrícula SIAPE</label>
                        <input type="text" class="form-control" id="inputMatrículaSIAPE" name="matricula" value="${ not empty requestScope.orientador ? requestScope.orientador.getMatricula() : param.matricula}" placeholder="Matrícula SIAPE" ${ not empty requestScope.orientador ? 'disabled': ''}>
                    </div>
                    <!-- Default input -->
                    <div class="form-group col-md-6">
                        <label for="inputCPF">CPF</label>
                        <input type="text" class="form-control" id="inputCPF" name="cpf" value="${ not empty requestScope.orientador ? requestScope.orientador.getCpf() : param.cpf}" placeholder="CPF" ${ not empty requestScope.orientador ? 'disabled': ''}>
                    </div>
                </div>
                <!-- Grid row -->
                
                <!-- Grid row -->
                <div class="form-row">
                    <!-- Default input -->
                    <div class="form-group col-md-6">
                        <label for="inputIdentidade">Identidade</label>
                        <input type="text" class="form-control" id="inputIdentidade" name="identidade" value="${ not empty requestScope.orientador ? requestScope.orientador.getIdentidade() : param.identidade}" placeholder="Identidade" ${ not empty requestScope.orientador ? 'disabled': ''}>
                    </div>
                    <!-- Default input -->
                    <div class="form-group col-md-6">
                        <label for="inputTelefone">Telefone</label>
                        <input type="text" class="form-control" id="inputTelefone" name="telefone" value="${ not empty requestScope.orientador ? requestScope.orientador.getTelefone() : param.telefone}" placeholder="Telefone" ${ not empty requestScope.orientador ? 'disabled': ''}>
                    </div>
                </div>
                <!-- Grid row -->
                
                <!-- Default input -->
                <div class="form-group">
                    <label for="inputLinkLattes">Link do Currículo Lattes</label>
                    <input type="text" class="form-control" id="inputLinkLattes" name="urlCurriculoLattes" value="${ not empty requestScope.orientador ? requestScope.orientador.getUrlCurriculoLattes() : param.urlCurriculoLattes}" placeholder="Link do Currículo Lattes" ${ not empty requestScope.orientador ? 'disabled': ''}>
                </div>
                
                <!-- Default input -->
                <div class="form-group">
                    <label for="inputDepartamento">Departamento</label>
                    <input type="text" class="form-control" id="inputDepartamento" name="departamento" value="${ not empty requestScope.orientador ? requestScope.orientador.getDepartamento() : param.departamento}" placeholder="Departamento" ${ not empty requestScope.orientador ? 'disabled': ''}>
                </div>
                
                <br>
                <br>
                <br>
                
                <h2><b>Dados do Projeto:</b></h2>
                <br>
                
                <!-- Default input -->
                <div class="form-group">
                    <label for="inputNomeProjeto">Nome Projeto</label>
                    <input type="text" class="form-control" id="inputNomeProjeto" name="nomeProjeto" value="${ not empty requestScope.projeto ? requestScope.projeto.getNome() : param.nomeProjeto}" placeholder="Nome Projeto">
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
                                    <input type="text" class="form-control" id="inputAreaMultidisciplinar" name="descricaoMultidisciplinar" value="${not empty requestScope.projeto.getDescricaoMultidisciplinar() ? requestScope.projeto.getDescricaoMultidisciplinar() : param.descricaoMultidisciplinar}" placeholder="" ${requestScope.projeto.getAreaOrigemProjeto() eq "MULTIDISCIPLINAR" ? '' : 'disabled'}>
                                </span>
                            </label>
                        </div>
                    </div>
                    <br>
                </div>
                                
                <br>
                
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
                                    <input type="radio" name="tipo" value="NOVO" ${not empty requestScope.projeto ? requestScope.projeto.getTipoProjeto() eq "NOVO" ? 'checked' : '' : 'checked'}>
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
                                    <input type="radio" name="tipo" value="CONTINUAÇÃO" ${requestScope.projeto.getTipoProjeto() eq "CONTINUAÇÃO" ? 'checked' : ''}>
                                    <span class="lever"></span>
                                    Continuação
                                </span>
                            </label>
                        </div>
                    </div>
                    <br>
                </div>
                
                
                <div class="form-row">
                    <p>Caso seja uma continuação do projeto, apresente aqui os resultados alcançados até o momento (máximo de 2.000 caracteres)</p>
                    <textarea class="form-control"  id="descricaoContinuacao" rows="10" name="resultadosContinuacao">${not empty requestScope.projeto.getResultadosContinuacaoProjeto() ? requestScope.projeto.getResultadosContinuacaoProjeto() : param.resultadosContinuacao}</textarea>
                    <small id="materialRegisterFormPhoneHelpBlock" class="form-text text-muted mb-4">
                        Digite algo com máximo de 2.000 caracteres
                    </small>
                </div>
                
                <br>
                
                <div class="form-row">
                    <p>2) Qual é o problema de mercado ou da sociedade que o seu projeto pretende resolver? (máximo de 2.000 caracteres)</p>
                    <textarea class="form-control" id="descricaoProblema" rows="10" name="problema">${not empty requestScope.projeto.getProblemaProjeto() ? requestScope.projeto.getProblemaProjeto() : param.problema}</textarea>
                    <small id="materialRegisterFormPhoneHelpBlock" class="form-text text-muted mb-4">
                        Digite algo com máximo de 2.000 caracteres
                    </small>
                </div>
                
                <br>
                
                <div class="form-row">
                    <p>3) Como você pretende desenvolver a solução para o problema identificado? (máximo de 2.000 caracteres)</p>
                    <textarea class="form-control" id="descricaoSolucao" rows="10" name="solucao">${not empty requestScope.projeto.getSolucaoProjeto() ? requestScope.projeto.getSolucaoProjeto() : param.solucao}</textarea>
                    <small id="materialRegisterFormPhoneHelpBlock" class="form-text text-muted mb-4">
                        Digite algo com máximo de 2.000 caracteres
                    </small>
                </div>
                
                <br>
                
                <div class="form-row">
                    <p>4) Resumo do currículo do professor orientador com foco na inovação proposta (máximo de 2.000 caracteres)</p>
                    <textarea class="form-control" id="descricaoCurriculo" rows="10" name="resumoCurriculoOrientador">${not empty requestScope.projeto.getResumoCurriculoOrientador() ? requestScope.projeto.getResumoCurriculoOrientador() : param.resumoCurriculoOrientador}</textarea>
                    <small id="materialRegisterFormPhoneHelpBlock" class="form-text text-muted mb-4">
                        Digite algo com máximo de 2.000 caracteres
                    </small>
                </div>
                
                <br>
                
                <div class="form-row">
                    <p>5) Apresente de forma resumida o potencial de transferência das tecnologias/conhecimentos para o mercado/sociedade a partir do projeto desenvolvido (máximo de 2.000 caracteres)</p>
                    <textarea class="form-control" id="descricaoPotencial" rows="10" name="potencial">${not empty requestScope.projeto.getPotencialProjeto() ? requestScope.projeto.getPotencialProjeto() : param.potencial}</textarea>
                    <small id="materialRegisterFormPhoneHelpBlock" class="form-text text-muted mb-4">
                        Digite algo com máximo de 2.000 caracteres
                    </small>
                </div>
                
                <br>
                
                <div class="form-row">
                    <p>6) Plano de trabalho do bolsista: Descrever as atividades que serão desenvolvidas pelo bolsista (até dez atividades) e os respectivos produtos associados a cada etapa. Apresentar gráfico de Gantt das atividades propostas distribuídas nos 12 meses do projeto. (máximo de 2.000 caracteres) </p>
                    <textarea class="form-control" id="descricaoPlanoAtividades" rows="10" name="planoTrabalhoBolsista">${not empty requestScope.projeto.getPlanoTrabalhoBolsista() ? requestScope.projeto.getPlanoTrabalhoBolsista() : param.planoTrabalhoBolsista}</textarea>
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
                        <tr>
                            <td scope="col"><h5><b><center>At. 1</center></b></h5></td>
                            <td scope="col"><center><input type="checkbox"></center></td>
                            <td scope="col"><center><input type="checkbox"></center></td>
                            <td scope="col"><center><input type="checkbox"></center></td>
                            <td scope="col"><center><input type="checkbox"></center></td>
                            <td scope="col"><center><input type="checkbox"></center></td>
                            <td scope="col"><center><input type="checkbox"></center></td>
                            <td scope="col"><center><input type="checkbox"></center></td>
                            <td scope="col"><center><input type="checkbox"></center></td>
                            <td scope="col"><center><input type="checkbox"></center></td>
                            <td scope="col"><center><input type="checkbox"></center></td>
                            <td scope="col"><center><input type="checkbox"></center></td>
                            <td scope="col"><center><input type="checkbox"></center></td>
                        </tr>
                        <tr>
                            <td scope="col"><center><h5><b><center>At. 2</center></b></h5></td>
                            <td scope="col"><center><input type="checkbox"></center></td>
                            <td scope="col"><center><input type="checkbox"></center></td>
                            <td scope="col"><center><input type="checkbox"></center></td>
                            <td scope="col"><center><input type="checkbox"></center></td>
                            <td scope="col"><center><input type="checkbox"></center></td>
                            <td scope="col"><center><input type="checkbox"></center></td>
                            <td scope="col"><center><input type="checkbox"></center></td>
                            <td scope="col"><center><input type="checkbox"></center></td>
                            <td scope="col"><center><input type="checkbox"></center></td>
                            <td scope="col"><center><input type="checkbox"></center></td>
                            <td scope="col"><center><input type="checkbox"></center></td>
                            <td scope="col"><center><input type="checkbox"></center></td>
                        </tr>
                        <tr>
                            <td scope="col"><center><h5><b><center>At. 3</center></b></h5></td>
                            <td scope="col"><center><input type="checkbox"></center></td>
                            <td scope="col"><center><input type="checkbox"></center></td>
                            <td scope="col"><center><input type="checkbox"></center></td>
                            <td scope="col"><center><input type="checkbox"></center></td>
                            <td scope="col"><center><input type="checkbox"></center></td>
                            <td scope="col"><center><input type="checkbox"></center></td>
                            <td scope="col"><center><input type="checkbox"></center></td>
                            <td scope="col"><center><input type="checkbox"></center></td>
                            <td scope="col"><center><input type="checkbox"></center></td>
                            <td scope="col"><center><input type="checkbox"></center></td>
                            <td scope="col"><center><input type="checkbox"></center></td>
                            <td scope="col"><center><input type="checkbox"></center></td>
                        </tr>
                        <tr>
                            <td scope="col"><h5><b><center>At. 4</center></b></h5></td>
                            <td scope="col"><center><input type="checkbox"></center></td>
                            <td scope="col"><center><input type="checkbox"></center></td>
                            <td scope="col"><center><input type="checkbox"></center></td>
                            <td scope="col"><center><input type="checkbox"></center></td>
                            <td scope="col"><center><input type="checkbox"></center></td>
                            <td scope="col"><center><input type="checkbox"></center></td>
                            <td scope="col"><center><input type="checkbox"></center></td>
                            <td scope="col"><center><input type="checkbox"></center></td>
                            <td scope="col"><center><input type="checkbox"></center></td>
                            <td scope="col"><center><input type="checkbox"></center></td>
                            <td scope="col"><center><input type="checkbox"></center></td>
                            <td scope="col"><center><input type="checkbox"></center></td>
                        </tr>
                        <tr>
                            <td scope="col"><h5><b><center>At. 5</center></b></h5></td>
                            <td scope="col"><center><input type="checkbox"></center></td>
                            <td scope="col"><center><input type="checkbox"></center></td>
                            <td scope="col"><center><input type="checkbox"></center></td>
                            <td scope="col"><center><input type="checkbox"></center></td>
                            <td scope="col"><center><input type="checkbox"></center></td>
                            <td scope="col"><center><input type="checkbox"></center></td>
                            <td scope="col"><center><input type="checkbox"></center></td>
                            <td scope="col"><center><input type="checkbox"></center></td>
                            <td scope="col"><center><input type="checkbox"></center></td>
                            <td scope="col"><center><input type="checkbox"></center></td>
                            <td scope="col"><center><input type="checkbox"></center></td>
                            <td scope="col"><center><input type="checkbox"></center></td>
                        </tr>
                        <tr>
                            <td scope="col"><h5><b><center>At. 6</center></b></h5></td>
                            <td scope="col"><center><input type="checkbox"></center></td>
                            <td scope="col"><center><input type="checkbox"></center></td>
                            <td scope="col"><center><input type="checkbox"></center></td>
                            <td scope="col"><center><input type="checkbox"></center></td>
                            <td scope="col"><center><input type="checkbox"></center></td>
                            <td scope="col"><center><input type="checkbox"></center></td>
                            <td scope="col"><center><input type="checkbox"></center></td>
                            <td scope="col"><center><input type="checkbox"></center></td>
                            <td scope="col"><center><input type="checkbox"></center></td>
                            <td scope="col"><center><input type="checkbox"></center></td>
                            <td scope="col"><center><input type="checkbox"></center></td>
                            <td scope="col"><center><input type="checkbox"></center></td>
                        </tr>
                        <tr>
                            <td scope="col"><h5><b><center>At. 7</center></b></h5></td>
                            <td scope="col"><center><input type="checkbox"></center></td>
                            <td scope="col"><center><input type="checkbox"></center></td>
                            <td scope="col"><center><input type="checkbox"></center></td>
                            <td scope="col"><center><input type="checkbox"></center></td>
                            <td scope="col"><center><input type="checkbox"></center></td>
                            <td scope="col"><center><input type="checkbox"></center></td>
                            <td scope="col"><center><input type="checkbox"></center></td>
                            <td scope="col"><center><input type="checkbox"></center></td>
                            <td scope="col"><center><input type="checkbox"></center></td>
                            <td scope="col"><center><input type="checkbox"></center></td>
                            <td scope="col"><center><input type="checkbox"></center></td>
                            <td scope="col"><center><input type="checkbox"></center></td>
                        </tr>
                        <tr>
                            <td scope="col"><h5><b><center>At. 8</center></b></h5></td>
                            <td scope="col"><center><input type="checkbox"></center></td>
                            <td scope="col"><center><input type="checkbox"></center></td>
                            <td scope="col"><center><input type="checkbox"></center></td>
                            <td scope="col"><center><input type="checkbox"></center></td>
                            <td scope="col"><center><input type="checkbox"></center></td>
                            <td scope="col"><center><input type="checkbox"></center></td>
                            <td scope="col"><center><input type="checkbox"></center></td>
                            <td scope="col"><center><input type="checkbox"></center></td>
                            <td scope="col"><center><input type="checkbox"></center></td>
                            <td scope="col"><center><input type="checkbox"></center></td>
                            <td scope="col"><center><input type="checkbox"></center></td>
                            <td scope="col"><center><input type="checkbox"></center></td>
                        </tr>
                        <tr>
                            <td scope="col"><h5><b><center>At. 9</center></b></h5></td>
                            <td scope="col"><center><input type="checkbox"></center></td>
                            <td scope="col"><center><input type="checkbox"></center></td>
                            <td scope="col"><center><input type="checkbox"></center></td>
                            <td scope="col"><center><input type="checkbox"></center></td>
                            <td scope="col"><center><input type="checkbox"></center></td>
                            <td scope="col"><center><input type="checkbox"></center></td>
                            <td scope="col"><center><input type="checkbox"></center></td>
                            <td scope="col"><center><input type="checkbox"></center></td>
                            <td scope="col"><center><input type="checkbox"></center></td>
                            <td scope="col"><center><input type="checkbox"></center></td>
                            <td scope="col"><center><input type="checkbox"></center></td>
                            <td scope="col"><center><input type="checkbox"></center></td>
                        </tr>
                        <tr>
                            <td scope="col"><h5><b><center>At. 10</center></b></h5></td>
                            <td scope="col"><center><input type="checkbox"></center></td>
                            <td scope="col"><center><input type="checkbox"></center></td>
                            <td scope="col"><center><input type="checkbox"></center></td>
                            <td scope="col"><center><input type="checkbox"></center></td>
                            <td scope="col"><center><input type="checkbox"></center></td>
                            <td scope="col"><center><input type="checkbox"></center></td>
                            <td scope="col"><center><input type="checkbox"></center></td>
                            <td scope="col"><center><input type="checkbox"></center></td>
                            <td scope="col"><center><input type="checkbox"></center></td>
                            <td scope="col"><center><input type="checkbox"></center></td>
                            <td scope="col"><center><input type="checkbox"></center></td>
                            <td scope="col"><center><input type="checkbox"></center></td>
                        </tr>
                </table>
                
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
</script>
