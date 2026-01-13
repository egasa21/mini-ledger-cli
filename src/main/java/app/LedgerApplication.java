package app;

import java.util.Scanner;

public class LedgerApplication {
    public static void main(String[] args) {
        System.out.println("Welcome to Mini Ledger");

        showMenu();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Select Menu: ");
        int input = scanner.nextInt();

        switch (input) {
            case 1:
                System.out.println("Add Transaction selected.");
                // Add transaction logic here
                break;
            case 2:
                System.out.println("List Transactions selected.");
                // List transactions logic here
                break;
            case 3:
                System.out.println("Total Amount selected.");
                // Total amount logic here
                break;
            case 4:
                System.out.println("Exiting the application. Goodbye!");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid selection. Please try again.");
        }



    }

    static void showMenu() {
        String[] menus = {"Add Transaction", "List Transactions", "Total Amount", "Exit"};
        for (int i = 0; i < menus.length; i++) {
            System.out.println((i + 1) + ". " + menus[i]);
        }
    }
}
