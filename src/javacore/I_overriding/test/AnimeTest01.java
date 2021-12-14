package javacore.I_overriding.test;

import javacore.I_overriding.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Dr. Strange");
        System.out.println(anime.toString());
    }
}
