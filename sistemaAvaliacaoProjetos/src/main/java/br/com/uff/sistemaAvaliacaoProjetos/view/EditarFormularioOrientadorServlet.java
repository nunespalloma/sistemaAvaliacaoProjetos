/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.uff.sistemaAvaliacaoProjetos.view;

import br.com.uff.sistemaAvaliacaoProjetos.controller.OrientadorController;
import br.com.uff.sistemaAvaliacaoProjetos.model.entity.Orientador;
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
 * @author pallo
 */
@WebServlet("/EditarFormularioOrientadorServlet")
public class EditarFormularioOrientadorServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String idProjetoString = req.getParameter("idProjeto");
        String idOrientadorString = req.getParameter("idOrientador");
        int idProjeto = 0;
        int idOrientador = 0;
        boolean valid = true;
        String editarMsgErroIdProjeto = "";
        String editarMsgErroIdOrientador = "";
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
        
        if(valid) {
            Orientador orientador = new Orientador();
            orientador.setId(idOrientador);
            orientador = OrientadorController.findOrientador(orientador);
            Projeto projeto = new Projeto();
            for (int i = 0; i < orientador.getProjetos().size(); i++) {
                if (orientador.getProjetos().get(i).getId() == idProjeto) {
                    projeto = orientador.getProjetos().get(i);
                }
            }
            req.setAttribute("orientador", orientador);
            req.setAttribute("projeto", projeto);
            req.getRequestDispatcher("Formulario.jsp").forward(req, resp);
        }else {
            req.getRequestDispatcher("Orientador.jsp").forward(req, resp);
        }
    }

}
