/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.uff.sistemaAvaliacaoProjetos.model.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
//import javax.persistence.OneToMany;
//import javax.persistence.OneToOne;

/**
 *
 * @author palloma
 */

@Entity
public class Projeto implements Serializable{
    
    //identificador pra inserir a classe no banco quando a mesma for serializada
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue
    private int id;
    
    @Column(nullable = false)
    private String nome;
    
    @Column(length = 2000,nullable = false)
    private String descricao;
    
    @Column(nullable = false)
    private String duracao;
    
    @Column(nullable = false)
    private String areaOrigemProjeto;
    
    @Column(nullable = true)
    private String descricaoMultidisciplinar;
    
    @Column(nullable = false)
    private String areaAtuacaoProjeto;
    
    @Column(nullable = false)
    private String destinacaoProjeto;
    
    @Column(nullable = false)
    private String tipoProjeto;
    
    @Column(length = 2000, nullable = true)
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
    
    @Column(nullable = false)
    private boolean requisitoRelatoriosParciais;
    
    @Column(nullable = false)
    private boolean requisitoTarefasDesenvolvimento;
    
    @Column(nullable = false)
    private boolean requisitoApresentacaoResultados;
    
    @Column(nullable = false)
    private boolean submetido;
    
    @Column(nullable = false)
    private boolean enviadoAvaliacao;
    
    @Column(nullable = false)
    private boolean avaliado;
    
    @Column(length = 2000 , nullable = true)
    private String avaliacao;
    
    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private Orientador orientador;
    
    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private Projetista projetista;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "projeto")
    private List<Atividade> atividades;
    //private Formulario formulario;
    
    public Projeto(){
        
    }

    public Projeto(String nome, String descricao, String duracao, String areaOrigemProjeto, String descricaoMultidisciplinar, String areaAtuacaoProjeto, String destinacaoProjeto, String tipoProjeto, String resultadosContinuacaoProjeto, String problemaProjeto, String solucaoProjeto, String resumoCurriculoOrientador, String potencialProjeto, String planoTrabalhoBolsista, boolean requisitoRelatoriosParciais, boolean requisitoTarefasDesenvolvimento, boolean requisitoApresentacaoResultados, Orientador orientador, Projetista projetista, List<Atividade> atividades) {
        this.nome = nome;
        this.descricao = descricao;
        this.duracao = duracao;
        this.areaOrigemProjeto = areaOrigemProjeto;
        this.descricaoMultidisciplinar = descricaoMultidisciplinar;
        this.areaAtuacaoProjeto = areaAtuacaoProjeto;
        this.destinacaoProjeto = destinacaoProjeto;
        this.tipoProjeto = tipoProjeto;
        this.resultadosContinuacaoProjeto = resultadosContinuacaoProjeto;
        this.problemaProjeto = problemaProjeto;
        this.solucaoProjeto = solucaoProjeto;
        this.resumoCurriculoOrientador = resumoCurriculoOrientador;
        this.potencialProjeto = potencialProjeto;
        this.planoTrabalhoBolsista = planoTrabalhoBolsista;
        this.requisitoRelatoriosParciais = requisitoRelatoriosParciais;
        this.requisitoTarefasDesenvolvimento = requisitoTarefasDesenvolvimento;
        this.requisitoApresentacaoResultados = requisitoApresentacaoResultados;
        this.orientador = orientador;
        this.projetista = projetista;
        this.atividades = atividades;
    }

    public Projeto(String nome, String descricao, String duracao, String areaOrigemProjeto, String descricaoMultidisciplinar, String areaAtuacaoProjeto, String destinacaoProjeto, String tipoProjeto, String resultadosContinuacaoProjeto, String problemaProjeto, String solucaoProjeto, String resumoCurriculoOrientador, String potencialProjeto, String planoTrabalhoBolsista, boolean submetido, boolean enviadoAvaliacao, boolean avaliado, String avaliacao, Orientador orientador, Projetista projetista, List<Atividade> atividades) {
        this.nome = nome;
        this.descricao = descricao;
        this.duracao = duracao;
        this.areaOrigemProjeto = areaOrigemProjeto;
        this.descricaoMultidisciplinar = descricaoMultidisciplinar;
        this.areaAtuacaoProjeto = areaAtuacaoProjeto;
        this.destinacaoProjeto = destinacaoProjeto;
        this.tipoProjeto = tipoProjeto;
        this.resultadosContinuacaoProjeto = resultadosContinuacaoProjeto;
        this.problemaProjeto = problemaProjeto;
        this.solucaoProjeto = solucaoProjeto;
        this.resumoCurriculoOrientador = resumoCurriculoOrientador;
        this.potencialProjeto = potencialProjeto;
        this.planoTrabalhoBolsista = planoTrabalhoBolsista;
        this.submetido = submetido;
        this.enviadoAvaliacao = enviadoAvaliacao;
        this.avaliado = avaliado;
        this.avaliacao = avaliacao;
        this.orientador = orientador;
        this.projetista = projetista;
        this.atividades = atividades;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public boolean isRequisitoRelatoriosParciais() {
        return requisitoRelatoriosParciais;
    }

    public void setRequisitoRelatoriosParciais(boolean requisitoRelatoriosParciais) {
        this.requisitoRelatoriosParciais = requisitoRelatoriosParciais;
    }

    public boolean isRequisitoTarefasDesenvolvimento() {
        return requisitoTarefasDesenvolvimento;
    }

    public void setRequisitoTarefasDesenvolvimento(boolean requisitoTarefasDesenvolvimento) {
        this.requisitoTarefasDesenvolvimento = requisitoTarefasDesenvolvimento;
    }

    public boolean isRequisitoApresentacaoResultados() {
        return requisitoApresentacaoResultados;
    }

    public void setRequisitoApresentacaoResultados(boolean requisitoApresentacaoResultados) {
        this.requisitoApresentacaoResultados = requisitoApresentacaoResultados;
    }

    public boolean isSubmetido() {
        return submetido;
    }

    public void setSubmetido(boolean submetido) {
        this.submetido = submetido;
    }

    public boolean isEnviadoAvaliacao() {
        return enviadoAvaliacao;
    }

    public void setEnviadoAvaliacao(boolean enviadoAvaliacao) {
        this.enviadoAvaliacao = enviadoAvaliacao;
    }

    public boolean isAvaliado() {
        return avaliado;
    }

    public void setAvaliado(boolean avaliado) {
        this.avaliado = avaliado;
    }

    public String getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(String avaliacao) {
        this.avaliacao = avaliacao;
    }
    
    public String getAreaOrigemProjeto() {
        return areaOrigemProjeto;
    }

    public void setAreaOrigemProjeto(String areaOrigemProjeto) {
        this.areaOrigemProjeto = areaOrigemProjeto;
    }

    public String getDescricaoMultidisciplinar() {
        return descricaoMultidisciplinar;
    }

    public void setDescricaoMultidisciplinar(String descricaoMultidisciplinar) {
        this.descricaoMultidisciplinar = descricaoMultidisciplinar;
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

    public Orientador getOrientador() {
        return orientador;
    }

    public void setOrientador(Orientador orientador) {
        this.orientador = orientador;
    }

    public Projetista getProjetista() {
        return projetista;
    }

    public void setProjetista(Projetista projetista) {
        this.projetista = projetista;
    }

    public List<Atividade> getAtividades() {
        return atividades;
    }

    public void setAtividades(List<Atividade> atividades) {
        this.atividades = atividades;
    }
    
}
