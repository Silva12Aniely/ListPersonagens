package com.example.listpersonagens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ListView listView;

    String[] nomePersonagens = {"NERO", "DANTE", "V", "NICO", "TRISH", "LADY", "VERGIL", "SPARDA"};

    String[] two_ttle = {"The Young Devil Hunter", "The Strongest Demon Slayer",
            "V The Mysterious One", "Artisan of Arms", "Fiendish Femme Fatale", "Armed Hunter for Hire",
            "Son of Sparda", "Legendary Dark Knight"};

    int[] imgPersonagens = {R.drawable.ic_nero, R.drawable.ic_dante,
            R.drawable.ic_v, R.drawable.ic_nico, R.drawable.ic_trish,
            R.drawable.ic_lady, R.drawable.ic_vergil, R.drawable.ic_sparda};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listaDePersonagens);

        CustomAdapter customAdapter = new CustomAdapter();
        listView.setAdapter(customAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent;

                intent = new Intent(getApplicationContext(), DadosPersonagem.class);
                intent.putExtra("name", nomePersonagens[position]);
                intent.putExtra("image", imgPersonagens[position]);
                intent.putExtra("sub_titulo", two_ttle[position]);
                startActivity(intent);
            }
        });
    }

    private class CustomAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return imgPersonagens.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View viewgroup, ViewGroup parent) {
            View view1 = getLayoutInflater().inflate(R.layout.lst_personagens, null);

            TextView name = (TextView) view1.findViewById(R.id.nomePersonagens);
            ImageView image = (ImageView) view1.findViewById(R.id.imgPersonagens);
            TextView sub_ttulo = (TextView) view1.findViewById(R.id.descPersonagem);

            name.setText(nomePersonagens[position]);
            image.setImageResource(imgPersonagens[position]);
//           sub_ttulo.setText(two_ttle[position]);
            return view1;
        }
    }
}
