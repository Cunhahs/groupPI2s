/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.artigosesportivos.DAO;


import com.mycompany.artigosesportivos.model.Cliente;
import java.net.URL;


import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * Classe responsável por promover a conexão com o banco de dados. É possível
 * fazer inclusão, alteração, exclusão e manutenção de clientes.
 * 
 *  @author VivianeCipollari
 * @version 1.0
 * @ee controller.ClienteController
 * @see model.Cliente
 * 
 */
public class ClienteDAO {
    


    /**
     * Método adicionar para gravação de informações no banco de dados
     * @author VivianeCipollari
     * @param p obj Cliente
     * @return true - para sucesso | false - para falha
     *
     */
    public static boolean Adicionar(Cliente p) {
        boolean retorno = false;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String URL = "jdbc:mysql://localhost:3306/sportssix?useTimezone=true&serverTimezone=UTC&useSSL=false";
            conexao = DriverManager.getConnection(URL, "root", "");

            instrucaoSQL = conexao.prepareStatement("INSERT INTO cliente (CPF, nome, genero, estadoCivil, telCliente, "
                    + "dtNascimento, email, endereco, bairro, cidade, estado, CEP) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, "
                    + "?, ?)", Statement.RETURN_GENERATED_KEYS);

            //parametros para gravar
            instrucaoSQL.setString(1, p.getCpf());
            instrucaoSQL.setString(2, p.getNome());
            instrucaoSQL.setString(3, p.getSexo());
            instrucaoSQL.setString(4, p.getEstadoCivil());
            instrucaoSQL.setString(5, p.getTelefone());
            instrucaoSQL.setDate(6, (Date) p.getDataNascimento());
            instrucaoSQL.setString(7, p.getEmail());
            instrucaoSQL.setString(8, p.getEndereço());
            instrucaoSQL.setString(9, p.getBairro());
            instrucaoSQL.setString(10, p.getCidade());
            instrucaoSQL.setString(11, p.getEstado());
            

            int linhasAfetadas = instrucaoSQL.executeUpdate();

            if (linhasAfetadas > 0) {
                retorno = true;

                ResultSet generatedKeys = instrucaoSQL.getGeneratedKeys(); //para recuperar o id do cliente
                if (generatedKeys.next()) {
                    p.setId(generatedKeys.getInt(1));
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

                 conexao.close();
            } catch (SQLException ex) {
            }
        }
        return retorno;
    }

