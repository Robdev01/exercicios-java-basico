package exercicios.entregas.estruturas;

import java.util.Scanner;

public class estruturasExercicio_03 {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        // Entrada dos números
        System.out.print("Digite o primeiro número: ");
        int inicio = scanner.nextInt();

        System.out.print("Digite o segundo número (maior que o primeiro): ");
        int fim = scanner.nextInt();

        if (fim <= inicio) {
            System.out.println("O segundo número deve ser maior que o primeiro.");
            return;
        }

        // Escolha entre par ou ímpar
        System.out.print("Você deseja ver os números pares ou ímpares? (Digite 'par' ou 'impar'): ");
        String opcao = scanner.next().toLowerCase();

        System.out.printf("Números %s entre %d e %d em ordem decrescente:%n", opcao, inicio, fim);

        for (int i = fim; i >= inicio; i--) {
            if (opcao.equals("par") && i % 2 == 0) {
                System.out.print(i + " ");
            } else if (opcao.equals("impar") && i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
