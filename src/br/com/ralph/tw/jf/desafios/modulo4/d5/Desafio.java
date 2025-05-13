package br.com.ralph.tw.jf.desafios.modulo4.d5;

import java.util.ArrayList;
import java.util.Scanner;

/* Dado um array de strings com N valores, complete o código abaixo de forma que cada elemento do array seja exibido em uma linha:

Entrada de dados

Java PHP C# Python JavaScript
Saída esperada

Java
PHP
C#
Python
JavaScript */
public class Desafio {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<String> palavras = new ArrayList<>();
        while (scanner.hasNext()) {
            String texto = scanner.next(); 
            
            if(";".equals(texto)) //necessário para interromper o laço quando executado via terminal
                break;
            
            palavras.add(texto);
        }

        palavras.forEach(palavra -> System.out.println(palavra));
        
        scanner.close();
        
    }
}
