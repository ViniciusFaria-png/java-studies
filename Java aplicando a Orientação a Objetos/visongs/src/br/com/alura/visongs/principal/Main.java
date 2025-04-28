package br.com.alura.visongs.principal;
import br.com.alura.visongs.modelos.Musica;
import br.com.alura.visongs.modelos.MyFavorites;
import br.com.alura.visongs.modelos.Podcast;

public class Main {
    public static void main(String[] args) {
        Musica musica = new Musica();
        musica.setTitle("Stairway to Heaven");
        musica.setAuthor("Led zeppelin");

        for (int i = 0; i < 5000; i++){
            musica.plays();
        }

        for (int i = 0; i < 5000; i++){
            musica.like();
        }

        Podcast podcast = new Podcast();
        podcast.setTitle("Papo com CBUM");
        podcast.setDescription("Papo com o maior fisiculturista da categoria Classic");

        for (int i = 0; i < 5000; i++){
            podcast.plays();
        }

        for (int i = 0; i < 5000; i++){
            podcast.like();
        }

        MyFavorites myFavorites = new MyFavorites();
        myFavorites.include(podcast);
        myFavorites.include(musica);
    }
}