package hr.dstr89.demo;

import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    void asd() {
        assertThat(App.getDoubleUsingIf("asd")).isEqualTo(0d);
    }

}
