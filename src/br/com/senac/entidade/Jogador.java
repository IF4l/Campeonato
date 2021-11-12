/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senac.entidade;

import java.util.Date;

/**
 *
 * @author DELL
 */
public class Jogador {
    
    private Integer id;
    private String nome;
    private Date nascimento ;
    private String bola;
    private String telefone;
    private String email;
    private String federacao;

    public Jogador(){
        
    }

    public Jogador( String nome, Date nascimento, String bola, String telefone, String email, String federacao) {
        this.nome = nome;
        this.nascimento = nascimento;
        this.bola = bola;
        this.telefone = telefone;
        this.email = email;
        this.federacao = federacao;
    }

 

    public String getBola() {
        return bola;
    }

    public void setBola(String bola) {
        this.bola = bola;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFederacao() {
        return federacao;
    }

    public void setFederacao(String federacao) {
        this.federacao = federacao;
    }


  
     
}
