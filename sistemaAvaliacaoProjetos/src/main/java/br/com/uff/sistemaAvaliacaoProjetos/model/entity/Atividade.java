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
 * @author pallo
 */
@Entity
public class Atividade implements Serializable{
    
    //identificador pra inserir a classe no banco quando a mesma for serializada
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue
    private int id;
    
    @Column(nullable = true)
    private String nome;
    
    @Column(nullable = true)
    private boolean janeiro;
    
    @Column(nullable = true)
    private boolean fevereiro;
    
    @Column(nullable = true)
    private boolean marco;
    
    @Column(nullable = true)
    private boolean abril;
    
    @Column(nullable = true)
    private boolean maio;
    
    @Column(nullable = true)
    private boolean junho;
    
    @Column(nullable = true)
    private boolean julho;
    
    @Column(nullable = true)
    private boolean agosto;
    
    @Column(nullable = true)
    private boolean setembro;
    
    @Column(nullable = true)
    private boolean outubro;
    
    @Column(nullable = true)
    private boolean novembro;
    
    @Column(nullable = true)
    private boolean dezembro;
    
    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private Projeto projeto;
    
    public Atividade() {
        
    }

    public Atividade(String nome, boolean janeiro, boolean fevereiro, boolean marco, boolean abril, boolean maio, boolean junho, boolean julho, boolean agosto, boolean setembro, boolean outubro, boolean novembro, boolean dezembro, Projeto projeto) {
        this.nome = nome;
        this.janeiro = janeiro;
        this.fevereiro = fevereiro;
        this.marco = marco;
        this.abril = abril;
        this.maio = maio;
        this.junho = junho;
        this.julho = julho;
        this.agosto = agosto;
        this.setembro = setembro;
        this.outubro = outubro;
        this.novembro = novembro;
        this.dezembro = dezembro;
        this.projeto = projeto;
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
    
    public boolean isJaneiro() {
        return janeiro;
    }

    public void setJaneiro(boolean janeiro) {
        this.janeiro = janeiro;
    }

    public boolean isFevereiro() {
        return fevereiro;
    }

    public void setFevereiro(boolean fevereiro) {
        this.fevereiro = fevereiro;
    }

    public boolean isMarco() {
        return marco;
    }

    public void setMarco(boolean marco) {
        this.marco = marco;
    }

    public boolean isAbril() {
        return abril;
    }

    public void setAbril(boolean abril) {
        this.abril = abril;
    }

    public boolean isMaio() {
        return maio;
    }

    public void setMaio(boolean maio) {
        this.maio = maio;
    }

    public boolean isJunho() {
        return junho;
    }

    public void setJunho(boolean junho) {
        this.junho = junho;
    }

    public boolean isJulho() {
        return julho;
    }

    public void setJulho(boolean julho) {
        this.julho = julho;
    }

    public boolean isAgosto() {
        return agosto;
    }

    public void setAgosto(boolean agosto) {
        this.agosto = agosto;
    }

    public boolean isSetembro() {
        return setembro;
    }

    public void setSetembro(boolean setembro) {
        this.setembro = setembro;
    }

    public boolean isOutubro() {
        return outubro;
    }

    public void setOutubro(boolean outubro) {
        this.outubro = outubro;
    }

    public boolean isNovembro() {
        return novembro;
    }

    public void setNovembro(boolean novembro) {
        this.novembro = novembro;
    }

    public boolean isDezembro() {
        return dezembro;
    }

    public void setDezembro(boolean dezembro) {
        this.dezembro = dezembro;
    }

    public Projeto getProjeto() {
        return projeto;
    }

    public void setProjeto(Projeto projeto) {
        this.projeto = projeto;
    }
    
}
