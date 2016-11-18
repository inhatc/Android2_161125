package com.example.ryuilhan.select_test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    CheckBox CH1;
    boolean BData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        CH1 = (CheckBox)CH1.findViewById(R.id.checkBox);
        CH1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(CH1.isChecked()){
                    BData = true;
                }
                else {
                    BData = false;
                }
            }
        });



    }
}

