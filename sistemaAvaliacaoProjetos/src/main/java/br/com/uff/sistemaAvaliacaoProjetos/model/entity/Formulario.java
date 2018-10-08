/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.uff.sistemaAvaliacaoProjetos.model.entity;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author palloma
 */
@Entity
public class Formulario implements Serializable{
    //identificador pra inserir a classe no banco quando a mesma for serializada
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue
    private int id;
    
    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private Orientador orientador;
    
    @Column(nullable = false)
    private String nomeProjeto;
    
    @Column(nullable = false)
    private String areaOrigemProjeto;
    
    @Column(nullable = false)
    private String areaAtuacaoProjeto;
    
    @Column(nullable = false)
    private String destinacaoProjeto;
    
    @Column(nullable = false)
    private String tipoProjeto;
    
    @Column(length = 2000, nullable = false)
    private String resultadosContinuacaoProjeto;
    
    @Column(length = 2000, nullable = false)
    private String problemaProjeto;
    
    @Column(length = 2000, nullable = false)
    private String solucaoProjeto;
    
    @Column(length = 2000, nullable = false)
    private String resumoCurriculoOrientador;
    
    @Column(length = 2000, nullable = false)
    private String potencialProjeto;
    
    @Column(length = 2000, nullable = false)
    private String planoTrabalhoBolsista;
    
    Formulario(){
        
    }
    
    public Formulario(Orientador orientador, String nomeProjeto, String areaOrigemProjeto, String areaAtuacaoProjeto, String destinacaoProjeto, String tipoProjeto, String resultadosContinuacaoProjeto, String problemaProjeto, String solucaoProjeto, String resumoCurriculoOrientador, String potencialProjeto, String planoTrabalhoBolsista) {
        this.orientador = orientador;
        this.nomeProjeto = nomeProjeto;
        this.areaOrigemProjeto = areaOrigemProjeto;
        this.areaAtuacaoProjeto = areaAtuacaoProjeto;
        this.destinacaoProjeto = destinacaoProjeto;
        this.tipoProjeto = tipoProjeto;
        this.resultadosContinuacaoProjeto = resultadosContinuacaoProjeto;
        this.problemaProjeto = problemaProjeto;
        this.solucaoProjeto = solucaoProjeto;
        this.resumoCurriculoOrientador = resumoCurriculoOrientador;
        this.potencialProjeto = potencialProjeto;
        this.planoTrabalhoBolsista = planoTrabalhoBolsista;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Orientador getOrientador() {
        return orientador;
    }

    public void setOrientador(Orientador orientador) {
        this.orientador = orientador;
    }

    public String getNomeProjeto() {
        return nomeProjeto;
    }

    public void setNomeProjeto(String nomeProjeto) {
        this.nomeProjeto = nomeProjeto;
    }

    public String getAreaOrigemProjeto() {
        return areaOrigemProjeto;
    }

    public void setAreaOrigemProjeto(String areaOrigemProjeto) {
        this.areaOrigemProjeto = areaOrigemProjeto;
    }

    public String getAreaAtuacaoProjeto() {
        return areaAtuacaoProjeto;
    }

    public void setAreaAtuacaoProjeto(String areaAtuacaoProjeto) {
        this.areaAtuacaoProjeto = areaAtuacaoProjeto;
    }

    public String getDestinacaoProjeto() {
        return destinacaoProjeto;
    }

    public void setDestinacaoProjeto(String destinacaoProjeto) {
        this.destinacaoProjeto = destinacaoProjeto;
    }

    public String getTipoProjeto() {
        return tipoProjeto;
    }

    public void setTipoProjeto(String tipoProjeto) {
        this.tipoProjeto = tipoProjeto;
    }

    public String getResultadosContinuacaoProjeto() {
        return resultadosContinuacaoProjeto;
    }

    public void setResultadosContinuacaoProjeto(String resultadosContinuacaoProjeto) {
        this.resultadosContinuacaoProjeto = resultadosContinuacaoProjeto;
    }

    public String getProblemaProjeto() {
        return problemaProjeto;
    }

    public void setProblemaProjeto(String problemaProjeto) {
        this.problemaProjeto = problemaProjeto;
    }

    public String getSolucaoProjeto() {
        return solucaoProjeto;
    }

    public void setSolucaoProjeto(String solucaoProjeto) {
        this.solucaoProjeto = solucaoProjeto;
    }

    public String getResumoCurriculoOrientador() {
        return resumoCurriculoOrientador;
    }

    public void setResumoCurriculoOrientador(String resumoCurriculoOrientador) {
        this.resumoCurriculoOrientador = resumoCurriculoOrientador;
    }

    public String getPotencialProjeto() {
        return potencialProjeto;
    }

    public void setPotencialProjeto(String potencialProjeto) {
        this.potencialProjeto = potencialProjeto;
    }

    public String getPlanoTrabalhoBolsista() {
        return planoTrabalhoBolsista;
    }

    public void setPlanoTrabalhoBolsista(String planoTrabalhoBolsista) {
        this.planoTrabalhoBolsista = planoTrabalhoBolsista;
    }
    
}
