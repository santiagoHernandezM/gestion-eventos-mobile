package com.example.loginregistro;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class eventos extends AppCompatActivity {

    Spinner spinner_fichas;
    Spinner spinner_competencias;
    Spinner spinner_resultados;



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        spinner_fichas = (Spinner) findViewById(R.id.spinner_fichas);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.fichas, android.R.layout.simple_spinner_item);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);

        spinner_fichas.setAdapter(adapter);

        spinner_competencias = (Spinner) findViewById(R.id.spinner_competencias);

        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(this, R.array.competencias, android.R.layout.simple_spinner_item);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);

        spinner_resultados.setAdapter(adapter1);
        spinner_resultados = (Spinner) findViewById(R.id.spinner_resultados);

        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this, R.array.resultados, android.R.layout.simple_spinner_item);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);

        spinner_resultados.setAdapter(adapter1);
    }
}