package br.com.bossini.tipcalculatorfatecipitarde;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    private NumberFormat currencyFormat =
            NumberFormat.getCurrencyInstance();
    private NumberFormat percentFormat =
            NumberFormat.getPercentInstance();
    private TextView amountTextView;
    private TextView percentTextView;
    private TextView tipTextView;
    private TextView totalTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        amountTextView = (TextView)
                findViewById(R.id.amountTextView);
        percentTextView = (TextView)
                findViewById(R.id.percentTextView);
        tipTextView = (TextView)
                findViewById(R.id.tipTextView);
        totalTextView = (TextView)
                findViewById(R.id.totalTextView);
        tipTextView.setText(currencyFormat.format(0));
        totalTextView.setText(currencyFormat.format(0));
        EditText amountEditText = (EditText)
                findViewById(R.id.amountEditText);
        SeekBar percentSeekBar = (SeekBar)
                findViewById(R.id.percentSeekBar);
        ObservadorDeEditText observadorDeEditText =
                new ObservadorDeEditText();
        amountEditText.addTextChangedListener(observadorDeEditText);
        ObservadorDeSeekBar observadorDeSeekBar =
                new ObservadorDeSeekBar();
        percentSeekBar.setOnSeekBarChangeListener(observadorDeSeekBar);

    }

    class ObservadorDeSeekBar implements SeekBar.OnSeekBarChangeListener{
        @Override
        public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {

        }

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {

        }
    }

    class ObservadorDeEditText implements TextWatcher{

        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {

        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    }

}

