/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.uff.sistemaAvaliacaoProjetos.view;

import br.com.uff.sistemaAvaliacaoProjetos.controller.OrientadorController;
import br.com.uff.sistemaAvaliacaoProjetos.model.entity.Orientador;
import br.com.uff.sistemaAvaliacaoProjetos.utils.FormatarDadosUtils;
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
        req.setCharacterEncoding("UTF-8");
        String nome = req.getParameter("nomeOrientador").toUpperCase().trim();
        String matricula = req.getParameter("matriculaOrientador").toUpperCase().trim();
        String cpf = req.getParameter("cpfOrientador").toUpperCase().trim();
        String identidade = req.getParameter("identidadeOrientador").toUpperCase().trim();
        String telefone = req.getParameter("telefoneOrientador").toUpperCase().trim();
        String urlCurriculoLattes = req.getParameter("urlCurriculoLattesOrientador").toUpperCase().trim();
        String departamento = req.getParameter("departamentoOrientador").toUpperCase().trim();
        String email = req.getParameter("emailOrientador").toUpperCase().trim(); //pego o que tem no name do input da jsp Cadastro Orientador.
        String senha = req.getParameter("senhaOrientador").toUpperCase().trim();
        boolean valid = true;
        String nomeOrientadorStatus;
        String nomeOrientadorMsgErro;
        String matriculaOrientadorStatus;
        String matriculaOrientadorMsgErro;
        String cpfOrientadorStatus;
        String cpfOrientadorMsgErro;
        String identidadeOrientadorStatus;
        String identidadeOrientadorMsgErro;
        String telefoneOrientadorStatus;
        String telefoneOrientadorMsgErro;
        String urlCurriculoLattesOrientadorStatus;
        String urlCurriculoLattesOrientadorMsgErro;
        String departamentoOrientadorStatus;
        String departamentoOrientadorMsgErro;
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
        
        //Validação de matricula
        if (ValidUtils.validMatriculaNull(matricula)) {
            if (ValidUtils.validMatriculaSize(matricula)) {
                matriculaOrientadorStatus = "is-valid";
                req.setAttribute("matriculaOrientadorStatus", matriculaOrientadorStatus);
            }else {
                valid = false;
                matriculaOrientadorStatus = "is-invalid";
                matriculaOrientadorMsgErro = "Tamanho da matricula inválido.".toUpperCase();
                req.setAttribute("matriculaOrientadorStatus", matriculaOrientadorStatus);
                req.setAttribute("matriculaOrientadorMsgErro", matriculaOrientadorMsgErro);
            }
        }else {
            valid = false;
            matriculaOrientadorStatus = "is-invalid";
            matriculaOrientadorMsgErro = "Matricula nulo ou vazio.".toUpperCase();
            req.setAttribute("matriculaOrientadorStatus", matriculaOrientadorStatus);
            req.setAttribute("matriculaOrientadorMsgErro", matriculaOrientadorMsgErro);
        }
        
        //Validação de cpf
        if (ValidUtils.validCpfNull(cpf)) {
            if (ValidUtils.validCpfSize(cpf)) {
                cpfOrientadorStatus = "is-valid";
                req.setAttribute("cpfOrientadorStatus", cpfOrientadorStatus);
            }else {
                valid = false;
                cpfOrientadorStatus = "is-invalid";
                cpfOrientadorMsgErro = "Tamanho do cpf inválido.".toUpperCase();
                req.setAttribute("cpfOrientadorStatus", cpfOrientadorStatus);
                req.setAttribute("cpfOrientadorMsgErro", cpfOrientadorMsgErro);
            }
        }else {
            valid = false;
            cpfOrientadorStatus = "is-invalid";
            cpfOrientadorMsgErro = "Cpf nulo ou vazio.".toUpperCase();
            req.setAttribute("cpfOrientadorStatus", cpfOrientadorStatus);
            req.setAttribute("cpfOrientadorMsgErro", cpfOrientadorMsgErro);
        }
        
        //Validação de identidade
        if (ValidUtils.validIdentidadeNull(identidade)) {
            if (ValidUtils.validIdentidadeSize(identidade)) {
                identidadeOrientadorStatus = "is-valid";
                req.setAttribute("identidadeOrientadorStatus", identidadeOrientadorStatus);
            }else {
                valid = false;
                identidadeOrientadorStatus = "is-invalid";
                identidadeOrientadorMsgErro = "Tamanho da identidade inválido.".toUpperCase();
                req.setAttribute("identidadeOrientadorStatus", identidadeOrientadorStatus);
                req.setAttribute("identidadeOrientadorMsgErro", identidadeOrientadorMsgErro);
            }
        }else {
            valid = false;
            identidadeOrientadorStatus = "is-invalid";
            identidadeOrientadorMsgErro = "Identidade nulo ou vazio.".toUpperCase();
            req.setAttribute("identidadeOrientadorStatus", identidadeOrientadorStatus);
            req.setAttribute("identidadeOrientadorMsgErro", identidadeOrientadorMsgErro);
        }
        
        //Validação de telefone
        if (ValidUtils.validTelefoneNull(telefone)) {
            if (ValidUtils.validTelefoneSize(telefone)) {
                telefoneOrientadorStatus = "is-valid";
                req.setAttribute("telefoneOrientadorStatus", telefoneOrientadorStatus);
            }else {
                valid = false;
                telefoneOrientadorStatus = "is-invalid";
                telefoneOrientadorMsgErro = "Tamanho do telefone inválido.".toUpperCase();
                req.setAttribute("telefoneOrientadorStatus", telefoneOrientadorStatus);
                req.setAttribute("telefoneOrientadorMsgErro", telefoneOrientadorMsgErro);
            }
        }else {
            valid = false;
            telefoneOrientadorStatus = "is-invalid";
            telefoneOrientadorMsgErro = "Telefone nulo ou vazio.".toUpperCase();
            req.setAttribute("telefoneOrientadorStatus", telefoneOrientadorStatus);
            req.setAttribute("telefoneOrientadorMsgErro", telefoneOrientadorMsgErro);
        }
        
        //Validação de link curriculo Lattes
        
        //Validação de departamento
        if (ValidUtils.validDepartamentoNull(departamento)) {
            if (ValidUtils.validDepartamentoSize(departamento)) {
                departamentoOrientadorStatus = "is-valid";
                req.setAttribute("departamentoOrientadorStatus", departamentoOrientadorStatus);
            }else {
                valid = false;
                departamentoOrientadorStatus = "is-invalid";
                departamentoOrientadorMsgErro = "Tamanho do departamento inválido.".toUpperCase();
                req.setAttribute("departamentoOrientadorStatus", departamentoOrientadorStatus);
                req.setAttribute("departamentoOrientadorMsgErro", departamentoOrientadorMsgErro);
            }
        }else {
            valid = false;
            departamentoOrientadorStatus = "is-invalid";
            departamentoOrientadorMsgErro = "Departamento nulo ou vazio.".toUpperCase();
            req.setAttribute("departamentoOrientadorStatus", departamentoOrientadorStatus);
            req.setAttribute("departamentoOrientadorMsgErro", departamentoOrientadorMsgErro);
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
            Orientador orientador = new Orientador(FormatarDadosUtils.filtrarMatricula(matricula), 
                    FormatarDadosUtils.filtrarCpf(cpf), FormatarDadosUtils.filtrarIdentidade(identidade), 
                    FormatarDadosUtils.filtrarTelefone(telefone), urlCurriculoLattes, departamento, nome, email, senha);
            try {
                if (!OrientadorController.buscaVerificacaoEmailCadastrado(orientador)) {
                    OrientadorController.insertOrientador(orientador);
                    req.getRequestDispatcher("Orientador.jsp").forward(req, resp);
                }else {
                    req.setAttribute("cadastroMsgErro", "Email de Orientador já cadastrado!");
                    req.getRequestDispatcher("CadastroOrientador.jsp").forward(req, resp);
                }
            }catch (Exception e) {
                e.printStackTrace();
            }
            
        }else {
            //reportar erro dispachando para a jsp.
            req.getRequestDispatcher("CadastroOrientador.jsp").forward(req, resp);
        }
    }
}
