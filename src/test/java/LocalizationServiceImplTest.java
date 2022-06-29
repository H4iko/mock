import org.junit.jupiter.api.*;
import ru.netology.entity.Country;
import ru.netology.i18n.LocalizationServiceImpl;

public class LocalizationServiceImplTest {

    @BeforeAll
    public static void start() {
        System.out.println("Start tests");
    }

    @AfterAll
    public static void finish() {
        System.out.printf("Tests finished");
    }

    @Test
    public void localeTest() {

        LocalizationServiceImpl localizationService = new LocalizationServiceImpl();

        //given
        Country country = Country.RUSSIA;
        String expected = "Добро пожаловать";

        //when
        String result = localizationService.locale(country);

        //then
        Assertions.assertEquals(expected, result);

        //given
        Country country = Country.USA;
        String expected = "Welcome";

        //when
        String result = localizationService.locale(country);

        //then
        Assertions.assertEquals(expected, result);

        //given
        Country country = Country.GERMANY;
        String expected = "Welcome";

        //when
        String result = localizationService.locale(country);

        //then
        Assertions.assertEquals(expected, result);

    }
}
