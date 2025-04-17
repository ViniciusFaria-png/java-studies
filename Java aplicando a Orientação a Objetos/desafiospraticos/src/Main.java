//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.age = 24;
        p1.name = "Viga";
        System.out.println(p1.saudacao());

        Calculadora calc = new Calculadora();
        System.out.println(calc.dobrar(4));

        Musica musica = new Musica();
        musica.addRating(4);
        musica.addRating(3);
        musica.addRating(9);
        System.out.println(musica.averageRating());


        Carro carro = new Carro();
        carro.year = 2017;
        carro.ageVerification();

        Aluno aluno = new Aluno();
        aluno.nome = "Maria";
        aluno.idade = 20;

        aluno.display();
    }
}