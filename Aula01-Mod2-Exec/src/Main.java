
public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.nome = "Fulano";
        aluno.matricula = 20230801;

        aluno.adicionarFalta();
        aluno.adicionarFalta();

        System.out.println(aluno.nome);
        System.out.println(aluno.matricula);
        System.out.println(aluno.qtdFaltas);


        Aluno aluno2 = new Aluno("Ciclano", 20230725, 0);
        aluno2.adicionarFalta();
        aluno2.adicionarFalta();
        aluno2.adicionarFalta();

        System.out.println(aluno2.nome);
        System.out.println(aluno2.matricula);
        System.out.println(aluno2.qtdFaltas);
    }
}