package com.example.yovotoxtodos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText jv_nombre, jv_provincia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        jv_nombre = (EditText) findViewById(R.id.Text_nombre);
        jv_provincia = (EditText) findViewById(R.id.Text_provincia);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);

        findViewById(R.id.inicio).setOnClickListener(v -> Inicio());
    }

    public void Inicio() {
        String nombre = jv_nombre.getText().toString();
        String provincia = jv_provincia.getText().toString();

        if(!nombre.equals("") && !provincia.equals("")){
            Intent intent = new Intent(this, MainActivity2.class);
            intent.putExtra("Nombre", nombre);
            intent.putExtra("Provincia", provincia);
            startActivity(intent);
            finish();
        } else {
            Toast.makeText(this, "Ingrese el dato faltante", Toast.LENGTH_LONG).show();

           if (nombre.equals("")){
               jv_nombre.requestFocus();
               InputMethodManager imm = (InputMethodManager) getSystemService(this.INPUT_METHOD_SERVICE);
               imm.showSoftInput(jv_nombre, InputMethodManager.SHOW_IMPLICIT);
           } else {
               jv_provincia.requestFocus();
               InputMethodManager imm = (InputMethodManager) getSystemService(this.INPUT_METHOD_SERVICE);
               imm.showSoftInput(jv_provincia, InputMethodManager.SHOW_IMPLICIT);
           }
        }
    }

    @Override
    public void onBackPressed() {
        finish();
    }
}