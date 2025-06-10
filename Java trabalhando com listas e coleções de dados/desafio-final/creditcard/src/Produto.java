public class Produto implements Comparable<Produto>{
    protected String nome;
    protected double valor;

    public Produto(String nome, double valor){
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public int compareTo(Produto outroProduto) {
        return Double.valueOf(this.valor).compareTo(Double.valueOf(outroProduto.valor));
    }

    @Override
    public String toString() {
        return "Produto: " + nome + " R$ " + valor;
    }
}
