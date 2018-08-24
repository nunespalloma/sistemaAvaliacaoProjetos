/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.uff.sistemaAvaliacaoProjetos.model.dao;

import br.com.uff.sistemaAvaliacaoProjetos.model.entity.Orientador;

/**
 *
 * @author palloma
 */
public class OrientadorDAO extends GenericDAO<Orientador>{
    public OrientadorDAO() {
        super(Orientador.class, PersistenceManager.getEntityManager());
    }
}
