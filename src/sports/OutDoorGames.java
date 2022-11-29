package sports;

import java.util.Scanner;

abstract  public class OutDoorGames {

   static  int  numberOfPlayers;
   static String teamname,typeofGame;
   static Scanner sc =new Scanner(System.in);

    abstract void read();
    abstract void display();
}
