/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.artigosesportivos.DAO;

import com.mycompany.artigosesportivos.model.Produto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * Classe responsável por promover a conexão com o banco de dados. É possível
 * para adicionar, alteração, exclusão e manutenção de clientes.
 * 
 *  @author VivianeCipollari
 * @version 1.0
 * @ee controller.ClienteController
 * @see model.Cliente
 * 
 */
public class ProdutoDAO {

    public static boolean adicionar(Produto p) {
        boolean retorno = false;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String URL = "jdbc:mysql://localhost:3306/sportssix?useTimezone=true&serverTimezone=UTC&useSSL=false";
            conexao = DriverManager.getConnection(URL, "root", "");
            instrucaoSQL = conexao.prepareStatement("INSERT INTO produto (cód. Produto, Produto, marca, "
                    + "categoria,  qtde em Estoque, Valor Unitario?, ?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS);

            //parametros para gravar
            instrucaoSQL.setInt(1, p.getcodProduto());
            instrucaoSQL.setString(2, p.getnomeProduto());
            instrucaoSQL.setString(3, p.getMarca());
            instrucaoSQL.setString(3, p.categoria());
            instrucaoSQL.setInt(4, (int) p.getQtdeEstoque());
            instrucaoSQL.setDouble(5, p.getValorUnitario());

            int linhasAfetadas = instrucaoSQL.executeUpdate();

            if (linhasAfetadas > 0) {
                retorno = true;

                ResultSet generatedKeys = instrucaoSQL.getGeneratedKeys(); //para recuperar o id do cliente
                if (generatedKeys.next()) {
                    p.setcodProduto(generatedKeys.getInt(1));
                } else {
                    throw new SQLException("Falha ao obter ID do cliente!");
                }
            } else {
                retorno = false;
            }

        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            retorno = false;
        } finally {
            //liberar recursos da memória
            try {
                if (instrucaoSQL != null) {
                    instrucaoSQL.close();
                }

                
            } catch (SQLException ex) {
            }
        }
        return retorno;
    }

    
    public static boolean alterar(Produto p) {
        boolean retorno = false;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            String URL = "jdbc:mysql://localhost:3306/sportssix?useTimezone=true&serverTimezone=UTC&useSSL=false";
            conexao = DriverManager.getConnection(URL, "root", "");
            instrucaoSQL = conexao.prepareStatement("INSERT INTO produto (cód. Produto, Produto, marca, "
                    + "categoria,  qtde em Estoque, Valor Unitario?, ?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS);

            instrucaoSQL.setInt(1, p.getcodProduto());
            instrucaoSQL.setString(2, p.getnomeProduto());
            instrucaoSQL.setString(3, p.getMarca());
            instrucaoSQL.setString(3, p.categoria());
            instrucaoSQL.setInt(4, (int) p.getQtdeEstoque());
            instrucaoSQL.setDouble(5, p.getValorUnitario());

            int linhasAfetadas = instrucaoSQL.executeUpdate();
            if (linhasAfetadas > 0) {
                retorno = true;
            } else {
                retorno = false;
            }

        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            retorno = false;
        } finally {

            try {

                if (instrucaoSQL != null) {
                    instrucaoSQL.close();
                }
                
                conexao.close();
                

            } catch (SQLException ex) {
            }
        }
        return retorno;
    }

