import java.math.BigDecimal;

public class Account{
    private String name;
    private BigDecimal balance;
    private String pin;
    private int accountNumber;
    private Bank bank;

   public  Account(String name , int accountNumber, String pin,Bank bank){
       this.name = name;
       this.accountNumber = accountNumber;
       this.pin = pin ;
       this.balance = BigDecimal.ZERO;
        this.bank = bank;

   }
    public void deposit(BigDecimal amount)
            throws InvalidAmountException {

        if (amount.compareTo(BigDecimal.ZERO) <= 0) {
            throw new InvalidAmountException(
                    "Amount must be greater than zero"
            );
        }

        balance = balance.add(amount);
    }

    public void withdraw(BigDecimal amount, String pinEntered)
            throws InvalidPinException,
            InsufficientFundsException,
            InvalidAmountException {

       verify(pinEntered);

        if (amount.compareTo(BigDecimal.ZERO) <= 0) {
            throw new InvalidAmountException(
                    "Amount must be greater than zero"
            );
        }

        if (balance.compareTo(amount) < 0) {
            throw new InsufficientFundsException(
                    "Insufficient funds");
        }
        balance = balance.subtract(amount);
    }
    public BigDecimal checkBalance(String pinEntered)
            throws InvalidPinException {
       verify(pinEntered);

        return balance;
    }

    private boolean validatePin(String pinEntered) {
        return pin.equals(pinEntered);
    }

    public void verify(String pinEntered)
            throws InvalidPinException {

        if (!validatePin(pinEntered)) {
            throw new InvalidPinException(
                    "Invalid card PIN"
            );
        }
    }
    public String getName() {
        return name;
    }

    public int getAccountNumber() {
        return accountNumber;
    }
    public Bank getBank(){
       return bank;
}

    }


    
    
