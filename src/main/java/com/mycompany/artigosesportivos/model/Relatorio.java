package com.mycompany.artigosesportivos.model;

import java.util.Date;

/**
 *
 * @author nicolly.crsouza
 */
public class Relatorio {
    private static int idVenda;
    private static Date dataVenda;
    private static String cliente;
    private static double valorTotal;
    private static String[] produtos;
    private static int[] qtdProdutos;

    public Relatorio() {
    }

    public static int getIdVenda() {
        return idVenda;
    }

    public static void setIdVenda(int idVenda) {
        Relatorio.idVenda = idVenda;
    }

    public static Date getDataVenda() {
        return dataVenda;
    }

    public static void setDataVenda(Date dataVenda) {
        Relatorio.dataVenda = dataVenda;
    }
    

    public static String getCliente() {
        return cliente;
    }

    public static void setCliente(String cliente) {
        Relatorio.cliente = cliente;
    }

    public static Double getValorTotal() {
        return valorTotal;
    }

    public static void setValorTotal(Double valorTotal) {
        Relatorio.valorTotal = valorTotal;
    }

    public static String[] getProdutos() {
        return produtos;
    }

    public static void setProdutos(String[] produtos) {
        Relatorio.produtos = produtos;
    }

    public static int[] getQtdProdutos() {
        return qtdProdutos;
    }

    public static void setQtdProdutos(int[] qtdProdutos) {
        Relatorio.qtdProdutos = qtdProdutos;
    }
}

