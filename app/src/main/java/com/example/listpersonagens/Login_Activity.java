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
import android.widget.EditText;
import android.widget.Toast;

public class Login_Activity extends AppCompatActivity {
    Button entrar, sair;
    EditText txtlogin, txtpass;
    Toolbar toolbar;

    public static final String EXTRA_MESSAGE = "br.sp.senac.atvpersonagens.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);

        txtlogin = (EditText) findViewById(R.id.txtlogin);
        txtpass = (EditText) findViewById(R.id.txtpass);
        entrar = (Button) findViewById(R.id.entrar);
        sair = (Button) findViewById(R.id.sair);
        txtlogin.requestFocus();

        entrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user, senha;

                user = txtlogin.getText().toString();
                senha = txtpass.getText().toString();

                if (user.equals("senac") && senha.equals("senac")) {
//                    startActivity(new Intent(getApplicationContext(), MainActivity.class));
                    Intent intent = new Intent(getApplicationContext(), MainActivity.class);

                    String message =txtlogin.getText().toString();
                    intent.putExtra(EXTRA_MESSAGE, message);

                    startActivity(intent);
                    finish();
                } else {
                    Toast.makeText(getApplicationContext(), "Usuário ou senha inválidos", Toast.LENGTH_SHORT).show();
                    txtlogin.setText("");
                    txtpass.setText("");
                    txtlogin.requestFocus();
                }

            }
        });
        sair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

//        toobar
        toolbar = (Toolbar) findViewById(R.id.idLogin);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.mBuscar:
                Toast.makeText(getApplicationContext(), "Pesquisa", Toast.LENGTH_SHORT).show();
                break;

            case R.id.mCadastrar:
                startActivity(new Intent(getApplicationContext(), Cadastro_Activity.class));
                finish();
                break;

            case R.id.mSobre:
                Toast.makeText(getApplicationContext(), "Sobre", Toast.LENGTH_SHORT).show();
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}
