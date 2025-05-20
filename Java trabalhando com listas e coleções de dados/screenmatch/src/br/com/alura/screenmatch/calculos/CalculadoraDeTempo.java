package br.com.alura.screenmatch.calculos;
import br.com.alura.screenmatch.modelos.Movie;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;

    }

//    public void inclui(Movie f){
//        tempoTotal += f.getRuntimeInMinutes();
//    }
//
//    public void inclui(Serie s){
//        this.tempoTotal = s.getRuntimeInMinutes();
//    }

    public void inclui(Titulo titulo) {
        System.out.println("Adding runtime in minutes from " + titulo.getTitle());
        this.tempoTotal += titulo.getRuntimeInMinutes();
    }
}
