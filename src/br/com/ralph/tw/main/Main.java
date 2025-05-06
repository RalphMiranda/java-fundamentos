package br.com.ralph.tw.main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Olá, Mundo!"); // Imprime mensagem já com quebra de linha
        System.out.print("Olá mundo de novo \n"); // Imprime mensagem sem quebra de linha, por isso, o uso do metacactere "\n"
        System.out.print("Olá mundo mais uma vez \n");

        System.out.println(nome);
        scanner.close();
    }
}
