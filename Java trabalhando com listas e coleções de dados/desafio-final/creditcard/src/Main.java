import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o limite do cartão: ");
        double limite = scanner.nextDouble();
        scanner.nextLine();
        CreditCard cartao = new CreditCard(limite);

        while(true){
            System.out.println("Digite o nome do produto: ");
            String nome = scanner.next();
            scanner.nextLine();
            System.out.println("Digite o valor do produto: ");
            double valor = scanner.nextDouble();
            scanner.nextLine();

            Produto produto = new Produto(nome, valor);
            boolean compraEfetuada = cartao.computaCompra(produto);

            if(compraEfetuada){
                System.out.println("Compra efetuada com sucesso!");
                System.out.println("Deseja continuar? (Sim -> 1 | Não -> 0");
                int resposta = scanner.nextInt();
                if(resposta == 0){
                    break;
                }
            } else {
                System.out.println("Saldo insuficiente para realizar a compra.");
                break;
            }
        }
        System.out.println("*****************************************");
        System.out.println("Produtos comprados: \n");
        Collections.sort(cartao.getProdutos());
        for(Produto p : cartao.getProdutos()){
            System.out.println(p.getNome() + " - R$ " + p.getValor());
        }

        System.out.println("\n*****************************************");

        System.out.println("\nSaldo final: R$ " + cartao.getSaldo());
    }
}