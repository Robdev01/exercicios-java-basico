package exercicios.entregas.estruturas;

import java.util.Scanner;

public class estruturasExercicio_02 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.print("Informe sua altura (em metros, exemplo 1.75): ");
        double altura = scanner.nextDouble();

        System.out.print("Informe seu peso (em kg): ");
        double peso = scanner.nextDouble();

        double imc = peso / (altura * altura);

        System.out.printf("Seu IMC é: %.2f%n", imc);

        if (imc <= 18.5) {
            System.out.println("Abaixo do peso");
        } else if (imc <= 24.9) {
            System.out.println("Peso ideal");
        } else if (imc <= 29.9) {
            System.out.println("Levemente acima do peso");
        } else if (imc <= 34.9) {
            System.out.println("Obesidade Grau I");
        } else if (imc <= 39.9) {
            System.out.println("Obesidade Grau II (Severa)");
        } else {
            System.out.println("Obesidade III (Mórbida)");
        }
    }
}
