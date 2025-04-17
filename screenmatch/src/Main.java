//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie();
        myMovie.title = "Godzilla 1954";
        myMovie.yearOfRelease = 1954;
        myMovie.runtimeInMinutes = 100;

        myMovie.display();
        myMovie.addRating(6);
        myMovie.addRating(5);
        myMovie.addRating(10);
        System.out.println(myMovie.sumOfRatings);
        System.out.println(myMovie.totalRatings);
        System.out.println(myMovie.averageRating());
    }
}