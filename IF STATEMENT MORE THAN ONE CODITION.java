import java.util.Scanner;
public class lola{
    public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
            
          double Salary, tax, netSalary;

          System.out.println("input Salary");
          Salary = input.nextDouble();
          if (Salary <= 500) {
            tax = 0.05;
          }else{
            if (Salary > 500 && Salary <= 1000) {
                tax = 0.07;
            }else{
                tax = 0.1;
            }
          }
          netSalary = Salary - (Salary * tax);
          System.out.println("net salary is:" + netSalary);
         }
    }


//OR


import java.util.Scanner;
public class lola{
    public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
            
          double Salary, tax, netSalary;

          System.out.println("input Salary");
          Salary = input.nextDouble();
      if (Salary <= 0){
        System.out.println("INCORRECT SALARY")
          
          } elseif (Salary <= 500) {
            tax = 0.05;
          }elseif (Salary > 500 && Salary <= 1000){
            tax = 0.07;
              }else{
            tax = 0.1;
              }
          }
          netSalary = Salary - (Salary * tax);
          System.out.println("net salary is:" + netSalary);
         }
    }
