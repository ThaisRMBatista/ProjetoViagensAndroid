package com.thais.projetoviagens.ui.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.thais.projetoviagens.R;
import com.thais.projetoviagens.dao.PacoteDao;
import com.thais.projetoviagens.model.Pacote;
import com.thais.projetoviagens.ui.adapter.ListaDePacotesAdapter;

import java.util.List;

public class ListaPacotesActivity extends AppCompatActivity {

    public static final String TITULO_APP_BAR = "Pacotes";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_pacotes2);

        setTitle(TITULO_APP_BAR);
        configuraLista();
    }

    private void configuraLista() {
        ListView listaDePacotes = findViewById(R.id.lista_pacotes_listview);
        List<Pacote> pacotes = new PacoteDao().lista();
        listaDePacotes.setAdapter(new ListaDePacotesAdapter(pacotes, this));
    }
}