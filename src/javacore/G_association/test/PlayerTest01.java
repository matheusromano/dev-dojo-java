package javacore.G_association.test;

import javacore.G_association.domain.Player;

public class PlayerTest01 {
    public static void main(String[] args) {
        Player p1 = new Player("Neymar Jr");
        Player p2 = new Player("Lionel Messi");
        Player p3 = new Player("Cristiano Ronaldo");

        Player[] players = {p1, p2, p3};

        for (Player player : players) {
            player.print();
            
        }


    }
}
