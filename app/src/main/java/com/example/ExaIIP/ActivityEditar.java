package com.example.ExaIIP;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class ActivityEditar extends AppCompatActivity {

    ImageView picture;
    Bitmap image;
    Button tomarfoto, guardar;
    EditText nombre, telefono, lat, lon;
    String currentPhotoPath;
    static final int REQUEST_IMAGE = 101;
    static final int PETICION_ACCESS_CAM = 201;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editar);

        picture = (ImageView) findViewById(R.id.imageView);
        tomarfoto = (Button) findViewById(R.id.btn_foto);
        guardar = (Button) findViewById(R.id.btn_guardar);
        nombre = (EditText) findViewById(R.id.txtNombre);
        telefono = (EditText) findViewById(R.id.txtTelefono);
        lat = (EditText) findViewById(R.id.txtLatitud);
        lon = (EditText) findViewById(R.id.txtLongitud);


    }
}