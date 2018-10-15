/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.uff.sistemaAvaliacaoProjetos.view;

import br.com.uff.sistemaAvaliacaoProjetos.controller.AvaliadorController;
import br.com.uff.sistemaAvaliacaoProjetos.controller.ProjetoController;
import br.com.uff.sistemaAvaliacaoProjetos.model.entity.Avaliador;
import br.com.uff.sistemaAvaliacaoProjetos.model.entity.Projeto;
import br.com.uff.sistemaAvaliacaoProjetos.utils.ValidUtils;
import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet("/AvaliacaoServlet")
public class AvaliacaoServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String idProjetoString = req.getParameter("idProjeto");
        String idAvaliadorString = req.getParameter("idAvaliador");
        String avaliacao = req.getParameter("avaliacao");
        int idProjeto=0;
        int idAvaliador=0;
        boolean valid = true;
        Avaliador avaliador = new Avaliador();
        Projeto projeto = new Projeto();
        String editarMsgErroIdProjeto;
        String editarMsgErroIdAvaliador;
        String avaliacaoStatus;
        String avaliacaoMsgErro;
        System.out.println("idAvaliador: "+idAvaliadorString);
        System.out.println("idProjeto: "+idProjetoString);
        System.out.println("avaliacao: "+avaliacao);
        //Validação de idProjeto
        if (ValidUtils.validConvertStringToInt(idProjetoString)) {
            idProjeto = Integer.parseInt(idProjetoString);
            projeto.setId(idProjeto);
            projeto = ProjetoController.findProjeto(projeto);
        }else {
            editarMsgErroIdProjeto = "Erro na conversão do idProjeto".toUpperCase().trim();
            req.setAttribute("editarMsgErroIdProjeto", editarMsgErroIdProjeto);
            valid = false;
        }
        
        //Validação de idAvaliador
        if (ValidUtils.validConvertStringToInt(idAvaliadorString)) {
            idAvaliador = Integer.parseInt(idAvaliadorString);
            avaliador.setId(idAvaliador);
            avaliador = AvaliadorController.findAvaliador(avaliador);
        }else {
            editarMsgErroIdAvaliador = "Erro na conversão do idAvaliador".toUpperCase().trim();
            req.setAttribute("editarMsgErroIdAvaliador", editarMsgErroIdAvaliador);
            valid = false;
        }
        
        //Validação avaliação
        if (ValidUtils.validTextFieldNull(avaliacao)) {
            if (ValidUtils.validTextFieldSize(avaliacao)) {
                avaliacaoStatus = "is-valid";
                req.setAttribute("avaliacaoStatus", avaliacaoStatus);
                projeto.setAvaliacao(avaliacao.toUpperCase().trim());
            }else {
                valid = false;
                avaliacaoStatus = "is-invalid";
                avaliacaoMsgErro = "Tamanho do campo de texto para a descrição da avaliação inválido.".toUpperCase();
                req.setAttribute("avaliacaoStatus", avaliacaoStatus);
                req.setAttribute("avaliacaoMsgErro", avaliacaoMsgErro);
            }
        }else {
            valid = false;
            avaliacaoStatus = "is-invalid";
            avaliacaoMsgErro = "Campo de texto para a descrição da avaliação nulo ou vazio.".toUpperCase();
            req.setAttribute("avaliacaoStatus", avaliacaoStatus);
            req.setAttribute("avaliacaoMsgErro", avaliacaoMsgErro);
        }
        
        if(valid) {
            projeto.setAvaliado(true);
            try{
                ProjetoController.updateProjeto(projeto);
            }catch (Exception e) {
                e.printStackTrace();
            }
            List<Projeto> projetosParaAvaliacao = ProjetoController.buscarProjetosParaAvaliacao(avaliador);
            List<Projeto> projetosAvaliados = ProjetoController.buscarProjetosAvaliados(avaliador);
            req.setAttribute("projetosParaAvaliacao", projetosParaAvaliacao);
            req.setAttribute("projetosAvaliados", projetosAvaliados);
            req.setAttribute("avaliador", avaliador);
            req.getSession().setAttribute("login", avaliador);
            req.getRequestDispatcher("Avaliador.jsp").forward(req, resp);
        }else {
            req.setAttribute("projeto", projeto);
            req.setAttribute("avaliador", avaliador);
            req.getRequestDispatcher("AvaliacaoProjeto.jsp").forward(req, resp);
        }
    }
    
}