    /**
     * Método para excluir informações da base de dados
     *
     * @param pCodProduto inteiro
     * @return true - para sucesso | false - falha
     *
     */
    public static boolean excluir(int pCodProduto) {
        boolean retorno = false;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String URL = "jdbc:mysql://localhost:3306/sportssix?useTimezone=true&serverTimezone=UTC&useSSL=false";
            conexao = DriverManager.getConnection(URL, "root", "");
            instrucaoSQL = conexao.prepareStatement("INSERT INTO produto (cód. Produto, Produto, marca, "
                    + "categoria,  qtde em Estoque, Valor Unitario?, ?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS);

            
            
            int linhasAfetadas = instrucaoSQL.executeUpdate();
            if (linhasAfetadas > 0) {
                retorno = true;
            } else {
                retorno = false;
            }

        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            retorno = false;
        } finally {

            try {
                if (instrucaoSQL != null) {
                    instrucaoSQL.close();
                }

                conexao.close();
                
            } catch (SQLException ex) {
            }
        }

        return retorno;
    }

    
    public static ArrayList<Produto> listarProdutos() {
        ResultSet rs = null;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;

        ArrayList<Produto> listar = new ArrayList<Produto>();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String URL = "jdbc:mysql://localhost:3306/sportssix?useTimezone=true&serverTimezone=UTC&useSSL=false";
            conexao = DriverManager.getConnection(URL, "root", "");
            instrucaoSQL = conexao.prepareStatement("INSERT INTO produto (cód. Produto, Produto, marca, "
                    + "categoria,  qtde em Estoque, Valor Unitario?, ?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS);

            rs = instrucaoSQL.executeQuery(); //executar a query

            //percorrer o result set
            while (rs.next()) {
                Produto c = new Produto();
                c.setcodProduto(rs.getInt("codProduto"));
                c.setnomeProduto(rs.getString("Produto"));
                c.setMarca(rs.getString("Marca"));
                c.setCategoria(rs.getString("categoria"));
                c.setQtdeEstoque(rs.getInt("qtde Estoque"));
                c.setValorUnitario(rs.getDouble("Valor Unitário"));

                listar.add(c);

            }

        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            listar = null;
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (instrucaoSQL != null) {
                    instrucaoSQL.close();
                }
                conexao.close();

            } catch (SQLException ex) {
            }
        }
        return listar;
    }

    /**
     * Método para selecionar um produto pelo seu identificador no banco de dados.
     * 
     * @param codProduto inteiro
     * @return obj Produto
     */
    public static Produto listarPorCodProduto(int  codProduto) { //método usado para venda view
        ResultSet rs = null;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;

        Produto produto = new Produto();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String URL = "jdbc:mysql://localhost:3306/sportssix?useTimezone=true&serverTimezone=UTC&useSSL=false";
            conexao = DriverManager.getConnection(URL, "root", "");
            instrucaoSQL = conexao.prepareStatement("INSERT INTO produto (cód. Produto, Produto, marca, "
                    + "categoria,  qtde em Estoque, Valor Unitario?, ?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS);
            rs = instrucaoSQL.executeQuery(); //executar a query

            if (rs.next()) {
                Produto c = new Produto();
                c.setcodProduto(rs.getInt("id"));
                c.setnomeProduto(rs.getString("Produto"));
                c.setMarca(rs.getString("Marca"));
                c.setCategoria(rs.getString("categoria"));
                c.setQtdeEstoque(rs.getInt("qtde Estoque"));
                c.setValorUnitario(rs.getDouble("Valor Unitário"));
            }

        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            produto = null;
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (instrucaoSQL != null) {
                    instrucaoSQL.close();
                }
                conexao.close();

            } catch (SQLException ex) {
            }
        }
        return produto;

    }

    public static ArrayList<Produto> listarProdutos(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Método para selecionar um produto pelo seu identificador no banco de dados
     * @param ID inteiro
     * @return  ArrayList da classe Produto
     */
    public static ArrayList<Produto> filtroPorCodProduto(int ID) { //filtro para produto view
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;
        ResultSet rs = null;

        ArrayList<Produto> filtro = new ArrayList<Produto>();

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            String URL = "jdbc:mysql://localhost:3306/sportssix?useTimezone=true&serverTimezone=UTC&useSSL=false";
            conexao = DriverManager.getConnection(URL, "root", "");
            instrucaoSQL = conexao.prepareStatement("INSERT INTO produto (cód. Produto, Produto, marca, "
                    + "categoria,  qtde em Estoque, Valor Unitario?, ?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS);
            rs = instrucaoSQL.executeQuery();

            while (rs.next()) {
                Produto c = new Produto();
                c.setcodProduto(rs.getInt("codProduto"));
                c.setnomeProduto(rs.getString("Produto"));
                c.setMarca(rs.getString("Marca"));
                c.setCategoria(rs.getString("categoria"));
                c.setQtdeEstoque(rs.getInt("qtde Estoque"));
                c.setValorUnitario(rs.getDouble("Valor Unitário"));

                filtro.add(c);

            }

        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            filtro = null;
        } finally {

            try {

                if (rs != null) {
                    rs.close();
                }
                if (instrucaoSQL != null) {
                    instrucaoSQL.close();
                }

                conexao.close();

            } catch (SQLException ex) {

            }
        }

        return filtro;
    }

    /**
     * Método para selecionar um produto pelo seu nome no banco de dados
     * @param pNome String
     * @return ArrayList da classe Produtos
     */
    public static ArrayList<Produto> filtroProduto(String pNome) { //filtro por nome produto view
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;
        ResultSet rs = null;

        ArrayList<Produto> filtro = new ArrayList<Produto>();

        try {
Class.forName("com.mysql.cj.jdbc.Driver");
            String URL = "jdbc:mysql://localhost:3306/sportssix?useTimezone=true&serverTimezone=UTC&useSSL=false";
            conexao = DriverManager.getConnection(URL, "root", "");
            instrucaoSQL = conexao.prepareStatement("INSERT INTO produto (cód. Produto, Produto, marca, "
                    + "categoria,  qtde em Estoque, Valor Unitario?, ?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS);
            instrucaoSQL.setString(1, "%" + pNome + '%');
            rs = instrucaoSQL.executeQuery();

            while (rs.next()) {
                Produto c = new Produto();
                c.setcodProduto(rs.getInt("codProduto"));
                c.setnomeProduto(rs.getString("Produto"));
                c.setMarca(rs.getString("Marca"));
                c.setCategoria(rs.getString("categoria"));
                c.setQtdeEstoque(rs.getInt("qtde Estoque"));
                c.setValorUnitario(rs.getDouble("Valor Unitário"));
                filtro.add(c);

            }

        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            filtro = null;

        } finally {
            try {

                if (rs != null) {
                    rs.close();
                }
                if (instrucaoSQL != null) {
                    instrucaoSQL.close();
                }

                conexao.close();

            } catch (SQLException ex) {
            }
        }

        return filtro;
    }

    /**
     * Método usado para selecionar o produto pelo seu nome exato como cadastrado no banco de dados
     * @param nome String
     * @return obj da classe Produto
     */
    public static Produto fnomeProduto(String nome) { //método usado para vendas view
        ResultSet rs = null;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;

        Produto produto = new Produto();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String URL = "jdbc:mysql://localhost:3306/sportssix?useTimezone=true&serverTimezone=UTC&useSSL=false";
            conexao = DriverManager.getConnection(URL, "root", "");
            instrucaoSQL = conexao.prepareStatement("INSERT INTO produto (cód. Produto, Produto, marca, "
                    + "categoria,  qtde em Estoque, Valor Unitario?, ?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS);
            instrucaoSQL.setString(1, nome);
            rs = instrucaoSQL.executeQuery(); //executar a query

            if (rs.next()) {
                produto.setcodProduto(rs.getInt("codProduto"));
                produto.setnomeProduto(rs.getString("nomeProduto"));
                produto.setMarca(rs.getString("descricao"));
                produto.setCategoria(rs.getString("fabricante"));
                produto.setQtdeEstoque(rs.getInt("quantProduto"));
                produto.setValorUnitario(rs.getDouble("valorVenda"));

            }

        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            produto = null;
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (instrucaoSQL != null) {
                    instrucaoSQL.close();
                }
                conexao.close();

            } catch (SQLException ex) {
            }
        }
        return produto;

    }

  
}
