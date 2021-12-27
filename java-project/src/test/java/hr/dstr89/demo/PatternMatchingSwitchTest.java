package hr.dstr89.demo;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PatternMatchingSwitchTest {

    @Test
    void givenOldImpl_whenParsingCorrectDouble_thenCorrectValueReturned() {
        double actual = PatternMatchingSwitch.parseDoubleOldSchool("17.00");
        assertThat(actual).isEqualTo(17.00d);
    }

    @Test
    void givenOldImpl_whenParsingIncorrectDouble_thenDefaultValueReturned() {
        double actual = PatternMatchingSwitch.parseDoubleOldSchool(false);
        assertThat(actual).isEqualTo(0d);
    }

    @Test
    void givenPatternMatchingImpl_whenParsingCorrectDouble_thenCorrectValueReturned() {
        double actual = PatternMatchingSwitch.parseDoublePatternMatching("17.00");
        assertThat(actual).isEqualTo(17.00d);
    }

    @Test
    void givenPatternMatchingImpl_whenParsingIncorrectDouble_thenDefaultValueReturned() {
        double actual = PatternMatchingSwitch.parseDoubleOldSchool(false);
        assertThat(actual).isEqualTo(0d);
    }

}
