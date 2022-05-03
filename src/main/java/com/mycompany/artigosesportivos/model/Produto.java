/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.artigosesportivos.model;

/**
 *
 * @author User
 */
public class Produto {
    
    private int codProduto;
    private String descricaoProduto;
    private String marca;
    private String categoria;
    private int qtdeEstoque;
    private double valorUnitario;
    
    public Produto() {
    
}

    public Produto(int codProduto) {
        this.codProduto = codProduto;
    }
    
   
    public int getcodProduto() {
        return codProduto;
    }

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public String getMarca() {
        return marca;
    }

    public String getCategoria() {
        return categoria;
    }

    public int getQtdeEstoque() {
        return qtdeEstoque;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setcodProduto(int codProduto) {
        this.codProduto = codProduto;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setQtdeEstoque(int QtdeEstoque) {
        this.qtdeEstoque = QtdeEstoque;
    }

    public void setValorUnitario(double ValorUnitario) {
        this.valorUnitario = ValorUnitario;
    }
    
 public void adicionar() {
       this.codProduto = codProduto;
    }
  
    
    public void excluir() {
       this.codProduto = codProduto;
    }
    
    public void alterar() {
        this.marca = marca;

    }
    
    public void consultar() {
        this.codProduto = codProduto;

    }
    
    
}
