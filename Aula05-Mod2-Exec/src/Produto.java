public class Produto {

    private String nome;

    private double preco;

    private CategoriaProduto categoria;


    public Produto(String nome, double preco, CategoriaProduto categoria){
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;
    }


    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", categoria=" + categoria +
                '}';
    }
}
