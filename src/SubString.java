import java.util.Scanner;

public class SubString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string : ");
        String str = sc.nextLine();
        System.out.println("substring of given string :");
        for (int i = 0; i < str.length(); i++)
        {
            for (int j = 1; j <= (str.length() - i); j++)
            {
                System.out.println(str.substring(i, (j + i)));
            }
        }

    }
}
