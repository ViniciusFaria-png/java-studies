public class ContaBancaria {
    protected double saldo;
    protected String numeroDaConta;

    public ContaBancaria(double saldo, String numeroDaConta){
        this.saldo = saldo;
        this.numeroDaConta = numeroDaConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNumeroDaConta() {
        return numeroDaConta;
    }
}
