/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.uff.sistemaAvaliacaoProjetos.AJAX;

import br.com.uff.sistemaAvaliacaoProjetos.controller.ProjetistaController;
import br.com.uff.sistemaAvaliacaoProjetos.model.entity.Projetista;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author pallo
 */
@WebServlet("/ProcurarMatriculaProjetistaServlet")
public class ProcurarMatriculaProjetistaServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("application/json;charset=UTF-8");
        String matriculaProjetista = req.getParameter("matriculaProjetista");
        String matriculaProjetistaStatus = "";
        String msgErroIdProjetista = "";
        Projetista projetista = new Projetista();
        try {
            projetista = ProjetistaController.buscaProjetistaPorMatricula(matriculaProjetista);
        }catch (Exception e) {
            e.printStackTrace();
        }
        if (projetista == null) {
            matriculaProjetistaStatus = "is-invalid";
            msgErroIdProjetista = "Matricula do projetista não encontrada".toUpperCase().trim();
            projetista = new Projetista();
            projetista.setNome("");
        }else {
            matriculaProjetistaStatus = "is-valid";
        }
        String jsonResposta = "{\"idProjetista\": \""+projetista.getId()+"\", \"nomeProjetista\":\""+projetista.getNome()+"\", \"matriculaProjetistaStatus\": \""+matriculaProjetistaStatus+"\", \"msgErroIdProjetista\": \""+msgErroIdProjetista+"\"}";
        resp.getWriter().print(jsonResposta);
        
    }

}
