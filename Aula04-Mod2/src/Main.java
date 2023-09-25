
public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno(20230101, "Ciclano");
        Aluno aluno2 = new Aluno(20230101, "Ciclano");

        System.out.println(aluno.hashCode());
        System.out.println(aluno2.hashCode());

    }
}