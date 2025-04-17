import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite seu filme favorito:");
        String filme = leitura.nextLine();
        System.out.println("O filme escolhido foi: " + filme);
        System.out.println("Qual o ano de lançamento do filme?");
        int anoDeLancamento = leitura.nextInt();
        System.out.println("O ano de lancamento eh:" + anoDeLancamento);
        System.out.println("Qual sua avaliacao do filme?");
        double avaliacao = leitura.nextDouble();
        System.out.println("A avaliacao eh:" + avaliacao);
    }
}
