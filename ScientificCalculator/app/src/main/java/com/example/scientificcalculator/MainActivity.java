package com.example.scientificcalculator;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void onPress(View v){
        if(v.getId()==R.id.b1){
            Intent i=new Intent(this,BasicCalc.class);
            startActivity(i);
        }
        if(v.getId()==R.id.b2){
            Intent i=new Intent(this,ScientificCalc.class);
            startActivity(i);
        }

    }
}
