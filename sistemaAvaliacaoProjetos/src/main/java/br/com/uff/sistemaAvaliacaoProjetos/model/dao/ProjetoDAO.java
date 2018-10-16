/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.uff.sistemaAvaliacaoProjetos.model.dao;

import br.com.uff.sistemaAvaliacaoProjetos.model.entity.Administrador;
import br.com.uff.sistemaAvaliacaoProjetos.model.entity.Avaliador;
import br.com.uff.sistemaAvaliacaoProjetos.model.entity.Orientador;
import br.com.uff.sistemaAvaliacaoProjetos.model.entity.Projetista;
import br.com.uff.sistemaAvaliacaoProjetos.model.entity.Projeto;
import java.util.ArrayList;
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
    
    public List<Projeto> buscarProjetosEnviadosParaAvaliacao (Administrador administrador) {
        try {
            List<Integer> idProjetos = (List<Integer>) manager.createQuery(
                    "SELECT distinct cap.projeto.id FROM Administrador a join ControleAvaliadorProjetos cap on cap.administrador.id = :idAdministrador")
                    .setParameter("idAdministrador", administrador.getId())
                    .getResultList();
            if (idProjetos == null || idProjetos.isEmpty()) {
                return null;
            }else {
                List<Projeto> projetosBD = new ArrayList();
                for (int i = 0; i < idProjetos.size(); i++) {
                    Projeto projeto = (Projeto) manager.createQuery(
                    "SELECT p FROM Projeto p WHERE p.id = :idProjeto and p.enviadoAvaliacao = true")
                    .setParameter("idProjeto", idProjetos.get(i))
                    .getSingleResult();
                    projetosBD.add(projeto);
                }
                return projetosBD;
            }
        } catch (NoResultException nre) {
            return null;
        }
    }
    
    public List<Projeto> buscarProjetosParaAvaliacao (Avaliador avaliador) {
        try {
            List<Integer> idProjetos = (List<Integer>) manager.createQuery(
                    "SELECT distinct cap.projeto.id FROM Avaliador a join ControleAvaliadorProjetos cap on cap.avaliador.id = :idAvaliador")
                    .setParameter("idAvaliador", avaliador.getId())
                    .getResultList();
            if (idProjetos == null || idProjetos.isEmpty()) {
                return null;
            }else {
                List<Projeto> projetosBD = new ArrayList();
                for (int i = 0; i < idProjetos.size(); i++) {
                    Projeto projeto = (Projeto) manager.createQuery(
                    "SELECT p FROM Projeto p WHERE p.id = :idProjeto and p.avaliado = false")
                    .setParameter("idProjeto", idProjetos.get(i))
                    .getSingleResult();
                    projetosBD.add(projeto);
                }
                return projetosBD;
            }
        } catch (NoResultException nre) {
            return null;
        }
    }
    
    public List<Projeto> buscarProjetosAvaliados (Avaliador avaliador) {
        try {
            List<Integer> idProjetos = (List<Integer>) manager.createQuery(
                    "SELECT distinct cap.projeto.id FROM Avaliador a join ControleAvaliadorProjetos cap on cap.avaliador.id = :idAvaliador")
                    .setParameter("idAvaliador", avaliador.getId())
                    .getResultList();
            if (idProjetos == null || idProjetos.isEmpty()) {
                return null;
            }else {
                List<Projeto> projetosBD = new ArrayList();
                for (int i = 0; i < idProjetos.size(); i++) {
                    Projeto projeto = (Projeto) manager.createQuery(
                    "SELECT p FROM Projeto p WHERE p.id = :idProjeto and p.avaliado = true")
                    .setParameter("idProjeto", idProjetos.get(i))
                    .getSingleResult();
                    projetosBD.add(projeto);
                }
                return projetosBD;
            }
        } catch (NoResultException nre) {
            return null;
        }
    }
    
    public List<Projeto> buscarProjetosAvaliados (Projetista projetista){
        try {
            List<Projeto> projetosBD = (List<Projeto>) manager.createQuery(
                    "SELECT p from Projeto p where p.avaliado = true and p.projetista.id = :idProjetista")
                    .setParameter("idProjetista", projetista.getId())
                    .getResultList();
            return projetosBD;
        } catch (NoResultException nre) {
            return null;
        }
    }
    
    public List<Projeto> buscarProjetosAvaliados (Orientador orientador){
        try {
            List<Projeto> projetosBD = (List<Projeto>) manager.createQuery(
                    "SELECT p from Projeto p where p.avaliado = true and p.orientador.id = :idOrientador")
                    .setParameter("idOrientador", orientador.getId())
                    .getResultList();
            return projetosBD;
        } catch (NoResultException nre) {
            return null;
        }
    }
    
    public List<Projeto> buscarProjetosNaoAvaliados (Projetista projetista){
        try {
            List<Projeto> projetosBD = (List<Projeto>) manager.createQuery(
                    "SELECT p from Projeto p where p.avaliado = false and p.projetista.id = :idProjetista")
                    .setParameter("idProjetista", projetista.getId())
                    .getResultList();
            return projetosBD;
        } catch (NoResultException nre) {
            return null;
        }
    }
    
    public List<Projeto> buscarProjetosNaoAvaliados (Orientador orientador){
        try {
            List<Projeto> projetosBD = (List<Projeto>) manager.createQuery(
                    "SELECT p from Projeto p where p.avaliado = false and p.orientador.id = :idOrientador")
                    .setParameter("idOrientador", orientador.getId())
                    .getResultList();
            return projetosBD;
        } catch (NoResultException nre) {
            return null;
        }
    }
}
