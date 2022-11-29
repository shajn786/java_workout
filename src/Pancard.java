import java.util.*;

class InvalidPanNumberException extends Exception {
    public InvalidPanNumberException(String s)
    {

        super(s);
    }
}

public class Pancard {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your name: ");
        String name=sc.nextLine();
        System.out.print("enter your pan number: ");
        String pan_number=sc.nextLine();
        try {
            if(name.charAt(0)==pan_number.charAt(4)){
                System.out.println("pannumber is valid");
            }
            else{
                throw new InvalidPanNumberException("pannumber is invalid");
            }
        }
        catch(InvalidPanNumberException m){
            System.out.println(m);
        }
    }
}