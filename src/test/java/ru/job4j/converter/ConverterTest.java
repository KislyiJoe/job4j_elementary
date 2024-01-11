package ru.job4j.converter;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class ConverterTest {

    @Test
    void whenConvert210RblThen3Euro() {
        float input = 210;
        float expected = 3;
        float output = Converter.rubleToEuro(input);
        float value = 0.0f;
        assertThat(output).isEqualTo(expected, withPrecision(value));
    }

    @Test
    void whenConvert190RblThen3dot1667Dollar() {
        float input = 190;
        float expected = 3.1667f;
        float output = Converter.rubleToDollar(input);
        float value = 0.0001f;
        assertThat(output).isEqualTo(expected, withPrecision(value));
    }
}