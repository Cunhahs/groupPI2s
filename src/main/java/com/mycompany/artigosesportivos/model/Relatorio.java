package com.mycompany.artigosesportivos.model;

/**
 *
 * @author nicolly.crsouza
 */
public class Relatorio {
    private static String dataVenda;
    private static String cliente;
    private static String valorTotal;
    private static String[] produtos;
    private static int[] qtdProdutos;

    public Relatorio() {
    }
    

    public static String getDataVenda() {
        return dataVenda;
    }

    public static void setDataVenda(String dataVenda) {
        Relatorio.dataVenda = dataVenda;
    }

    public static String getCliente() {
        return cliente;
    }

    public static void setCliente(String cliente) {
        Relatorio.cliente = cliente;
    }

    public static String getValorTotal() {
        return valorTotal;
    }

    public static void setValorTotal(String valorTotal) {
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

