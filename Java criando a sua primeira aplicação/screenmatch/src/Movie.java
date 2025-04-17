public class Movie {
    String title;
    String description;
    int yearOfRelease;
    double sumOfRatings;
    int totalRatings;
    int runtimeInMinutes;
    boolean included;

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Description: " + description);
        System.out.println("Year of release: " + yearOfRelease);
        System.out.println("Rating: " + sumOfRatings);
        System.out.println("Total Ratings: " + totalRatings);
        System.out.println("Runtime In Minutes: " + runtimeInMinutes);
        System.out.println("Included: " + included);
    }

    void addRating(double rate) {
        sumOfRatings += rate;
        totalRatings++;
    }

    double averageRating() {
        return sumOfRatings / totalRatings;
    }
}
