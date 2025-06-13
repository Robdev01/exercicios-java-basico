package exercicios.entregas.fundamentos;

import java.util.Scanner;

public class fundamentosExercicios_03 {
    public static void main(String[] args){
        var scanner =new Scanner(System.in);

        System.out.println("Informe o valor da BASE: ");
        double base = scanner.nextDouble();

        System.out.println("Informe o valor da ALTURA: ");
        double altura = scanner.nextDouble();

        double  area = base * altura;

        System.out.println("O calculo da Área: " + area);
    }
}
