package com.example.EnviosApp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button botonGestionar, botonCalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        botonGestionar = findViewById(R.id.btnGestion);
        botonCalcular = findViewById(R.id.btnCalcular);

        botonGestionar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GestionarEnvio();
            }
        });
        botonCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                CalcularEnvio();
            }
        });
    }

    private void GestionarEnvio() {
        Intent intent = new Intent(MainActivity.this,MainActivity2.class);
        startActivity(intent);
    }

    private void CalcularEnvio() {
        Intent intent = new Intent(MainActivity.this,MainActivity3.class);
        startActivity(intent);
    }


}