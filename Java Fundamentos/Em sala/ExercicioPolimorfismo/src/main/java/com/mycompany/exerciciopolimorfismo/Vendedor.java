
package com.mycompany.exerciciopolimorfismo;

public class Vendedor extends Funcionario{
    public Double vendasManha;
    public Double vendasTarde;
    

    @Override
    public Double totalDeVendas(){
        return vendasManha + vendasTarde;
    }
    
 
    @Override
    public Double calculaComissao(){
        return Math.round((totalDeVendas() * 0.10)*100.0)/100.0;
    }
    
}
