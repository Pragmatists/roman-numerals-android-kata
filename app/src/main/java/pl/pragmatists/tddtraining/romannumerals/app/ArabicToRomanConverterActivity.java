package pl.pragmatists.tddtraining.romannumerals.app;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;
import pl.pragmatists.tddtraining.romannumerals.skdfree.RomanNumeralsConverter;

public class ArabicToRomanConverterActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arabic_to_roman_converter);
        getRomanInputField().addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                String result = new RomanNumeralsConverter().arabicToRoman(
                        getRomanInputField().getText().toString()
                );
                getArabicResultTextView().setText(result);
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    private TextView getArabicResultTextView() {
        return (TextView) findViewById(R.id.romanResult);
    }

    private EditText getRomanInputField() {
        return (EditText) findViewById(R.id.arabicInput);
    }

}
