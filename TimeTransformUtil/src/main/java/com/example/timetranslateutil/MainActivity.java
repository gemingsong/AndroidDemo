package com.example.timetranslateutil;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    private Context mContext = null;

    private EditText mMsInputView = null;
    private CheckBox mMsOrSSwitchView = null;
    private Button mUnitTimeToDate = null;
    private TextView mShowSwitchedDateView = null;
    private boolean mIsMsUnit = true;


    private EditText mDateInputView = null;
    private Button mDateToUnitTimeView = null;
    private TextView mshowSwitchedUnitTimeView = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mContext = getApplicationContext();
        setContentView(R.layout.activity_main);
        mMsInputView = (EditText) findViewById(R.id.input_ms_edittext);
        mMsInputView.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                return false;
            }
        });
        mMsInputView.setText(String.valueOf(System.currentTimeMillis()));
        mMsOrSSwitchView = (CheckBox) findViewById(R.id.switch_ms_and_s);
        mMsOrSSwitchView.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                mIsMsUnit = isChecked;
                mMsOrSSwitchView.setText(isChecked ? R.string.str_time_unit_ms : R.string.str_time_unit_s);
            }
        });
        mUnitTimeToDate = (Button) findViewById(R.id.unit_to_date_time);
        mUnitTimeToDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputNumber = String.valueOf(mMsInputView.getText());
                Log.d("gms", "inputNumber = " + inputNumber);
                if (Objects.nonNull(inputNumber) && inputNumber.length() != 0) {
                    long unit_time = Long.parseLong(inputNumber);
                    if (!mIsMsUnit) {
                        unit_time *= 1000;
                    }
                    String date = TimeUtil.getDateTimeFromMillisecond(unit_time);
                    mShowSwitchedDateView.setText(date);
                    Log.d("gms", "date = " + date);
                } else {
                    Toast.makeText(mContext, "nothing iuput", Toast.LENGTH_SHORT).show();
                }
            }
        });
        mShowSwitchedDateView = (TextView) findViewById(R.id.show_unit_to_date_string);







        /*接下来是将时间转换成毫秒*/
        mDateInputView = (EditText) findViewById(R.id.input_date_edit_text);

        mDateToUnitTimeView = (Button) findViewById(R.id.date_to_unit_time);
        mDateToUnitTimeView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputNumber = String.valueOf(mDateInputView.getText());
                Log.d("gms", "inputNumber = " + inputNumber);
                if (Objects.nonNull(inputNumber) && inputNumber.length() != 0) {
                    long timeInMs = TimeUtil.timeStrToSecond(inputNumber);
                    mshowSwitchedUnitTimeView.setText(String.valueOf(timeInMs));
                } else {
                    Toast.makeText(mContext, "nothing iuput", Toast.LENGTH_SHORT).show();
                }
            }
        });
        mshowSwitchedUnitTimeView = (TextView) findViewById(R.id.show_date_to_unit_string);
    }
}
