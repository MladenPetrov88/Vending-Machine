import java.sql.SQLOutput;
import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.next();
        double sum = 0;
        double change = 0;
        double price = 0;


        while (!command.equals("Start")) {
            double coins = Double.parseDouble(command);

            if (coins == 0.1 || coins == 0.2 || coins == 0.5 || coins == 1 || coins == 2) {
                sum += coins;
            } else {
                System.out.printf("Cannot accept %.2f%n", coins);
            }

            command = scanner.next();
        }

        while (!command.equals("End")) {
            command = scanner.next();
            if (command.equals("Nuts")) {
                price = 2.0;
                if (sum < price) {
                    System.out.println("Sorry, not enough money");
                } else {
                    System.out.println("Purchased " + command);
                    sum = sum - price;
                }

            }
            if (command.equals("Water")) {
                price = 0.7;
                if (sum < price) {
                    System.out.println("Sorry, not enough money");
                } else {
                    System.out.println("Purchased " + command);
                    sum = sum - price;
                }

            }
            if (command.equals("Crisps")) {
                price = 1.5;
                if (sum < price) {
                    System.out.println("Sorry, not enough money");
                } else {
                    System.out.println("Purchased " + command);
                    sum = sum - price;
                }

            }
            if (command.equals("Soda")) {
                price = 0.8;
                if (sum < price) {
                    System.out.println("Sorry, not enough money");
                } else {
                    System.out.println("Purchased " + command);
                    sum = sum - price;
                }

            }
            if (command.equals("Coke")) {
                price = 1.0;
                if (sum < price) {
                    System.out.println("Sorry, not enough money");
                } else {
                    System.out.println("Purchased " + command);
                    sum = sum - price;
                }
            }
            if (!command.equals("Nuts") && !command.equals("Water") && !command.equals("Crisps") && !command.equals("Soda") && !command.equals("Coke") && !command.equals("Start") && !command.equals("End")) {
                System.out.println("Invalid product");
            }

        }
        System.out.printf("Change: %.2f", sum);
    }
}