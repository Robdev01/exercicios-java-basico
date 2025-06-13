package exercicios.entregas.estruturas;

import java.util.Scanner;

public class estruturasExercicio_04 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.print("Informe o número inicial: ");
        int numeroInicial = scanner.nextInt();

        while (true) {
            System.out.print("Informe outro número: ");
            int numero = scanner.nextInt();

            if (numero < numeroInicial) {
                System.out.println("Número ignorado (menor que o número inicial).");
                continue;
            }

            if (numero % numeroInicial != 0) {
                System.out.println("Número não divisível por " + numeroInicial + ". Encerrando...");
                break;
            }

            System.out.println("Número válido: " + numero);
        }
    }
}
