import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Movie;
import br.com.alura.screenmatch.modelos.Serie;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie();
        myMovie.setTitle("Godzilla 1954");
        myMovie.setRuntimeInMinutes(200);

        //myMovie.display();
        myMovie.addRating(6);
        myMovie.addRating(5);
        myMovie.addRating(4);
        System.out.println("Total de avaliações: " + myMovie.getTotalRatings());
        System.out.println(myMovie.averageRating());

        Serie serie = new Serie();
        serie.setTitle("Lost");

        Movie otherMovie = new Movie();
        otherMovie.setTitle("2001");
        otherMovie.setRuntimeInMinutes(150);


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
    }
}