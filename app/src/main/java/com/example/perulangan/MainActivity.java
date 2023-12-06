package com.example.perulangan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
Button BtnFor, BtnWhile, BtnDoWhile;
TextView TVHasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TVHasil = findViewById(R.id.hasil);
        BtnFor = findViewById(R.id.Bfor);
        BtnWhile = findViewById(R.id.Bwhile);
        BtnDoWhile = findViewById(R.id.Bdowhile);

        BtnFor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TVHasil.setText("");
                for(int x=1;x<=10;x++){
                    TVHasil.setText(TVHasil.getText().toString()+x+"\n");
                }
            }
        });

        BtnWhile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TVHasil.setText("");
                int y = 5;
                while(y<=15) {
                    TVHasil.setText(TVHasil.getText().toString()+y+"\n");
                    y++;
                }
            }
        });

        BtnDoWhile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TVHasil.setText("");
                int z=10;
                do {
                    TVHasil.setText(TVHasil.getText().toString()+z+"\n");
                    z++;
                }while(z<=20);
            }
        });
    }
}