package com.example.nemixs.shazbird;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.nemixs.shazbird.info_ave;

import org.json.JSONArray;
import org.json.JSONException;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;

import static com.example.nemixs.shazbird.R.id.textAve;

public class infoAve extends AppCompatActivity {

    Button cancelar;
//    info_ave info = new info_ave();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_ave);

        cancelar = (Button)findViewById(R.id.cancelarave);

        cancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cargar = new Intent(infoAve.this, MainActivity.class);
                startActivity(cargar);
            }
        });
    }
}
