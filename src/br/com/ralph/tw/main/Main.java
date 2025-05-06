package br.com.ralph.tw.main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite a operação: ");
        char operacao = scanner.next().charAt(0);

        System.out.print("Digite o segundo número: ");
        int numero2 = scanner.nextInt();

        System.out.println(String.format("Você quer a fazer operação %d %c %d", numero1, operacao, numero2));

        int resultado = 0;

        /*if (operacao == '+') {
            resultado = numero1 + numero2;
        } else if (operacao == '-') {
            resultado = numero1 - numero2;
        } else if (operacao == '*') {
            resultado = numero1 * numero2;
        } else if (operacao == '/') {
            resultado = numero1 / numero2;
        } else {
            System.out.println("Operação inválida");
        }*/

        switch (operacao) {
            case '+':
                resultado = numero1 + numero2;
                break;
            case '-':
                resultado = numero1 - numero2;
                break;
            case '*':
                resultado = numero1 * numero2;
                break;
            case '/':
                resultado = numero1 + numero2;
                break;
            default:
                System.out.println("Operação inválida");
                break;
        }

        System.out.println(String.format("%d %c %d = %d", numero1, operacao, numero2, resultado));

        scanner.close();
    }
}
