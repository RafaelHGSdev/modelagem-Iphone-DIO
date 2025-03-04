package apps;

import interfaces.NavegadorInternet;

public class NavegadorSafari implements NavegadorInternet {
    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página web pelo navegador");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.printf("Abrindo nova aba no navegador de internet");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página do navegador");
    }
}
