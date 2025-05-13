package br.com.ralph.tw.jf.desafios.modulo4.d6;

import java.util.Scanner;

/* Supondo três inteiros: a , b e n; aplicados a seguinte fórmula:

(a + 2^0 x b),(a + 2^0 x b + 2^1 x b), ... , (a + 2^0 x b + 2^1 x b + ... + 2^n-1 x b)

Onde serão informados q sequências de a, b e n. Para cada uma, informe no console a série correspondente dos valores em uma única linha, sepados por espaço.

Entrada de dados

2
0 2 3
5 3 5
Saída esperada

2 6 14
8 14 26 50 98
Explicação:

Sendo passado duas sequências:

1a: Onde a = 0, b = 2 e n = 3, é produzido os dados:

0 + 1 x 2 = 2
0 + 1 x 2 + 2 x 2 = 6
0 + 1 x 2 + 2 x 2 + 4 x 2 = 14
2a: Onde a = 5, b = 3 e n = 5, é produzido os dados:

5 + 1 x 3 = 8.
5 + 1 x 3 + 2 x 3 = 14.
5 + 1 x 3 + 2 x 3 + 4 x 3 = 26.
5 + 1 x 3 + 2 x 3 + 4 x 3 + 8 x 3 = 50.
5 + 1 x 3 + 2 x 3 + 4 x 3 + 8 x 3 + 16 x 3 = 98.
Obs: No Java utilize o método Math.pow para potenciação. */

public class Desafio {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();
;
            int resultado = 0;

            for (int e = 0; e < n; e++) {
                if (e == 0)
                    resultado += a + (Math.pow(2, e) * b);
                else 
                    resultado += (Math.pow(2, e) * b);

                System.out.print(String.format("%d ", resultado));
            }

            /*
             int[] result = new int[n] ;

            for(int j = 0; j < n; j++)
            {
                result[j] = a;
                for(int k = 0; k <= j; k++)
                {
                    int exp = (int)Math.pow(2, k);
                    result[j] += exp * b;
                }
            }

            for(int j = 0; j < n; j++)
            {
                System.out.printf("%d ", result[j]);
            }

            System.out.print("\n");
             */

        }

        
        scanner.close();
    }

}
