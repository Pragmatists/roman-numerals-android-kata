package pl.pragmatists.tddtraining.romannumerals.skdfree;

public class RomanNumeralsConverter {
    public String arabicToRoman(String romanNumber) {
        return times("I", Integer.valueOf(romanNumber));
    }

    private String times(String textToRepeat, int howManyTimes) {
        String result = "";
        for (int i = 0; i < howManyTimes; i++) {
            result += textToRepeat;
        }
        return result;
    }
}
