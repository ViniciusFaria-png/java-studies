import java.util.Date;

public class ProdutoPerecivel extends Produto {
    private Date validade;

    public ProdutoPerecivel(String name, double price, int quantity, Date validade) {
        super(name, price, quantity);
        this.validade = validade;
    }

    public Date getValidade() {
        return validade;
    }

    public void setValidade(Date validade) {
        this.validade = validade;
    }

    @Override
    public String toString() {
        return super.toString() + " Validade: " + validade;
    }
}
