package exercicios.entregas.estruturas;

import java.util.Scanner;

public class estruturasExercicio_01 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.print("Digite um número para ver a tabuada: ");
        int numero = scanner.nextInt();

        System.out.println("\nTabuada de Multiplicação e Divisão do número " + numero + ":\n");
        System.out.printf("%-20s%-20s%n", "Multiplicação", "Divisão");
        System.out.println("----------------------------------------------");

        for (int i = 1; i <= 10; i++) {
            int multiplicacao = numero * i;
            double divisao = (double) numero / i;

            System.out.printf("%-20s%-20s%n",
                    numero + " x " + i + " = " + multiplicacao,
                    numero + " / " + i + " = " + String.format("%.2f", divisao)
            );
        }

    }
}
