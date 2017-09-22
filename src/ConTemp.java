import java.util.Scanner;

public class ConTemp {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

       System.out.print("Indtast Fahrenheit værdi: ");

    double fahr = input.nextDouble();

    double cel = (5.0/9)*(fahr - 32);

    System.out.print(fahr + " Grader Fahrenheit er " + cel + " Grader celcius");





    }
}
