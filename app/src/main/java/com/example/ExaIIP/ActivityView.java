package com.example.ExaIIP;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class ActivityView extends AppCompatActivity {

    ImageView picture;
    Button editar, eliminar, contactos, mapa;
    EditText nombre, telefono, lat, lon;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);
        contactos = (Button) findViewById(R.id.btn_contacto);
        editar = (Button) findViewById(R.id.btn_editar);
        mapa = (Button) findViewById(R.id.btn_mapa);
        picture = (ImageView) findViewById(R.id.imageView);
        nombre = (EditText) findViewById(R.id.txtNombre);
        telefono = (EditText) findViewById(R.id.txtTelefono);
        lat = (EditText) findViewById(R.id.txtLatitud);
        lon = (EditText) findViewById(R.id.txtLongitud);

        contactos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ActivityListView.class);
                startActivity(intent);
            }
        });


        editar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ActivityEditar.class);
                startActivity(intent);
            }
        });

    }
}