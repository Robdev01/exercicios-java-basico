package exercicios.entregas.fundamentos;

import java.util.Calendar;
import java.util.Scanner;

public class fundamentosExercicios_01 {
    public static void main(String[] args){
        var scanner =new Scanner(System.in);
        System.out.println("Informe seu nome");
        var nome = scanner.next();

        System.out.println("Em que ano você nasceu?");
        var ano = scanner.nextInt();

        int anoAtual = Calendar.getInstance().get(Calendar.YEAR);
        System.out.println("--------------------------");
        System.out.println("Ano atual: " + anoAtual);
        System.out.println("--------------------------");

        var resultado = anoAtual - ano;

        System.out.println("--------------------------------");
        System.out.printf("Olá %s você tem %s \n", nome, resultado);
        System.out.println("--------------------------------");
    }
}
