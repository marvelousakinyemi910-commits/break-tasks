package BankApp;

public class Card {
    private String cardNumber;
    private String pin;
    private Account account;
    private Bank bank;

    public Card(
            String cardNumber,
            String pin,
            Account account
    ) {

        this.cardNumber = cardNumber;
        this.pin = pin;
        this.account = account;
    }



    public Account getAccount(){
        return account;
    }

    public Bank getBank() {
        return account.getBank();
    }
}
