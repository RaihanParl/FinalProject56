package com.bidjidev.finalproject56;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class Activity2 extends AppCompatActivity {
int nilai;
    EditText edJawaban;
    CheckBox ckNaruto,ckSasuke,ckObito;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        nilai = getIntent().getIntExtra("nilai",0);
        Toast.makeText(this, nilai + "", Toast.LENGTH_SHORT).show();
        edJawaban = (EditText)findViewById(R.id.edJawaban);
        ckNaruto = (CheckBox) findViewById(R.id.ckNaruto);
        ckSasuke = (CheckBox) findViewById(R.id.ckSasuke);
        ckObito = (CheckBox) findViewById(R.id.ckObito);
    }
    public void getJawaban(){
        String jawaban = edJawaban.getText().toString();
        if (jawaban.equals("kakashi")){
            nilai += 10;
        }else {
            Toast.makeText(this, "jawaban anda salah", Toast.LENGTH_SHORT).show();
        }
    }
    public void getCheckbox(){
        if (ckNaruto.isChecked()){
            nilai +=10;
        }if (ckSasuke.isChecked()){
            nilai +=10;
        }if (ckObito.isChecked()){
            Toast.makeText(this, "jawabannya bukan obito", Toast.LENGTH_SHORT).show();
        }
    }
    public void kumpul(View v){
        getJawaban();getCheckbox();
        Toast.makeText(this, nilai + "", Toast.LENGTH_SHORT).show();
    }

}
