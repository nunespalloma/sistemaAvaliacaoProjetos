/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.uff.sistemaAvaliacaoProjetos.view;

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
 * @author palloma
 */
@WebServlet("/CadastroProjetistaServlet")
public class CadastroProjetistaServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nome = req.getParameter("nomeProjetista");
        String email = req.getParameter("emailProjetista"); //pego o que tem no name do input da jsp Cadastro Projetista.
        String senha = req.getParameter("senhaProjetista");
        
        Projetista projetista = new Projetista(nome,email,senha);
        ProjetistaController projetistaController = new ProjetistaController();
        
        projetistaController.insertProjetista(projetista);
        
        //System.out.println(nome + "," + email + ","  + senha);
        
        
        
        req.getRequestDispatcher("Projetista.jsp").forward(req, resp);
        
    }
    
}
