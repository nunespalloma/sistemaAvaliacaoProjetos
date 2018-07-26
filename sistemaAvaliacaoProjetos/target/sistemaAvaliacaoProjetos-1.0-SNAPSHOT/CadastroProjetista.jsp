<%-- 
    Document   : Cadastro
    Created on : 25/07/2018, 00:20:43
    Author     : pallo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!-- Bootstrap Code -->
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <!-- Bootstrap Code -->
        <meta http-equiv="x-ua-compatible" content="ie=edge">
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core" %> 
        <title>Cadastro Projetista</title>
        
        <!-- Bootstrap Code -->
        <link rel="stylesheet" href="bootstrap/css/font-awesome.min.css">
        <!-- Bootstrap core CSS -->
        <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">
        <link rel="stylesheet" href="bootstrap/css/bootstrap-datepicker.min.css" >
        <!-- Material Design Bootstrap -->
        <link href="bootstrap/css/mdb.min.css" rel="stylesheet">
        <!-- Your custom styles (optional) -->
        <link href="bootstrap/css/style.css" rel="stylesheet">
    </head>
    <body>
                <!-- Material form register -->
        <div class="card">

            <h5 class="card-header indigo white-text text-center py-4">
                <font size="8" face="Arial">
                    <strong>Cadastro</strong>
                </font>
            </h5>

            <!--Card content-->
            <div class="card-body px-lg-5 pt-0">

                <!-- Form -->
                <form class="text-center" style="color: #757575;">
                    <br>
                    <div class="form-row">
                        <font size="5" face="Arial">
                            <strong>PROJETISTA</strong>
                        </font> 
                    </div>

                    <!-- Nome do projetista -->
                    <div class="md-form">
                        <input type="text" id="nomeProjetista" class="form-control">
                        <label for="nomeAdministradorSistema">Nome</label>
                        <small id="materialRegisterFormPhoneHelpBlock" class="form-text text-muted mb-4">
                            Digite algo entre 2 e 50 caracateres
                        </small>
                    </div>
                    
                    <div class="form-row">
                        <div class="col">
                            <!-- E-mail do responsavel pelo sistema -->
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
                    <div class="form-row">
                        <font size="5" face="Arial">
                            <strong>PROJETO</strong>
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
                                <input type="checkbox" checked="checked">
                                <span class="lever"></span>
                                Relatórios  Parciais
                            </label>
                        </div>
                    </div>
                    <div  class="form-row">
                        <!-- Switch -->
                        <div class="switch mdb-color-switch">
                            <label>
                                <input type="checkbox" checked="checked">
                                <span class="lever"></span>
                                Tarefas de desenvolvimento
                            </label>
                        </div>
                    </div>
                    <div  class="form-row">
                        <!-- Switch -->
                        <div class="switch mdb-color-switch">
                            <label>
                                <input type="checkbox" checked="checked">
                                <span class="lever"></span>
                                Apresentação de resultados
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
        
        <!-- BOOTSTRAP SCRIPTS -->
        <!-- JQuery -->
        <script type="text/javascript" src="bootstrap/js/jquery-3.3.1.min.js"></script>
        <!-- Bootstrap tooltips -->
        <script type="text/javascript" src="bootstrap/js/popper.min.js"></script>
        <!-- Bootstrap core JavaScript -->
        <script type="text/javascript" src="bootstrap/js/bootstrap.min.js"></script>
        <!-- MDB core JavaScript -->
        <script type="text/javascript" src="bootstrap/js/mdb.min.js"></script>
    </body>
</html>
