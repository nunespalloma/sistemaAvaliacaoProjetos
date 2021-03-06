/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.uff.sistemaAvaliacaoProjetos.model.dao;

import br.com.uff.sistemaAvaliacaoProjetos.model.entity.Projetista;
import javax.persistence.NoResultException;

/**
 *
 * @author palloma
 */
public class ProjetistaDAO extends GenericDAO<Projetista>{
    public ProjetistaDAO() {
        super(Projetista.class, PersistenceManager.getEntityManager());
    }
    
    public boolean buscaVerificacaoLogin (Projetista projetista) {
        try {
            Projetista projetistaBD = (Projetista) manager.createQuery(
                    "SELECT p FROM Projetista p WHERE p.email = :email AND p.senha = :senha")
                    .setParameter("email", projetista.getEmail())
                    .setParameter("senha", projetista.getSenha())
                    .getSingleResult();
            
            return true;
        } catch (NoResultException nre) {
            return false;
        }
        
    }
    
    public Projetista buscaProjetistaPorLogin (Projetista projetista) {
        try {
            Projetista projetistaBD = (Projetista) manager.createQuery(
                    "SELECT p FROM Projetista p WHERE p.email = :email AND p.senha = :senha")
                    .setParameter("email", projetista.getEmail())
                    .setParameter("senha", projetista.getSenha())
                    .getSingleResult();
            
            return projetistaBD;
        } catch (NoResultException nre) {
            return null;
        }
        
    }
    
    public boolean buscaVerificacaoEmailCadastrado (Projetista projetista) {
        try {
            Projetista projetistaBD = (Projetista) manager.createQuery(
                    "SELECT p FROM Projetista p WHERE p.email = :email")
                    .setParameter("email", projetista.getEmail())
                    .getSingleResult();
            
            return true;
        } catch (NoResultException nre) {
            return false;
        }
        
    }
    
    public Projetista buscaProjetistaPorMatricula (String matricula) {
        try {
            Projetista projetistaBD = (Projetista) manager.createQuery(
                    "SELECT p FROM Projetista p WHERE p.matricula = :matricula")
                    .setParameter("matricula", matricula)
                    .getSingleResult();
            
            return projetistaBD;
        } catch (NoResultException nre) {
            return null;
        }
        
    }
    
}
