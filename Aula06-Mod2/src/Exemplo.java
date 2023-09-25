public class Exemplo {

    private String valor = "Sei lá";

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Exemplo{" +
                "valor='" + valor + '\'' +
                '}';
    }
}
