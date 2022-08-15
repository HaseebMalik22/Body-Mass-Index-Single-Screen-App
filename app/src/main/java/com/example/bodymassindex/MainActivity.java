package com.example.bodymassindex;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView hintResult;
        EditText weighte, heightte, heighte;
        Button hintBmi;
        ConstraintLayout CCmain;

        weighte = findViewById(R.id.weighte);
        heighte = findViewById(R.id.heighte);
        heightte = findViewById(R.id.heightte);
        hintBmi = findViewById(R.id.hint_bmi);
        hintResult = findViewById(R.id.hint_result);
        CCmain = findViewById(R.id.CCmain);



        hintBmi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int wtt = Integer.parseInt(weighte.getText().toString());
                int ht = Integer.parseInt(heighte.getText().toString());
                int htt = Integer.parseInt(heightte.getText().toString());

                int totalIn = ht*12 + htt;
                double totalCm = totalIn*2.53;
                double totalM = totalCm/100;
                double BMI = wtt/(totalM*totalM);

                if (BMI>25){
                    hintResult.setText("You are over weight");
                    CCmain.setBackgroundColor(getResources().getColor(R.color.colorOW));

                }else if (BMI<18){
                    hintResult.setText("You are under weight");
                    CCmain.setBackgroundColor(getResources().getColor(R.color.colorUW));

                }else {
                    hintResult.setText("You are healthy");
                    CCmain.setBackgroundColor(getResources().getColor(R.color.colorH));

                }


            }
        });





    }
}