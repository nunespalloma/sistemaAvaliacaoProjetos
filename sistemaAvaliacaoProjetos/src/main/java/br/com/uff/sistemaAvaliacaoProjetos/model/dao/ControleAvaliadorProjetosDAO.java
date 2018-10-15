/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.uff.sistemaAvaliacaoProjetos.model.dao;

import br.com.uff.sistemaAvaliacaoProjetos.model.entity.ControleAvaliadorProjetos;

/**
 *
 * @author pallo
 */
public class ControleAvaliadorProjetosDAO extends GenericDAO<ControleAvaliadorProjetos>{
    public ControleAvaliadorProjetosDAO() {
        super(ControleAvaliadorProjetos.class, PersistenceManager.getEntityManager());
    }
}
