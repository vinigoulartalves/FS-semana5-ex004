public class Main {
    public static void main(String[] args) {

        ListaJogadores lista = new ListaJogadores();
        lista.iniciarListaJogadores();

        lista.exibirMelhoresJogadores();

        System.out.println("------------------");

        lista.exibirTop10();

    }
}
