/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.uff.sistemaAvaliacaoProjetos.controller;

import br.com.uff.sistemaAvaliacaoProjetos.model.dao.GenericDAO;
import br.com.uff.sistemaAvaliacaoProjetos.model.dao.PersistenceManager;
import br.com.uff.sistemaAvaliacaoProjetos.model.entity.Avaliador;
import java.util.List;

/**
 *
 * @author palloma
 */
public class AvaliadorController {
    public static List<Avaliador> listAllAvaliadores() {
        GenericDAO<Avaliador> avaliadorDAO = PersistenceManager.createGenericDAO(Avaliador.class);
        return avaliadorDAO.selectAll();
    }

    public static Avaliador findAvaliador(Avaliador avaliador) {
        GenericDAO<Avaliador> avaliadorDAO = PersistenceManager.createGenericDAO(Avaliador.class);
        return avaliadorDAO.select(avaliador.getId());
    }

    public static void insertAvaliador(Avaliador avaliador) {
        GenericDAO<Avaliador> avaliadorDAO = PersistenceManager.createGenericDAO(Avaliador.class);
        try {
            PersistenceManager.getTransaction().begin();
            avaliadorDAO.insert(avaliador);
            PersistenceManager.getTransaction().commit();
        } catch (Exception e) {
            PersistenceManager.getTransaction().rollback();
            throw e;
        }
    }

    public static void updateAvaliador(Avaliador avaliador) {
        GenericDAO<Avaliador> avaliadorDAO = PersistenceManager.createGenericDAO(Avaliador.class);

        try {
            PersistenceManager.getTransaction().begin();
            avaliadorDAO.update(avaliador);
            PersistenceManager.getTransaction().commit();
        } catch (Exception e) {
            PersistenceManager.getTransaction().rollback();
            throw e;
        }
    }
}