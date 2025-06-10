package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Movie;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;

public class PrincipalComListas {
    public static void main(String[] args) {
        Movie myMovie = new Movie("Godzilla 1954", 1954);
        Serie mySerie = new Serie("Supernatural", 2005);
        Serie mySerie2 = new Serie("Lost", 200);
        Movie myMovie2 = new Movie("2001, Uma odisséia no espaço", 1968);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(myMovie);
        lista.add(mySerie);
        lista.add(myMovie2);
        lista.add(mySerie2);

        for (Titulo item: lista){
            System.out.println(item.getTitle());
        }
    }
}
