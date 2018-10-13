/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.uff.sistemaAvaliacaoProjetos.view;

import br.com.uff.sistemaAvaliacaoProjetos.controller.OrientadorController;
import br.com.uff.sistemaAvaliacaoProjetos.controller.ProjetistaController;
import br.com.uff.sistemaAvaliacaoProjetos.model.entity.Orientador;
import br.com.uff.sistemaAvaliacaoProjetos.model.entity.Projetista;
import br.com.uff.sistemaAvaliacaoProjetos.model.entity.Projeto;
import br.com.uff.sistemaAvaliacaoProjetos.utils.ValidUtils;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author vinicius
 */
@WebServlet("/EditarFormularioProjetistaServlet")
public class EditarFormularioProjetistaServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String idProjetoString = req.getParameter("idProjeto");
        String idOrientadorString = req.getParameter("idOrientador");
        String idProjetistaString = req.getParameter("idProjetista");
        int idProjeto = 0;
        int idOrientador = 0;
        int idProjetista = 0;
        boolean valid = true;
        String editarMsgErroIdProjeto = "";
        String editarMsgErroIdOrientador = "";
        String editarMsgErroIdProjetista = "";
        //Validação de idProjeto
        if (ValidUtils.validConvertStringToInt(idProjetoString)) {
            idProjeto = Integer.parseInt(idProjetoString);
        }else {
            editarMsgErroIdProjeto = "Erro na conversão do idProjeto".toUpperCase().trim();
            req.setAttribute("editarMsgErroIdProjeto", editarMsgErroIdProjeto);
            valid = false;
        }
        
        //Validação de idOrientador
        if (ValidUtils.validConvertStringToInt(idOrientadorString)) {
            idOrientador = Integer.parseInt(idOrientadorString);
        }else {
            editarMsgErroIdOrientador = "Erro na conversão do idOrientador".toUpperCase().trim();
            req.setAttribute("editarMsgErroIdOrientador", editarMsgErroIdOrientador);
            valid = false;
        }
        
        //Validação de idProjetista
        if (ValidUtils.validConvertStringToInt(idProjetistaString)) {
            idProjetista = Integer.parseInt(idProjetistaString);
        }else {
            editarMsgErroIdProjetista = "Erro na conversão do idProjetista".toUpperCase().trim();
            req.setAttribute("editarMsgErroIdProjetista", editarMsgErroIdProjetista);
            valid = false;
        }
        
        if(valid) {
            Orientador orientador = new Orientador();
            orientador.setId(idOrientador);
            orientador = OrientadorController.findOrientador(orientador);
            Projetista projetista = new Projetista();
            projetista.setId(idProjetista);
            projetista = ProjetistaController.findProjetista(projetista);
            Projeto projeto = new Projeto();
            for (int i = 0; i < projetista.getProjetos().size(); i++) {
                if (projetista.getProjetos().get(i).getId() == idProjeto) {
                    projeto = projetista.getProjetos().get(i);
                }
            }
            req.setAttribute("orientador", orientador);
            req.setAttribute("projeto", projeto);
            req.getRequestDispatcher("Formulario.jsp").forward(req, resp);
        }else {
            req.getRequestDispatcher("Projetista.jsp").forward(req, resp);
        }
    }

}
