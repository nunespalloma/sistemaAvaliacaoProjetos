package br.com.uff.sistemaAvaliacaoProjetos.model.dao;

import java.util.List;

import javax.persistence.EntityManager;

//CRUD
public class GenericDAO<T> {

    protected EntityManager manager;
    protected Class<T> t;

    GenericDAO(Class<T> t, EntityManager manager) {
        this.t = t;
        this.manager = manager;
    }

    public List<T> selectAll() {
        List<T> lista = manager.createQuery("from " + t.getName()).getResultList();
        return lista;
    }

    public T select(Integer id) {
        return manager.find(t, id);
    }

    public void insert(T entidade) {
        manager.persist(entidade);
    }

    public void remove(T entidade) {
        manager.remove(entidade);
    }

    public void update(T entidade) {
        manager.merge(entidade);
    }

}
