package com.example.nemixs.shazbird;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button cargar;
    Button perfil;
    Button acerca;
    Button historial;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        historial = (Button)findViewById(R.id.historial);
        historial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent historial = new Intent(MainActivity.this, Historial.class);
                startActivity(historial);
            }
        });

        acerca = (Button)findViewById(R.id.acerca);
        acerca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent acerca = new Intent(MainActivity.this, Acerca.class);
                startActivity(acerca);
            }
        });

        perfil = (Button)findViewById(R.id.perfil);
        perfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent perfil = new Intent(MainActivity.this, Perfil.class);
                startActivity(perfil);
            }
        });

        cargar = (Button)findViewById(R.id.captar);
        cargar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             //   grabar();
                Intent cargar = new Intent(MainActivity.this, captura_audio.class);
                startActivity(cargar);
            }
        });
    }

    public void grabar() {
        Grabar gb = new Grabar(this);
        gb.comenzarGrabacion("/storage/sdcard0/external_sdcard/audio.wav");
        gb.finalizarGrabacion();
    }
}
