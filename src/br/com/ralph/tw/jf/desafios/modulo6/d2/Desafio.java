package br.com.ralph.tw.jf.desafios.modulo6.d2;

import java.util.ArrayList;
import java.util.Scanner;

/* Leia os dados do terminal até que seja encontrada a última linha e no final, as exiba.

Entrada de dados

Olá Mundo!
Linha de um arquivo
Última linha do arquivo
Saída esperada

1 Olá Mundo!
2 Linha de um arquivo
3 Última linha do arquivo
Dica:

O método Scanner.hasNextLine() pode ser útil na resolução deste desafio. */

public class Desafio {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> entradas = new ArrayList<>();
        while (scanner.hasNextLine()) {
            String texto = scanner.nextLine();
            
            if (";".equals(texto))
                break;

            entradas.add(texto);
        }

        for (int i = 0; i < entradas.size(); i++) {
            System.out.println(String.format("%d %s", i+1, entradas.get(i)));
        }

/*      Scanner scann = new Scanner(System.in);
        int i = 1;
        while(scann.hasNextLine())
        {
            String line = scann.nextLine();
            System.out.printf("%d %s\n", i, line);
            i++;
        }
*/
        scanner.close();
    }

}
