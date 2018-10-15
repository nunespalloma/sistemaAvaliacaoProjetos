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
@WebServlet("/SubmeterProjetoAvaliacaoAvaliadorServlet")
public class SubmeterProjetoAvaliacaoAvaliadorServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String idAvaliadorString = req.getParameter("idAvaliador");
        String idProjetoString = req.getParameter("idProjeto");
        int idProjeto=0;
        int idAvaliador=0;
        boolean valid = true;
        Avaliador avaliador = new Avaliador();
        Projeto projeto = new Projeto();
        String editarMsgErroIdProjeto;
        String editarMsgErroIdAvaliador;
        
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
        
        if(valid) {
            req.setAttribute("projeto", projeto);
            req.setAttribute("avaliador", avaliador);
            req.getRequestDispatcher("AvaliacaoProjeto.jsp").forward(req, resp);
        }else {
            List<Projeto> projetosParaAvaliacao = ProjetoController.buscarProjetosParaAvaliacao(avaliador);
            List<Projeto> projetosAvaliados = ProjetoController.buscarProjetosAvaliados(avaliador);
            req.setAttribute("projetosParaAvaliacao", projetosParaAvaliacao);
            req.setAttribute("projetosAvaliados", projetosAvaliados);
            req.getRequestDispatcher("AvaliacaoProjeto.jsp").forward(req, resp);
        }
    }
    
}
