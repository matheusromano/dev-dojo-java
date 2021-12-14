package javacore.E_initializationblock.domain;

public class Anime {
    private String name;
    private int[] episodes;
    // Steps:
    // 1 - Memory allocated for variables;
    // 2 - Each class attribute is initialized
    // 3 - Init block is executed
    // 4 - The constructor is executed


    // the initialization block runs everytime that the class are called the sintax is that
    // could be anywhere in the code and always will run before the constructor
    // the init block represents every constructor in the class
    {
        episodes = new int[100];
        for (int i = 0; i < episodes.length; i++) {
            episodes[i] = i + 1;
        }
    }

    public Anime(String name) {
        this.name = name;
    }

    public Anime() {

        for(int episode: episodes) {
            System.out.println(episode + " ");
        }
    }

    public String getName() {
        return name;
    }

    public int[] getEpisodes() {
        return episodes;
    }
}
