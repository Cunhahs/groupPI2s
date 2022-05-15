package com.mycompany.artigosesportivos.model;

import java.util.Date;

/**
 *
 * @author nicolly.crsouza
 */
public class Relatorio {
    private int idVenda;
    private Date dataVenda;
    private String cliente;
    private double valorTotal;
    private String produtos;
    private int qtdProdutos;

    public Relatorio() {
    }

    public int getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }

    public Date getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getProdutos() {
        return produtos;
    }

    public void setProdutos(String produtos) {
        this.produtos = produtos;
    }

    public int getQtdProdutos() {
        return qtdProdutos;
    }

    public void setQtdProdutos(int qtdProdutos) {
        this.qtdProdutos = qtdProdutos;
    }

}

