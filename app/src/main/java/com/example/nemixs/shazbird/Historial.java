package com.example.nemixs.shazbird;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Historial extends AppCompatActivity {

    Button regresar;
    Button historial1;
    Button historial2;
    Button historial3;
    Button historial4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historial);

        historial1 = (Button)findViewById(R.id.historial1);
        historial1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cargar = new Intent(Historial.this, infoAve.class);
                startActivity(cargar);
            }
        });

        historial2 = (Button)findViewById(R.id.historial2);
        historial2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cargar = new Intent(Historial.this, infoAve.class);
                startActivity(cargar);
            }
        });

        historial3 = (Button)findViewById(R.id.historial3);
        historial3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cargar = new Intent(Historial.this, infoAve.class);
                startActivity(cargar);
            }
        });

        historial4 = (Button)findViewById(R.id.historial4);
        historial4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cargar = new Intent(Historial.this, infoAve.class);
                startActivity(cargar);
            }
        });

        regresar = (Button)findViewById(R.id.cancelarhistorial);
        regresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cargar = new Intent(Historial.this, MainActivity.class);
                startActivity(cargar);
            }
        });
    }
}
