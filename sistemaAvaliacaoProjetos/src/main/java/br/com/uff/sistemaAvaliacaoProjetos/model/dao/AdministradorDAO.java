/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.uff.sistemaAvaliacaoProjetos.model.dao;

import br.com.uff.sistemaAvaliacaoProjetos.model.entity.Administrador;
import javax.persistence.NoResultException;

/**
 *
 * @author pallo
 */
public class AdministradorDAO extends GenericDAO<Administrador>{
    public AdministradorDAO() {
        super(Administrador.class, PersistenceManager.getEntityManager());
    }
    
    public boolean buscaVerificacaoLogin (Administrador administrador) {
        try {
            Administrador administradorBD = (Administrador) manager.createQuery(
                    "SELECT a FROM Administrador a WHERE a.email = :email AND a.senha = :senha")
                    .setParameter("email", administrador.getEmail())
                    .setParameter("senha", administrador.getSenha())
                    .getSingleResult();
            
            return true;
        } catch (NoResultException nre) {
            return false;
        }
        
    }
    
    public Administrador buscaAdministradorPorLogin (Administrador administrador) {
        try {
            Administrador administradorBD = (Administrador) manager.createQuery(
                    "SELECT a FROM Administrador a WHERE a.email = :email AND a.senha = :senha")
                    .setParameter("email", administrador.getEmail())
                    .setParameter("senha", administrador.getSenha())
                    .getSingleResult();
            
            return administradorBD;
        } catch (NoResultException nre) {
            return null;
        }
        
    }
    
    public boolean buscaVerificacaoEmailCadastrado (Administrador administrador) {
        try {
            Administrador administradorBD = (Administrador) manager.createQuery(
                    "SELECT a FROM Administrador a WHERE a.email = :email")
                    .setParameter("email", administrador.getEmail())
                    .getSingleResult();
            
            return true;
        } catch (NoResultException nre) {
            return false;
        }
        
    }
}
