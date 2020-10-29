package com.example.capturapokemon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        }
        final CheckBox checkBox = (CheckBox) findViewById(R.id.Be);

        public boolean isChecked = false;

        checkBox.setOnClickListener(new OnClickListener() {

           @Override
                   public void onClick(View view){

            if ( ((CheckBox)view).isChecked() ) {

            }
        }
    }
}
