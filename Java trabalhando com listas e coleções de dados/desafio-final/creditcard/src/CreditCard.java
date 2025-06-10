import java.util.ArrayList;
import java.util.List;

public class CreditCard {
    private double limite;
    private double saldo;
    private List<Produto> produtos;

    public CreditCard(double limite){
        this.limite = limite;
        this.saldo = limite;
        this.produtos = new ArrayList<>();
    }

    public double getLimite() {
        return limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }
    public boolean computaCompra(Produto produto){
        if(this.saldo > produto.getValor()){
            this.saldo -= produto.getValor();
            this.produtos.add(produto);
            return true;
        }
        return false;
    }
}
