package exercicios.entregas.java_encapsolamento.funcoesCarro;

public class carro {
    private boolean ligado;
    private int velocidade;
    private int marcha;

    public carro() {
        this.ligado = false;
        this.velocidade = 0;
        this.marcha = 0;
    }

    public void ligar() {
        if (!ligado) {
            ligado = true;
            System.out.println("Carro ligado.");
        } else {
            System.out.println("O carro já está ligado.");
        }
    }

    public void desligar() {
        if (ligado && velocidade == 0 && marcha == 0) {
            ligado = false;
            System.out.println("Carro desligado.");
        } else {
            System.out.println("Não é possível desligar o carro. Ele deve estar parado e em ponto morto.");
        }
    }

    public void acelerar() {
        if (!ligado) {
            System.out.println("O carro está desligado.");
            return;
        }

        if (marcha == 0) {
            System.out.println("Não é possível acelerar em ponto morto.");
            return;
        }

        if (velocidade >= 120) {
            System.out.println("Velocidade máxima atingida.");
            return;
        }

        int novaVelocidade = velocidade + 1;
        if (!velocidadePermitida(novaVelocidade)) {
            System.out.println("Velocidade excede o limite da marcha atual.");
        } else {
            velocidade = novaVelocidade;
            System.out.println("Acelerou para " + velocidade + " km/h.");
        }
    }

    public void diminuirVelocidade() {
        if (!ligado) {
            System.out.println("O carro está desligado.");
            return;
        }

        if (velocidade == 0) {
            System.out.println("O carro já está parado.");
            return;
        }

        velocidade -= 1;
        System.out.println("Velocidade reduzida para " + velocidade + " km/h.");
    }

    public void virar(String direcao) {
        if (!ligado) {
            System.out.println("O carro está desligado.");
            return;
        }

        if (velocidade >= 1 && velocidade <= 40) {
            System.out.println("Virando para " + direcao + "...");
        } else {
            System.out.println("Não é possível virar a " + direcao + " nessa velocidade.");
        }
    }

    public void trocarMarcha(int novaMarcha) {
        if (!ligado) {
            System.out.println("O carro está desligado.");
            return;
        }

        if (novaMarcha < 0 || novaMarcha > 6) {
            System.out.println("Marcha inválida.");
            return;
        }

        if (Math.abs(novaMarcha - marcha) != 1) {
            System.out.println("Você só pode trocar para a marcha imediatamente anterior ou seguinte.");
            return;
        }

        marcha = novaMarcha;
        System.out.println("Marcha trocada para: " + marcha);
    }

    public void verificarVelocidade() {
        System.out.println("Velocidade atual: " + velocidade + " km/h");
    }

    private boolean velocidadePermitida(int v) {
        switch (marcha) {
            case 1: return v >= 0 && v <= 20;
            case 2: return v >= 21 && v <= 40;
            case 3: return v >= 41 && v <= 60;
            case 4: return v >= 61 && v <= 80;
            case 5: return v >= 81 && v <= 100;
            case 6: return v >= 101 && v <= 120;
            default: return false;
        }
    }
}
