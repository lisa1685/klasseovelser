import java.util.Scanner;

public class ArealCirkel2 {
    public static void main(String[] args) {

        System.out.print(" Indsæt radius: "); //Det som brugeren kan se

        Scanner input = new Scanner(System.in); //Boksen tallet bliver skrevet i af brugeren

        double r = input.nextDouble(); // tallet brugeren putter ind i boksen


        double areal = r*r*3.14;


        System.out.print(" Arealet af cirklen er: " + areal);
    }
}
