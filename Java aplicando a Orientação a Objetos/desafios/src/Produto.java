public class Produto {
    private String name;
    private double price;

    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public void aplicarDesconto(double desconto){
        this.price = this.price * (1 - desconto / 100);
    }
}
