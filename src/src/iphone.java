import apps.NavegadorSafari;
import apps.Spotify;
import apps.telefoneApp;


public class iphone {
    public static void main(String[] args) {

        NavegadorSafari navegadorDeInternet = new NavegadorSafari();
        Spotify reprodutorDeMusica = new Spotify();
        telefoneApp telefone = new telefoneApp();

        System.out.println("Navegando na internet");
        navegadorDeInternet.exibirPagina();
        navegadorDeInternet.adicionarNovaAba();
        navegadorDeInternet.atualizarPagina();

        System.out.println("Ouvindo Músicas");
        reprodutorDeMusica.selecionarMusica("Cant Help Falling in Love - Elvis Presley");
        reprodutorDeMusica.tocar();
        reprodutorDeMusica.pausar();

        System.out.println("Realizando chamada telefonica");
        telefone.ligar("123456789");

        System.out.println("Recebendo chamada telefonica");
        if (telefone.atender()){
            System.out.println("você atendeu ao telefone");
        }
        else{
            telefone.iniciarCorreioVoz();
        }


    }
}