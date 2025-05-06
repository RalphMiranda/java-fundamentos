package br.com.ralph.tw.main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        //int numero = Integer.parseInt(scanner.nextLine());
        int numero = scanner.nextInt();

        System.out.println(numero);

        scanner.close();
    }
}
