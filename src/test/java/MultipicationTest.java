import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MultipicationTest {

    @Test
    void testMultiplication() {

        Dollar dollar = new Dollar(5);
        dollar.times(2);

        assertEquals(Money.dollar(10), Money.dollar(5).times(2));
        assertNotEquals(Money.dollar(10), Money.dollar(5).times(3));

        assertEquals(Money.franc(10), Money.franc(5).times(2));
        assertNotEquals(Money.franc(10), Money.franc(5).times(3));

        assertNotEquals(Money.franc(10), Money.dollar(10));
    }

    @Test
    void testSimpleAddition() {
        Money sum = Money.dollar(5).plus(Money.dollar(5));
        assertEquals(Money.dollar(10), sum);

        Bank bank= new Bank();
        Money reduced = bank.reduce(sum, "USD");
        assertEquals(Money.dollar(10), reduced);
    }
}
