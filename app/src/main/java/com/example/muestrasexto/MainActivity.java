package com.example.muestrasexto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText usuario;
    EditText contra;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        usuario = findViewById(R.id.Edusuario);
        contra = findViewById(R.id.Edcontra);
        Intent principal = new Intent(getApplicationContext(),PrincipalActivity.class);
        if((usuario.getText().toString()== "javi")&&(contra.getText().toString()=="root"))
        {
            startActivity(principal);
        }
    }
}