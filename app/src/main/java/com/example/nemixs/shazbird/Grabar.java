package com.example.nemixs.shazbird;

/**
 * Created by Nemixs on 19-11-2016.
 */

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.media.MediaRecorder;
import android.util.Log;

import java.io.IOException;

/**
 * Created by nacho-pc on 24-10-2016.
 */

public class Grabar extends MainActivity{
    /*
    * Atributos de la clase
    */
    private MediaRecorder grabador;

    /**
     * Constructor de la clase
     *
     * @param contexto Contexto de la aplicación
     */

    public Grabar(Context contexto) {
        grabador = new MediaRecorder();
    }

//Para poder grabar desde el micrófono y guardarlo en una ruta específica nos creamos el siguiente método:

    /**
     * Graba un sonido del micrófono en formato wav
     *
     * @param ruta Ruta donde se va a guardar el fichero grabado, por ejemplo: /storage/sdcard0/external_sdcard/audio.wav
     */
    @SuppressLint("InlinedApi")
    public void comenzarGrabacion(String ruta) {
        try {
            String rutasonido = ruta;
            grabador.setAudioSource(MediaRecorder.AudioSource.MIC); // Indico que quiero grabar del micrófono
            grabador.setOutputFormat(MediaRecorder.OutputFormat.THREE_GPP);    // Formato de salida
            grabador.setAudioEncoder(MediaRecorder.OutputFormat.AMR_NB);    // Codificación
            grabador.setOutputFile(ruta);
            grabador.prepare();    // Prepara el objeto para comenzar a grabar
            grabador.start();    // Comienza la grabación
        }
        catch (IllegalStateException e) {
            Log.i("Sonido", "Error grabando el sonido: " + e.toString());
        }
        catch (IOException e) {
            Log.i("Sonido", "Error grabando el sonido: " + e.toString());
        }
    }

    //   Por último para detener la grabación y que se guarde el fichero en la ruta especificada nos creamos el siguiente método:

    /**
     * Finaliza la grabación de un fichero del micrófono
     */
    public void finalizarGrabacion() {
        if (grabador != null) {
            grabador.stop();
            grabador.release();
            grabador = null;
        }
    }

    /**
     * Libera el recurso de sonido
     */
    public void liberar() {
        if( grabador != null ){
            grabador.release();
            grabador = null;
        }
    }
}