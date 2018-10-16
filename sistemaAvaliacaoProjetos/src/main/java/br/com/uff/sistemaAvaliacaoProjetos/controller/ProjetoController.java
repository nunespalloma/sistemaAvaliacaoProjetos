/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.uff.sistemaAvaliacaoProjetos.controller;

import br.com.uff.sistemaAvaliacaoProjetos.model.dao.GenericDAO;
import br.com.uff.sistemaAvaliacaoProjetos.model.dao.PersistenceManager;
import br.com.uff.sistemaAvaliacaoProjetos.model.dao.ProjetoDAO;
import br.com.uff.sistemaAvaliacaoProjetos.model.entity.Administrador;
import br.com.uff.sistemaAvaliacaoProjetos.model.entity.Avaliador;
import br.com.uff.sistemaAvaliacaoProjetos.model.entity.Orientador;
import br.com.uff.sistemaAvaliacaoProjetos.model.entity.Projetista;
import br.com.uff.sistemaAvaliacaoProjetos.model.entity.Projeto;
import java.util.List;

/**
 *
 * @author palloma
 */
public class ProjetoController {
    public static List<Projeto> listAllProjetos() {
        GenericDAO<Projeto> projetoDAO = PersistenceManager.createGenericDAO(Projeto.class);
        return projetoDAO.selectAll();
    }

    public static Projeto findProjeto(Projeto projeto) {
        GenericDAO<Projeto> projetoDAO = PersistenceManager.createGenericDAO(Projeto.class);
        return projetoDAO.select(projeto.getId());
    }
    
    public static List<Projeto> buscarProjetosParaSeresEnviadosAvaliacao () {
        ProjetoDAO projetoDAO = new ProjetoDAO();
        return projetoDAO.buscarProjetosParaSeresEnviadosAvaliacao();
    }
    
    public static List<Projeto> buscarProjetosEnviadosParaAvaliacao (Administrador administrador) {
        ProjetoDAO projetoDAO = new ProjetoDAO();
        return projetoDAO.buscarProjetosEnviadosParaAvaliacao(administrador);
    }
    
    public static List<Projeto> buscarProjetosParaAvaliacao (Avaliador avaliador) {
        ProjetoDAO projetoDAO = new ProjetoDAO();
        return projetoDAO.buscarProjetosParaAvaliacao(avaliador);
    }
    
    public static List<Projeto> buscarProjetosAvaliados (Avaliador avaliador) {
        ProjetoDAO projetoDAO = new ProjetoDAO();
        return projetoDAO.buscarProjetosAvaliados(avaliador);
    }
    
    public static List<Projeto> buscarProjetosAvaliados (Projetista projetista){
        ProjetoDAO projetoDAO = new ProjetoDAO();
        return projetoDAO.buscarProjetosAvaliados(projetista);
    }
    
    public static List<Projeto> buscarProjetosAvaliados (Orientador orientador){
        ProjetoDAO projetoDAO = new ProjetoDAO();
        return projetoDAO.buscarProjetosAvaliados(orientador);
    }
    
    public static List<Projeto> buscarProjetosNaoAvaliados (Projetista projetista){
        ProjetoDAO projetoDAO = new ProjetoDAO();
        return projetoDAO.buscarProjetosNaoAvaliados(projetista);
    }
    
    public static List<Projeto> buscarProjetosNaoAvaliados (Orientador orientador){
        ProjetoDAO projetoDAO = new ProjetoDAO();
        return projetoDAO.buscarProjetosNaoAvaliados(orientador);
    }
    
    public static void insertProjeto(Projeto projeto) {
        GenericDAO<Projeto> projetoDAO = PersistenceManager.createGenericDAO(Projeto.class);
        try {
            PersistenceManager.getTransaction().begin();
            projetoDAO.insert(projeto);
            PersistenceManager.getTransaction().commit();
        } catch (Exception e) {
            PersistenceManager.getTransaction().rollback();
            throw e;
        }
    }

    public static void updateProjeto(Projeto projeto) {
        GenericDAO<Projeto> projetoDAO = PersistenceManager.createGenericDAO(Projeto.class);

        try {
            PersistenceManager.getTransaction().begin();
            projetoDAO.update(projeto);
            PersistenceManager.getTransaction().commit();
        } catch (Exception e) {
            PersistenceManager.getTransaction().rollback();
            throw e;
        }
    }
}
