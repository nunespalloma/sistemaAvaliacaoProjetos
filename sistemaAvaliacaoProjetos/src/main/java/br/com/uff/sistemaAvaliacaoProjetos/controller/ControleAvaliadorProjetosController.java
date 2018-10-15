/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.uff.sistemaAvaliacaoProjetos.controller;

import br.com.uff.sistemaAvaliacaoProjetos.model.dao.GenericDAO;
import br.com.uff.sistemaAvaliacaoProjetos.model.dao.PersistenceManager;
import br.com.uff.sistemaAvaliacaoProjetos.model.entity.ControleAvaliadorProjetos;
import java.util.List;

/**
 *
 * @author pallo
 */
public class ControleAvaliadorProjetosController {
    public static List<ControleAvaliadorProjetos> listAllControleAvaliadorProjetoss() {
        GenericDAO<ControleAvaliadorProjetos> controleAvaliadorProjetosDAO = PersistenceManager.createGenericDAO(ControleAvaliadorProjetos.class);
        return controleAvaliadorProjetosDAO.selectAll();
    }

    public static ControleAvaliadorProjetos findControleAvaliadorProjetos(ControleAvaliadorProjetos controleAvaliadorProjetos) {
        GenericDAO<ControleAvaliadorProjetos> controleAvaliadorProjetosDAO = PersistenceManager.createGenericDAO(ControleAvaliadorProjetos.class);
        return controleAvaliadorProjetosDAO.select(controleAvaliadorProjetos.getId());
    }

    public static void insertControleAvaliadorProjetos(ControleAvaliadorProjetos controleAvaliadorProjetos) {
        GenericDAO<ControleAvaliadorProjetos> controleAvaliadorProjetosDAO = PersistenceManager.createGenericDAO(ControleAvaliadorProjetos.class);
        try {
            PersistenceManager.getTransaction().begin();
            controleAvaliadorProjetosDAO.insert(controleAvaliadorProjetos);
            PersistenceManager.getTransaction().commit();
        } catch (Exception e) {
            PersistenceManager.getTransaction().rollback();
            throw e;
        }
    }

    public static void updateControleAvaliadorProjetos(ControleAvaliadorProjetos controleAvaliadorProjetos) {
        GenericDAO<ControleAvaliadorProjetos> controleAvaliadorProjetosDAO = PersistenceManager.createGenericDAO(ControleAvaliadorProjetos.class);

        try {
            PersistenceManager.getTransaction().begin();
            controleAvaliadorProjetosDAO.update(controleAvaliadorProjetos);
            PersistenceManager.getTransaction().commit();
        } catch (Exception e) {
            PersistenceManager.getTransaction().rollback();
            throw e;
        }
    }
    
}
