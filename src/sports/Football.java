package sports;

import java.util.Scanner;

public class Football extends OutDoorGames{

    static Scanner sc =new Scanner(System.in);

    void read()
    {
        typeofGame="Football";
        System.out.println("enter the team name");
        teamname=sc.next();
        System.out.println("enter the number of players");
        numberOfPlayers=sc.nextInt();
    }

    void display()
    {
        System.out.println("Game Type : "+typeofGame);
        System.out.println("Team Name : "+teamname);
        System.out.println("Number of players : "+numberOfPlayers);
    }
}
