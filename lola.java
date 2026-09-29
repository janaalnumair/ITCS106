import java.util.Scanner;

public class lola {
    public static void main(String[] args) {

       int Y1, Y2, Age;
       Scanner input = new Scanner(System.in);

       System.out.println("enter the birth year");
       Y1 = input.nextInt();
       System.out.println("enter the current year");
       Y2 = input.nextInt();

       Age = Y2-Y1;

       System.out.println("your age is:"+Age);




    }
}
