<%-- 
    Document   : CadastroSistemaAdministrador
    Created on : 25/07/2018, 22:09:47
    Author     : palloma
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file="head.jspf"%> 
        <title>Cadastro Sistema e Administrador</title>
    </head>
    <body>
        <%@include file="navbar.jspf"%>
                <!-- Material form register -->
        <div class="card">

            <h1 class="text-center indigo-text py-4">
                <font size="10" face="Calibri">
                    <strong>CADASTRO</strong>
                </font>
            </h1>

            <!--Card content-->
            <div class="card-body px-lg-5 pt-0">

                <!-- Form -->
                <form class="text-center" style="color: #757575;" action="CadastroSistemaAdministradorServlet" method="POST">
                    <br>
                    <div class="form-row indigo-text">
                        <font size="5" face="Calibri">
                            <strong>ADMINISTRADOR</strong>
                        </font>
                    </div>

                    <!-- Nome do administrador do sistema -->
                    <div class="md-form">
                        <input type="text" id="nomeAdministradorSistema" class="form-control">
                        <label for="nomeAdministradorSistema">Nome</label>
                        <small id="materialRegisterFormPhoneHelpBlock" class="form-text text-muted mb-4">
                            Digite algo entre 2 e 50 caracateres
                        </small>
                    </div>
                    
                    <div class="form-row">
                        <div class="col">
                            <!-- E-mail do administrador do sistema -->
                            <div class="md-form">
                                <input type="text" id="emailAdministradorSistema" class="form-control">
                                <label for="emailAdministradorSistema">E-mail</label>
                                <small id="materialRegisterFormPhoneHelpBlock" class="form-text text-muted mb-4">
                                    Digite algo entre 2 e 50 caracateres
                                </small>
                            </div>
                        </div>
                        <div class="col">
                            <!-- Password -->
                            <div class="md-form">
                                <input type="password" id="materialRegisterFormPassword" class="form-control" aria-describedby="materialRegisterFormPasswordHelpBlock">
                                <label for="materialRegisterFormPassword">Password</label>
                                <small id="materialRegisterFormPasswordHelpBlock" class="form-text text-muted mb-4">
                                    Digite pelo menos 8 caracteres e 1 digito
                                </small>
                            </div>
                        </div>
                    </div>
                    <br>
                    <br>
                    <br>
                    <br>
                    <br>
                    <br>
                    <div class="form-row indigo-text">
                        <font size="5" face="Calibri">
                            <strong>SISTEMA DE PROJETOS</strong>
                        </font>
                    </div>
                    <br>
                    <!-- Nome do Sistema de Projetos -->
                    <div class="md-form mt-0">
                        <input type="text" id="nomeSistemaProjetos" class="form-control">
                        <label for="nomeSistemaProjetos">Nome do Sistema de Projetos</label>
                        <small id="materialRegisterFormPhoneHelpBlock" class="form-text text-muted mb-4">
                            Digite algo entre 2 e 50 caracateres
                        </small>
                    </div>
                    
                    <!-- Area de atuação do Sistema de Projetos -->
                    <div class="md-form mt-0">
                        <input type="text" id="areaAtuacaoSistemaProjetos" class="form-control">
                        <label for="areaAtuacaoSistemaProjetos">Área Atuação do Sistema de Projetos</label>
                        <small id="materialRegisterFormPhoneHelpBlock" class="form-text text-muted mb-4">
                            Digite algo entre 2 e 50 caracateres
                        </small>
                    </div>
                    
                    <div class="form-row">
                        <strong>Requisitos para os alunos:</strong>
                    </div>
                    <br>
                    <div class="form-row">
                        <!-- Switch -->
                        <div class="switch mdb-color-switch">
                            <label>
                                <input type="checkbox" id="relatorioParcial" valor="sim">
                                Tarefas de desenvolvimento
                            </label>
                        </div>
                    </div>
                    <div  class="form-row">
                        <!-- Switch -->
                        <div class="switch mdb-color-switch">
                            <label>
                                <input type="checkbox" name="" value="">
                                Relatórios parciais
                            </label>
                        </div>
                    </div>
                    <div  class="form-row">
                        <!-- Switch -->
                        <div class="switch mdb-color-switch">
                            <label>
                                <input type="checkbox" name="" value="">
                                XXXX
                            </label>
                        </div>
                    </div>
                    <div  class="form-row">
                        <!-- Switch -->
                        <div class="switch mdb-color-switch">
                            <label>
                                <input type="checkbox">
                                XXXX
                            </label>
                        </div>
                    </div>

                    <!-- Sign up button -->
                    <button class="btn btn-indigo my-4 btn-block" type="submit">Sign in</button>

                    <hr>

                </form>
                <!-- Form -->

            </div>

        </div>
        <!-- Material form register -->
        
        <%@include file="footer.jspf"%>
        <%@include file="finalBody.jspf"%>
    </body>
</html>
