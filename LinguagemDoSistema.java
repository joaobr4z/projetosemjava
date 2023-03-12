package com.mycompany.linguagemdosistema;

import java.util.Locale;

public class LinguagemDoSistema {

    public static void main(String[] args) {
        
      Locale idioma = Locale.getDefault();
      String linguagem = idioma.getLanguage();
      
       System.out.println("Essa é a linguagem do sistema: " + linguagem);
       
    }
}
