import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in);
        String l_name, f_name;
        double salary,percentPay,newSalary;

        System.out.print("employee1 - input last name, first name, salary, percentPay: ");
        l_name = input.next();
        f_name = input.next();
        salary = input.nextDouble();
        percentPay = input.nextDouble();
        newSalary = salary + salary * percentPay;
        System.out.println("new salary for employee1 = " + newSalary);

        System.out.print("employee2 -input last name, first name, salary, percentPay: ");
        l_name = input.next();
        f_name = input.next();
        salary = input.nextDouble();
        percentPay = input.nextDouble();
        newSalary = salary + salary * percentPay;
        System.out.println("new salary for employee2 = " + newSalary);


