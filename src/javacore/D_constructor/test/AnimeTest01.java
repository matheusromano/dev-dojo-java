package javacore.D_constructor.test;

import javacore.D_constructor.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Naruto", "TV", 150, "Online", "Production Id");
        anime.print();

//        Anime anime1 = new Anime();
//        anime1.print();
    }
}
