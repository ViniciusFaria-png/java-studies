package br.com.alura.visongs.modelos;

public class Audio {
    private String title;
    private int totalPlays;
    private int totalLikes;
    private double ranking;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getTotalPlays() {
        return totalPlays;
    }

    public int getTotalLikes() {
        return totalLikes;
    }

    public double getRanking() {
        return ranking;
    }

    public void like(){
        totalLikes++;
    }

    public void plays(){
        totalPlays++;
    }

    public void display(){
        System.out.println("Title: " + this.getTitle());
        System.out.println("Total Plays: " + this.getTotalPlays());
        System.out.println("Total Likes: " + this.getTotalLikes());
        System.out.println("Ranking: " + this.getRanking());
    }
}
