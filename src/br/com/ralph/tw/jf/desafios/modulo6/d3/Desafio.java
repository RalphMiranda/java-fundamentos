package br.com.ralph.tw.jf.desafios.modulo6.d3;

import java.util.InputMismatchException;
import java.util.Scanner;

/* Sabendo que os métodos Scanner.nextInt() realiza a conversão do valor lido para inteiro e gera o erro InputMismatchException caso possua outro valor. Leia os valores do terminal e escreva no console o valor inteiro ou "Gerou o erro InputMismatchException" caso ele não possa ser convertido.

Entrada de dados

3
2
Treinaweb
-12
Saída esperada

2
Gerou o erro InputMismatchException
-12
*/

public class Desafio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int valor = 0;
            try {
                valor = scanner.nextInt();
                System.out.println(valor);
            } catch (InputMismatchException e) {
                System.out.println("Gerou o erro InputMismatchException");
                scanner.nextLine();
            }
        }

        scanner.close();
    }
}
