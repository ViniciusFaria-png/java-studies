public class AverageCalculator {
    public static void main(String[] args){
        double a = 7.5;
        double b = 6.5;
        double c = (a + b) / 2;
        System.out.println("Resultado da média: " + c);

        int d;
        d = (int) a;
        System.out.println(d);

        String f = "JV";
        char e = 'M';

        System.out.println(f + e);

        double precoProduto = 23.99;
        int quantidade = 5;
        double valorTotal = precoProduto * quantidade;

        System.out.printf("O valor total é: %.2f%n", valorTotal);

        double valorEmDolares = 55.99;
        double conversion = 4.94;
        double resultadoConversao = valorEmDolares * conversion;

        System.out.printf("O valor total é: %.2f%n", resultadoConversao);

        double precoOriginal = 100.0;
        double percentualDesconto = 10;
        double desconto = precoOriginal * percentualDesconto / 100;
        double precoComDesconto = precoOriginal - desconto;

        System.out.printf("O valor total, com desconto, é: %.2f%n", precoComDesconto);
    }
}
