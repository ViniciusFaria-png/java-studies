public class Aluno {
    private String name;
    private double[] notas;

    public String getName() {
        return name;
    }

    public double[] getNotas(){
        return notas;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setNotas(double[] notas){
        this.notas = notas;
    }

    public double calcularMedia(){
        double soma = 0.0;
        for (double nota : notas) {
            soma += nota;
        }

        return soma / notas.length;
    }
}
