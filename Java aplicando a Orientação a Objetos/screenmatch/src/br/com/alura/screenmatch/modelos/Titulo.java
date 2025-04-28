package br.com.alura.screenmatch.modelos;

public class Titulo {
    private String title;
    private String description;
    private int yearOfRelease;
    private double sumOfRatings;
    private int totalRatings;
    private int runtimeInMinutes;
    private boolean included;

    public int getTotalRatings() {
        return totalRatings;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public boolean isIncluded() {
        return included;
    }

    public int getRuntimeInMinutes() {
        return runtimeInMinutes;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setIncluded(boolean included) {
        this.included = included;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public void setRuntimeInMinutes(int runtimeInMinutes) {
        this.runtimeInMinutes = runtimeInMinutes;
    }

    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Description: " + description);
        System.out.println("Year of release: " + yearOfRelease);
        System.out.println("Rating: " + sumOfRatings);
        System.out.println("Total Ratings: " + totalRatings);
        System.out.println("Runtime In Minutes: " + runtimeInMinutes);
        System.out.println("Included: " + included);
    }

    public void addRating(double rate) {
        sumOfRatings += rate;
        totalRatings++;
    }

    public double averageRating() {
        return sumOfRatings / totalRatings;
    }
}
