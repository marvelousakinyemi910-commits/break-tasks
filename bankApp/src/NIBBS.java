import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class NIBBS {
    private List<Bank> banks = new ArrayList<>();

    public void registerBank(Bank bank) {
        banks.add(bank);
    }

    public void transfer(Bank fromBank, int fromAccount,
                         Bank toBank, int toAccount,
                         BigDecimal amount, String pin)
            throws Exception {

        if (!banks.contains(fromBank) || !banks.contains(toBank)) {
            throw new IllegalStateException("Bank not registered");
        }

        fromBank.withdraw(amount, fromAccount, pin);
        toBank.deposit(amount, toAccount);

        System.out.println("Transfer completed via NIBSS");
    }

}
