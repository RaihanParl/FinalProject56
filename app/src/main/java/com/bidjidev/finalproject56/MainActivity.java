package com.bidjidev.finalproject56;

import android.content.Intent;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {
    RadioGroup radioGroup1;
    RadioButton rdAndroid,rdIos,rdLinux;
    Button btnNext;
    TextView txtnilai;
    int nilai;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnNext = (Button)findViewById(R.id.btnNext);
        txtnilai = (TextView)findViewById(R.id.tvNilai);
        radioGroup1 = (RadioGroup)findViewById(R.id.radioGroup1);
        rdAndroid = (RadioButton)findViewById(R.id.rbAndroid);
        rdIos = (RadioButton)findViewById(R.id.rbIos);
        rdLinux = (RadioButton)findViewById(R.id.rbLinux);
        radioGroup1.setOnCheckedChangeListener(this);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(getApplicationContext(),Activity2.class);
                a.putExtra("nilai",nilai);
                startActivity(a);
            }
        });
    }

    @Override
    public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
        if (checkedId == R.id.rbAndroid){
            nilai = 10;
            txtnilai.setText(""+nilai);
        }if (checkedId==R.id.rbIos){
            nilai =0;
            txtnilai.setText(""+nilai);
        }if (checkedId == R.id.rbLinux){
            nilai = 0;
            txtnilai.setText(""+nilai);
        }
    }
}
