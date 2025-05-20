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
    }
}