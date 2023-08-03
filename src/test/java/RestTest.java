import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.services.RestService;

public class RestTest {
    @Test
    public void shouldCalculateMoneyMonths1() {
        RestService service = new RestService();
        int income = 10_000;
        int expenses = 3_000;
        int threshold = 20_000;
        int expected = 3;

        int actual = service.calculateMoneyMonths(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateMoneyMonths2() {
        RestService service = new RestService();
        int income = 100_000;
        int expenses = 60_000;
        int threshold = 150_000;
        int expected = 2;

        int actual = service.calculateMoneyMonths(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);
    }

}