/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.uff.sistemaAvaliacaoProjetos.model.dao;

import br.com.uff.sistemaAvaliacaoProjetos.model.entity.Projeto;
import java.util.List;
import javax.persistence.NoResultException;

/**
 *
 * @author palloma
 */
public class ProjetoDAO extends GenericDAO<Projeto>{
    public ProjetoDAO() {
        super(Projeto.class, PersistenceManager.getEntityManager());
    }
    
    public List<Projeto> buscarProjetosParaSeresEnviadosAvaliacao () {
        try {
            List<Projeto> projetosBD = (List<Projeto>) manager.createQuery(
                    "SELECT p FROM Projeto p WHERE p.submetido = true AND p.enviadoAvaliacao = false")
                    .getResultList();
            return projetosBD;
        } catch (NoResultException nre) {
            return null;
        }
    }
}
