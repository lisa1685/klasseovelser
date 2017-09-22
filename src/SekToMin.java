import java.util.Scanner;

public class SekToMin {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Indtast sekunder: ");

        int sek = input.nextInt();

        int min = sek/60;

        int restSek = sek%60;

        System.out.print(sek + " Sekunder er " + min + " Minutter og " + restSek + " sekunder");






    }
}
