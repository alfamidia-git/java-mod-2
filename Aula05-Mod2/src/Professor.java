public class Professor {

    private String nome;

    private String disciplina;

    public Professor(String nome, String disciplina){
        this.nome = nome;
        this.disciplina = disciplina;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "nome='" + nome + '\'' +
                ", disciplina='" + disciplina + '\'' +
                '}';
    }
}
