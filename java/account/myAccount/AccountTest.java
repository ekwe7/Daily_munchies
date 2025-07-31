
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {
    Account ekweAccount = new Account();

    @Test

    public void testAccount() {
        Account ekweAccount = new Account();
        int myAccount = ekweAccount.getbalance();
        assertEquals(ekweAccount.getbalance(), myAccount);

    }

    @Test
    public void depositTest() {
        int myAccount2 = ekweAccount.deposit(2000);
        assertEquals(2000, myAccount2);

    }


    @Test
    public void withdrawTest() {
        ekweAccount.deposit(2000);
        ekweAccount.withdraw(500);
        assertEquals(1500, ekweAccount.getbalance());
    }



}
