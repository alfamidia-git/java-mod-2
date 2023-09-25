public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.cor = "preto";
        carro.marca = "Chevrolet";
        carro.modelo = "Onix";
        carro.qtdCombustivel = 50;

        System.out.println(carro.cor);
        System.out.println(carro.marca);
        System.out.println(carro.modelo);
        System.out.println(carro.verQtdCombustivel());
        System.out.println(carro.estaLigado);

        carro.ligar();

        System.out.println(carro.estaLigado);
    }
}