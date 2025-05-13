package br.com.ralph.tw.jf.desafios.modulo4.d2;

import java.util.Scanner;

/* Dado um valor inteiro N, complete o código abaixo de acordo com as condições:

Se N for ímpar, exiba no console: "Estranho";
Se N for par e for menor que 10, exiba no console: "Não é estranho";
Se N for par e estiver entre 10 e 20, exiba no console: "Estranho";
Se N for par e for maior que 20, exiba no console: "Não é estranho".
Entrada de dados 1

2
Saída esperada 1

Não é estranho
Entrada de dados 2

7
Saída esperada 2

Estranho

 */
public class Desafio {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();

        if (N % 2 != 0)
            System.out.println("Estranho");
        else if (N < 10)
            System.out.println("Não é estranho");
        else if (N <= 20)
            System.out.println("Estranho");
        else
            System.out.println("Não é estranho");

        scanner.close();
    }

}
