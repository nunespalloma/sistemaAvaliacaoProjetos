/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.uff.sistemaAvaliacaoProjetos.view;

import br.com.uff.sistemaAvaliacaoProjetos.controller.OrientadorController;
import br.com.uff.sistemaAvaliacaoProjetos.model.entity.Orientador;
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
@WebServlet("/CadastroOrientadorServlet")
public class CadastroOrientadorServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nome = req.getParameter("nomeOrientador").toUpperCase().trim();
        String email = req.getParameter("emailOrientador").toUpperCase().trim(); //pego o que tem no name do input da jsp Cadastro Orientador.
        String senha = req.getParameter("senhaOrientador").toUpperCase().trim();
        boolean valid = true;
        String nomeOrientadorStatus;
        String nomeOrientadorMsgErro;
        String emailOrientadorStatus;
        String emailOrientadorMsgErro;
        String senhaOrientadorStatus;
        String senhaOrientadorMsgErro;
        
        //Validação de nome
        if (ValidUtils.validNameNull(nome)) {
            if (ValidUtils.validNameSize(nome)) {
                nomeOrientadorStatus = "is-valid";
                req.setAttribute("nomeOrientadorStatus", nomeOrientadorStatus);
            }else {
                valid = false;
                nomeOrientadorStatus = "is-invalid";
                nomeOrientadorMsgErro = "Tamanho do nome inválido.".toUpperCase();
                req.setAttribute("nomeOrientadorStatus", nomeOrientadorStatus);
                req.setAttribute("nomeOrientadorMsgErro", nomeOrientadorMsgErro);
            }
        }else {
            valid = false;
            nomeOrientadorStatus = "is-invalid";
            nomeOrientadorMsgErro = "Nome nulo ou vazio.".toUpperCase();
            req.setAttribute("nomeOrientadorStatus", nomeOrientadorStatus);
            req.setAttribute("nomeOrientadorMsgErro", nomeOrientadorMsgErro);
        }
        
        //Validação de email
        if (ValidUtils.validEmailNull(email)) {
            if (ValidUtils.validEmailSize(email)) {
                if (ValidUtils.validEmail(email)) {
                    emailOrientadorStatus = "is-valid";
                    req.setAttribute("emailOrientadorStatus", emailOrientadorStatus);
                }else {
                    valid = false;
                    emailOrientadorStatus = "is-invalid";
                    emailOrientadorMsgErro = "Email fora do formato correto.".toUpperCase();
                    req.setAttribute("emailOrientadorStatus", emailOrientadorStatus);
                    req.setAttribute("emailOrientadorMsgErro", emailOrientadorMsgErro);
                }
            }else {
                valid = false;
                emailOrientadorStatus = "is-invalid";
                emailOrientadorMsgErro = "Tamanho do email inválido.".toUpperCase();
                req.setAttribute("emailOrientadorStatus", emailOrientadorStatus);
                req.setAttribute("emailOrientadorMsgErro", emailOrientadorMsgErro);
            }
        }else {
            valid = false;
            emailOrientadorStatus = "is-invalid";
            emailOrientadorMsgErro = "Email nulo ou vazio.".toUpperCase();
            req.setAttribute("emailOrientadorStatus", emailOrientadorStatus);
            req.setAttribute("emailOrientadorMsgErro", emailOrientadorMsgErro);
        }
        
        //Validação de senha
        if (ValidUtils.validPasswordNull(senha)) {
            if (ValidUtils.validPasswordSize(senha)) {
                senhaOrientadorStatus = "is-valid";
                req.setAttribute("senhaOrientadorStatus", senhaOrientadorStatus);
            }else {
                valid = false;
                senhaOrientadorStatus = "is-invalid";
                senhaOrientadorMsgErro = "Tamanho da senha inválido.".toUpperCase();
                req.setAttribute("senhaOrientadorStatus", senhaOrientadorStatus);
                req.setAttribute("senhaOrientadorMsgErro", senhaOrientadorMsgErro);
            }
        }else {
            valid = false;
            senhaOrientadorStatus = "is-invalid";
            senhaOrientadorMsgErro = "Senha nulo ou vazio.".toUpperCase();
            req.setAttribute("senhaOrientadorStatus", senhaOrientadorStatus);
            req.setAttribute("senhaOrientadorMsgErro", senhaOrientadorMsgErro);
        }
        
        if (valid) {
            Orientador orientador = new Orientador(nome,email,senha);
            try {
                OrientadorController.insertOrientador(orientador);
            }catch (Exception e) {
                e.printStackTrace();
            }
            req.getRequestDispatcher("Orientador.jsp").forward(req, resp);
        }else {
            //reportar erro dispachando para a jsp.
            req.getRequestDispatcher("CadastroOrientador.jsp").forward(req, resp);
        }
    }
}
