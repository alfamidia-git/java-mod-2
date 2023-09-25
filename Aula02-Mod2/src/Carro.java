public class Carro {
    String marca;
    String modelo;
    String cor;
    boolean estaLigado;
    Integer qtdCombustivel;

    public Carro(String marca, String modelo, String cor){ // esse é nosso construtor
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
    }

    public Carro(){

    }

    public void ligar(){
        this.estaLigado = true;
    }

    public void desligar(){
        this.estaLigado = false;
    }

    public Integer verQtdCombustivel(){
        return this.qtdCombustivel;
    }
}
