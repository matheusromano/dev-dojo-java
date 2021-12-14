package javacore.G_association.domain;

public class Team {
    private String name;
    private Player[] players;

    // Constructors

    public Team(String name) {
        this.name = name;
    }

    public Team(String name, Player[] players) {
        this.name = name;
        this.players = players;
    }

    // Methods

    public void print() {
        System.out.println(this.name);
        if(players == null) return;
        for (Player player : players){
            System.out.println(player.getName());
        }

    }


    // Getters and Setters


    public Player[] getPlayers() {
        return players;
    }

    public void setPlayers(Player[] players) {
        this.players = players;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
