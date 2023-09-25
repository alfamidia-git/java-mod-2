
public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.setMarca("Hyundai");
        carro.setModelo("I30");
        carro.setCor("Preto");

        System.out.println("Marca: " + carro.getMarca());
        System.out.println("Modelo: " + carro.getModelo());
        System.out.println("Cor: " + carro.getCor());
    }
}