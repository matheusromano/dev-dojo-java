package javacore.G_association.test;

import javacore.G_association.domain.Player;
import javacore.G_association.domain.Team;

public class PlayerTest03 {
    public static void main(String[] args) {
        Player player = new Player("Ronaldinho Gaucho");
        Player player1 = new Player("Kaká");
        Team team = new Team("Brazil");
        Player[] players = {player, player1};


        player.setTeam(team);
        player1.setTeam(team);

        team.setPlayers(players);

        System.out.println("!---------- Player ----------!");
        player.print();
        player1.print();



        System.out.println(("!---------- Team ----------!"));
        team.print();
    }
}
