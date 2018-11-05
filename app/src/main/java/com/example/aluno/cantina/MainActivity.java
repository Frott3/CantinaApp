package com.example.aluno.cantina;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.orm.SchemaGenerator;
import com.orm.SugarContext;
import com.orm.SugarDb;

public class MainActivity extends AppCompatActivity {

    Button botaoProd;
    Button botaoQuem;
    Button botaoSugar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botaoProd = (Button) findViewById(R.id.buttonProd);
        botaoQuem = (Button) findViewById(R.id.buttonQuem);
        botaoSugar = (Button) findViewById(R.id.buttonSugar);


        botaoProd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent( MainActivity.this, ProdutosActivity.class));
            }
        });

        botaoQuem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent( MainActivity.this, QuemActivity.class));
            }
        });

        botaoSugar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent( MainActivity.this, SugarORMActivity.class));
            }
        });

        

        //SugarContext.init(getApplicationContext());
        //SchemaGenerator schemaGenerator = new SchemaGenerator(this);
        //schemaGenerator.createDatabase(new SugarDb(this).getDB());

    }
}
