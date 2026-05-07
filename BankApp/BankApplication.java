package BankApp;

import java.math.BigDecimal;

public class BankApplication {

    public static void main(String[] args) {

        try {
            Bank bank = new Bank("My Bank");

            bank.registerCustomer(
                    "Marvellous",
                    "1234",
                    1001);

            bank.registerCustomer(
                    "Delight",
                    "4311",
                    1002
            );
            bank.deposit(
                    new BigDecimal("5000.00"),
                    1001
            );

            bank.withdraw(
                    new BigDecimal("500.00"),
                    1001,
                    "1234");


            bank.transfer(
                    new BigDecimal("500.00"),
                    1001,
                    1002,
                    "1234"
            );

            System.out.println(
                    bank.checkBalance(1001, "1234")
            );

            System.out.println(
                    bank.checkBalance(1002, "4321")
            );

        } catch (Exception e) {
            System.out.println(e.getMessage());

        }

    }
}