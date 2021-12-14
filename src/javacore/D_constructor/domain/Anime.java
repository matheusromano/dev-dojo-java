package javacore.D_constructor.domain;

public class Anime {
    private String name;
    private String type;
    private int episodes;
    private String status;
    private String studio;

    // this is the constructor, this code have priority over the least
    // everything that you pass as a paramenter must be in the main class
    // **THE REAL CONSTRUCTOR DOESNT HAVE ANY RETURN TYPE EVEN VOID ONES**
    public Anime(String name, String type, int episodes, String status) {
        // thats the way to call a constructor inside the prior class, the invokation only works inside a constructor
        // must to be the first statement
        this();
        this.name = name;
        this.type = type;
        this.episodes = episodes;
        this.status = status;
    }

    public Anime(String name, String type, int episodes, String status ,String studio) {
        this(name, type, episodes, status);
        this.studio = studio;
    }

    // Overloading the constructor with no parameters
    public Anime(){
        System.out.println("Inside no args contructor");

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println(this.name);
        System.out.println(this.type);
        System.out.println(this.episodes);
        System.out.println(this.status);
        System.out.println(this.studio);

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getEpisodes() {
        return episodes;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }
}
