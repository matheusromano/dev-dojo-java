package javacore.F_staticmodifier.domain;

public class Anime {
    private String name;
    private static int[] episodes;
    // Steps:
    // 0 - Static init block is executed when the JVM loads the class and only once
    // 1 - Memory allocated for variables;
    // 2 - Each class attribute is initialized
    // 3 - Init block is executed
    // 4 - The constructor is executed

    // runs the init block only once independs how much intances were created with the static keyword
    static {
        System.out.println("hey im here");
        episodes = new int[100];
        for (int i = 0; i < episodes.length; i++) {
            episodes[i] = i + 1;
        }
    }

    static {
        System.out.println("Hey im here 2");
    }

    static {
        System.out.println("Hey im here 3");
    }

    // runs at every new instance
    {
        System.out.println("Hey im here without static block");
    }



    public Anime(String name) {
        this.name = name;
    }

    public Anime() {

        for(int episode: Anime.episodes) {
            System.out.println(episode + " ");
        }
    }

    public String getName() {
        return name;
    }

    public static int[] getEpisodes() {
        return episodes;
    }
}
