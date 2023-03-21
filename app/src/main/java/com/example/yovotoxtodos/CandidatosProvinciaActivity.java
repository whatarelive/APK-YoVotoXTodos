package com.example.yovotoxtodos;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.yovotoxtodos.models.Candidato;
import com.example.yovotoxtodos.models.CandidatosData;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CandidatosProvinciaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.la_habana);

        ArrayList<Candidato> candidatoList = new ArrayList<>();

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            candidatoList = extras.getParcelableArrayList("province");
        }

        Log.i("TAG", "onCreate: " + candidatoList.size());

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        CandidatosAdapter adapter = new CandidatosAdapter(candidatoList, getBaseContext());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getBaseContext()));

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(this, MainActivity2.class));
        finish();
    }
}
