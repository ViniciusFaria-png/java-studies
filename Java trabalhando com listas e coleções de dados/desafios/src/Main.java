import java.lang.reflect.Array;
import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<Pessoa> listaDePessoas = new ArrayList<Pessoa>();
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();
        Pessoa p3 = new Pessoa();

        p1.setNome("Pedro");
        p2.setNome("João");
        p3.setNome("Flavia");

        p1.setIdade(10);
        p2.setIdade(20);
        p3.setIdade(30);

        listaDePessoas.add(p1);
        listaDePessoas.add(p2);
        listaDePessoas.add(p3);

        System.out.println("Tamanho da lista eh: " + listaDePessoas.size());
        System.out.println("Primeiro pessoa da lista eh: " + listaDePessoas.get(0).getNome());
        System.out.println("Primeiro pessoa da lista eh: " + listaDePessoas.get(0));
        System.out.println("Lista de pessoas: " + listaDePessoas);



        Produto prod1 = new Produto("Notebook", 1000.0, 10);
        Produto prod2 = new Produto("Impressora", 200.0, 1);
        Produto prod3 = new Produto("Mouse", 50.0, 10);

        ArrayList<Produto> produtos = new ArrayList<Produto>();
        produtos.add(prod1);
        produtos.add(prod2);
        produtos.add(prod3);

        System.out.println("Tamanho da lista: " + produtos.size());

        System.out.println("Produto 1: " + produtos.get(0).getName());

        for(int i = 0; i < produtos.size(); i++){
            System.out.println(produtos.get(i).toString());
        }

        ProdutoPerecivel produtoPerecivel = new ProdutoPerecivel("Notebook", 1000.0, 10, new java.util.Date());

        System.out.println(produtoPerecivel.toString());


        ArrayList<String> listaDeString = new ArrayList<String>();
        listaDeString.add("Notebook");
        listaDeString.add("Impressora");
        listaDeString.add("Mouse");

        listaDeString.forEach(System.out::println);

        Animal animalQuEUmCachorro = new Cachorro("Pitucha");
        animalQuEUmCachorro.fazerSom();


        if(animalQuEUmCachorro instanceof Cachorro){
            Cachorro pituchaVerificada = (Cachorro) animalQuEUmCachorro;
            pituchaVerificada.fazerSom();
        } else {
            System.out.println("Não é um cachorro");
        }

        Produto produto1 = new Produto("Notebook", 1000.0, 10);
        Produto produto2 = new Produto("Impressora", 200.0, 1);
        Produto produto3 = new Produto("Mouse", 50.0, 10);


        double media = 0.0;

        final double [] somaDosPrecos = {0.0};

        ArrayList<Produto> listaDeProdutos = new ArrayList<Produto>();
        listaDeProdutos.add(produto1);
        listaDeProdutos.add(produto2);
        listaDeProdutos.add(produto3);

        listaDeProdutos.forEach(item -> {
            somaDosPrecos[0] += item.getPrice();
        } );

        media = somaDosPrecos[0] / listaDeProdutos.size();

        System.out.println("Média é: R$ " + String.format("%.2f", media));

        ArrayList<Forma> listaDeFormas = new ArrayList<Forma>();

        Forma quadrado = new Quadrado(2);
        Forma quadrado2 = new Quadrado(3);

        Forma circulo = new Circulo(2);
        Forma circulo2 = new Circulo(3);

        listaDeFormas.add(quadrado);
        listaDeFormas.add(quadrado2);
        listaDeFormas.add(circulo);
        listaDeFormas.add(circulo2);

        listaDeFormas.forEach(Forma::calcularArea);

        ContaBancaria conta = new ContaBancaria(1000, "123456");
        ContaBancaria conta2 = new ContaBancaria(2000, "654321");
        ContaBancaria conta3 = new ContaBancaria(3000, "789012");
        ContaBancaria conta4 = new ContaBancaria(4000, "123456");
        ContaBancaria conta5 = new ContaBancaria(5000, "654321");
        ContaBancaria conta6 = new ContaBancaria(6000, "789012");

        ArrayList<ContaBancaria> listaDeContas = new ArrayList<ContaBancaria>();

        listaDeContas.add(conta);
        listaDeContas.add(conta2);
        listaDeContas.add(conta3);
        listaDeContas.add(conta4);
        listaDeContas.add(conta5);
        listaDeContas.add(conta6);


        ContaBancaria contaMaiorSaldo = listaDeContas.get(0);

        for (ContaBancaria contaAtual : listaDeContas) {
            if(contaAtual.getSaldo() > contaMaiorSaldo.getSaldo()){
                contaMaiorSaldo = contaAtual;
            }
        }

        System.out.println("Conta com maior saldo é: " + contaMaiorSaldo.getNumeroDaConta());

    }
}