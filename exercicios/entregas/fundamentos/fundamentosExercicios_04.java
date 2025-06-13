package exercicios.entregas.fundamentos;

import java.util.Scanner;

public class fundamentosExercicios_04 {
    public static void main(String[] args){
        var scanner =new Scanner(System.in);

        System.out.println("Informe o nome da 1° pessoa:");
        var pessoa1 = scanner.next();

        System.out.printf("%s, Informe idade: \n ", pessoa1);
        int idade1 = scanner.nextInt();


        System.out.println("Informe o nome da 2° pessoa:");
        var pessoa2 = scanner.next();


        System.out.printf("%s, Informe idade: \n ", pessoa2);
        int idade2 = scanner.nextInt();



        int diferencaIdade = Math.abs(idade1 - idade2);

        System.out.printf("1° pessoa %s, idade %s \n", pessoa1, idade1);
        System.out.printf("2° pessoa %s, idade %s \n", pessoa2, idade2);

        System.out.printf("A diferença de idade entre vocês é de %s ano(s).%n", diferencaIdade);


    }
}
