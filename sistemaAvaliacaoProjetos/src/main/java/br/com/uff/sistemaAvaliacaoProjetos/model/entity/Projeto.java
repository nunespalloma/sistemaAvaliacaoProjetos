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
    
    @Column(nullable = false)
    private String descricao;
    
    @Column(nullable = false)
    private String duracao;
    
    @Column(nullable = false)
    private boolean requisitoRelatoriosParciais;
    
    @Column(nullable = false)
    private boolean requisitoTarefasDesenvolvimento;
    
    @Column(nullable = false)
    private boolean requisitoApresentacaoResultados;
    
    Projeto(){
        
    }
    
    public Projeto(String nome, String descricao, String duracao, boolean requisitoRelatoriosParciais, boolean requisitoTarefasDesenvolvimento, boolean requisitoApresentacaoResultados) {
        this.nome = nome;
        this.descricao = descricao;
        this.duracao = duracao;
        this.requisitoRelatoriosParciais = requisitoRelatoriosParciais;
        this.requisitoTarefasDesenvolvimento = requisitoTarefasDesenvolvimento;
        this.requisitoApresentacaoResultados = requisitoApresentacaoResultados;
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

    
    
}
