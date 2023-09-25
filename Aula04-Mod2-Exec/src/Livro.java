import java.util.Objects;

public class Livro {
    private String titulo;

    private String autor;

    private int anoPublicado;

    public Livro(String titulo, String autor, int anoPublicado){
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicado = anoPublicado;
    }


    public String toString(){
        return "Livro [ titulo: " + this.titulo + " - autor: " +
                this.autor + " - ano de publicação: " + this.anoPublicado + "]";
    }

    public boolean equals(Livro outroLivro){
        if(this == outroLivro){
            return true;
        }

        if(outroLivro == null || getClass() != outroLivro.getClass()){
            return false;
        }

        return Objects.equals(this.titulo, outroLivro.titulo) && Objects.equals(this.autor, outroLivro.autor)
                && Objects.equals(this.anoPublicado, outroLivro.anoPublicado);
    }


    public int hashCode(){
        return Objects.hash(this.titulo, this.autor, this.anoPublicado);
    }
}
