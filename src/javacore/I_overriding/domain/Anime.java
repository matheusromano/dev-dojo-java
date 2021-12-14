package javacore.I_overriding.domain;

public class Anime extends Object{
    private String name;


    // to set a default print, must to be the same modifier same return and same NAME
    // the method must to be more public as possible
    @Override
    public String toString() {
        return "Anime{" +
                "name='" + name + '\'' +
                '}';
    }

    public Anime(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
