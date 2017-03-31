/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gdb.model;

/**
 *
 * @author MissyM
 */
public class Entidade {
    
   private String nome;
   private String localidade;
   private String contacto;
   private String tipo_entidade;

    public Entidade(String nome, String localidade, String contacto, String tipo_entidade) {
        this.nome = nome;
        this.localidade = localidade;
        this.contacto = contacto;
        this.tipo_entidade = tipo_entidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocalidade() {
        return localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getTipo_entidade() {
        return tipo_entidade;
    }

    public void setTipo_entidade(String tipo_entidade) {
        this.tipo_entidade = tipo_entidade;
    }
   
   
   
   
   
    
}
