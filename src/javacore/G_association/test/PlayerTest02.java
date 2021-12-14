package javacore.G_association.test;

import javacore.G_association.domain.Player;
import javacore.G_association.domain.Team;

public class PlayerTest02 {
    public static void main(String[] args) {
        Player player01 = new Player("Neymar Jr");

        Team team1 = new Team("Brazil's national team");

        player01.setTeam(team1);

        player01.print();

    }
}
