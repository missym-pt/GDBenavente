package gdb.controller;

import static gdb.MockupData.entidades;
import gdb.model.Entidade;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MissyM
 */
public class Entidade_controller {

    public Entidade_controller() {
    }
    
    public void criar_entidade(String nome, String localidade, String contacto, String tipo_entidade){
        
        Entidade entidade=new Entidade(nome, localidade, contacto, tipo_entidade);
       entidades.add(entidade);
        
    }
    
     
    
}
