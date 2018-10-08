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
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
//import javax.persistence.OneToMany;
//import javax.persistence.OneToOne;

/**
 *
 * @author palloma
 */
@Entity
public class Orientador implements Serializable{
    //identificador pra inserir a classe no banco quando a mesma for serializada
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue
    private int id;
    
    @Column(nullable = false, unique = true)
    private String matricula;
    
    @Column(nullable = false, unique = true)
    private String cpf;
    
    @Column(nullable = false)
    private String identidade;
    
    @Column(nullable = false)
    private String telefone;
    
    @Column(nullable = true)
    private String urlCurriculoLattes;
    
    @Column(nullable = false)
    private String departamento;
    
    @Column(nullable = false)
    private String nome;
    
    @Column(nullable = false, unique = true)
    private String email;
    
    @Column(nullable = false)
    private String senha;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "orientador")
    private List<Formulario> formularios;
    //adicionar projeto como atributo de aluno!
    
    public Orientador(){
        
    }

    public Orientador(String matricula, String cpf, String identidade, String telefone, String urlCurriculoLattes, String departamento, String nome, String email, String senha) {
        this.matricula = matricula;
        this.cpf = cpf;
        this.identidade = identidade;
        this.telefone = telefone;
        this.urlCurriculoLattes = urlCurriculoLattes;
        this.departamento = departamento;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getIdentidade() {
        return identidade;
    }

    public void setIdentidade(String identidade) {
        this.identidade = identidade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getUrlCurriculoLattes() {
        return urlCurriculoLattes;
    }

    public void setUrlCurriculoLattes(String urlCurriculoLattes) {
        this.urlCurriculoLattes = urlCurriculoLattes;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}
