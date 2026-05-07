package BankApp;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Bank {
    private String name;
    private List<Account> accounts;

    public Bank(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    public Account registerCustomer(String customerName, String pin, int accountNumber) {

        Account account = new Account(
                customerName,
                pin,
                accountNumber
        );
        accounts.add(account);
        return account;
    }


    public void removeAccount(int accountNumber,
                              String pin)
            throws InvalidPinException {

        Account account = findAccount(accountNumber);

        if (account == null) {
            return;
        }
        account.checkBalance(pin);
        accounts.remove(account);
    }

    public Account findAccount(int accountNumber) {

        for (Account account : accounts) {
            if (account.getNumber() == accountNumber) {
                return account;
            }
        }
        return null;
    }

    public void deposit(BigDecimal amount,
                        int accountNumber)
            throws InvalidAmountException {

        Account account = findAccount(accountNumber);

        if (account == null) {
            throw new IllegalArgumentException(
                    "Account not found");
        }
        account.deposit(amount);
    }

    public void withdraw(BigDecimal amount,
                         int accountNumber,
                         String pin)
            throws InvalidPinException,
            InvalidAmountException,
            InsufficientFundsException {

        Account account = findAccount(accountNumber);

        if (account == null) {
            throw new IllegalArgumentException(
                    "Account not found");
        }
        account.withdraw(amount, pin);
    }

    public void transfer(BigDecimal amount,
                         int fromAccount,
                         int toAccount,
                         String pin)
            throws InvalidPinException,
            InvalidAmountException,
            InsufficientFundsException {
        Account sender = findAccount(fromAccount);
        Account receiver = findAccount(toAccount);

        if (sender == null || receiver == null) {
            throw new IllegalArgumentException(
                    "Account not found"
            );
        }
        sender.withdraw(amount, pin);
        receiver.deposit(amount);
    }

    public BigDecimal checkBalance(int accountNumber,
                                   String pin)
            throws InvalidPinException {

        Account account = findAccount(accountNumber);

        if (account == null) {
            throw new IllegalArgumentException(
                    "Account not found"
            );
        }
        return account.checkBalance(pin);
    }
}






