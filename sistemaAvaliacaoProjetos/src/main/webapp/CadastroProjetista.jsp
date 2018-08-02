<%-- 
    Document   : Cadastro
    Created on : 25/07/2018, 00:20:43
    Author     : pallo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file="head.jspf"%> 
        <title>Cadastro Projetista</title>
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
                <form class="text-center" style="color: #757575;" action="CadastroProjetistaServlet" method="POST">
                    <br>
                    <div class="form-row indigo-text">
                        <font size="5" face="Calibri">
                            <strong>PROJETISTA</strong>
                        </font>
                    </div>

                    <!-- Nome do projetista -->
                    <div class="md-form">
                        <input type="text" id="nomeProjetista" class="form-control">
                        <label for="nomeProjetista">Nome</label>
                        <small id="materialRegisterFormPhoneHelpBlock" class="form-text text-muted mb-4">
                            Digite algo entre 2 e 50 caracateres
                        </small>
                    </div>
                    
                    <div class="form-row">
                        <div class="col">
                            <!-- E-mail do Projetista -->
                            <div class="md-form">
                                <input type="text" id="emailProjetista" class="form-control">
                                <label for="emailProjetista">E-mail</label>
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
                            <strong>PROJETO</strong>
                        </font>
                    </div>
                    <br>
                    <!-- Nome do Projeto -->
                    <div class="md-form mt-0">
                        <input type="text" id="nomeProjetos" class="form-control">
                        <label for="nomeProjetos">Nome do Projeto</label>
                        <small id="materialRegisterFormPhoneHelpBlock" class="form-text text-muted mb-4">
                            Digite algo entre 2 e 50 caracateres
                        </small>
                    </div>
                    
                    <!-- Descrição do Projeto -->
                    <div class="form-row">
                        <p>Descrição</p>
                        <textarea class="form-control rounded-0" id="descricao" rows="10"></textarea>
                        <small id="materialRegisterFormPhoneHelpBlock" class="form-text text-muted mb-4">
                            Digite algo entre 500 e 1000 caracateres
                        </small>
                    </div>
                    
                    <!-- Duração do Projeto -->
                    <div class="md-form mt-0">
                        <input type="text" id="duracao" class="form-control">
                        <label for="duracao">Duração</label>     
                    </div>
                    
                    <br>
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
        
        <%@include file="footer.jspf"%>
        <%@include file="finalBody.jspf"%>
    </body>
</html>
