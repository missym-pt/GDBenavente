/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gdb.model;

import java.time.LocalDate;

/**
 *
 * @author MissyM
 */
public class Receita {
    
    private Entidade actor;
    private LocalDate data;
    private float valor;
     
    public Receita(Entidade actor, LocalDate data, float valor) {
        this.actor = actor;
        this.data = data;
        this.valor = valor;
    }
    
    public Entidade getActor() {
        return actor;
    }

    public void setActor(Entidade actor) {
        this.actor = actor;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
   
}
