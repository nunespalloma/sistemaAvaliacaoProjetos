/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.uff.sistemaAvaliacaoProjetos.controller;

import br.com.uff.sistemaAvaliacaoProjetos.model.dao.GenericDAO;
import br.com.uff.sistemaAvaliacaoProjetos.model.dao.PersistenceManager;
import br.com.uff.sistemaAvaliacaoProjetos.model.entity.Formulario;
import java.util.List;

/**
 *
 * @author palloma
 */
public class FormularioController {
    public static List<Formulario> listAllFormularios() {
        GenericDAO<Formulario> formularioDAO = PersistenceManager.createGenericDAO(Formulario.class);
        return formularioDAO.selectAll();
    }

    public static Formulario findFormulario(Formulario formulario) {
        GenericDAO<Formulario> formularioDAO = PersistenceManager.createGenericDAO(Formulario.class);
        return formularioDAO.select(formulario.getId());
    }

    public static void insertFormulario(Formulario formulario) {
        GenericDAO<Formulario> formularioDAO = PersistenceManager.createGenericDAO(Formulario.class);
        try {
            PersistenceManager.getTransaction().begin();
            formularioDAO.insert(formulario);
            PersistenceManager.getTransaction().commit();
        } catch (Exception e) {
            PersistenceManager.getTransaction().rollback();
            throw e;
        }
    }

    public static void updateFormulario(Formulario formulario) {
        GenericDAO<Formulario> formularioDAO = PersistenceManager.createGenericDAO(Formulario.class);

        try {
            PersistenceManager.getTransaction().begin();
            formularioDAO.update(formulario);
            PersistenceManager.getTransaction().commit();
        } catch (Exception e) {
            PersistenceManager.getTransaction().rollback();
            throw e;
        }
    }
}
