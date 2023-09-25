public class Turma {
    private int identificador;

    private int nrAlunos;

    private Professor professor;


    public Turma(int identificador, int nrAlunos, Professor professor){
        this.identificador = identificador;
        this.nrAlunos = nrAlunos;
        this.professor = professor;
    }

    @Override
    public String toString() {
        return "Turma{" +
                "identificador=" + identificador +
                ", nrAlunos=" + nrAlunos +
                ", professor=" + professor +
                '}';
    }
}
