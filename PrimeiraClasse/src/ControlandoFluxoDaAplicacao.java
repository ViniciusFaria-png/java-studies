import java.util.Scanner;

public class ControlandoFluxoDaAplicacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int number = scanner.nextInt();
        if(number > 0){
            System.out.println("Número positivo");
        } else{
            System.out.println("Número negativo");
        }

        System.out.println("Digite dois valores");
        System.out.println("Primeiro valor: ");
        int number1 = scanner.nextInt();
        System.out.println("Segundo valor: ");
        int number2 = scanner.nextInt();

        if(number1 > number2){
            System.out.println("Numero 1 maior que o numero 2");
        }
        else if(number1 < number2){
            System.out.println("Numero 2 maior que o numero 1");
        } else {
            System.out.println("Os numeros sao iguais");
        }


        System.out.println("MENU");
        System.out.println("1 para Calcular a area do quadrado");
        System.out.println("2 para Calcular a area do circulo");

        int escolha = scanner.nextInt();
        switch(escolha){
            case 1:
                System.out.println("Calculando area do quadrado");
                System.out.println("Digite o lado do quadrado: ");
                int lado = scanner.nextInt();
                int areaQuadrado = lado * lado;
                System.out.println("A area do quadrado eh: " + areaQuadrado);
                break;
            case 2:
                System.out.println("Calculando area do circulo");
                System.out.println("Digite o raio do circulo: ");
                double raio = scanner.nextDouble();
                double areaCirculo = Math.PI * Math.pow(raio, 2);
                System.out.println("A area do circulo eh: " + areaCirculo);
        }

        System.out.println("Digite um numero: ");
        int numero3 = scanner.nextInt();
        int cont = 1;
        while(cont <= 10){
            System.out.println(numero3 + " x " + cont + " = " + numero3 * cont );
            cont++;
        }


        System.out.println("Digite um numero inteiro: ");
        int numero4 = scanner.nextInt();
        if(numero4 % 2 == 0){
            System.out.println("Numero par");
        } else {
            System.out.println("Numero impar");
        }

        System.out.println("Digite um numero para calcular o fatorial: ");
        int numero5 = scanner.nextInt();
        int fatorial = 1;
        while(numero5 > 0){
            fatorial *= numero5;
            numero5--;
        }
        System.out.println("O fatorial de " + numero5 + " eh: " + fatorial);




    }

}
