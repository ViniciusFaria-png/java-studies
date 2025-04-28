package br.com.alura.visongs.modelos;

public class MyFavorites {
    public void include(Audio audio){
        if (audio.getRanking() >= 9){
            System.out.println(audio.getTitle() + " it's a enormous sucess" + " and loved by everyone");
        } else {
            System.out.println(audio.getTitle() + " it's a sucess" + " and liked by everyone");
        }
    }
}
