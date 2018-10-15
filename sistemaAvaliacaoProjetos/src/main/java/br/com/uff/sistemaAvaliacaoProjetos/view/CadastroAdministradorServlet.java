/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.uff.sistemaAvaliacaoProjetos.view;

import br.com.uff.sistemaAvaliacaoProjetos.controller.AdministradorController;
import br.com.uff.sistemaAvaliacaoProjetos.controller.AvaliadorController;
import br.com.uff.sistemaAvaliacaoProjetos.controller.ProjetoController;
import br.com.uff.sistemaAvaliacaoProjetos.model.entity.Administrador;
import br.com.uff.sistemaAvaliacaoProjetos.model.entity.Avaliador;
import br.com.uff.sistemaAvaliacaoProjetos.model.entity.Projeto;
import br.com.uff.sistemaAvaliacaoProjetos.utils.ValidUtils;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author pallo
 */
@WebServlet("/CadastroAdministradorServlet")
public class CadastroAdministradorServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String nome = req.getParameter("nomeAdministrador").toUpperCase().trim();
        String email = req.getParameter("emailAdministrador").toUpperCase().trim(); //pego o que tem no name do input da jsp Cadastro Administrador.
        String senha = req.getParameter("senhaAdministrador").toUpperCase().trim();
        boolean valid = true;
        String nomeAdministradorStatus;
        String nomeAdministradorMsgErro;
        String emailAdministradorStatus;
        String emailAdministradorMsgErro;
        String senhaAdministradorStatus;
        String senhaAdministradorMsgErro;
        
        //Validação de nome
        if (ValidUtils.validNameNull(nome)) {
            if (ValidUtils.validNameSize(nome)) {
                nomeAdministradorStatus = "is-valid";
                req.setAttribute("nomeAdministradorStatus", nomeAdministradorStatus);
            }else {
                valid = false;
                nomeAdministradorStatus = "is-invalid";
                nomeAdministradorMsgErro = "Tamanho do nome inválido.".toUpperCase();
                req.setAttribute("nomeAdministradorStatus", nomeAdministradorStatus);
                req.setAttribute("nomeAdministradorMsgErro", nomeAdministradorMsgErro);
            }
        }else {
            valid = false;
            nomeAdministradorStatus = "is-invalid";
            nomeAdministradorMsgErro = "Nome nulo ou vazio.".toUpperCase();
            req.setAttribute("nomeAdministradorStatus", nomeAdministradorStatus);
            req.setAttribute("nomeAdministradorMsgErro", nomeAdministradorMsgErro);
        }
        
        //Validação de email
        if (ValidUtils.validEmailNull(email)) {
            if (ValidUtils.validEmailSize(email)) {
                if (ValidUtils.validEmail(email)) {
                    emailAdministradorStatus = "is-valid";
                    req.setAttribute("emailAdministradorStatus", emailAdministradorStatus);
                }else {
                    valid = false;
                    emailAdministradorStatus = "is-invalid";
                    emailAdministradorMsgErro = "Email fora do formato correto.".toUpperCase();
                    req.setAttribute("emailAdministradorStatus", emailAdministradorStatus);
                    req.setAttribute("emailAdministradorMsgErro", emailAdministradorMsgErro);
                }
            }else {
                valid = false;
                emailAdministradorStatus = "is-invalid";
                emailAdministradorMsgErro = "Tamanho do email inválido.".toUpperCase();
                req.setAttribute("emailAdministradorStatus", emailAdministradorStatus);
                req.setAttribute("emailAdministradorMsgErro", emailAdministradorMsgErro);
            }
        }else {
            valid = false;
            emailAdministradorStatus = "is-invalid";
            emailAdministradorMsgErro = "Email nulo ou vazio.".toUpperCase();
            req.setAttribute("emailAdministradorStatus", emailAdministradorStatus);
            req.setAttribute("emailAdministradorMsgErro", emailAdministradorMsgErro);
        }
        
        //Validação de senha
        if (ValidUtils.validPasswordNull(senha)) {
            if (ValidUtils.validPasswordSize(senha)) {
                senhaAdministradorStatus = "is-valid";
                req.setAttribute("senhaAdministradorStatus", senhaAdministradorStatus);
            }else {
                valid = false;
                senhaAdministradorStatus = "is-invalid";
                senhaAdministradorMsgErro = "Tamanho da senha inválido.".toUpperCase();
                req.setAttribute("senhaAdministradorStatus", senhaAdministradorStatus);
                req.setAttribute("senhaAdministradorMsgErro", senhaAdministradorMsgErro);
            }
        }else {
            valid = false;
            senhaAdministradorStatus = "is-invalid";
            senhaAdministradorMsgErro = "Senha nulo ou vazio.".toUpperCase();
            req.setAttribute("senhaAdministradorStatus", senhaAdministradorStatus);
            req.setAttribute("senhaAdministradorMsgErro", senhaAdministradorMsgErro);
        }
        
        if (valid) {
            Administrador administrador = new Administrador(nome,email,senha);
            try {
                if (!AdministradorController.buscaVerificacaoEmailCadastrado(administrador)) {
                    AdministradorController.insertAdministrador(administrador);
                    administrador = AdministradorController.buscaAdministradorPorLogin(administrador);
                    List<Projeto> projetos = ProjetoController.listAllProjetos();
                    List<Avaliador> avaliadores = AvaliadorController.listAllAvaliadores();
                    req.setAttribute("projetos", projetos);
                    req.setAttribute("avaliadores", avaliadores);
                    req.getSession().setAttribute("login", administrador);
                    req.getRequestDispatcher("Administrador.jsp").forward(req, resp);
                }else {
                    req.setAttribute("cadastroMsgErro", "Email de Administrador já cadastrado!");
                    req.getRequestDispatcher("CadastroAdministrador.jsp").forward(req, resp);
                }

            }catch (Exception e) {
                e.printStackTrace();
            }

        }else {
            //reportar erro dispachando para a jsp.
            req.getRequestDispatcher("CadastroAdministrador.jsp").forward(req, resp);
        }
    }
    
}
