/*FINALIZADA*/

package com.mycompany.artigosesportivos.controller;

import com.mycompany.artigosesportivos.DAO.RelatorioDAO;
import com.mycompany.artigosesportivos.model.Relatorio;
import java.util.ArrayList;
import java.util.Date;

/**
*
* @author nicolly.crsouza
* @see controller.RelatorioDAO
*/

/**
    * Método para estabelecer conexão com o banco e consultar as vendas realizadas em um determinado período
    * @param Date dataInicio - Data inicial do período para procura no banco
    * @param Date dataFim - Data final do período para procura no banco
    * @return ArrayList - contém uma lista com as vendas realizadas no período procurado
    */
public class RelatorioController {
    public static ArrayList<Relatorio> consultaGeral(Date dataInicio, Date dataFim){
        return RelatorioDAO.consultaGeral(dataInicio, dataFim);
    }
    
/**
    * Método para estabelecer conexão com o banco e consultar uma determinada venda
    * @param int id - identificador da venda a ser procurada no banco
    * @return ArrayList - contém uma lista com as propriedades da venda procurada
    */
    public static ArrayList<Relatorio> consultaIndividual(int id){
        return RelatorioDAO.consultaIndividual(id);
    }
}
