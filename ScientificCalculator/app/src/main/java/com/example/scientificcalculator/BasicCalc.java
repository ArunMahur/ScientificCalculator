package com.example.scientificcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class BasicCalc extends AppCompatActivity {

    EditText et1;
    Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,bclear,bdec,ba,bs,bm,bdiv,bcalc;

    float Value1, Value2;
    boolean mAddition, mSubtract, mMultiplication, mDivision ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_calc);

        b0=findViewById(R.id.btn_0);
        b1=findViewById(R.id.btn_1);
        b2=findViewById(R.id.btn_2);
        b3=findViewById(R.id.btn_3);
        b4=findViewById(R.id.btn_4);
        b5=findViewById(R.id.btn_5);
        b6=findViewById(R.id.btn_6);
        b7=findViewById(R.id.btn_7);
        b8=findViewById(R.id.btn_8);
        b9=findViewById(R.id.btn_9);
        bclear=findViewById(R.id.btn_clear);
        bdec=findViewById(R.id.btn_dec);
        ba=findViewById(R.id.btn_Add);
        bs=findViewById(R.id.btn_Sub);
        bm=findViewById(R.id.btn_Mul);
        bdiv=findViewById(R.id.btn_Div);
        bcalc=findViewById(R.id.btn_calc);
        et1=findViewById(R.id.edText1);

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText(et1.getText()+"0");
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText(et1.getText()+"1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText(et1.getText()+"2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText(et1.getText()+"3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText(et1.getText()+"4");
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText(et1.getText()+"1");
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText(et1.getText()+"5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText(et1.getText()+"6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText(et1.getText()+"7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText(et1.getText()+"8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText(et1.getText()+"9");
            }
        });
        bdec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText(et1.getText()+".");
            }
        });
        bclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText(null);
            }
        });
        ba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (et1==null){
                    et1.setText("");
                }
                else {
                    Value1=Float.parseFloat(et1.getText()+"");
                    mAddition=true;
                    et1.setText(null);
                }
            }
        });
        bs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (et1==null){
                    et1.setText("");
                }
                else {
                    Value1=Float.parseFloat(et1.getText()+"");
                    mSubtract=true;
                    et1.setText(null);
                }

            }
        });
        bm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (et1==null){
                    et1.setText("");
                }
                else {
                    Value1=Float.parseFloat(et1.getText()+"");
                    mMultiplication=true;
                    et1.setText(null);
                }
            }
        });
        bdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (et1==null){
                    et1.setText("");
                }
                else {
                    Value1=Float.parseFloat(et1.getText()+"");
                    mDivision=true;
                    et1.setText(null);
                }
            }
        });

        bcalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Value2=Float.parseFloat(et1.getText()+"");

                if(mAddition==true){
                    et1.setText(Value1+Value2+"");
                    mAddition=false;
                }
                if(mSubtract==true){
                    et1.setText(Value1-Value2+"");
                    mSubtract=false;
                }
                if(mMultiplication==true){
                    et1.setText(Value1*Value2+"");
                    mMultiplication=false;
                }if(mDivision==true){
                    et1.setText(Value1/Value2+"");
                    mDivision=false;
                }

            }
        });

    }
}
