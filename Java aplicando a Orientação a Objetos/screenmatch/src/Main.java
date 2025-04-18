import br.com.alura.screenmatch.modelos.Movie;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie();
        myMovie.setTitle("Godzilla 1954");
        myMovie.yearOfRelease = 1954;
        myMovie.runtimeInMinutes = 100;

        //myMovie.display();
        myMovie.addRating(6);
        myMovie.addRating(5);
        myMovie.addRating(10);
        System.out.println("Total de avaliações: " + myMovie.getTotalRatings());
        System.out.println(myMovie.averageRating());
    }
}