package sportstar;

public class FootBaller {
    int total_goal,goal_save_gain,income;
    float rating;

    public FootBaller(int total_goal, int goal_save_gain)
    {
        this.total_goal = total_goal;
        this.goal_save_gain = goal_save_gain;
        this.income = 0;
        this.rating = 0;
    }

    void inCome()
    {
        rating = (total_goal/goal_save_gain)*5;
        income = (int)rating * 50000;
        System.out.println("Player Rating :"+rating);
        System.out.println("Income is :"+income);
    }
}
