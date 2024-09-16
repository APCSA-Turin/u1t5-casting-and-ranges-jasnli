import java.util.Scanner;

public class ExactChange {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter an amount in dollars and cents: ");
        double amount = scan.nextDouble();
        amount = amount * 100;
        scan.nextLine();

        int quarters = (int) (amount / 25);
        amount -= (double) quarters * 25;
        int dimes = (int) (amount / 10);
        amount -= (double) dimes * 10;
        int nickels = (int) (amount / 5);
        amount -= (double) nickels * 5;
        int pennies = (int) (amount);
        amount -= (double) pennies;
        int total = quarters + dimes + nickels + pennies;

        System.out.println("The minimum number of coins is: " + total);
        System.out.println(quarters + " quarters");
        System.out.println(dimes + " dimes");
        System.out.println(nickels + " nickels");
        System.out.println(pennies + " pennies");

    }
}
