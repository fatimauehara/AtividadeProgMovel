package com.example.fcg1400019345.horoscopo;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@SuppressWarnings("deprecation")
public class AtividadePrincipal extends ActionBarActivity {
    private ListAdapter mAdaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atividade_principal);

        String [] dados= {
                "Áres - 21/03 a 20/04",
                "Touro - 21/04 a 20/05",
                "Gêmeos - 21/05 a 20/06",
                "Câncer - 21/06 a 21/07",
                "Leão - 22/07 a 22/08",
                "Virgem - 23/08 a 22/09",
                "Libra - 23/09 a 22/10",
                "Escorpião - 23/10 a 21/11",
                "Sargitário - 22/11 a 21/12",
                "Capricórnio - 22/12 a 20/01",
                "Aquário - 21/01 a 19/02",
                "Peixes - 20/02 a 20/03"


        };

        List<String> signos = new ArrayList<>(Arrays.asList(dados));

        //CRIAR O ADAPTADOR
        mAdaptador= new ArrayAdapter<>(
                getApplicationContext(), //contexto atual
                R.layout.item_lista_principal, //nome do ID do layout
                R.id.item_texto, //ID do TextView a ser prenchido
                signos);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_atividade_principal, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
