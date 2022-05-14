/*EM PROGRESSO*/

package com.mycompany.artigosesportivos.DAO;

import com.mycompany.artigosesportivos.model.Relatorio;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
*
* @author nicolly.crsouza
* @see controller.RelatorioDAO
*/
public class RelatorioDAO {
    
/**
    * Método para consultar (em um banco de dados) as vendas realizadas em um determinado período
    * @param Date dataInicio - Data inicial do período para procura no banco
    * @param Date dataFim - Data final do período para procura no banco
    * @return ArrayList - contém uma lista com as vendas realizadas no período procurado
    */

    public static ArrayList<Relatorio> consultaGeral(Date dataInicio, Date dataFim){
        ResultSet rs = null;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null; 
        
        ArrayList<Relatorio> listaVendas = new ArrayList<>();
        
        
        try{
            /*Conectar com banco*/
            Class.forName("com.mysql.cj.jdbc.Driver");
            String URL = "jdbc:mysql://localhost:3306/sportssix?useTimezone=true&serverTimezone=UTC&useSSL=false";
            conexao = DriverManager.getConnection(URL, "root", "");
            
            /*Executar procura*/
            instrucaoSQL = conexao.prepareStatement("SELECT * FROM vendas WHERE dataVenda BETWEEN #?# AND #?#;");
            
            /*Passando data como parâmetro*/
            instrucaoSQL.setDate(1, new java.sql.Date(dataInicio.getTime()));
            instrucaoSQL.setDate(2, new java.sql.Date(dataFim.getTime()));

            rs = instrucaoSQL.executeQuery();
            
            while(rs.next())
            {
                Relatorio r = new Relatorio();
                r.setIdVenda(rs.getInt("idVenda"));
                r.setDataVenda(rs.getDate("dataVenda"));
                r.setCliente(rs.getString("cliente"));
                r.setValorTotal(rs.getDouble("valorTotal"));
                
                listaVendas.add(r);
            }
            
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex.getMessage());
            listaVendas = null;
        } finally {
            try{
                if(rs!=null)
                    rs.close();                
                if(instrucaoSQL!=null)
                    instrucaoSQL.close();
                
                conexao.close();
            } catch (SQLException ex) {
                Logger.getLogger(RelatorioDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return listaVendas;
    }
    
/**
    * Método para consultar (em um banco de dados) uma determinada venda
    * @param int id - identificador da venda a ser procurada no banco
    * @return ArrayList - contém uma lista com as propriedades da venda procurada
    */
    public static ArrayList<Relatorio> consultaIndividual(int id){
        ResultSet rs = null;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null; 
        
        ArrayList<Relatorio> venda = new ArrayList<>();
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String URL = "jdbc:mysql://localhost:3306/sportssix?useTimezone=true&serverTimezone=UTC&useSSL=false";
            conexao = DriverManager.getConnection(URL, "root", "");
            
            /*Executar procura - vou precisar usar o JOIN pra juntar as tabelas Cliente, Produtos e Vendas
            vou gerar uma linha de cada vez para imprimir no relatorio sintetico*/
            instrucaoSQL = conexao.prepareStatement("SELECT * FROM vendas WHERE idVenda = ?;"); //Join
            
            instrucaoSQL.setInt(1, id);
            
            rs = instrucaoSQL.executeQuery();
            
            while(rs.next())
            {
                Relatorio r = new Relatorio();
                r.setIdVenda(rs.getInt("idVenda"));
                r.setDataVenda(rs.getDate("dataVenda"));
                r.setCliente(rs.getString("cliente"));
                r.setProdutos(rs.getString("produto"));
                r.setQtdProdutos(rs.getInt("qtdProduto"));
                r.setValorTotal(rs.getDouble("valorTotal"));
                
                venda.add(r);
            }
            
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex.getMessage());
            venda = null;
        } finally {
            try{
                if(rs!=null)
                    rs.close();                
                if(instrucaoSQL!=null)
                    instrucaoSQL.close();
                
                conexao.close();
            } catch (SQLException ex) {
                Logger.getLogger(RelatorioDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return venda;
        
    }
}
