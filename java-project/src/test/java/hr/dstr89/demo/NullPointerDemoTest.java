package hr.dstr89.demo;

import org.junit.jupiter.api.Test;

import java.util.random.RandomGenerator;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

class NullPointerDemoTest {

    @Test
    void givenMethodThatThrowsNullPointer_whenInvokingIt_thenMessageContainersVariableName() {
        RandomGenerator generator = RandomGenerator.of("L128X256MixRandom");
        assertThatThrownBy(NullPointerDemo::makeNullPointer).hasMessageContaining("because \"car\" is null");
    }

}
