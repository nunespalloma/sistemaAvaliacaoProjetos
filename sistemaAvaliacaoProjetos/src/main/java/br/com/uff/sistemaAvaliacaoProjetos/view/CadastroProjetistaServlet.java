/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.uff.sistemaAvaliacaoProjetos.view;

import br.com.uff.sistemaAvaliacaoProjetos.controller.ProjetistaController;
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
 * @author palloma
 */
@WebServlet("/CadastroProjetistaServlet")
public class CadastroProjetistaServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String matricula = req.getParameter("matriculaProjetista").toUpperCase().trim();
        String nome = req.getParameter("nomeProjetista").toUpperCase().trim();
        String email = req.getParameter("emailProjetista").toUpperCase().trim(); //pego o que tem no name do input da jsp Cadastro Projetista.
        String senha = req.getParameter("senhaProjetista").toUpperCase().trim();
        boolean valid = true;
        String matriculaProjetistaStatus;
        String matriculaProjetistaMsgErro;
        String nomeProjetistaStatus;
        String nomeProjetistaMsgErro;
        String emailProjetistaStatus;
        String emailProjetistaMsgErro;
        String senhaProjetistaStatus;
        String senhaProjetistaMsgErro;
        
        //Validação de matricula
        if (ValidUtils.validMatriculaNull(matricula)) {
            if (ValidUtils.validMatriculaProjetistaSize(matricula)) {
                matriculaProjetistaStatus = "is-valid";
                req.setAttribute("matriculaProjetistaStatus", matriculaProjetistaStatus);
            }else {
                valid = false;
                matriculaProjetistaStatus = "is-invalid";
                matriculaProjetistaMsgErro = "Tamanho da matricula inválido.".toUpperCase();
                req.setAttribute("matriculaProjetistaStatus", matriculaProjetistaStatus);
                req.setAttribute("matriculaProjetistaMsgErro", matriculaProjetistaMsgErro);
            }
        }else {
            valid = false;
            matriculaProjetistaStatus = "is-invalid";
            matriculaProjetistaMsgErro = "Matricula nulo ou vazio.".toUpperCase();
            req.setAttribute("matriculaProjetistaStatus", matriculaProjetistaStatus);
            req.setAttribute("matriculaProjetistaMsgErro", matriculaProjetistaMsgErro);
        }
        
        //Validação de nome
        if (ValidUtils.validNameNull(nome)) {
            if (ValidUtils.validNameSize(nome)) {
                nomeProjetistaStatus = "is-valid";
                req.setAttribute("nomeProjetistaStatus", nomeProjetistaStatus);
            }else {
                valid = false;
                nomeProjetistaStatus = "is-invalid";
                nomeProjetistaMsgErro = "Tamanho do nome inválido.".toUpperCase();
                req.setAttribute("nomeProjetistaStatus", nomeProjetistaStatus);
                req.setAttribute("nomeProjetistaMsgErro", nomeProjetistaMsgErro);
            }
        }else {
            valid = false;
            nomeProjetistaStatus = "is-invalid";
            nomeProjetistaMsgErro = "Nome nulo ou vazio.".toUpperCase();
            req.setAttribute("nomeProjetistaStatus", nomeProjetistaStatus);
            req.setAttribute("nomeProjetistaMsgErro", nomeProjetistaMsgErro);
        }
        
        //Validação de email
        if (ValidUtils.validEmailNull(email)) {
            if (ValidUtils.validEmailSize(email)) {
                if (ValidUtils.validEmail(email)) {
                    emailProjetistaStatus = "is-valid";
                    req.setAttribute("emailProjetistaStatus", emailProjetistaStatus);
                }else {
                    valid = false;
                    emailProjetistaStatus = "is-invalid";
                    emailProjetistaMsgErro = "Email fora do formato correto.".toUpperCase();
                    req.setAttribute("emailProjetistaStatus", emailProjetistaStatus);
                    req.setAttribute("emailProjetistaMsgErro", emailProjetistaMsgErro);
                }
            }else {
                valid = false;
                emailProjetistaStatus = "is-invalid";
                emailProjetistaMsgErro = "Tamanho do email inválido.".toUpperCase();
                req.setAttribute("emailProjetistaStatus", emailProjetistaStatus);
                req.setAttribute("emailProjetistaMsgErro", emailProjetistaMsgErro);
            }
        }else {
            valid = false;
            emailProjetistaStatus = "is-invalid";
            emailProjetistaMsgErro = "Email nulo ou vazio.".toUpperCase();
            req.setAttribute("emailProjetistaStatus", emailProjetistaStatus);
            req.setAttribute("emailProjetistaMsgErro", emailProjetistaMsgErro);
        }
        
        //Validação de senha
        if (ValidUtils.validPasswordNull(senha)) {
            if (ValidUtils.validPasswordSize(senha)) {
                senhaProjetistaStatus = "is-valid";
                req.setAttribute("senhaProjetistaStatus", senhaProjetistaStatus);
            }else {
                valid = false;
                senhaProjetistaStatus = "is-invalid";
                senhaProjetistaMsgErro = "Tamanho da senha inválido.".toUpperCase();
                req.setAttribute("senhaProjetistaStatus", senhaProjetistaStatus);
                req.setAttribute("senhaProjetistaMsgErro", senhaProjetistaMsgErro);
            }
        }else {
            valid = false;
            senhaProjetistaStatus = "is-invalid";
            senhaProjetistaMsgErro = "Senha nulo ou vazio.".toUpperCase();
            req.setAttribute("senhaProjetistaStatus", senhaProjetistaStatus);
            req.setAttribute("senhaProjetistaMsgErro", senhaProjetistaMsgErro);
        }
        
        if (valid) {
            Projetista projetista = new Projetista(matricula,nome,email,senha);
            try {
                if (!ProjetistaController.buscaVerificacaoEmailCadastrado(projetista)) {
                    ProjetistaController.insertProjetista(projetista);
                    projetista = ProjetistaController.buscaProjetistaPorLogin(projetista);
                    req.setAttribute("projetista", projetista);
                    req.getSession().setAttribute("login", projetista);
                    req.getRequestDispatcher("Projetista.jsp").forward(req, resp);
                }else {
                    req.setAttribute("cadastroMsgErro", "Email de Projetista já cadastrado!");
                    req.getRequestDispatcher("CadastroProjetista.jsp").forward(req, resp);
                }
                
            }catch (Exception e) {
                e.printStackTrace();
            }
            
        }else {
            //reportar erro dispachando para a jsp.
            req.getRequestDispatcher("CadastroProjetista.jsp").forward(req, resp);
        }
    }
}