    /**
     * Método atualizar para alteração de informações no banco de dados
     *
     * @param p obj Cliente
     * @return true - para sucesso | false - para falha
     */
    public static boolean atualizar(Cliente p) throws ClassNotFoundException {
        boolean retorno = false;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            String URL = "jdbc:mysql://localhost:3306/sportssix?useTimezone=true&serverTimezone=UTC&useSSL=false";
            conexao = DriverManager.getConnection(URL, "root", "");
            instrucaoSQL = conexao.prepareStatement("UPDATE cliente SET CPF=?, nome=?, genero=?, estadoCivil=?, "
                    + "telCliente=?, dtNascimento=?, email=?, endereco=?, bairro=?, cidade=?, estado=?, CEP=?"
                    + "WHERE id=?");

            instrucaoSQL.setString(1, p.getCpf());
            instrucaoSQL.setString(2, p.getNome());
            instrucaoSQL.setString(3, p.getSexo());
            instrucaoSQL.setString(4, p.getEstadoCivil());
            instrucaoSQL.setString(5, p.getTelefone());
            instrucaoSQL.setDate(6, new java.sql.Date(p.getDataNascimento().getTime()));
            //instrucaoSQL.setString(6, p.getDataNascimento()); 
            instrucaoSQL.setString(7, p.getEmail());
            instrucaoSQL.setString(8, p.getEndereço());
            instrucaoSQL.setString(9, p.getBairro());
            instrucaoSQL.setString(10, p.getCidade());
            instrucaoSQL.setString(11, p.getEstado());           
            instrucaoSQL.setInt(13, p.getId());

            int linhasAfetadas = instrucaoSQL.executeUpdate();
            if (linhasAfetadas > 0) {
                retorno = true;
            } else {
                retorno = false;
            }

        } catch (SQLException ex) {
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
     * @param pID inteiro
     * @return true - para sucesso | false - falha
     *
     */
    public static boolean excluir(int pID) throws ClassNotFoundException {
        boolean retorno = false;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String URL = "jdbc:mysql://localhost:3306/sportssix?useTimezone=true&serverTimezone=UTC&useSSL=false";
            conexao = DriverManager.getConnection(URL, "root", "");
            instrucaoSQL = conexao.prepareStatement("DELETE FROM cliente WHERE id = ?");
            instrucaoSQL.setInt(1, pID);

            int linhasAfetadas = instrucaoSQL.executeUpdate();

            if (linhasAfetadas > 0) {
                retorno = true;
            } else {
                retorno = false;
            }

        } catch (SQLException ex) {
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
     * Método para listar toda a base de dados de uma só vez
     *
     * @return ArrayList da classe cliente
     *
     */
    public static ArrayList<Cliente> listarClientes() throws ClassNotFoundException {
        ResultSet rs = null;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;

        ArrayList<Cliente> listar = new ArrayList<Cliente>();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String URL = "jdbc:mysql://localhost:3306/sportssix?useTimezone=true&serverTimezone=UTC&useSSL=false";
            conexao = DriverManager.getConnection(URL, "root", "");
            instrucaoSQL = conexao.prepareStatement("SELECT * FROM cliente;");
            rs = instrucaoSQL.executeQuery(); //executar a query

            //percorrer o result set
            while (rs.next()) {
                Cliente c = new Cliente();
                c.setId(rs.getInt("id"));
                c.setCpf(rs.getString("CPF"));
                c.setNome(rs.getString("nome"));
                c.setSexo(rs.getString("genero"));
                c.setEstadoCivil(rs.getString("estadoCivil"));
                c.setTelefone(rs.getString("telCliente"));
                c.setDataNascimento(rs.getDate("dtNascimento"));
                //c.setDataNascimento(rs.getString("dtNascimento")); //refazer usando aula 10 jCalendar
                c.setEmail(rs.getString("email"));
                c.setEndereço(rs.getString("endereco"));
                c.setBairro(rs.getString("bairro"));
                c.setCidade(rs.getString("cidade"));
                c.setEstado(rs.getString("estado"));
                

                listar.add(c);

            }

        } catch (SQLException ex) {
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
     * Método para realizar a filtragem de dados inseridos no banco de dados
     * levando como parâmetro o nome do cliente
     *
     * @param pNome String
     * @return ArrayLyst da Classe Cliente
     *
     */
    public static ArrayList<Cliente> filtroNome(String pNome) throws ClassNotFoundException {
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;
        ResultSet rs = null;

        ArrayList<Cliente> filtro = new ArrayList<Cliente>();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String URL = "jdbc:mysql://localhost:3306/sportssix?useTimezone=true&serverTimezone=UTC&useSSL=false";
            conexao = DriverManager.getConnection(URL, "root", "");
            instrucaoSQL = conexao.prepareStatement("SELECT * FROM cliente WHERE nome LIKE ?;");
            instrucaoSQL.setString(1, "%" + pNome + '%');
            rs = instrucaoSQL.executeQuery();

            while (rs.next()) {
                Cliente c = new Cliente();
                c.setId(rs.getInt("id"));
                c.setCpf(rs.getString("CPF"));
                c.setNome(rs.getString("nome"));
                c.setSexo(rs.getString("genero"));
                c.setEstadoCivil(rs.getString("estadoCivil"));
                c.setTelefone(rs.getString("telCliente"));
                c.setDataNascimento(rs.getDate("dtNascimento"));

                c.setEmail(rs.getString("email"));
                c.setEndereço(rs.getString("endereco"));
                c.setBairro(rs.getString("bairro"));
                c.setCidade(rs.getString("cidade"));
                c.setEstado(rs.getString("estado"));
               

                filtro.add(c);

            }

        } catch (SQLException ex) {
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
     * Método para realizar a filtragem de dados inseridos no banco de dados
     * levando como parâmetro o CPF do cliente
     *
     * @param pCPF String
     * @return ArrayList da Classe Cliente
     */
    public static ArrayList<Cliente> filtroCPF(String pCPF) throws ClassNotFoundException {
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;
        ResultSet rs = null;

        ArrayList<Cliente> filtro = new ArrayList<Cliente>();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String URL = "jdbc:mysql://localhost:3306/sportssix?useTimezone=true&serverTimezone=UTC&useSSL=false";
            conexao = DriverManager.getConnection(URL, "root", "");
            instrucaoSQL = conexao.prepareStatement("SELECT * FROM cliente WHERE CPF LIKE ?;");
            instrucaoSQL.setString(1, "%" + pCPF + '%');
            rs = instrucaoSQL.executeQuery();

            while (rs.next()) {
                Cliente c = new Cliente();
                c.setId(rs.getInt("id"));
                c.setCpf(rs.getString("CPF"));
                c.setNome(rs.getString("nome"));
                c.setEndereço(rs.getString("endereco"));
                c.setNumero(rs.getString("numero"));
                c.setBairro(rs.getString("bairro"));
                c.setCidade(rs.getString("cidade"));
                c.setEstado(rs.getString("estado"));   
                c.setSexo(rs.getString("genero"));
                c.setEstadoCivil(rs.getString("estadoCivil"));
                c.setTelefone(rs.getString("telefone"));
                c.setDataNascimento(rs.getDate("dtNascimento"));
                //c.setDataNascimento(rs.getString("dtNascimento"));
                c.setEmail(rs.getString("email"));
               
                
                

                filtro.add(c);

            }

        } catch (SQLException ex) {
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

    public static boolean adicionar(Cliente objAdicionar) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static boolean alterar(Cliente objAlterar) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static boolean excluir(Cliente objExcluir) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
