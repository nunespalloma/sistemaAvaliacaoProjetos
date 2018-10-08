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
                        <input type="text" name="nomeOrientador" id="nomeOrientador" class="form-control ${requestScope.nomeOrientadorStatus}" value="${param.nomeOrientador}">
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
                            <!-- E-mail do Orientador -->
                            <div class="md-form">
                                <input type="text" name="emailOrientador" id="emailOrientador" class="form-control ${requestScope.emailOrientadorStatus}" value="${param.emailOrientador}">
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
                            <!-- Password -->
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
    </body>
</html>
