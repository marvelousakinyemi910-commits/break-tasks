package BankApp;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    void depositShouldIncreaseBalance() throws Exception {
        NIBBS nibbs = new NIBBS();
        Bank bank = new Bank("GTBank", "01",nibbs);
        Account account = new Account("John", 1234, "1234", bank);

        account.deposit(new BigDecimal("500"));

        assertEquals(new BigDecimal("500"), account.checkBalance("1234"));
    }

    @Test
    void withdrawShouldDecreaseBalance() throws Exception {
        NIBBS nibbs = new NIBBS();
        Bank bank = new Bank("GTBank", "01",nibbs);
        Account account = new Account("John", 1234, "1234",bank);

        account.deposit(new BigDecimal("1000"));
        account.withdraw(new BigDecimal("400"), "1234");

        assertEquals(new BigDecimal("600"), account.checkBalance("1234"));
    }

    @Test
    void wrongPinShouldThrowException() {
        NIBBS nibbs = new NIBBS();
        Bank bank = new Bank("GTBank", "01", nibbs);
        Account account = new Account("Marve", 1234, "1234", bank);

        assertThrows(InvalidPinException.class, () -> {
            account.checkBalance("0000");
        });
    }

    @Test
    void insufficientFundsShouldThrowException() {
        NIBBS nibbs = new NIBBS();
        Bank bank = new Bank("GTBank", "01",nibbs);
        Account account = new Account("Marve", 1234, "1234", bank);

        assertThrows(InsufficientFundsException.class, () -> {
            account.withdraw(new BigDecimal("1000"), "1234");
        });
    }
}