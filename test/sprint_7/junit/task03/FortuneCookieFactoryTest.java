package sprint_7.junit.task03;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collections;

public class FortuneCookieFactoryTest {

    private static FortuneCookieFactory fortuneCookieFactory;

    @BeforeEach
    public void beforeEach() {
        fortuneCookieFactory = new FortuneCookieFactory(new FortuneConfig(true),
                Collections.singletonList("Вам повезёт!"),
                Collections.singletonList("Сегодня будет дождь.")
        );
    }

    @Test
    public void shouldIncrementCountByOneAfterOneCookieBaked() {
        fortuneCookieFactory.bakeFortuneCookie();
        int cookiesBaked = fortuneCookieFactory.getCookiesBaked();
        Assertions.assertEquals(1, cookiesBaked);
    }

    @Test
    public void shouldIncrementCountByTwoAfterTwoCookiesBaked() {
        fortuneCookieFactory.bakeFortuneCookie();
        fortuneCookieFactory.bakeFortuneCookie();
        int cookiesBaked = fortuneCookieFactory.getCookiesBaked();
        Assertions.assertEquals(2, cookiesBaked);
    }

    @Test
    public void shouldSetCounterToZeroAfterResetCookieCreatedCall() {
        fortuneCookieFactory.bakeFortuneCookie();
        int cookiesBaked = fortuneCookieFactory.getCookiesBaked();
        Assertions.assertEquals(1, cookiesBaked);
        fortuneCookieFactory.resetCookiesCreated();
        cookiesBaked = fortuneCookieFactory.getCookiesBaked();
        Assertions.assertEquals(0, cookiesBaked);
    }
}
