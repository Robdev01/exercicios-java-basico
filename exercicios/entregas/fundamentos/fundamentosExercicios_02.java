package exercicios.entregas.fundamentos;

import java.util.Scanner;

public class fundamentosExercicios_02 {
    public static void main(String[] args){
        var scanner =new Scanner(System.in);

        System.out.println("Informe o valor de um lado: ");
        double   lado = scanner.nextDouble();

        double  area = lado *lado;

        System.out.println("Área do quadrado: " + area);
    }
}
