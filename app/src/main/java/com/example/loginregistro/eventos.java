package com.example.loginregistro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class eventos extends AppCompatActivity {

    Spinner spinner_fichas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        spinner_fichas = (Spinner) findViewById(R.id.spinner_fichas);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.fichas, android.R.layout.simple_spinner_item);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);

        spinner_fichas.setAdapter(adapter);
    }
}