package sportstar;

import java.util.Scanner;

public class Main {
    static int over,count,goal;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //cricketer

        System.out.println("enter the number of over");
        over=sc.nextInt();
        int total_ball = over*6;
        System.out.println("enter the number of ball faced or bowled");
        count=sc.nextInt();
        Cricketer c1 = new Cricketer(total_ball,count);
        c1.inCome();

        //footballer

        System.out.println("enter the total number of goals");
        goal=sc.nextInt();
        System.out.println("enter the number of goal saved or gained");
        count=sc.nextInt();
        FootBaller f1 = new FootBaller(goal,count);
        f1.inCome();



    }

}
