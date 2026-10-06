import java.util.Scanner;

public class lola {
    public static void main(String[] args) {

       int x, y, area;
       Scanner input = new Scanner(System.in);

       System.out.println("enter the length");
       x = input.nextInt();
       System.out.println("enter the width");
       y = input.nextInt();

       area = x * y;

       System.out.println("the area is:"+area);




    }
}
