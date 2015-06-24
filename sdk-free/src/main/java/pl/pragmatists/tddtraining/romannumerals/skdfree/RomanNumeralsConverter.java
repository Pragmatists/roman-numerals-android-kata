package pl.pragmatists.tddtraining.romannumerals.skdfree;

public class RomanNumeralsConverter {
    public String arabicToRoman(String arabicNumber) {
        return times("I", Integer.valueOf(arabicNumber));
    }

    private String times(String textToRepeat, int howManyTimes) {
        String result = "";
        for (int i = 0; i < howManyTimes; i++) {
            result += textToRepeat;
        }
        return result;
    }
}
