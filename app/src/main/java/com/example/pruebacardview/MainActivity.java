package com.example.pruebacardview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<listview> elements;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }
    public void init(){
        elements = new ArrayList<>();
        elements.add(new listview(R.drawable.ic_foto_perfil_predeterminada, "Hola Buenos dias a todos y todas."));
        elements.add(new listview(R.drawable.ic_foto_perfil_predeterminada, "Hola Buenos dias a todos y todas."));
        elements.add(new listview(R.drawable.ic_foto_perfil_predeterminada, "Hola Buenos dias a todos y todas."));
        elements.add(new listview(R.drawable.ic_foto_perfil_predeterminada, "Hola Buenos dias a todos y todas."));
        elements.add(new listview(R.drawable.ic_foto_perfil_predeterminada, "Hola Buenos dias a todos y todas."));
        elements.add(new listview(R.drawable.ic_foto_perfil_predeterminada, "Hola Buenos dias a todos y todas."));
        elements.add(new listview(R.drawable.ic_foto_perfil_predeterminada, "Hola Buenos dias a todos y todas."));

        adaptadorLista listadapter = new adaptadorLista(elements, this);
        RecyclerView recyclerView = findViewById(R.id.RecyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(listadapter);
    }
}