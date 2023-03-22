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

        findViewById(R.id.imageButton).setOnClickListener(v -> navigate(CandidatosData.pinar));
        findViewById(R.id.imageButton3).setOnClickListener(v -> navigate(CandidatosData.artemisa));
        findViewById(R.id.imageButton2).setOnClickListener(v -> navigate(CandidatosData.habana));
        findViewById(R.id.imageButton4).setOnClickListener(v -> navigate(CandidatosData.mayabeque));
        findViewById(R.id.imageButton5).setOnClickListener(v -> navigate(CandidatosData.isla));
        findViewById(R.id.imageButton6).setOnClickListener(v -> navigate(CandidatosData.matanzas));
        findViewById(R.id.imageButton7).setOnClickListener(v -> navigate(CandidatosData.villa));
        findViewById(R.id.imageButton8).setOnClickListener(v -> navigate(CandidatosData.cienfuego));
        findViewById(R.id.imageButton10).setOnClickListener(v -> navigate(CandidatosData.santi));
        findViewById(R.id.imageButton11).setOnClickListener(v -> navigate(CandidatosData.ciego));
        findViewById(R.id.imageButton12).setOnClickListener(v -> navigate(CandidatosData.camaguey));
        findViewById(R.id.imageButton13).setOnClickListener(v -> navigate(CandidatosData.tunas));
        findViewById(R.id.imageButton14).setOnClickListener(v -> navigate(CandidatosData.holguin));
        findViewById(R.id.imageButton15).setOnClickListener(v -> navigate(CandidatosData.granma));
        findViewById(R.id.imageButton16).setOnClickListener(v -> navigate(CandidatosData.santiago));
        findViewById(R.id.imageButton17).setOnClickListener(v -> navigate(CandidatosData.guantanamo));


    }

    private void navigate(ArrayList<Candidato> candidatoList) {
        Intent intent = new Intent(this, CandidatosProvinciaActivity.class);
        intent.putParcelableArrayListExtra("province", candidatoList);
        startActivity(intent);
        finish();
    }

}