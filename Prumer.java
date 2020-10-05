import java.util.Scanner;
public class Prumer {

 public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Prvni cislo: ");
        double num1 = scan.nextDouble();
        System.out.print("Druhe cislo: ");
        double num2 = scan.nextDouble();
        scan.close();
        System.out.print("Prumer je :" + avr(num1, num2) );
    }

  public static double avr(double a, double b)
    {
        return (a + b) / 2;
    }
}