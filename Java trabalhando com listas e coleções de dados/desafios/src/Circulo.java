public class Circulo implements Forma{
    protected double raio;

    public Circulo(double raio){
        this.raio = raio;
    }

    @Override
    public void calcularArea() {
        double area = Math.PI * Math.pow(raio, 2);
        System.out.println("Area do círculo é: " + area);
    }
}
