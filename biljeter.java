import java.util.Scanner;




public class biljeter {
    public static void main(String[] args)
    {
        Scanner input= new Scanner(System.in);

        int biljetkost = 100;

        int moviNightCost=2000;

        System.out.println("hur många biljeter sålde ni");

        int numberOfGuests = input.nextInt();34

        int profit = biljetkost * numberOfGuests - moviNightCost;

        System.out.println("ni har tjänat " + profit +" kr" );

    }
}