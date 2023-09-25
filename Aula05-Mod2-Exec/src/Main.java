public class Main {
    public static void main(String[] args) {

        Produto produto01 = new Produto("Computador", 2500, CategoriaProduto.ELETRONICO);
        Produto produto02 = new Produto("Carne moida", 25.9, CategoriaProduto.ALIMENTO);
        Produto produto03 = new Produto("Calça", 140, CategoriaProduto.VESTUARIO);
        Produto produto04 = new Produto("Sabão em pó", 27.5, CategoriaProduto.LIMPEZA);

        System.out.println(produto01);
        System.out.println(produto02);
        System.out.println(produto03);
        System.out.println(produto04);

    }
}