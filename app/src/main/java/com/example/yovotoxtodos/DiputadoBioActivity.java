package com.example.yovotoxtodos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.example.yovotoxtodos.models.Candidato;

public class DiputadoBioActivity extends AppCompatActivity {

    private Candidato candidato;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.diputado_bio);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            candidato = extras.getParcelable("diputado");
        }

        TextView name = findViewById(R.id.name);
        name.setText(candidato.getName());

        TextView age = findViewById(R.id.age_value);
        age.setText(candidato.getAge());

        TextView cargo = findViewById(R.id.cargo_value);
        cargo.setText(candidato.getCargo());

        TextView bio = findViewById(R.id.bio_value);
        bio.setText(candidato.getBiografia());
    }
}