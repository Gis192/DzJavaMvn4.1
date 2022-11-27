package ru.netology.DzJavaMvn41.BonusService;

import com.sun.jdi.Value;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class BonusServerTestPrm {
    @ParameterizedTest
    @CsvSource(
            value={
                    "1000,true,30",
                    "1000000,true,500"
            }
    )
    @CsvFileSource(files = "src/test/resources/data.csv")
    public void tets(long amount, boolean registered, long expected ) {
        BonusService service = new BonusService();
        long actual = service.calculate(amount, registered);
        Assertions.assertEquals(expected,actual);
    }

}
