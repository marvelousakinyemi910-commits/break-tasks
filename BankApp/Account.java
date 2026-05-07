package BankApp;

import java.math.BigDecimal;
public class Account {
    private String name;
    private BigDecimal balance;
    private String pin;
    private int number;

    public Account(String name, String pin, int number) {
        this.name = name;
        this.pin = pin;
        this.number = number;
        this.balance = BigDecimal.ZERO;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    private void validatePin(String pinEntered)
            throws InvalidPinException {

        if (!pin.equals(pinEntered)) {
            throw new InvalidPinException("Invalid PIN");
        }
    }

    public void deposit(BigDecimal amount) throws InvalidAmountException {

        if (amount == null || amount.compareTo(BigDecimal.ZERO) <= 0) {
            throw new InvalidAmountException(
                    "Amount must be positive"
            );
        }
        balance = balance.add(amount);


    }

    public void withdraw(BigDecimal amount, String pinEntered) throws InvalidPinException,
            InvalidAmountException,
            InsufficientFundsException {

        validatePin(pinEntered);


        if (amount == null || amount.compareTo(BigDecimal.ZERO) <= 0) {
            throw new InvalidAmountException(
                    "Amount must be positive"
            );
        }
        if (balance.compareTo(amount) < 0) {
            throw new InsufficientFundsException(
                    "Insufficient funds"
            );
        }

        balance = balance.subtract(amount);


    }

    public BigDecimal checkBalance(String pinEntered)
            throws InvalidPinException {

        validatePin(pinEntered);
        return balance;

    }
}