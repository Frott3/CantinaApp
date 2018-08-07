package com.example.aluno.cantina;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ProdutosActivity extends AppCompatActivity {


    Button confirma;
    SeekBar Nsalgado;
    SeekBar Nrefrigerante;
    TextView valorfinal;
    EditText troco;

    int Qtdsalgado = 0;
    int Qtdrefrigerante = 0;
    Double ValorSalgado = 3.80;
    Double ValorRefri = 1.50;
    Double conta = 0.0;
    Double valor
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_produtos);

        valorfinal = (TextView) findViewById(R.id.textView4) ;
        confirma = (Button) findViewById(R.id.button);
        Nsalgado = (SeekBar)findViewById(R.id.seekBar);
        Nrefrigerante = (SeekBar)findViewById(R.id.seekBar2);




       ;

        confirma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Qtdsalgado = Nsalgado.getProgress();
                Qtdrefrigerante = Nrefrigerante.getProgress();
                conta = (Qtdrefrigerante*ValorRefri) + (ValorSalgado*Qtdsalgado);


                valorfinal.setText(""+conta);
            }
        });
    }
}
