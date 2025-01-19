package com.server;

import java.util.HashMap;
import java.util.Map;

public class Contador {

    private static Map<String, Integer> map;

    public Contador(){
        map = new HashMap<String, Integer>();
    }

    public int incluir(String palavra){

        try {
            Integer nPalavras = map.get(palavra);
        
            if(nPalavras == null){
                map.put(palavra, 1);
                System.out.println("Palavra incluida: " + palavra);
            }
            else{
                map.put(palavra, nPalavras+1);
                System.out.println("Palavra atualizada: " + palavra + " " + nPalavras);
            }           
        } catch (Exception e) {
            return 1;
            // TODO: handle exception
        }
        return 0;
    }

    public Map<String, Integer> consultar(){
        return map;
    }
}
