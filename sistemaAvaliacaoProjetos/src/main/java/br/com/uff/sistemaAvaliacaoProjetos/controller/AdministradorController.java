/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.uff.sistemaAvaliacaoProjetos.controller;

import br.com.uff.sistemaAvaliacaoProjetos.model.dao.AdministradorDAO;
import br.com.uff.sistemaAvaliacaoProjetos.model.dao.GenericDAO;
import br.com.uff.sistemaAvaliacaoProjetos.model.dao.PersistenceManager;
import br.com.uff.sistemaAvaliacaoProjetos.model.entity.Administrador;
import java.util.List;

/**
 *
 * @author pallo
 */
public class AdministradorController {
    public static List<Administrador> listAllAdministradores() {
        GenericDAO<Administrador> administradorDAO = PersistenceManager.createGenericDAO(Administrador.class);
        return administradorDAO.selectAll();
    }

    public static Administrador findAdministrador(Administrador administrador) {
        GenericDAO<Administrador> administradorDAO = PersistenceManager.createGenericDAO(Administrador.class);
        return administradorDAO.select(administrador.getId());
    }
    
    public static boolean buscaVerificacaoLogin (Administrador administrador) {
        AdministradorDAO administradorDAO = new AdministradorDAO();
        return administradorDAO.buscaVerificacaoLogin(administrador);
    }
    
    public static void insertAdministrador(Administrador administrador) {
        GenericDAO<Administrador> administradorDAO = PersistenceManager.createGenericDAO(Administrador.class);
        try {
            PersistenceManager.getTransaction().begin();
            administradorDAO.insert(administrador);
            PersistenceManager.getTransaction().commit();
        } catch (Exception e) {
            PersistenceManager.getTransaction().rollback();
            throw e;
        }
    }

    public static void updateAdministrador(Administrador administrador) {
        GenericDAO<Administrador> administradorDAO = PersistenceManager.createGenericDAO(Administrador.class);

        try {
            PersistenceManager.getTransaction().begin();
            administradorDAO.update(administrador);
            PersistenceManager.getTransaction().commit();
        } catch (Exception e) {
            PersistenceManager.getTransaction().rollback();
            throw e;
        }
    }
}
