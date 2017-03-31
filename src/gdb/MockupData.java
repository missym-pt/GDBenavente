/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gdb;

import gdb.model.Entidade;
import gdb.model.Receita;
import java.util.ArrayList;

/**
 *
 * @author MissyM
 */
public class MockupData {
    
    public static ArrayList<Entidade> entidades = new ArrayList<Entidade>();
    public static ArrayList<Receita> receitas = new ArrayList<Receita>();
    
    public static Entidade dummy=new Entidade("bilhete", "bilhete", "bilhete", "bilhete" );
    
}
