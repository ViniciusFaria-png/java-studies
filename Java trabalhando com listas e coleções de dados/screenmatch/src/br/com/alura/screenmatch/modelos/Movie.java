package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.Classificavel;

public class Movie extends Titulo implements Classificavel {
    private String director;

    public Movie(String name, int yearOfRelease) {
        super(name, yearOfRelease);
    }

    public String getDirector(){
        return director;
    }

    public void setDirector(String director){
        this.director = director;
    }

    @Override
    public int getClassificacao() {
        return (int) averageRating();
    }
}
