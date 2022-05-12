/*FINALIZADA*/

package com.mycompany.artigosesportivos.controller;

import com.mycompany.artigosesportivos.DAO.RelatorioDAO;
import com.mycompany.artigosesportivos.model.Relatorio;
import java.util.ArrayList;
import java.util.Date;

public class RelatorioController {
    //Passar parâmetros de datas - ver no lab
    public static ArrayList<Relatorio> consultaGeral(Date dataInicio, Date dataFim){
        return RelatorioDAO.consultaGeral(dataInicio, dataFim);
    }
    
    public static ArrayList<Relatorio> consultaIndividual(int id){
        return RelatorioDAO.consultaIndividual(id);
    }
}
