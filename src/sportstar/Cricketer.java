package sportstar;

import sports.Cricket;

public class Cricketer {
    int total_ball,bat_bowl_count,income;
    float rating;

    Cricketer(int total_ball,int bat_bowl_count)
    {
        this.total_ball=total_ball;
        this.bat_bowl_count=bat_bowl_count;
        rating=0;
        income=0;

    }

    void inCome()
    {
         rating = total_ball/bat_bowl_count;
         income = (int)rating * 50000;
        System.out.println("Player Rating :"+rating);
        System.out.println("Income is :"+income);
    }

}
