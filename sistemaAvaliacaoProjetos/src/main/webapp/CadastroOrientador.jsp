<%-- 
    Document   : CadastroOrientador
    Created on : 23/09/2018, 19:01:48
    Author     : pallo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file="head.jspf"%> 
        <title>Cadastro Orientador</title>
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
                <form class="text-center" style="color: #757575;" action="CadastroOrientadorServlet" method="POST">
                    <br>
                    <div class="form-row indigo-text">
                        <font size="5" face="Calibri">
                            <strong>ORIENTADOR</strong>
                        </font>
                    </div>

                    <!-- Nome do orientador -->
                    <div class="md-form">
                        <input type="text" name="nomeOrientador" id="nomeOrientador" class="form-control ${requestScope.nomeOrientadorStatus}" value="${param.nomeOrientador}" maxlength="50">
                        <div class="invalid-feedback">
                            ${requestScope.nomeOrientadorMsgErro}
                        </div>
                        <label for="nomeOrientador">Nome</label>
                        <small id="materialRegisterFormPhoneHelpBlock" class="form-text text-muted mb-4">
                            Digite algo entre 2 e 50 caracateres
                        </small>
                    </div>
                    
                    <div class="form-row">
                        <div class="col">
                            <!-- Matricula do Orientador -->
                            <div class="md-form">
                                <input type="text" name="matriculaOrientador" id="matriculaOrientador" class="form-control ${requestScope.matriculaOrientadorStatus}" value="${param.matriculaOrientador}" maxlength="7">
                                <div class="invalid-feedback">
                                    ${requestScope.matriculaOrientadorMsgErro}
                                </div>
                                <label for="matriculaOrientador">Matrícula SIAPE</label>
                                <small id="materialRegisterFormPhoneHelpBlock" class="form-text text-muted mb-4">
                                    Digite 7 caracateres
                                </small>
                            </div>
                        </div>
                        <div class="col">
                            <!-- CPF do Orientador -->
                            <div class="md-form">
                                <input type="text" name="cpfOrientador" id="cpfOrientador" class="form-control ${requestScope.cpfOrientadorStatus}" value="${param.cpfOrientador}" maxlength="14">
                                <div class="invalid-feedback">
                                    ${requestScope.cpfOrientadorMsgErro}
                                </div>
                                <label for="cpfOrientador">CPF</label>
                                <small id="materialRegisterFormPasswordHelpBlock" class="form-text text-muted mb-4">
                                    Digite pelo menos 11 caracteres
                                </small>
                            </div>
                        </div>
                    </div>    
                    
                    <div class="form-row">
                        <div class="col">
                            <!-- Identidade do Orientador -->
                            <div class="md-form">
                                <input type="text" name="identidadeOrientador" id="identidadeOrientador" class="form-control ${requestScope.identidadeOrientadorStatus}" value="${param.identidadeOrientador}" maxlength="13">
                                <div class="invalid-feedback">
                                    ${requestScope.identidadeOrientadorMsgErro}
                                </div>
                                <label for="identidadeOrientador">Identidade</label>
                                <small id="materialRegisterFormPhoneHelpBlock" class="form-text text-muted mb-4">
                                    Digite pelo menos 10 caracateres
                                </small>
                            </div>
                        </div>
                        <div class="col">
                            <!-- Telefone do Orientador -->
                            <div class="md-form">
                                <input type="text" name="telefoneOrientador" id="telefoneOrientador" class="form-control ${requestScope.telefoneOrientadorStatus}" value="${param.telefoneOrientador}" maxlength="14">
                                <div class="invalid-feedback">
                                    ${requestScope.telefoneOrientadorMsgErro}
                                </div>
                                <label for="telefoneOrientador">Telefone</label>
                                <small id="materialRegisterFormPasswordHelpBlock" class="form-text text-muted mb-4">
                                    Digite 10 ou 11 caracteres
                                </small>
                            </div>
                        </div>
                    </div>            
                    
                    <!-- Link do Curriculo Lattes do Orientador -->
                    <div class="md-form">
                        <input type="text" name="urlCurriculoLattesOrientador" id="urlCurriculoLattesOrientador" class="form-control ${requestScope.urlCurriculoLattesOrientadorStatus}" value="${param.urlCurriculoLattesOrientador}">
                        <div class="invalid-feedback">
                            ${requestScope.urlCurriculoLattesOrientadorMsgErro}
                        </div>
                        <label for="urlCurriculoLattesOrientador">Link do Curriculo Lattes</label>
                        <small id="materialRegisterFormPhoneHelpBlock" class="form-text text-muted mb-4">
                            Digite a url do curriculo Lattes caracateres
                        </small>
                    </div>
                    
                    <!-- Departamento do Orientador -->
                    <div class="md-form">
                        <input type="text" name="departamentoOrientador" id="departamentoOrientador" class="form-control ${requestScope.departamentoOrientadorStatus}" value="${param.departamentoOrientador}" maxlength="50">
                        <div class="invalid-feedback">
                            ${requestScope.departamentoOrientadorMsgErro}
                        </div>
                        <label for="departamentoOrientador">Departamento</label>
                        <small id="materialRegisterFormPhoneHelpBlock" class="form-text text-muted mb-4">
                            Digite algo entre 2 e 50 caracateres
                        </small>
                    </div>    
                                
                    <div class="form-row">
                        <div class="col">
                            <!-- E-mail do Orientador -->
                            <div class="md-form">
                                <input type="text" name="emailOrientador" id="emailOrientador" class="form-control ${requestScope.emailOrientadorStatus}" value="${param.emailOrientador}" maxlength="50">
                                <div class="invalid-feedback">
                                    ${requestScope.emailOrientadorMsgErro}
                                </div>
                                <label for="emailOrientador">E-mail</label>
                                <small id="materialRegisterFormPhoneHelpBlock" class="form-text text-muted mb-4">
                                    Digite algo entre 2 e 50 caracateres
                                </small>
                            </div>
                        </div>
                        <div class="col">
                            <!-- Password do Orientador -->
                            <div class="md-form">
                                <input type="password" name="senhaOrientador" id="materialRegisterFormPassword" class="form-control ${requestScope.senhaOrientadorStatus}" aria-describedby="materialRegisterFormPasswordHelpBlock">
                                <div class="invalid-feedback">
                                    ${requestScope.senhaOrientadorMsgErro}
                                </div>
                                <label for="materialRegisterFormPassword">Senha</label>
                                <small id="materialRegisterFormPasswordHelpBlock" class="form-text text-muted mb-4">
                                    Digite pelo menos 8 caracteres
                                </small>
                            </div>
                        </div>
                    </div>
                    <h6 class="text-center" style="color: #ff0219">${requestScope.cadastroMsgErro}</h6>
                    <br>
                    <br>
                    
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
        <%@include file="scripts.jspf"%>
    </body>
</html>
