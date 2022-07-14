
package com.mycompany.exerciciopolimorfismo;

public class Gerente extends Funcionario{
    Vendedor vendedor1;
    Vendedor vendedor2;
    
    public Gerente (){
        vendedor1 = new Vendedor();
        vendedor2 = new Vendedor();
    }
    
 
    @Override
    public Double totalDeVendas(){
        return vendedor1.totalDeVendas() + vendedor2.totalDeVendas();
    }
    
 
    @Override
    public Double calculaComissao(){
     
        return Math.round((totalDeVendas() * 0.02)*100.0)/100.0;
    }
}
