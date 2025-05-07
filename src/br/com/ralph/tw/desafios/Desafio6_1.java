package br.com.ralph.tw.desafios;

import java.util.Scanner;

/* Dado um valor inteiro N, escreva no console em quais tipos de dados ele pode ser armazenado, sendo que os possíveis são:

byte: inteiro de 8bits com sinal;
short: inteiro de 16 bits com sinal;
int: inteiro de 32bits com sinal;
long: inteiro de 64btis com sinal.
A saída do console deve ser:

N pode ser armazenado nos tipos:
* tipos de dados
Caso o valor não puder ser armazenado em um tipo numérico inteiro, deve ser exibido:

N não pode ser armazenado em nenhum tipo numérico inteiro
Entrada de dados

5
-150
150000
1500000000
213333333333333333333333333333333333
-100000000000000
Saída esperada

-150 pode ser armazenado nos tipos:
* short
* int
* long
150000 pode ser armazenado nos tipos:
* int
* long
1500000000 pode ser armazenado nos tipos:
* int
* long
213333333333333333333333333333333333 não pode ser armazenado em nenhum tipo numérico inteiro.
-100000000000000 pode ser armazenado nos tipos:
* long */

public class Desafio6_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for(int i = 0; i < t; i++) {
            try {
                long x = scanner.nextLong();
                System.out.println(x + " pode ser armazenado nos tipos:");

                if (x >= Byte.MIN_VALUE && x <= Byte.MAX_VALUE)
                    System.out.println("* byte");
                if (x >= Short.MIN_VALUE && x <= Short.MAX_VALUE)
                    System.out.println("* short");
                if (x >= Integer.MIN_VALUE && x <= Integer.MAX_VALUE)
                    System.out.println("* int");
                if (x >= Long.MIN_VALUE && x <= Long.MAX_VALUE)
                    System.out.println("* long");
                
            } catch (Exception e) {
                System.out.println(scanner.next() + " não pode ser convertido em nenhum tipo numérico inteiro");
            }
        }

        scanner.close();

    }

}
