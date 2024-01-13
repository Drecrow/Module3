package Module3; 

import java.util.Scanner;

public class Module3 {

    static double calculateTax(double income) {
        if (income < 500) {
            return income * 0.10;  
        } else if (income < 1500) {
            return income * 0.15;  
        } else if (income < 2500) {
            return income * 0.20;  
        } else {
            return income * 0.30;  
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter weekly income: ");
        double income = scanner.nextDouble();

        double taxWithholding = calculateTax(income);

        System.out.println("Weekly income: $" + income);
        System.out.println("Tax withholding: $" + taxWithholding);

        scanner.close();
    }
}
