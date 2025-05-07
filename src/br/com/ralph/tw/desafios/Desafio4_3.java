package br.com.ralph.tw.desafios;

import java.util.Scanner;

/* Sabendo que o fatorial de um valor n é:

n! = n x (n – 1) x (n – 2) x (n – 3)  x ... x 2 x 1.
Por exemplo,

5!= 5 x 4 x 3 x 2 x 1 = 120
Complete o código de forma que seja lido um valor N e seja retornado o seu valor fatorial.

Entrada de dados

5
Saída esperada

120 */

public class Desafio4_3 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        int fatorial = 1;

        while (N >= 1) {
            fatorial = fatorial * N;
            N--;
        }

        /* for(int i = N; i > 0; i--) {
            fatorial *= i;
        } */

        System.out.println(fatorial);

        scanner.close();
    }

}
