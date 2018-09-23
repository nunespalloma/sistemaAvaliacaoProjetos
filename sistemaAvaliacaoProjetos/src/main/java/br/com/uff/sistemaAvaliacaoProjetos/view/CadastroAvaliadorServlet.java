/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.uff.sistemaAvaliacaoProjetos.view;

import br.com.uff.sistemaAvaliacaoProjetos.controller.AvaliadorController;
import br.com.uff.sistemaAvaliacaoProjetos.model.entity.Avaliador;
import br.com.uff.sistemaAvaliacaoProjetos.utils.ValidUtils;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author pallo
 */
@WebServlet("/CadastroAvaliadorServlet")
public class CadastroAvaliadorServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nome = req.getParameter("nomeAvaliador").toUpperCase().trim();
        String email = req.getParameter("emailAvaliador").toUpperCase().trim(); //pego o que tem no name do input da jsp Cadastro Avaliador.
        String senha = req.getParameter("senhaAvaliador").toUpperCase().trim();
        boolean valid = true;
        String nomeAvaliadorStatus;
        String nomeAvaliadorMsgErro;
        String emailAvaliadorStatus;
        String emailAvaliadorMsgErro;
        String senhaAvaliadorStatus;
        String senhaAvaliadorMsgErro;
        
        //Validação de nome
        if (ValidUtils.validNameNull(nome)) {
            if (ValidUtils.validNameSize(nome)) {
                nomeAvaliadorStatus = "is-valid";
                req.setAttribute("nomeAvaliadorStatus", nomeAvaliadorStatus);
            }else {
                valid = false;
                nomeAvaliadorStatus = "is-invalid";
                nomeAvaliadorMsgErro = "Tamanho do nome inválido.".toUpperCase();
                req.setAttribute("nomeAvaliadorStatus", nomeAvaliadorStatus);
                req.setAttribute("nomeAvaliadorMsgErro", nomeAvaliadorMsgErro);
            }
        }else {
            valid = false;
            nomeAvaliadorStatus = "is-invalid";
            nomeAvaliadorMsgErro = "Nome nulo ou vazio.".toUpperCase();
            req.setAttribute("nomeAvaliadorStatus", nomeAvaliadorStatus);
            req.setAttribute("nomeAvaliadorMsgErro", nomeAvaliadorMsgErro);
        }
        
        //Validação de email
        if (ValidUtils.validEmailNull(email)) {
            if (ValidUtils.validEmailSize(email)) {
                if (ValidUtils.validEmail(email)) {
                    emailAvaliadorStatus = "is-valid";
                    req.setAttribute("emailAvaliadorStatus", emailAvaliadorStatus);
                }else {
                    valid = false;
                    emailAvaliadorStatus = "is-invalid";
                    emailAvaliadorMsgErro = "Email fora do formato correto.".toUpperCase();
                    req.setAttribute("emailAvaliadorStatus", emailAvaliadorStatus);
                    req.setAttribute("emailAvaliadorMsgErro", emailAvaliadorMsgErro);
                }
            }else {
                valid = false;
                emailAvaliadorStatus = "is-invalid";
                emailAvaliadorMsgErro = "Tamanho do email inválido.".toUpperCase();
                req.setAttribute("emailAvaliadorStatus", emailAvaliadorStatus);
                req.setAttribute("emailAvaliadorMsgErro", emailAvaliadorMsgErro);
            }
        }else {
            valid = false;
            emailAvaliadorStatus = "is-invalid";
            emailAvaliadorMsgErro = "Email nulo ou vazio.".toUpperCase();
            req.setAttribute("emailAvaliadorStatus", emailAvaliadorStatus);
            req.setAttribute("emailAvaliadorMsgErro", emailAvaliadorMsgErro);
        }
        
        //Validação de senha
        if (ValidUtils.validPasswordNull(senha)) {
            if (ValidUtils.validPasswordSize(senha)) {
                senhaAvaliadorStatus = "is-valid";
                req.setAttribute("senhaAvaliadorStatus", senhaAvaliadorStatus);
            }else {
                valid = false;
                senhaAvaliadorStatus = "is-invalid";
                senhaAvaliadorMsgErro = "Tamanho da senha inválido.".toUpperCase();
                req.setAttribute("senhaAvaliadorStatus", senhaAvaliadorStatus);
                req.setAttribute("senhaAvaliadorMsgErro", senhaAvaliadorMsgErro);
            }
        }else {
            valid = false;
            senhaAvaliadorStatus = "is-invalid";
            senhaAvaliadorMsgErro = "Senha nulo ou vazio.".toUpperCase();
            req.setAttribute("senhaAvaliadorStatus", senhaAvaliadorStatus);
            req.setAttribute("senhaAvaliadorMsgErro", senhaAvaliadorMsgErro);
        }
        
        if (valid) {
            Avaliador avaliador = new Avaliador(nome,email,senha);
            try {
                AvaliadorController.insertAvaliador(avaliador);
            }catch (Exception e) {
                e.printStackTrace();
            }
            req.getRequestDispatcher("Avaliador.jsp").forward(req, resp);
        }else {
            //reportar erro dispachando para a jsp.
            req.getRequestDispatcher("CadastroAvaliador.jsp").forward(req, resp);
        }
    }

}
