package hr.dstr89.demo;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RandomNumberGeneratorTest {

    @Test
    void givenBound_whenUsingOldRngApi_thenNumberIsExpectedRangeIsGenerated() {
        int actual = RandomNumberGenerator.randomGeneratorOldSchool(10);
        assertThat(actual).isNotNegative().isLessThan(10);
    }

    @Test
    void givenBound_whenUsingNewRngApi_thenNumberIsExpectedRangeIsGenerated() {
        int actual = RandomNumberGenerator.randomGeneratorNewApi(10);
        assertThat(actual).isNotNegative().isLessThan(10);
    }

}
