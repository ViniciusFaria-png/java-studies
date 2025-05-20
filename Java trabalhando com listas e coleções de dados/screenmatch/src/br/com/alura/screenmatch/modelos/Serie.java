package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.Classificavel;

public class Serie extends Titulo implements Classificavel {
    private int temporadas;
    private boolean ativa;
    private int epPerSeason;
    private int minutesPerEp;

    public Serie(String title, int yearOfRelease) {
        super(title, yearOfRelease);
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getEpPerSeason() {
        return epPerSeason;
    }

    public void setEpPerSeason(int epPerSeason) {
        this.epPerSeason = epPerSeason;
    }

    public int getMinutesPerEp() {
        return minutesPerEp;
    }

    public void setMinutesPerEp(int minutesPerEp) {
        this.minutesPerEp = minutesPerEp;
    }

    @Override
    public int getRuntimeInMinutes() {
        return temporadas * epPerSeason * minutesPerEp;
    }

    @Override
    public int getClassificacao() {
        return (int) averageRating();
    }
}
