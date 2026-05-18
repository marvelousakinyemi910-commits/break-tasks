import java.math.BigDecimal;

public class ATM {
    private Bank bank;

    public ATM(Bank bank){
        this.bank = bank;
    }
    public void withdraw(Card card, String pinEntered, BigDecimal amount )throws InvalidPinException,InvalidAmountException,InsufficientFundsException{
        Account account = card.getAccount();
        account.withdraw(amount,pinEntered);

    }
    public void transfer(Card card, int fromAccount, int toAccount,String pinEntered ,Bank toBank) throws InvalidPinException,InvalidAmountException,InsufficientFundsException{
        Bank fromBank = card.getBank();
    }
}
