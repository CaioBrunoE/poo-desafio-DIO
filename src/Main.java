import domain.Iphone;

public class Main {
    public static void main(String[] args) {

        Iphone iphone = new Iphone();

        iphone.ligar("31999999999");
        iphone.iniciarCorreioVoz();
        iphone.atender();

        iphone.tocar();
        iphone.selecionarMusica("Nothing Else Matters - Metalica");
        iphone.pausar();

        iphone.exibirPagina("https://github.com/CaioBrunoE");
        iphone.atualizarPagina();
        iphone.adicionarNovaAba();
    }
}