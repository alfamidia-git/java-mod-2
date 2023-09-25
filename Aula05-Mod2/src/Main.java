
public class Main {
    public static void main(String[] args) {
//        DiaSemana dia = DiaSemana.DOMINGO;
//
//        System.out.println("Hoje é: " + dia);
//
//        if (dia == DiaSemana.DOMINGO) {
//            System.out.println("É dia de descanso!");
//        } else {
//            System.out.println("Ainda não é fim de semana.");
//        }


        Professor professor = new Professor("Joao", "Ciência");

        Turma turma01 = new Turma(102, 20, professor);

        System.out.println(turma01);
    }
}