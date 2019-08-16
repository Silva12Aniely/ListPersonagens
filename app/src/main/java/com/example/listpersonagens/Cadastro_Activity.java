package com.example.listpersonagens;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Cadastro_Activity extends AppCompatActivity {
    Toolbar toolbar;
    Button btnCadastrar, btnSair;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cadastro_layout);

//        toolbar = (Toolbar) findViewById(R.id.idCadastro); idCadastro = id+daToolbar

        /*carrega a toolbar*/
        setSupportActionBar(toolbar);
        /*coloca o icone na barra*/
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        btnCadastrar = (Button) findViewById(R.id.btnCadastrar);
        btnSair = (Button) findViewById(R.id.btnSair);

        btnCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Cadastrado com Sucesso!", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(getApplicationContext(), Login_Activity.class));
            }
        });
        btnSair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
//          onBackPressed();
            startActivity(new Intent(getApplicationContext(), Login_Activity.class));
            finish();
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
