package BankApp;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

    class BankTest {

        @Test
       public void shouldRegisterCustomer() {
            NIBBS nibbs = new NIBBS();
            Bank bank = new Bank("GTBank", "01", nibbs);

            Account account = bank.registerCustomer("John", 1234, "1234");

            assertNotNull(account);
        }

        @Test
       public void testFindAccount() {
            NIBBS nibbs = new NIBBS();
            Bank bank = new Bank("GTBank", "01", nibbs);

            bank.registerCustomer("John", 1234, "1234");

            Account found = bank.findAccount(1234);

            assertNotNull(found);
        }

        @Test
         public void  testThatDepositShouldWork() throws Exception {
            NIBBS nibbs = new NIBBS();
            Bank bank = new Bank("GTBank", "01",nibbs);

            bank.registerCustomer("John", 1234, "1234");
            bank.deposit(new BigDecimal("500"), 1234);

            Account account = bank.findAccount(1234);

            assertEquals(new BigDecimal("500"), account.checkBalance("1234"));
        }

        @Test
        public void transferShouldMoveMoney() throws Exception {
            NIBBS  nibbs = new NIBBS();
            Bank bank = new Bank("GTBank", "01",nibbs);

            bank.registerCustomer("John", 1111, "1234");
            bank.registerCustomer("Doe", 2222, "5678");

            bank.deposit(new BigDecimal("1000"), 1111);

            bank.transfer(
                    new BigDecimal("300"),
                    1111,
                    2222,
                    "1234"
            );

            Account sender = bank.findAccount(1111);
            Account receiver = bank.findAccount(2222);

            assertEquals(new BigDecimal("700"), sender.checkBalance("1234"));
            assertEquals(new BigDecimal("300"), receiver.checkBalance("5678"));
        }
    }

