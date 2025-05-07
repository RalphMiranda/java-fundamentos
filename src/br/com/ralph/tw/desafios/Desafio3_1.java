package br.com.ralph.tw.desafios;

import java.util.Scanner;

/* Leia dois dados do terminal, uma string e um valor inteiro e o exiba no console.

Entrada de dados

Treinaweb
10
Saída esperada

Treinaweb
10
 */

public class Desafio3_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String texto = scan.nextLine();
        int inteiro = scan.nextInt();

        System.out.println(texto);
        System.out.println(inteiro);

        scan.close();
    }
}
