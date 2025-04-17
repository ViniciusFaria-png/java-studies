public class Musica {
    String title;
    String artist;
    int yearRelease;
    double rating;
    int numRatings;
    double totalRatings;


    void display(){
        System.out.println("Title" + title);
        System.out.println("Artist" + artist);
        System.out.println("Year Release" + yearRelease);
        System.out.println("Rating" + rating);
        System.out.println("NumRatings" + numRatings);
    }

    void addRating(double rate){
        totalRatings += rate;
        numRatings++;
    }

    double averageRating(){
        return totalRatings / numRatings;
    }
}
