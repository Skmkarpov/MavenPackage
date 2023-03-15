import Netology.MavenPackage.CalcService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CalcServiceTest {
    @ParameterizedTest
    @CsvSource({
            "200,300,3",
            "0,120,1",
            "0,9802,90",
            "0,99,0"
    })
    public void borderTest(int downBorder, int upBorder, int expected) {
        CalcService service = new CalcService();
        int actual = service.calc(downBorder, upBorder);
        Assertions.assertEquals(actual, expected);
    }
}
