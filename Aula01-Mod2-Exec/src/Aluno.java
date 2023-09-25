public class Aluno {
    String nome;
    long matricula;
    int qtdFaltas;

    public Aluno(String nome, long matricula, int qtdFaltas){
        this.nome = nome;
        this.matricula = matricula;
        this.qtdFaltas = qtdFaltas;
    }

    public Aluno(){

    }
    public void adicionarFalta(){
        qtdFaltas++;
    }
}
