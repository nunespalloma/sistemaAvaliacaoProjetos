<%-- 
    Document   : CadastroAvaliador
    Created on : 23/09/2018, 19:42:00
    Author     : pallo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file="head.jspf"%> 
        <title>Cadastro Avaliador</title>
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
                <form class="text-center" style="color: #757575;" action="CadastroAvaliadorServlet" method="POST">
                    <br>
                    <div class="form-row indigo-text">
                        <font size="5" face="Calibri">
                            <strong>AVALIADOR</strong>
                        </font>
                    </div>

                    <!-- Nome do avaliador -->
                    <div class="md-form">
                        <input type="text" name="nomeAvaliador" id="nomeAvaliador" class="form-control ${requestScope.nomeAvaliadorStatus}" value="${param.nomeAvaliador}">
                        <div class="invalid-feedback">
                            ${requestScope.nomeAvaliadorMsgErro}
                        </div>
                        <label for="nomeAvaliador">Nome</label>
                        <small id="materialRegisterFormPhoneHelpBlock" class="form-text text-muted mb-4">
                            Digite algo entre 2 e 50 caracateres
                        </small>
                    </div>
                    
                    <div class="form-row">
                        <div class="col">
                            <!-- E-mail do Avaliador -->
                            <div class="md-form">
                                <input type="text" name="emailAvaliador" id="emailAvaliador" class="form-control ${requestScope.emailAvaliadorStatus}" value="${param.emailAvaliador}">
                                <div class="invalid-feedback">
                                    ${requestScope.emailAvaliadorMsgErro}
                                </div>
                                <label for="emailAvaliador">E-mail</label>
                                <small id="materialRegisterFormPhoneHelpBlock" class="form-text text-muted mb-4">
                                    Digite algo entre 2 e 50 caracateres
                                </small>
                            </div>
                        </div>
                        <div class="col">
                            <!-- Password -->
                            <div class="md-form">
                                <input type="password" name="senhaAvaliador" id="materialRegisterFormPassword" class="form-control ${requestScope.senhaAvaliadorStatus}" aria-describedby="materialRegisterFormPasswordHelpBlock">
                                <div class="invalid-feedback">
                                    ${requestScope.senhaAvaliadorMsgErro}
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
