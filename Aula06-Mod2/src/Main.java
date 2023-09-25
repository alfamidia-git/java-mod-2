public class Main {

    public static void main(String[] args) {
        Impressora.imprimir(Impressora.exemplo.toString());
        Impressora.exemplo.setValor("Sei lá - Alterado");
        Impressora.imprimir(Impressora.exemplo.toString());

    }
}