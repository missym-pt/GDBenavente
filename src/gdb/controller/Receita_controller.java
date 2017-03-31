/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gdb.controller;

import static gdb.MockupData.*;
import gdb.model.Entidade;
import gdb.model.Receita;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author MissyM
 */
public class Receita_controller {
    
   public void venderBilhetes(int qtd, float preço){
       
       DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
       LocalDate localDate = LocalDate.now();       
       
       for(int i=0; i<qtd; i++){
           Receita receita= new Receita(dummy, localDate, preço);
           receitas.add(receita);
       }
   }
       
    public Receita receberPagamento(String nome, float preço, int tipo_ent){
       String tipo= tipo_ent==1? "Sócio":"Benemérito";
       DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
       LocalDate localDate = LocalDate.now();
       for(Entidade entidade : entidades){
           if(entidade.getNome().equals(nome) && entidade.getTipo_entidade().equals(tipo) ){
            Receita receita= new Receita(entidade, localDate, preço);
            receitas.add(receita);
            return receita;
           }
       }       
    return null;}
    
    public Entidade maiorPagante(){
        float totalEntidade=0, maior=0;
        Entidade maiorPagante=null;
        for(Entidade entidade : entidades){
            for (Receita receita : receitas){
                totalEntidade= receita.getActor()==entidade? totalEntidade+receita.getValor():totalEntidade;
            }
            if(totalEntidade>maior){
                maior=totalEntidade;
                maiorPagante=entidade;
            }
        }
        return maiorPagante;
    }
    
    public int melhorMes(){
        float totalMes=0, maior=0;
        int mes=0;
        
        for (Receita receita : receitas){
            for (int i=1; i<=12; i++){
                totalMes= receita.getData().getMonthValue()==i? totalMes+receita.getValor():totalMes;            
            if(totalMes>maior){
                maior=totalMes;
                mes=i+1;
            }}}
        return mes;
    }
       
       
       
   
    
    }

