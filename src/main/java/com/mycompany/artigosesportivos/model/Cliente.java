/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.artigosesportivos.model;

import java.util.Date;

/**
 *
 * @author User
 */
public class Cliente {
    
        private String nome;
        private String cpf;
        private String endereço;
        private String numero;
        private String bairro;
        private String cidade;
        private String estado;
        private String sexo;
        private String estadoCivil;
        private String dataNascimento;
        private String email;
        private String Telefone;
        
        public Cliente(){
            
        }

    public Cliente(String nome, String cpf, String endereço, String numero, String bairro, String cidade, String estado, String sexo, String estadoCivil, String dataNascimento, String email, String Telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereço = endereço;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.sexo = sexo;
        this.estadoCivil = estadoCivil;
        this.dataNascimento = dataNascimento;
        this.email = email;
        this.Telefone = Telefone;
    }

    

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEndereço() {
        return endereço;
    }

    public String getNumero() {
        return numero;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }

    public String getSexo() {
        return sexo;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }
        
    
    // metódos
    
    public void adicionar() {
       this.cpf = cpf;
    }
  
    
    public void excluir() {
       this.nome = nome;
    }
    
    public void alterar() {
        this.Telefone = Telefone;

    }
    
    public void consultar() {
        this.email = email; 

    }
  
   

}   