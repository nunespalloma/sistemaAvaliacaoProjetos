/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.uff.sistemaAvaliacaoProjetos.model.dao;

import br.com.uff.sistemaAvaliacaoProjetos.model.entity.Avaliador;
import br.com.uff.sistemaAvaliacaoProjetos.model.entity.Projeto;
import java.util.List;
import javax.persistence.NoResultException;

/**
 *
 * @author palloma
 */
public class AvaliadorDAO extends GenericDAO<Avaliador>{
    public AvaliadorDAO() {
        super(Avaliador.class, PersistenceManager.getEntityManager());
    }
    
    public boolean buscaVerificacaoLogin (Avaliador avaliador) {
        try {
            Avaliador avaliadorBD = (Avaliador) manager.createQuery(
                    "SELECT a FROM Avaliador a WHERE a.email = :email AND a.senha = :senha")
                    .setParameter("email", avaliador.getEmail())
                    .setParameter("senha", avaliador.getSenha())
                    .getSingleResult();
            
            return true;
        } catch (NoResultException nre) {
            return false;
        }
        
    }
    
    public Avaliador buscaAvaliadorPorLogin (Avaliador avaliador) {
        try {
            Avaliador avaliadorBD = (Avaliador) manager.createQuery(
                    "SELECT a FROM Avaliador a WHERE a.email = :email AND a.senha = :senha")
                    .setParameter("email", avaliador.getEmail())
                    .setParameter("senha", avaliador.getSenha())
                    .getSingleResult();
            
            return avaliadorBD;
        } catch (NoResultException nre) {
            return null;
        }
        
    }
    
    public boolean buscaVerificacaoEmailCadastrado (Avaliador avaliador) {
        try {
            Avaliador avaliadorBD = (Avaliador) manager.createQuery(
                    "SELECT a FROM Avaliador a WHERE a.email = :email")
                    .setParameter("email", avaliador.getEmail())
                    .getSingleResult();
            
            return true;
        } catch (NoResultException nre) {
            return false;
        }
        
    }
    
    public Avaliador buscarAvaliadorPorProjetoAvaliacao (Projeto projeto){
        try {
            Avaliador avaliadorBD = (Avaliador) manager.createQuery(
                    "SELECT a from Avaliador a where a.id = (SELECT distinct cap.avaliador.id FROM Projeto p join ControleAvaliadorProjetos cap on cap.projeto.id = :idProjeto)")
                    .setParameter("idProjeto", projeto.getId())
                    .getSingleResult();
            return avaliadorBD;
        } catch (NoResultException nre) {
            return null;
        }
    }
}
