/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.uff.sistemaAvaliacaoProjetos.view;

import br.com.uff.sistemaAvaliacaoProjetos.controller.AdministradorController;
import br.com.uff.sistemaAvaliacaoProjetos.controller.AvaliadorController;
import br.com.uff.sistemaAvaliacaoProjetos.controller.OrientadorController;
import br.com.uff.sistemaAvaliacaoProjetos.controller.ProjetistaController;
import br.com.uff.sistemaAvaliacaoProjetos.model.entity.Administrador;
import br.com.uff.sistemaAvaliacaoProjetos.model.entity.Avaliador;
import br.com.uff.sistemaAvaliacaoProjetos.model.entity.Orientador;
import br.com.uff.sistemaAvaliacaoProjetos.model.entity.Projetista;
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
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String usuario = req.getParameter("exampleRadios").toUpperCase().trim();
        String email = req.getParameter("email").toUpperCase().trim(); //pego o que tem no name do input da jsp Cadastro .
        String senha = req.getParameter("senha").toUpperCase().trim();
        boolean valid = true;
        String emailStatus;
        String emailMsgErro;
        String senhaStatus;
        String senhaMsgErro;
        
        //Validação de email
        if (ValidUtils.validEmailNull(email)) {
            if (ValidUtils.validEmailSize(email)) {
                if (ValidUtils.validEmail(email)) {
                    emailStatus = "is-valid";
                    req.setAttribute("emailStatus", emailStatus);
                }else {
                    valid = false;
                    emailStatus = "is-invalid";
                    emailMsgErro = "Email fora do formato correto.".toUpperCase();
                    req.setAttribute("emailStatus", emailStatus);
                    req.setAttribute("emailMsgErro", emailMsgErro);
                }
            }else {
                valid = false;
                emailStatus = "is-invalid";
                emailMsgErro = "Tamanho do email inválido.".toUpperCase();
                req.setAttribute("emailStatus", emailStatus);
                req.setAttribute("emailMsgErro", emailMsgErro);
            }
        }else {
            valid = false;
            emailStatus = "is-invalid";
            emailMsgErro = "Email nulo ou vazio.".toUpperCase();
            req.setAttribute("emailStatus", emailStatus);
            req.setAttribute("emailMsgErro", emailMsgErro);
        }
        
        //Validação de senha
        if (ValidUtils.validPasswordNull(senha)) {
            if (ValidUtils.validPasswordSize(senha)) {
                senhaStatus = "is-valid";
                req.setAttribute("senhaStatus", senhaStatus);
            }else {
                valid = false;
                senhaStatus = "is-invalid";
                senhaMsgErro = "Tamanho da senha inválido.".toUpperCase();
                req.setAttribute("senhaStatus", senhaStatus);
                req.setAttribute("senhaMsgErro", senhaMsgErro);
            }
        }else {
            valid = false;
            senhaStatus = "is-invalid";
            senhaMsgErro = "Senha nulo ou vazio.".toUpperCase();
            req.setAttribute("senhaStatus", senhaStatus);
            req.setAttribute("senhaMsgErro", senhaMsgErro);
        }
        
        if (valid) {
            if (usuario.equals("ADMINISTRADOR")) {
                Administrador administrador = new Administrador();
                administrador.setEmail(email);
                administrador.setSenha(senha);
                if (AdministradorController.buscaVerificacaoLogin(administrador)) {
                    req.getRequestDispatcher("Administrador.jsp").forward(req, resp);
                }else {
                    req.setAttribute("loginMsgErro", "Email ou senha não encontrados de Administrador!");
                    req.getRequestDispatcher("Login.jsp").forward(req, resp);
                }
            }else if (usuario.equals("AVALIADOR")) {
                Avaliador avaliador = new Avaliador();
                avaliador.setEmail(email);
                avaliador.setSenha(senha);
                if (AvaliadorController.buscaVerificacaoLogin(avaliador)) {
                    req.getRequestDispatcher("Avaliador.jsp").forward(req, resp);
                }else {
                    req.setAttribute("loginMsgErro", "Email ou senha não encontrados de Avaliador!");
                    req.getRequestDispatcher("Login.jsp").forward(req, resp);
                }
            }else if (usuario.equals("ORIENTADOR")) {
                Orientador orientador = new Orientador();
                orientador.setEmail(email);
                orientador.setSenha(senha);
                if (OrientadorController.buscaVerificacaoLogin(orientador)) {
                    req.getRequestDispatcher("Orientador.jsp").forward(req, resp);
                }else {
                    req.setAttribute("loginMsgErro", "Email ou senha não encontrados de Orientador!");
                    req.getRequestDispatcher("Login.jsp").forward(req, resp);
                }
            }else if (usuario.equals("PROJETISTA")) {
                Projetista projetista = new Projetista();
                projetista.setEmail(email);
                projetista.setSenha(senha);
                if (ProjetistaController.buscaVerificacaoLogin(projetista)) {
                    req.getRequestDispatcher("Projetista.jsp").forward(req, resp);
                }else {
                    req.setAttribute("loginMsgErro", "Email ou senha não encontrados de Projetista!");
                    req.getRequestDispatcher("Login.jsp").forward(req, resp);
                }
            }else {
                //throw new Exception().printStackTrace();
            }
            //String jspDispachada = usuario.toLowerCase();
                    //jspDispachada = jspDispachada.substring(0, 1).toUpperCase().concat(jspDispachada.substring(1));
                    //req.getRequestDispatcher(jspDispachada+".jsp").forward(req, resp);
        }else {
            //reportar erro dispachando para a jsp.
            req.getRequestDispatcher("Login.jsp").forward(req, resp);
        }
    }

}
