package com.example.fcg1400019345.horoscopo;

import android.app.SearchManager;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;


@SuppressWarnings("deprecation")
public class AtividadeDetalhes extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atividade_detalhes);

        Intent intent = getIntent();
        String detailText = intent.getStringExtra(Intent.EXTRA_TEXT);

        if (intent.hasExtra(Intent.EXTRA_TEXT)) {
            TextView detailTextView = (TextView) findViewById(R.id.detalhe_item_texto);
            detailTextView.setText(detailText);

        }

        // LIGAR BOTAO NA CLASSE

        Button botao = (Button) findViewById(R.id.botao);

        botao.setOnClickListener(new BotaoClicado());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_atividade_detalhes, menu);
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

    private class BotaoClicado implements View.OnClickListener {

        @Override
        public void onClick(View v) {

            Intent intent = new Intent(Intent.ACTION_WEB_SEARCH);

            TextView detailTextView = (TextView) findViewById(R.id.detalhe_item_texto);

            String texto = detailTextView.getText().toString();

            intent.putExtra(SearchManager.QUERY, texto);
            if (intent.resolveActivity(getPackageManager()) != null)
                startActivity(intent);

        }

    }

}
