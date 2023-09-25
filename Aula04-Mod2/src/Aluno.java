import java.util.Objects;

public class Aluno {
    private long matricula;
    private String nome;


    public Aluno(long matricula, String nome){
        this.matricula = matricula;
        this.nome = nome;
    }

    public String toString(){
        return "Aluno [ matricula: " + this.matricula + " - nome: " + this.nome + "]";
    }

    public boolean equals(Aluno outro){
        if(this == outro){
            return true;
        }
        if(outro == null || getClass() != outro.getClass()){
            return false;
        }
        return Objects.equals(this.matricula, outro.matricula) && Objects.equals(this.nome, outro.nome);
    }

    public int hashCode(){
        return Objects.hash(this.matricula, this.nome);
    }
}
