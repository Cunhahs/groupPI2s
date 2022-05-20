/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.artigosesportivos.controller;

import com.mycompany.artigosesportivos.DAO.ProdutoDAO;
import com.mycompany.artigosesportivos.model.Produto;
import java.util.ArrayList;

/**
 *
 * @author Viviane Cipollari
 */
public class ProdutoController {

    public static boolean Adicionar(int codProduto, String DescricaoProduto, String Marca, String Categoria,
                                     int QtdeEstoque,double valorUnitario) {

        Produto objAdicionar = new Produto();

        objAdicionar.setcodProduto(codProduto);
        objAdicionar.setnomeProduto(DescricaoProduto);
        objAdicionar.setMarca(Marca);
        objAdicionar.setCategoria(Categoria);
        objAdicionar.setQtdeEstoque(QtdeEstoque);
        objAdicionar.setValorUnitario(valorUnitario);

        return ProdutoDAO.adicionar(objAdicionar);

    }

    public static boolean Alterar(int codProduto, String DescricaoProduto, String Marca, String Categoria,
                                     int QtdeEstoque,double valorUnitario) {

        Produto objAlterar = new Produto();

        objAlterar.setcodProduto(codProduto);
        objAlterar.setnomeProduto(DescricaoProduto);
        objAlterar.setMarca(Marca);
        objAlterar.setCategoria(Categoria);
        objAlterar.setQtdeEstoque(QtdeEstoque);
        objAlterar.setValorUnitario(valorUnitario);

        return ProdutoDAO.alterar(objAlterar);
    }

    public static boolean Excluir(int CodProd) {
        return ProdutoDAO.excluir(CodProd);
    }

    public static ArrayList<String[]> listarProdutos() {
        ArrayList<Produto> listar = ProdutoDAO.listarProdutos();
        ArrayList<String[]> retorno = new ArrayList<>();

        for (Produto item : listar) {
            retorno.add(new String[]{String.valueOf(item.getcodProduto()), item.getnomeProduto(), item.getMarca(),
                item.getCategoria(), String.valueOf(item.getQtdeEstoque()), String.valueOf(item.getValorUnitario())});
        }

        return retorno;
    }

    public static ArrayList<String[]> filtroCodProduto(int codProduto) {
        ArrayList<Produto> filtro = ProdutoDAO.filtroPorCodProduto(codProduto);
        ArrayList<String[]> listaFiltro = new ArrayList<>();

        for (Produto item : filtro) {
            listaFiltro.add(new String[]{String.valueOf(item.getcodProduto()), item.getnomeProduto(), item.getMarca(),
                item.getCategoria(), String.valueOf(item.getQtdeEstoque()), String.valueOf(item.getValorUnitario())});

        }

        return listaFiltro;

    }

    public static ArrayList<String[]> filtroProduto(String produto) {
        ArrayList<Produto> filtro = ProdutoDAO.filtroProduto(produto);
        ArrayList<String[]> listaFiltro = new ArrayList<>();

        for (Produto item : filtro) {
            listaFiltro.add(new String[]{String.valueOf(item.getcodProduto()), item.getnomeProduto(), item.getMarca(),
                item.getCategoria(), String.valueOf(item.getQtdeEstoque()), String.valueOf(item.getValorUnitario())});
        }
        
        return listaFiltro;
    }

    
}
