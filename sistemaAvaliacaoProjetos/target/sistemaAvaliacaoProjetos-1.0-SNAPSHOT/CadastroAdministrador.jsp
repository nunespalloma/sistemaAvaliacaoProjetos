<%-- 
    Document   : CadastroAdministrador
    Created on : 25/07/2018, 22:09:47
    Author     : palloma
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file="head.jspf"%> 
        <title>Cadastro Administrador</title>
    </head>
    <body>
        <%@include file="navbar.jspf"%>
        <div class="card">
            <h1 class="text-center indigo-text py-4">
                <font size="10" face="Calibri">
                    <strong>CADASTRO</strong>
                </font>
            </h1>

            <!--Card content-->
            <div class="card-body px-lg-5 pt-0">

                <!-- Form -->
                <form class="text-center" style="color: #757575;" action="CadastroAdministradorServlet" method="POST">
                    <br>
                    <div class="form-row indigo-text">
                        <font size="5" face="Calibri">
                            <strong>ADMINISTRADOR</strong>
                        </font>
                    </div>

                    <!-- Nome do administrador -->
                    <div class="md-form">
                        <input type="text" name="nomeAdministrador" id="nomeAdministrador" class="form-control ${requestScope.nomeAdministradorStatus}" value="${param.nomeAdministrador}">
                        <div class="invalid-feedback">
                            ${requestScope.nomeAdministradorMsgErro}
                        </div>
                        <label for="nomeAdministrador">Nome</label>
                        <small id="materialRegisterFormPhoneHelpBlock" class="form-text text-muted mb-4">
                            Digite algo entre 2 e 50 caracateres
                        </small>
                    </div>
                    
                    <div class="form-row">
                        <div class="col">
                            <!-- E-mail do Administrador -->
                            <div class="md-form">
                                <input type="text" name="emailAdministrador" id="emailAdministrador" class="form-control ${requestScope.emailAdministradorStatus}" value="${param.emailAdministrador}">
                                <div class="invalid-feedback">
                                    ${requestScope.emailAdministradorMsgErro}
                                </div>
                                <label for="emailAdministrador">E-mail</label>
                                <small id="materialRegisterFormPhoneHelpBlock" class="form-text text-muted mb-4">
                                    Digite algo entre 2 e 50 caracateres
                                </small>
                            </div>
                        </div>
                        <div class="col">
                            <!-- Password -->
                            <div class="md-form">
                                <input type="password" name="senhaAdministrador" id="materialRegisterFormPassword" class="form-control ${requestScope.senhaAdministradorStatus}" aria-describedby="materialRegisterFormPasswordHelpBlock">
                                <div class="invalid-feedback">
                                    ${requestScope.senhaAdministradorMsgErro}
                                </div>
                                <label for="materialRegisterFormPassword">Senha</label>
                                <small id="materialRegisterFormPasswordHelpBlock" class="form-text text-muted mb-4">
                                    Digite pelo menos 8 caracteres
                                </small>
                            </div>
                        </div>
                    </div>
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
    </body>
</html>
