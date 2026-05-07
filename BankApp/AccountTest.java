import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {
    @Test
    public void testThatBalanceIsZeroOnCreation() {
        Account account = new Account("marve", "1234");
        assertEquals(BigDecimal.ZERO, account.getBalance());

    }

    @Test
    public void testThatI_deposit500AndBalanceIs500() {
        Account account = new Account("marve", "1234");
        account.deposit(BigDecimal.valueOf(500));
        assertEquals(BigDecimal.valueOf(500), account.getBalance());
    }

    @Test
    public void testThatI_depositNegativeAmountAndBalanceIs500() {
        Account account = new Account("marve", "1234");
        account.deposit(BigDecimal.valueOf(500));
        account.deposit(BigDecimal.valueOf(-500));
        assertEquals(BigDecimal.valueOf(500), account.getBalance());

    }

    @Test
    public void testThatI_deposit500AndWithdraw200_balanceIs500() {
        Account account = new Account("marve", "1234");
        account.deposit(BigDecimal.valueOf(500));
        account.withdraw(BigDecimal.valueOf(200));
        assertEquals(BigDecimal.valueOf(300), account.getBalance());

    }

    @Test
    public void testThatI_deposit500AndWithdraw1k_balanceIs500() {
        Account account = new Account("marve", "1234");
        account.deposit(BigDecimal.valueOf(500));
        account.withdraw(BigDecimal.valueOf(1000));
        assertEquals(BigDecimal.valueOf(500), account.getBalance());

    }

    @Test
    public void testThatTheUserPinIsValid() {
        Account account = new Account("marve", "1234");
        assertTrue(account.isPin("1234"));
    }

    @Test
    public void testThatTheUserPinContains_a_letter() {
        Account account = new Account("marve", "1234");
        assertFalse(account.isPin("123a"));

    }

    @Test
    public void testThatTheUserPinLengthIsInvalid() {
        Account account = new Account("marve", "1234");
        assertFalse(account.isPin("12356"));


    }
    
}

