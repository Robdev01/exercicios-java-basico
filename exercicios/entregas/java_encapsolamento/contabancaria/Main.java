package exercicios.entregas.java_encapsolamento.contabancaria;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        var scanner = new Scanner(System.in);

        System.out.print("Digite o valor inicial para criar a conta: R$ ");
        double depositoInicial = scanner.nextDouble();


        var conta = new contaBancaria(depositoInicial);

        int acao;
        do{
            System.out.println("\n--- MENU ---");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Consultar cheque especial");
            System.out.println("3. Depositar dinheiro");
            System.out.println("4. Sacar dinheiro");
            System.out.println("5. Pagar boleto");
            System.out.println("6. Verificar uso do cheque especial");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            acao = scanner.nextInt();

            switch (acao) {
                case 1:
                    conta.consultarSaldo();
                    break;
                case 2:
                    conta.consultarChequeEspecial();
                    break;
                case 3:
                    System.out.print("Valor do depósito: R$ ");
                    double deposito = scanner.nextDouble();
                    conta.depositar(deposito);
                    break;
                case 4:
                    System.out.print("Valor do saque: R$ ");
                    double saque = scanner.nextDouble();
                    conta.sacar(saque);
                    break;
                case 5:
                    System.out.print("Valor do boleto: R$ ");
                    double boleto = scanner.nextDouble();
                    conta.pagarBoleto(boleto);
                    break;
                case 6:
                    conta.verificarUsoChequeEspecial();
                    break;
                case 0:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (acao != 0);

        scanner.close();




    }
}
