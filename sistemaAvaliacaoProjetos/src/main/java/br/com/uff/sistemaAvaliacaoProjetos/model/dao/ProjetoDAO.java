/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.uff.sistemaAvaliacaoProjetos.model.dao;

import br.com.uff.sistemaAvaliacaoProjetos.model.entity.Projeto;

/**
 *
 * @author palloma
 */
public class ProjetoDAO extends GenericDAO<Projeto>{
    public ProjetoDAO() {
        super(Projeto.class, PersistenceManager.getEntityManager());
    }
}
