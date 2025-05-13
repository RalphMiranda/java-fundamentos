package br.com.ralph.tw.jf.desafios.modulo4.d4;

import java.util.Scanner;

/* Dado um número inteiro N, complete o código abaixo para que seja exibido a tabuada do valor, seguindo o formato:

N x i = resultado
Entrada de dados

2
Saída esperada

2 x 1 = 2
2 x 2 = 4
2 x 3 = 6
2 x 4 = 8
2 x 5 = 10
2 x 6 = 12
2 x 7 = 14
2 x 8 = 16
2 x 9 = 18
2 x 10 = 20 */
public class Desafio {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();

        for(int i = 1; i <= 10; i++) {
            System.out.println(String.format("%d x %d = %d", N, i, N * i));
        }

        scanner.close();
    }

}
