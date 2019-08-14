package com.example.listpersonagens;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class DadosPersonagem extends AppCompatActivity {
    TextView personagem, descPersonagem;
    ImageView imgPersonagem;
    Button btnRating;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dados_personagem_layout);

        personagem = (TextView) findViewById(R.id.personagem);
        imgPersonagem = (ImageView) findViewById(R.id.imgPersonagem);
        descPersonagem = (TextView) findViewById(R.id.descPersonagem);

        Intent intent = getIntent();
        String nomef = intent.getStringExtra("name");
        String subf = intent.getStringExtra("sub_titulo");
        int imgf = intent.getIntExtra("image", 0);

        personagem.setText(nomef);
        imgPersonagem.setImageResource(imgf);
        descPersonagem.setText(subf);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        /* RatingBar */
        final RatingBar ratingBar = (RatingBar) findViewById(R.id.RatingPerso);

        btnRating = (Button) findViewById(R.id.btnRating);

        btnRating.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String rating = "Sua avaliação: " + ratingBar.getRating();
                Toast.makeText(getApplicationContext(), rating, Toast.LENGTH_SHORT).show();
            }
        });
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
