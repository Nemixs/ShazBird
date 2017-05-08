package com.example.nemixs.shazbird;

import android.os.AsyncTask;
import android.util.Log;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by Nemixs on 04-12-2016.
 */

public class info_ave {
    private int id_Ave;
    private String nombre;
    private String nombreCientifico;
    private String habitat;
    private String infoBitacora;
    private String audio_ave;
    private String fecha_avistamiento;

    //  new getDatos().execute();

    public void setId_Ave (int id_Ave) {this.id_Ave = id_Ave;}
    public void setNombre (String nombre) {this.nombre = nombre;}
    public void setNombreCientifico (String nombreCientifico) {this.nombreCientifico = nombreCientifico;}
    public void setHabitat (String habitat) {this.habitat = habitat;}
    public void setInfoBitacora (String infoBitacora) {this.infoBitacora = infoBitacora;}
    public void setAudio_ave (String audio_ave) {this.audio_ave = audio_ave;}
    public void setFecha_avistamiento (String fecha_avistamiento) {this.fecha_avistamiento = fecha_avistamiento;}

    public int getId_Ave() {return this.id_Ave;}
    public String getNombre() {return this.nombre;}
    public String getNombreCientifico() {return this.nombreCientifico;}
    public String getHabitat() {return this.habitat;}
    public String getInfoBitacora() {return this.infoBitacora;}
    public String getAudio_ave() {return this.audio_ave;}
    public String getFecha_avistamiento() {return this.fecha_avistamiento;}
}
