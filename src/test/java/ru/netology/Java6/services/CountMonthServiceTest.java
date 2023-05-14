package ru.netology.Java6.services;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.Java6.services.CountMonthService;

public class CountMonthServiceTest {

    @Test
    public void RestCalculatedLot () {
        CountMonthService service = new CountMonthService();

        int expected = 3;
        int actual = service.calculate(10_000, 3_000, 20_000);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void RestCalculatedFew () {
        CountMonthService service = new CountMonthService();

        int expected = 2;
        int actual = service.calculate(100_000, 60_000, 150_000);

        Assertions.assertEquals(expected, actual);
    }
}
