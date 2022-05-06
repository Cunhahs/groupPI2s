/*FINALIZADA*/

package com.mycompany.artigosesportivos.controller;

import com.mycompany.artigosesportivos.DAO.RelatorioDAO;
import com.mycompany.artigosesportivos.model.Relatorio;
import java.util.ArrayList;

public class RelatorioController {
    public static ArrayList<Relatorio> consultaGeral(){
        return RelatorioDAO.consultaGeral();
    }
    
    public static ArrayList<Relatorio> consultaIndividual(int id){
        return RelatorioDAO.consultaIndividual(id);
    }
}
