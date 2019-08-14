package com.example.listpersonagens;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class Cadastro_Activity extends AppCompatActivity {
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cadastro_layout);

        toolbar = (Toolbar) findViewById(R.id.idCadastro);

        /*carrega a toolbar*/
        setSupportActionBar(toolbar);
        /*coloca o icone na barra*/
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.mBuscar:
                Toast.makeText(getApplicationContext(), "Clique aqui para pesquisar", Toast.LENGTH_SHORT).show();
                break;
            case R.id.mCadastrar:
                Toast.makeText(getApplicationContext(), "Clique para se cadastrar", Toast.LENGTH_SHORT).show();
                break;
            case R.id.mSobre:
                Toast.makeText(getApplicationContext(), "Clique para saber mais", Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
