
package com.mycompany.exemplohashmap;

import java.util.HashMap;

public class ExemploHashMap {

    public static void main(String[] args) {
        //Criando um HashMap
        HashMap<String, String> estados = new HashMap<String, String>();
        
        //Adicionando dados em cada posição do HashMap
        estados.put("Santa Catarina", "Florianópolis");
        estados.put("Paraná", "Curitiba");
        estados.put("Minas Gerais", "Belo Horizonte");
        
        //Exibindo o valor de HashMap
        System.out.println(estados);
        
        //Exibindo o valor de Florianopolis
        System.out.println(estados.get("Santa Catarina"));
        
        //Removendo o elemento onde a chave é Parana
        estados.remove("Paraná");
        System.out.println(estados);
        
    }
}
