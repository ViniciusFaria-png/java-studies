package br.com.alura.visongs.modelos;

public class Podcast extends Audio {
    private String host;
    private String description;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public double getRanking(){
        if (this.getTotalLikes() > 1000 && this.getTotalPlays() > 1000){
            System.out.println("Top 1 Podcasts");
        } else {
            System.out.println("Top Podcasts in your country, i hope it's not worst than podpah");
        }
        return 0;
    }
}
