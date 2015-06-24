package pl.pragmatists.tddtraining.romannumerals.skdfree;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RomanNumeralsConverterTest {

    @Test
    public void converts_1_to_I() {
        String result = new RomanNumeralsConverter().arabicToRoman("1");

        assertThat(result).isEqualTo("I");
    }

    @Test
    public void converts_2_to_II() {
        String result = new RomanNumeralsConverter().arabicToRoman("2");

        assertThat(result).isEqualTo("II");
    }

}