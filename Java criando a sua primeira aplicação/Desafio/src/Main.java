import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem vindo ao Viga's Bank, seu banco favorito");
        System.out.println("Qual seu nome? ");
        String name = scanner.nextLine();
        double saldo = 0;
        System.out.println("***********************************************");
        System.out.println("Dados iniciais do cliente:");
        System.out.println();
        System.out.println("Nome: " + name);
        System.out.println("Tipo conta: Corrente");
        System.out.println("Saldo inicial: R$ " + saldo);
        System.out.println("***********************************************");

        int valor = 0;
        while(valor != -1){
            System.out.println("Operações");
            System.out.println();
            System.out.println("1 - Consultar saldos");
            System.out.println("2 - Receber valor");
            System.out.println("3 - Transferir valor");
            System.out.println("4 - Sair");
            System.out.println();
            System.out.println("Digite a opção desejada:");
            valor = scanner.nextInt();
            switch(valor){
                case 1:
                    System.out.println("Saldo atual: R$ " + saldo);
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Digite o valor a ser recebido:");
                    double valorRecebido = scanner.nextDouble();
                    saldo += valorRecebido;
                    System.out.println("Valor recebido: R$ " + valorRecebido);
                    System.out.println("Saldo atual: R$ " + saldo);
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Digite o valor a ser transferido:");
                    double valorTransferido = scanner.nextDouble();
                    if(valorTransferido > saldo) {
                        System.out.println("Saldo insuficiente, transfira um valor menor");
                    } else {
                        saldo -= valorTransferido;
                        System.out.println("Valor transferido: R$ " + valorTransferido);
                        System.out.println("Saldo atual: R$ " + saldo);
                        System.out.println();
                    }
                    break;
                case 4:
                    valor = -1;
                    System.out.println("Finalizando sistema, obrigado por usar nosso banco");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente");
                    break;
            }
        }
    }
}