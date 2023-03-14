package com.example.yovotoxtodos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.yovotoxtodos.models.Candidato;
import com.example.yovotoxtodos.models.CandidatosData;

import java.util.ArrayList;
import java.util.List;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


    }

    private void navigate(ArrayList<Candidato> candidatoList) {
        Intent intent = new Intent(this, CandidatosProvinciaActivity.class);
        intent.putParcelableArrayListExtra("province", candidatoList);
        startActivity(intent);
        finish();
    }

}