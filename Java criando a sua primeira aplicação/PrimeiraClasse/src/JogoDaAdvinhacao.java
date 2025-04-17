import java.util.Random;
import java.util.Scanner;

public class JogoDaAdvinhacao {
    public static void main(String[] args) {
        int randomNumber = new Random().nextInt(100);
        Scanner scanner = new Scanner(System.in);
        int userNumber = 0;
        int count = 0;
        System.out.println("O numero sorteado eh: " + randomNumber);
        while(userNumber != randomNumber){
            System.out.println("Qual número voce acha que eh: ");
            userNumber = scanner.nextInt();
            if(userNumber == randomNumber){
                System.out.println("Voce acertou mais que a sorte!");
                break;
            }
        }


    }
}
