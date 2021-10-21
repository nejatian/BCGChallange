package Challange.BCG.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class WatchTest {
    @Test
    void shouldCreateAWatchSuccessfully() {
        Watch watch = new Watch("001", "Rolex", new Money(100));
        watch.addDiscountRule(new DiscountRule(3, new Money(200)));
        assertThat(watch.id()).isEqualTo("001");
    }

}
