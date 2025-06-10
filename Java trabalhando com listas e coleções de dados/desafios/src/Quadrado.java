public class Quadrado implements Forma {
    protected double lado;

    public Quadrado(double lado){
        this.lado = lado;
    }

    @Override
    public void calcularArea() {
        double area = Math.pow(lado, 2);
        System.out.println("A area do quadrado é: " + area);
    }
}
