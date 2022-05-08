/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.artigosesportivos.controller;

import com.mycompany.artigosesportivos.model.Cliente;
import com.mycompany.artigosesportivos.DAO.ClienteDAO;
import java.util.ArrayList;
import java.util.Date;

/**
 * 
 *
 * @author VivianeCipollari
 * 
 * 
 */
   public class ClienteController {
        
        
         public static boolean Adicionar(String CPF, String nome, String genero, String estadoCivil, String telefone,
            Date dtNascimento, String email, String endereco,String numero, String bairro, String cidade, String estado, String CEP) {

        Cliente objAdicionar = new Cliente();

        objAdicionar.setCpf(CPF);
        objAdicionar.setNome(nome);
        objAdicionar.setEndereço(endereco);
        objAdicionar.setNumero(numero);
        objAdicionar.setBairro(bairro);
        objAdicionar.setCidade(cidade);
        objAdicionar.setEstado(estado);
        objAdicionar.setSexo(genero);
        objAdicionar.setEstadoCivil(estadoCivil);        
        objAdicionar.setDataNascimento(dtNascimento);        
        objAdicionar.setEmail(email);
        objAdicionar.setTelefone(telefone);
        
        

        return ClienteDAO.Adicionar(objAdicionar);
    }

    public static boolean alterar(int ID, String CPF, String nome, String genero, String estadoCivil, 
            String telefone, Date dtNascimento, String email, String endereco, String numero, String bairro, 
            String cidade, String estado) {

        Cliente objAlterar = new Cliente();

        objAlterar.setCpf(CPF);
        objAlterar.setNome(nome);
        objAlterar.setEndereço(endereco);
        objAlterar.setNumero(numero);
        objAlterar.setBairro(bairro);
        objAlterar.setCidade(cidade);
        objAlterar.setEstado(estado);
        objAlterar.setSexo(genero);
        objAlterar.setEstadoCivil(estadoCivil);        
        objAlterar.setDataNascimento(dtNascimento);        
        objAlterar.setEmail(email);
        objAlterar.setTelefone(telefone);
        

        return ClienteDAO.alterar(objAlterar);
    }

    
     public static boolean excluir(int ID, String CPF, String nome, String genero, String estadoCivil, 
            String telefone, Date dtNascimento, String email, String endereco, String numero, String bairro, 
            String cidade, String estado) {
        
        Cliente objExcluir = new Cliente();

        objExcluir.setCpf(CPF);
        objExcluir.setNome(nome);
        objExcluir.setEndereço(endereco);
        objExcluir.setNumero(numero);
        objExcluir.setBairro(bairro);
        objExcluir.setCidade(cidade);
        objExcluir.setEstado(estado);
        objExcluir.setSexo(genero);
        objExcluir.setEstadoCivil(estadoCivil);        
        objExcluir.setDataNascimento(dtNascimento);        
        objExcluir.setEmail(email);
        objExcluir.setTelefone(telefone);       
        
        
        return ClienteDAO.excluir(objExcluir);
    }

     
     public static ArrayList<String[]> listarC() throws ClassNotFoundException {
        ArrayList<Cliente> listaClientes = ClienteDAO.listarClientes();
        ArrayList<String[]> retorno = new ArrayList<>();

        for (Cliente item : listaClientes) {
            retorno.add(new String[]{String.valueOf(item.getId()), item.getCpf(), item.getNome(), item.getEndereço(), item.getNumero(),
            item.getBairro(), item.getCidade(),item.getEstadoCivil(),  String.valueOf(item.getDataNascimento()), item.getEmail(),
            item.getEstado(), item.getSexo(),item.getTelefone()});
            }
        return retorno;
    }
            
            
    /**
     * Método responsável por passar informações a serem listadas na tabela view
     * @return ArrayList String[]
     */
    public static ArrayList<String[]> listarCliente() throws ClassNotFoundException {
        ArrayList<Cliente> listaClientes = ClienteDAO.listarClientes();
        ArrayList<String[]> retorno = new ArrayList<>();

        for (Cliente item : listaClientes) {
            retorno.add(new String[]{String.valueOf(item.getId()), item.getCpf(), item.getNome(), item.getEndereço(), item.getNumero(),
            item.getBairro(), item.getCidade(),item.getEstadoCivil(),  String.valueOf(item.getDataNascimento()), item.getEmail(),
            item.getEstado(), item.getSexo(),item.getTelefone()});
                    

        }
        return retorno;
    }

    /**
     * Método responsável por passar informações a serem filtradas (filtro por nome do cliente)
     * @param nome String
     * @return ArrayList String[]
     */
    public static ArrayList<String[]> filtroNome(String nome) throws ClassNotFoundException {
        ArrayList<Cliente> filtro = ClienteDAO.filtroNome(nome);
        ArrayList<String[]> listaFiltro = new ArrayList<>();

        for (Cliente item : filtro) {
            listaFiltro.add(new String[]{String.valueOf(item.getId()), item.getCpf(), item.getNome(),item.getEndereço(), item.getNumero(),
                  item.getBairro(), item.getCidade(),item.getEstadoCivil(),  String.valueOf(item.getDataNascimento()), item.getEmail(),
                 item.getEstado(), item.getSexo(),item.getTelefone()});
                

        }

        return listaFiltro;

    }
    
   

    public static ArrayList<String[]> filtroCPF(String CPF) throws ClassNotFoundException {
        ArrayList<Cliente> filtro = ClienteDAO.filtroCPF(CPF);
        ArrayList<String[]> listaFiltro = new ArrayList<>();

        for (Cliente item : filtro) {
             listaFiltro.add(new String[]{String.valueOf(item.getId()), item.getCpf(), item.getNome(),item.getEndereço(), item.getNumero(),
                  item.getBairro(), item.getCidade(),item.getEstadoCivil(),  String.valueOf(item.getDataNascimento()), item.getEmail(),
                 item.getEstado(), item.getSexo(),item.getTelefone()});

        }

        return listaFiltro;
    }

    public static boolean adicionar(String CPF, String nome, String Endereco, String Numero, String sexo, String estadoCivil, String telefone, String dataNascimento, String email, String bairro, String cidade, String estado) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   }