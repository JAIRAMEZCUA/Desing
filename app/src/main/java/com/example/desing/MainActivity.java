package com.example.desing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.jar.Manifest;

public class MainActivity extends AppCompatActivity {
    private Typeface tipo;
    private TextView textView;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.textView);
        button=findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent  intent = new Intent( MainActivity.this,NotasActivity.class);
                startActivity(intent);
            }
        });
         String fuente = "Fuentes/nuevo.ttf";
         this.tipo = Typeface.createFromAsset(getAssets(),fuente);
         textView.setTypeface(tipo);
    }
}
