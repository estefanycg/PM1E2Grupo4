package com.example.ExaIIP;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityView extends AppCompatActivity {

    Button editar, eliminar, contactos, mapa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);
        contactos = (Button) findViewById(R.id.btn_contacto);
        editar = (Button) findViewById(R.id.btn_editar);
        mapa = (Button) findViewById(R.id.btn_mapa);

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