
public class Main {
    public static void main(String[] args) {
        Livro livro1 = new Livro("Dom Casmurro", "Machado de Assis", 1899);
        Livro livro2 = new Livro("O Príncipe", "Maquiavel", 1532);
        Livro livro3 = new Livro("Dom Casmurro", "Machado de Assis", 1899);

        System.out.println(livro1);
        System.out.println(livro2);
        System.out.println(livro3);

        System.out.println(livro1.hashCode());
        System.out.println(livro2.hashCode());
        System.out.println(livro3.hashCode());


        System.out.println(livro1.equals(livro2));
        System.out.println(livro1.equals(livro3));


    }
}