package br.com.ralph.tw.main;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int acao = 1; // 0 = Sair, 1 = Operação Matemática, 2 = Histórico de Operações

        ArrayList<String> historico = new ArrayList<>();

        while (acao > 0) {
            if (acao == 1) {
                System.out.println("\n=== Operação Matemática ===");

                System.out.print("Digite o primeiro número: ");
                int numero1 = scanner.nextInt();

                System.out.print("Digite a operação: ");
                char operacao = scanner.next().charAt(0);

                System.out.print("Digite o segundo número: ");
                int numero2 = scanner.nextInt();

                System.out.println(String.format("Você quer a fazer operação %d %c %d", numero1, operacao, numero2));

                int resultado = 0;

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

                String entradaHistorico = String.format("%d %c %d = %d", numero1, operacao, numero2, resultado);
                historico.add(entradaHistorico);
                System.out.println(entradaHistorico);

            } else if (acao == 2) {
                System.out.println("\n=== Histórico de Operações");

                System.out.println(String.format("Você realizou %d operações", historico.size()));

                //for (int i = 0; i < historico.size(); i++) {
                //    System.out.println(historico.get(i));
                //}

                historico.forEach(itemHistorico -> System.out.println(itemHistorico));
            } else {
                System.out.println("Opção inválida!");
            }

            System.out.println("\n=== O que deseja fazer? ===");
            System.out.println("0. Sair");
            System.out.println("1. Operações Matemáticas");
            System.out.println("2. Histórico de Operações");
            System.out.print("Opção: ");

            acao = scanner.nextInt();

        }

        scanner.close();
    }
}
