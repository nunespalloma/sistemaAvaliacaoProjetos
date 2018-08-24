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
public class Sistema implements Serializable{
    
    //identificador pra inserir a classe no banco quando a mesma for serializada
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue
    private int id;
    
    @Column(nullable = false)
    private String nome;
    
    @Column(nullable = false)
    private String areaAtuacao;
    
    //MAIS ATRIBUTOS...
    
    Sistema(){
        
    }
    
    public Sistema(String nome, String areaAtuacao) {
        this.nome = nome;
        this.areaAtuacao = areaAtuacao;
    }
    
}
