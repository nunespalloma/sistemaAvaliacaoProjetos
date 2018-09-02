/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.uff.sistemaAvaliacaoProjetos.controller;

import br.com.uff.sistemaAvaliacaoProjetos.model.dao.GenericDAO;
import br.com.uff.sistemaAvaliacaoProjetos.model.dao.PersistenceManager;
import br.com.uff.sistemaAvaliacaoProjetos.model.entity.Orientador;
import java.util.List;

/**
 *
 * @author palloma
 */
public class OrientadorController {
    public static List<Orientador> listAllOrientadores() {
        GenericDAO<Orientador> orientadorDAO = PersistenceManager.createGenericDAO(Orientador.class);
        return orientadorDAO.selectAll();
    }

    public static Orientador findOrientador(Orientador orientador) {
        GenericDAO<Orientador> orientadorDAO = PersistenceManager.createGenericDAO(Orientador.class);
        return orientadorDAO.select(orientador.getId());
    }

    public static void insertOrientador(Orientador orientador) {
        GenericDAO<Orientador> orientadorDAO = PersistenceManager.createGenericDAO(Orientador.class);
        try {
            PersistenceManager.getTransaction().begin();
            orientadorDAO.insert(orientador);
            PersistenceManager.getTransaction().commit();
        } catch (Exception e) {
            PersistenceManager.getTransaction().rollback();
            throw e;
        }
    }

    public static void updateOrientador(Orientador orientador) {
        GenericDAO<Orientador> orientadorDAO = PersistenceManager.createGenericDAO(Orientador.class);

        try {
            PersistenceManager.getTransaction().begin();
            orientadorDAO.update(orientador);
            PersistenceManager.getTransaction().commit();
        } catch (Exception e) {
            PersistenceManager.getTransaction().rollback();
            throw e;
        }
    }
}
