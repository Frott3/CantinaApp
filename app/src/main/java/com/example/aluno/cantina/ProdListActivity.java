package com.example.aluno.cantina;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

public class ProdListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prod_list);

        List<Produto> produtos = Produto.listAll(Produto.class);
        ListView lv = (ListView) findViewById(R.id.listView);

        ArrayAdapter<Produto> adapter = new ArrayAdapter<Produto>(this, android.R.layout.simple_list_item_1, produtos );
        lv.setAdapter(adapter);
    }
}
