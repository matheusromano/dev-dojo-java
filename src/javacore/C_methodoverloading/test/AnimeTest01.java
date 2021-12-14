package javacore.C_methodoverloading.test;

import javacore.C_methodoverloading.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        // set the values with one single line
        anime.init("Naruto", "TV", 150, "Online");
//        anime.setName("Naruto");
//        anime.setType("TV");
//        anime.setEpisodes(150);
        anime.print();
    }
}
