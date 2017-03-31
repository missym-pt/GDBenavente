/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gdb.views;

import gdb.controller.*;
import java.util.Scanner;

/**
 *
 * @author MissyM
 */
public class Gdb_views {
    
    public Gdb_views(){
    
    Entidade_controller ec=new Entidade_controller();
    Receita_controller rc=new Receita_controller();
    int i=0;
    
    do{
    System.out.println("<------------------MENU------------------>");
    System.out.println("1 - Criar nova entidade\n2 - Vender bilhete\n3 - Receber pagamento\n4 - Verificar sócio que mais pagou\n5 - Verificar mês em que houveram mais recebimentos\n0 - SAIR");
    i=new Scanner(System.in).nextInt();
    switch (i){
        case 1: case1(ec);
            break;
        case 2: case2(rc);
            break;
        case 3: case3(rc);
            break;
        case 4: case4(rc);
            break;
        case 5: case5(rc);
            break;
        default:break;}
    }while(i>0 || i<5);
}
    
    public void case1(Entidade_controller ec){
        int i;
        do{
        System.out.println("Seleccione o tipo de entidade:\n1 - Sócio\n2 - Benemérito");
        i=new Scanner(System.in).nextInt();
        }while(i<1 || i>2);
        String tipo= i==1? "Sócio": "Benemérito";
        System.out.println("Indique o nome do novo " + tipo);
        String nome=new Scanner(System.in).nextLine();
        System.out.println("Indique a localidade do novo " + tipo);
        String localidade=new Scanner(System.in).nextLine();
        System.out.println("Indique o contacto do novo " + tipo);
        String contacto=new Scanner(System.in).nextLine();        
        ec.criar_entidade(nome, localidade, contacto, tipo);      
    }
    
    public void case2(Receita_controller rc){
        System.out.println("Insira a quantidade de bilhetes que deseja vender");
        int i=new Scanner(System.in).nextInt();
        System.out.println("Indique o preço unitário de cada bilhete");
        rc.venderBilhetes(i, new Scanner(System.in).nextInt());        
    }
    
    public void case3(Receita_controller rc){
        System.out.println("Indique a proveniencia do recebimento\n1 - Quotas\n2 - Donativo");
        int tipo_ent=new Scanner(System.in).nextInt();
        System.out.println("Indique o Nome do pagante");
        String nome=new Scanner(System.in).nextLine();
        System.out.println("Indique o valor pago ");
        String result= rc.receberPagamento(nome, new Scanner(System.in).nextFloat(), tipo_ent)== null? "\nPAGANTE NÃO ENCONTRADO PARA ESTE TIPO DE RECEBIMENTO\nPor favor insira entidade no menu correspondente" : "Pagamento registado";
        System.out.println(result);
    }
    
    public void case4(Receita_controller rc){
        System.out.println("O sócio\\beneficiário com maior volume de pagamentos é "+ rc.maiorPagante().getNome());
    }
    
    public void case5(Receita_controller rc){
        System.out.println("O mes com maior volume de FACTURAÇÃO é "+ rc.melhorMes());
    }
    
    }
    

