package coyclab.github.com.hw_testing;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Calculator mCalculator = new Calculator();
    private EditText mFirstNumberEditText, mSecondNumberEditText;
    private Button mAddButton, mSubButton, mMulButton, mDivButton, mNextButton;
    private TextView mResultTextView;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        mFirstNumberEditText = (EditText) findViewById(R.id.first_number_edit_text);
        mSecondNumberEditText = (EditText) findViewById(R.id.second_number_edit_text);
        mAddButton = (Button) findViewById(R.id.add_button);
        mSubButton = (Button) findViewById(R.id.sub_button);
        mDivButton = (Button) findViewById(R.id.div_button);
        mMulButton = (Button) findViewById(R.id.mul_button);
        mResultTextView = (TextView) findViewById(R.id.result_text_view);
        mNextButton = (Button) findViewById(R.id.next_button);

        mAddButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(final View pView) {
                showResult(mCalculator.addition(Integer.valueOf(mFirstNumberEditText.getText().toString()),
                        Integer.valueOf(mSecondNumberEditText.getText().toString())));

            }
        });

        mSubButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(final View pView) {
                showResult(mCalculator.subtraction(Integer.parseInt(mFirstNumberEditText.getText().toString()),
                        Integer.parseInt(mSecondNumberEditText.getText().toString())));
            }
        });

        mNextButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(final View  pView) {
                startActivity(new Intent(MainActivity.this, ConverterActivity.class));
            }
        });

    }

    private void showResult(final String result) {
        mResultTextView.setText(result);
        mNextButton.setEnabled(true);
    }
}
