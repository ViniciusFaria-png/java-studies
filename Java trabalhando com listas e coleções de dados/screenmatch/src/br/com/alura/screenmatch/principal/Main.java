package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Movie;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie("Godzilla 1954", 1954);
        myMovie.setRuntimeInMinutes(200);

        //myMovie.display();
        myMovie.addRating(6);
        myMovie.addRating(5);
        myMovie.addRating(4);
        System.out.println("Total de avaliações: " + myMovie.getTotalRatings());
        System.out.println(myMovie.averageRating());

        Serie serie = new Serie("Lost", 2000);

        Movie otherMovie = new Movie("2001", 1968);
        otherMovie.setRuntimeInMinutes(150);


        Movie otherOtherMovie = new Movie("Senhor dos aneis", 1999);
        otherMovie.setRuntimeInMinutes(300);


        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(myMovie);
        calculadora.inclui(otherMovie);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(myMovie);


        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(serie);
        episodio.setTotalViews(300);
        filtro.filtra(episodio);

        ArrayList<Movie> listaDeFilmes = new ArrayList<>();

        listaDeFilmes.add(myMovie);
        listaDeFilmes.add(otherMovie);
        listaDeFilmes.add(otherOtherMovie);

        System.out.println("Tamanho da lista eh " + listaDeFilmes.size());
        System.out.println(listaDeFilmes.get(0).getTitle());
        System.out.println(listaDeFilmes.get(1).getTitle());
        System.out.println(listaDeFilmes.get(2).getTitle());


    }
}