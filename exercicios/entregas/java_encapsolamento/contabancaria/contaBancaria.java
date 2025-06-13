package exercicios.entregas.java_encapsolamento.contabancaria;

public class contaBancaria {
    private double saldo;
    private double chequeEspecial;
    private double usadoChequeEspecial;

    public contaBancaria(double depositoInicial){
        this.saldo = depositoInicial;

        if(depositoInicial <= 500){
            this.chequeEspecial = 50.00;
        }else{
            this.chequeEspecial = depositoInicial * 0.5;
        }
        this.usadoChequeEspecial = 0;
    }

    public void consultarSaldo() {
        System.out.printf("Saldo disponível: R$ %s. \n", saldo);
        System.out.printf("Saldo disponével do cheque especial: R$ %s. \n", chequeEspecial);
        System.out.printf("Saldo total: R$ %s. \n", saldo + chequeEspecial);
    }
    public void consultarChequeEspecial(){
        System.out.printf("Saldo disponével: R$ %s \n", chequeEspecial);
        System.out.printf("Usado do cheque especial: R$ %s \n", usadoChequeEspecial);
    }
    public void depositar(double valor) {
        if (usadoChequeEspecial > 0) {
            double taxa = usadoChequeEspecial * 0.2;
            double totalCobrado = usadoChequeEspecial + taxa;

            if (valor >= totalCobrado) {
                valor -= totalCobrado;
                usadoChequeEspecial = 0;
                System.out.printf("R$ %.2f foram usados para cobrir o cheque especial (incluindo taxa de R$ %.2f)\n", totalCobrado, taxa);
            } else {
                double usado = valor / 1.2;
                usadoChequeEspecial -= usado;
                System.out.printf("Parte do cheque especial foi coberta com R$ %.2f (incluindo taxa)\n", valor);
                valor = 0;
            }
        }
        saldo += valor;
        System.out.printf("Depósito realizado. Novo saldo: R$ %.2f\n", saldo);
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
        } else if (valor <= saldo + chequeEspecial - usadoChequeEspecial) {
            double restante = valor - saldo;
            saldo = 0;
            usadoChequeEspecial += restante;
        } else {
            System.out.println("Saldo insuficiente, mesmo com cheque especial.");
            return;
        }
        System.out.printf("Saque realizado. Saldo atual: R$ %.2f\n", saldo);
    }

    public void pagarBoleto(double valor) {
        System.out.println("Pagando boleto...");
        sacar(valor);
    }

    public void verificarUsoChequeEspecial() {
        if (usadoChequeEspecial > 0) {
            System.out.printf("Você está usando R$ %.2f do cheque especial.\n", usadoChequeEspecial);
        } else {
            System.out.println("Você não está usando o cheque especial.");
        }
    }
}
