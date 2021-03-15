package com.example.cs.appbodymass;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText edthigh;
    private EditText edtweight;
    private Button result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edthigh = findViewById(R.id.ediHeigh);
        edtweight = findViewById(R.id.edtweight);
        result = findViewById(R.id.btn_calculate);
    }

    public void btn_OnClick(View view) {
        String high = edthigh.getText().toString();
        String weight = edtweight.getText().toString();
        if (high != null && !"".equals(high) && weight!=null && !"".equals(weight)){
            double h = Double.parseDouble(high)/100;
            double w = Double.parseDouble(weight);

            double bmi = w / (h*h);

            BMIR(bmi);
            result.setText(String.valueOf(bmi));

        }
    }
    String lessthannormal;
    String normalbmi;
    String over;
    String obse;
    private String BMIR(double bmi) {

        if (bmi < 18.5){

            return lessthannormal;
        }else if (bmi >= 18.5 && bmi < 25) {
            return normalbmi;
        } else if (bmi >= 25 && bmi < 30){

            return over;
        }else
            return obse;
    }


}