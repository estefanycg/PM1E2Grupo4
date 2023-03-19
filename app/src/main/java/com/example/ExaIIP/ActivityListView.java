package com.example.ExaIIP;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class ActivityListView extends AppCompatActivity {

    private ListView ContactosListView;
    FloatingActionButton agregar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        //Obtener la lista de Contactos
        //ArrayList<Contactos> contactos = 0btenerContactos();

        //Configurar el Adaptador
        CustomBaseAdapter adapter = new CustomBaseAdapter();

        //Mostrar la lista de Contactos
        ContactosListView = findViewById(R.id.customListView);
        ContactosListView.setAdapter(adapter);
        agregar = findViewById(R.id.registroNuevo);


        agregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });
    }
}