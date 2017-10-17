package com.jorgesoasti.notificaciones;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.media.RingtoneManager;
import android.net.Uri;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.google.firebase.iid.FirebaseInstanceId;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //En realida este método deberia llamarse Enviar token al servidor
    public void lanzarNotificacion(View v){
        String token = FirebaseInstanceId.getInstance().getToken();
        enviarTokenRegistro(token);
        Toast.makeText(this, token, Toast.LENGTH_SHORT).show();
    }

    private void enviarTokenRegistro(String token){
        Log.d("TOKEN", token);
    }
}
