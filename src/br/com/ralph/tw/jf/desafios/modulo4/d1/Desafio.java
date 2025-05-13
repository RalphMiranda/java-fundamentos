package br.com.ralph.tw.jf.desafios.modulo4.d1;

import java.util.Scanner;

/* Dado um valor inteiro N, complete o código abaixo de acordo com as condições:

Se N for par, exiba no console: "Par";
Se N for ímpar, exiba no console: "Ímpar".
Entrada de dados 1

2
Saída esperada 1

Par
Entrada de dados 2

7
Saída esperada 2

Ímpar

 */
public class Desafio {

    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int N = scanner.nextInt();

        if (N % 2 == 0)
            System.out.println("Par");
        else
            System.out.println("Ímpar");

        scanner.close();
    }

}
