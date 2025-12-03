package banking;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Bank {

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            try {
                System.out.println("\n===============================");
                System.out.println("        MINI BANKING APP      ");
                System.out.println("===============================");
                System.out.println("1) Create Account");
                System.out.println("2) Login Account");
                System.out.println("3) Exit");
                System.out.print("Enter Choice: ");

                int choice = Integer.parseInt(br.readLine());

                if (choice == 1) {
                    System.out.print("Enter Username: ");
                    String name = br.readLine();
                    System.out.print("Enter Passcode: ");
                    int pass = Integer.parseInt(br.readLine());

                    BankManagement.createAccount(name, pass);
                }

                else if (choice == 2) {
                    System.out.print("Enter Username: ");
                    String name = br.readLine();
                    System.out.print("Enter Passcode: ");
                    int pass = Integer.parseInt(br.readLine());

                    BankManagement.loginAccount(name, pass);
                }

                else if (choice == 3) {
                    System.out.println("Thank you for using Mini Banking App!");
                    System.exit(0);
                }

                else {
                    System.out.println("Invalid Option!");
                }

            } catch (Exception e) {
                System.out.println("Please enter valid input!");
            }
        }
    }
}
