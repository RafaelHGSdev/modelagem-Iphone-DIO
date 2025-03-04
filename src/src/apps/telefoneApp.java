package apps;

import interfaces.AparelhoTelefonico;

import java.util.Random;

public class telefoneApp implements AparelhoTelefonico {
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para o número: " + numero);
    }

    @Override
    public boolean atender() {
        Random random = new Random();
        return random.nextInt(3)+1 == 1;
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Chamada não atendida, iniciando mensagem de voz");
    }
}
