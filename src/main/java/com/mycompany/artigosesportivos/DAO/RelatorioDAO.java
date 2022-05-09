/*EM PROGRESSO*/

package com.mycompany.artigosesportivos.DAO;

import com.mycompany.artigosesportivos.model.Relatorio;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RelatorioDAO {
    
    public static ArrayList<Relatorio> consultaGeral(){
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
            instrucaoSQL = conexao.prepareStatement("SELECT * FROM vendas;");
            
            rs = instrucaoSQL.executeQuery();
            
            while(rs.next())
            {
                Relatorio r = new Relatorio();
                r.setIdVenda(rs.getInt("idVenda"));
                r.setDataVenda(rs.getString("dataVenda")); //Duvidas
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
    
    public static ArrayList<Relatorio> consultaIndividual(int id){
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
            instrucaoSQL = conexao.prepareStatement("SELECT * FROM vendas WHERE idVenda = ?;");
            
            instrucaoSQL.setInt(1, id);
            
            rs = instrucaoSQL.executeQuery();
            
            while(rs.next())
            {
                Relatorio r = new Relatorio();
                r.setIdVenda(rs.getInt("idVenda"));
                r.setDataVenda(rs.getString("dataVenda"));
                r.setCliente(rs.getString("cliente"));
                r.setProdutos((String[]) rs.getObject("produtos")); //Dúvidas aqui
                r.setQtdProdutos((int[]) rs.getObject("qtdProdutos")); //Dúvidas aqui
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
}
