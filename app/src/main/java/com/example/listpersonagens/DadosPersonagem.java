package com.example.listpersonagens;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class DadosPersonagem extends AppCompatActivity {
    TextView personagem;
    ImageView imgPersonagem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dados_personagem_layout);

        personagem = (TextView) findViewById(R.id.personagem);
        imgPersonagem = (ImageView) findViewById(R.id.imgPersonagem);

        Intent intent = getIntent();
        String nomef = intent.getStringExtra("name");
        int imgf = intent.getIntExtra("image", 0);

        personagem.setText(nomef);
        imgPersonagem.setImageResource(imgf);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
