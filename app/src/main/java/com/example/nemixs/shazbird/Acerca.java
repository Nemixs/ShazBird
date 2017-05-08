package com.example.nemixs.shazbird;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Acerca extends AppCompatActivity {

    Button regresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shaz_bird);

        regresar = (Button)findViewById(R.id.cancelarshazbird);
        regresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cargar = new Intent(Acerca.this, MainActivity.class);
                startActivity(cargar);
            }
        });

    }
}
