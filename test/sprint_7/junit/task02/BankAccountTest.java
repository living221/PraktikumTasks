package sprint_7.junit.task02;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {

    @Test
    public void shouldNotBeBlockedWhenCreated() {
        BankAccount account = new BankAccount("a", "b");
        assertFalse(account.isBlocked());
    }

    @Test
    public void shouldReturnZeroAmountAfterActivation() {
        BankAccount account = new BankAccount("a", "b");
        account.activate("RUB");
        assertEquals(new Integer(0), account.getAmount());
        assertEquals("RUB", account.getCurrency());
    }

    @Test
    public void shouldBeBlockedAfterBlockIsCalled() {
        BankAccount account = new BankAccount("a", "b");
        account.activate("RUB");
        account.block();
        assertTrue(account.isBlocked());
    }

    @Test
    public void shouldReturnFirstNameThenSecondName() {
        BankAccount account = new BankAccount("a", "b");
        account.activate("RUB");

        String[] expected = {"a", "b"};
        assertArrayEquals(expected, account.getFullName());
    }

    @Test
    public void shouldReturnNullAmountWhenNotActive() {
        BankAccount account = new BankAccount("a", "b");

        IllegalStateException exception = assertThrows(IllegalStateException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                assertNull(account.getAmount());
            }
        });
        assertEquals("Счёт не активирован.", exception.getMessage());
//        assertNull(account.getAmount());


    }
 }