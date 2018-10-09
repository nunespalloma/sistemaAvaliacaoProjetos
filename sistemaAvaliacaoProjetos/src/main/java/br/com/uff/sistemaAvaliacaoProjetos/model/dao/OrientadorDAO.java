/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.uff.sistemaAvaliacaoProjetos.model.dao;

import br.com.uff.sistemaAvaliacaoProjetos.model.entity.Orientador;
import javax.persistence.NoResultException;

/**
 *
 * @author palloma
 */
public class OrientadorDAO extends GenericDAO<Orientador>{
    public OrientadorDAO() {
        super(Orientador.class, PersistenceManager.getEntityManager());
    }
    
    public boolean buscaVerificacaoLogin (Orientador orientador) {
        try {
            Orientador orientadorBD = (Orientador) manager.createQuery(
                    "SELECT o FROM Orientador o WHERE o.email = :email AND o.senha = :senha")
                    .setParameter("email", orientador.getEmail())
                    .setParameter("senha", orientador.getSenha())
                    .getSingleResult();
            
            return true;
        } catch (NoResultException nre) {
            return false;
        }
        
    }
    
    public Orientador buscaOrientadorPorLogin (Orientador orientador) {
        try {
            Orientador orientadorBD = (Orientador) manager.createQuery(
                    "SELECT o FROM Orientador o WHERE o.email = :email AND o.senha = :senha")
                    .setParameter("email", orientador.getEmail())
                    .setParameter("senha", orientador.getSenha())
                    .getSingleResult();
            
            return orientadorBD;
        } catch (NoResultException nre) {
            return null;
        }
        
    }
    
    public boolean buscaVerificacaoEmailCadastrado (Orientador orientador) {
        try {
            Orientador orientadorBD = (Orientador) manager.createQuery(
                    "SELECT o FROM Orientador o WHERE o.email = :email")
                    .setParameter("email", orientador.getEmail())
                    .getSingleResult();
            
            return true;
        } catch (NoResultException nre) {
            return false;
        }
        
    }
}
