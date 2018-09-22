/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.uff.sistemaAvaliacaoProjetos.model.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

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
    
    @Column(nullable = false)
    private String nomeOrientador;
    
    @Column(nullable = false)
    private String emailOrientador;
    
    @Column(nullable = false)
    private String matriculaSIAPEOrientador;
    
    @Column(nullable = false)
    private String cpfOrientador ;
    
    @Column(nullable = false)
    private String identidadeOrientador;
    
    @Column(nullable = false)
    private String telefoneOrientador;
    
    @Column(nullable = false)
    private String linkLattesOrientador;
    
    @Column(nullable = false)
    private String departamentoOrientador;
    
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
    
    public Formulario(String nomeOrientador, String emailOrientador, String matriculaSIAPEOrientador, String cpfOrientador, String identidadeOrientador, String telefoneOrientador, String linkLattesOrientador, String departamentoOrientador, String nomeProjeto, String areaOrigemProjeto, String areaAtuacaoProjeto, String destinacaoProjeto, String tipoProjeto, String resultadosContinuacaoProjeto, String problemaProjeto, String solucaoProjeto, String resumoCurriculoOrientador, String potencialProjeto, String planoTrabalhoBolsista) {
        this.nomeOrientador = nomeOrientador;
        this.emailOrientador = emailOrientador;
        this.matriculaSIAPEOrientador = matriculaSIAPEOrientador;
        this.cpfOrientador = cpfOrientador;
        this.identidadeOrientador = identidadeOrientador;
        this.telefoneOrientador = telefoneOrientador;
        this.linkLattesOrientador = linkLattesOrientador;
        this.departamentoOrientador = departamentoOrientador;
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

    public String getNomeOrientador() {
        return nomeOrientador;
    }

    public void setNomeOrientador(String nomeOrientador) {
        this.nomeOrientador = nomeOrientador;
    }

    public String getEmailOrientador() {
        return emailOrientador;
    }

    public void setEmailOrientador(String emailOrientador) {
        this.emailOrientador = emailOrientador;
    }

    public String getMatriculaSIAPEOrientador() {
        return matriculaSIAPEOrientador;
    }

    public void setMatriculaSIAPEOrientador(String matriculaSIAPEOrientador) {
        this.matriculaSIAPEOrientador = matriculaSIAPEOrientador;
    }

    public String getCpfOrientador() {
        return cpfOrientador;
    }

    public void setCpfOrientador(String cpfOrientador) {
        this.cpfOrientador = cpfOrientador;
    }

    public String getIdentidadeOrientador() {
        return identidadeOrientador;
    }

    public void setIdentidadeOrientador(String identidadeOrientador) {
        this.identidadeOrientador = identidadeOrientador;
    }

    public String getTelefoneOrientador() {
        return telefoneOrientador;
    }

    public void setTelefoneOrientador(String telefoneOrientador) {
        this.telefoneOrientador = telefoneOrientador;
    }

    public String getLinkLattesOrientador() {
        return linkLattesOrientador;
    }

    public void setLinkLattesOrientador(String linkLattesOrientador) {
        this.linkLattesOrientador = linkLattesOrientador;
    }

    public String getDepartamentoOrientador() {
        return departamentoOrientador;
    }

    public void setDepartamentoOrientador(String departamentoOrientador) {
        this.departamentoOrientador = departamentoOrientador;
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
