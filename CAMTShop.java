import java.util.Scanner;

public class CAMTShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[][] discountRates = {
            { 0.02, 0.05 },     
            { 0.03, 0.08 },     
            { 0.05, 0.10 }      
        };

        System.out.print("Enter the total price spent: ");
        double totalPrice = scanner.nextDouble();

        System.out.print("Enter membership status (Silver, Gold, or None): ");
        String memberStatus = scanner.next();

        double discount = 0.0;

        if (memberStatus.equalsIgnoreCase("Silver")) {
            if (totalPrice <= 1000) {
                discount = discountRates[0][0];
            } else if (totalPrice > 1000 && totalPrice <= 10000) {
                discount = discountRates[1][0];
            } else if (totalPrice > 10000) {
                discount = discountRates[2][0];
            }
        } else if (memberStatus.equalsIgnoreCase("Gold")) {
            if (totalPrice <= 1000) {
                discount = discountRates[0][1];
            } else if (totalPrice > 1000 && totalPrice <= 10000) {
                discount = discountRates[1][1];
            } else if (totalPrice > 10000) {
                discount = discountRates[2][1];
            }
        }

        double amountToPay = totalPrice * (1 - discount);

        System.out.println("Total amount to pay after discount: " + amountToPay);

        scanner.close();
    }
}
