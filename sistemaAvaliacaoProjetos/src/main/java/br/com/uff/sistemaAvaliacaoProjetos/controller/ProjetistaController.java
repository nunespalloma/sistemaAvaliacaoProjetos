/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.uff.sistemaAvaliacaoProjetos.controller;

import br.com.uff.sistemaAvaliacaoProjetos.model.dao.GenericDAO;
import br.com.uff.sistemaAvaliacaoProjetos.model.dao.PersistenceManager;
import br.com.uff.sistemaAvaliacaoProjetos.model.dao.ProjetistaDAO;
import br.com.uff.sistemaAvaliacaoProjetos.model.entity.Projetista;
import java.util.List;

/**
 *
 * @author palloma
 */
public class ProjetistaController {
    public static List<Projetista> listAllProjetistas() {
        GenericDAO<Projetista> projetistaDAO = PersistenceManager.createGenericDAO(Projetista.class);
        return projetistaDAO.selectAll();
    }

    public static Projetista findProjetista(Projetista projetista) {
        GenericDAO<Projetista> projetistaDAO = PersistenceManager.createGenericDAO(Projetista.class);
        return projetistaDAO.select(projetista.getId());
    }
    
    public static boolean buscaVerificacaoLogin (Projetista projetista) {
        ProjetistaDAO projetistaDAO = new ProjetistaDAO();
        return projetistaDAO.buscaVerificacaoLogin(projetista);
    }
    
    public static boolean buscaVerificacaoEmailCadastrado (Projetista projetista) {
        ProjetistaDAO projetistaDAO = new ProjetistaDAO();
        return projetistaDAO.buscaVerificacaoEmailCadastrado(projetista);
    }
    
    public static void insertProjetista(Projetista projetista) {
        GenericDAO<Projetista> projetistaDAO = PersistenceManager.createGenericDAO(Projetista.class);
        try {
            PersistenceManager.getTransaction().begin();
            projetistaDAO.insert(projetista);
            PersistenceManager.getTransaction().commit();
        } catch (Exception e) {
            PersistenceManager.getTransaction().rollback();
            throw e;
        }
    }

    public static void updateProjetista(Projetista projetista) {
        GenericDAO<Projetista> projetistaDAO = PersistenceManager.createGenericDAO(Projetista.class);

        try {
            PersistenceManager.getTransaction().begin();
            projetistaDAO.update(projetista);
            PersistenceManager.getTransaction().commit();
        } catch (Exception e) {
            PersistenceManager.getTransaction().rollback();
            throw e;
        }
    }
}
