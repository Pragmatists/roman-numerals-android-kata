package pl.pragmatists.tddtraining.romannumerals.skdfree;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class RomanNumeralsConverterTest {

    @Test
    public void converts_1_to_I() {
        String result = new RomanNumeralsConverter().arabicToRoman("1");

        Assertions.assertThat(result).isEqualTo("I");
    }

    @Test
    public void converts_2_to_II() {
        String result = new RomanNumeralsConverter().arabicToRoman("2");

        Assertions.assertThat(result).isEqualTo("II");
    }

}