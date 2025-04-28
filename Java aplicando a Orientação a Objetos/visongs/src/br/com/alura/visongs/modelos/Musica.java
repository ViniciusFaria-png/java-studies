package br.com.alura.visongs.modelos;

public class Musica extends Audio{
    private String author;
    private String album;
    private String genre;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public double getRanking(){
        if (this.getTotalLikes() > 1000 && this.getTotalPlays() > 1000){
            System.out.println("Top 1 Songs");
        } else {
            System.out.println("Top songs in your country");
        }
        return 0;
    }

    @Override
    public void display(){

    }
}
