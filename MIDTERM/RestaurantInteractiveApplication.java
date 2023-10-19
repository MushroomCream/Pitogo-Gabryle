import java.util.Scanner;
import java.text.DecimalFormat;

public class RestaurantInteractiveApplication {
    public static void main(String[]args) {
        DecimalFormat df = new DecimalFormat("0.00");
        Calculate cal = new Calculate();
        Scanner scan = new Scanner(System.in);
        int x, y;
        int c1 = 0, c2 = 0, c3 = 0, r1 = 0, r2 = 0;
        double total = 0;
        do {
            cal.printMenu();
            x = scan.nextInt();
            switch (x) {
                case 1:
                    cal.quantityPrompt();
                    y = scan.nextInt();
                    total += 100 * y;
                    c1 = y;
                    System.out.println("\nQuantity: " + y + " C1");
                    System.out.println("Current Total: Php " + total + "/Usd " + df.format(cal.convertUSD(total)));
                    break;
                case 2:
                    cal.quantityPrompt();
                    y = scan.nextInt();
                    total += 150 * y;
                    c2 = y;
                    System.out.println("\nQuantity: " + y + " C2");
                    System.out.println("Current Total: Php " + total + "/Usd " + df.format(cal.convertUSD(total)));
                    break;
                case 3:
                    cal.quantityPrompt();
                    y = scan.nextInt();
                    total += 200 * y;
                    c3 = y;
                    System.out.println("\nQuantity: " + y + " C3");
                    System.out.println("Current Total: Php " + total + "/Usd " + df.format(cal.convertUSD(total)));
                    break;
                case 4:
                    cal.quantityPrompt();
                    y = scan.nextInt();
                    total += 35 * y;
                    r1 = y;
                    System.out.println("\nQuantity: " + y + " R1");
                    System.out.println("Current Total: Php " + total + "/Usd " + df.format(cal.convertUSD(total))); 
                    break;
                case 5:
                    cal.quantityPrompt();
                    y = scan.nextInt();
                    total += 50 * y;
                    r2 = y;
                    System.out.println("\nQuantity: " + y  + " R2");
                    System.out.println("Current Total: Php " + total + "/Usd " + df.format(cal.convertUSD(total)));
                    break;
            }
        }
        while (x != 0);
        scan.close();
        System.out.println("Item(s) Ordered: ");
        System.out.println(c1 + " C1\t" + r1 + " R1");
        System.out.println(c2 + " C2\t" + r2 + " R2");
        System.out.println(c3 + " C3");
        System.out.println("Total: $" + df.format(cal.convertUSD(total)));
    }
}

class Calculate {
    public void printMenu() {
        System.out.println("Menu: ");
        System.out.println("--------------------");
        System.out.println("1.) C1 - Php 100.00");
        System.out.println("2.) C2 - Php 150.00");
        System.out.println("3.) C3 - Php 200.00");
        System.out.println("Add Ons: ");
        System.out.println("4.) R1 - Php 35.00");
        System.out.println("5.) R2 - Php 50.00");
        System.out.println("--------------------");
        System.out.println("(Press 0 To Complete Order)");
    }
    public void quantityPrompt() {
        System.out.println("Quantity: ");
    }
    public double convertUSD(double total) {
        //Php to Usd Conversion
        total = total / 56.7;
        return total;
    }
}
