package sprint_7.junit.task03;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Collections;

public class FortuneCookieControllerTest {
    public static FortuneCookieController goodFortuneCookieController;
    public static FortuneCookieController badFortuneCookieController;

    @BeforeAll
    public static void beforeAll() {
        FortuneCookieFactory goodFortuneCookieFactory = new FortuneCookieFactory(new FortuneConfig(true),
                Collections.singletonList("Вам повезёт!"),
                Collections.singletonList("Вам  не повезёт!"));

        goodFortuneCookieController = new FortuneCookieController(goodFortuneCookieFactory);

        FortuneCookieFactory badFortuneCookieFactory = new FortuneCookieFactory(new FortuneConfig(false),
                Collections.singletonList("Вам повезёт!"),
                Collections.singletonList("Вам  не повезёт!"));

        badFortuneCookieController = new FortuneCookieController(badFortuneCookieFactory);
    }


    @Test
    public void shouldReturnPositiveFortune() {
        FortuneCookie fortuneCookie = goodFortuneCookieController.tellFortune();
        Assertions.assertEquals("Вам повезёт!", fortuneCookie.getFortuneText());
    }

    @Test
    public void shouldReturnNegativeFortune() {
        FortuneCookie fortuneCookie = badFortuneCookieController.tellFortune();
        Assertions.assertEquals("Вам  не повезёт!", fortuneCookie.getFortuneText());
    }
}
