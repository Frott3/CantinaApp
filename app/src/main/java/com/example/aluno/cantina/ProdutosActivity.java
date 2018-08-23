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
    SeekBar Nbebida;
    SeekBar Nbolo;
    SeekBar Ncafe;
    SeekBar Npacoca;
    SeekBar Npirulito;
    SeekBar Nbala;
    TextView valorfinal;
    EditText pag;
    Button botaoTroco;
    TextView campoTroco;
    TextView textSalgado;
    TextView textBebida;
    TextView textBolo;
    TextView textCafe;
    TextView textPacoca;
    TextView textPirulito;
    TextView textBala;



    int Qtdsalgado = 0;
    int Qtdrefrigerante = 0;
    int Qtdbolo = 0;
    int Qtdcafe = 0;
    int Qtdpacoca = 0;
    int Qtdpirulito = 0;
    int Qtdbala = 0;
    Double ValorSalgado = 3.80;
    Double ValorRefri = 1.50;
    Double ValorBolo = 2.00;
    Double ValorCafe = 1.50;
    Double ValorPacoca = 0.50;
    Double ValorPirulito = 0.75;
    Double ValorBala = 0.10;
    Double conta = 0.0;
    Double resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_produtos);

        valorfinal = (TextView) findViewById(R.id.textView5) ;
        confirma = (Button) findViewById(R.id.button);
        Nsalgado = (SeekBar)findViewById(R.id.seekBar2);
        Nbebida = (SeekBar)findViewById(R.id.seekBar);
        Nbolo = (SeekBar)findViewById(R.id.seekBar4);
        Ncafe = (SeekBar)findViewById(R.id.seekBar5);
        Npacoca= (SeekBar)findViewById(R.id.seekBar6);
        Npirulito = (SeekBar)findViewById(R.id.seekBar7);
        Nbala = (SeekBar)findViewById(R.id.seekBar3);


        pag = (EditText)findViewById(R.id.campoPg);
        botaoTroco = (Button)findViewById(R.id.botaoTroco);
        campoTroco = (TextView)findViewById(R.id.campoTroco);
        textSalgado = (TextView) findViewById(R.id.textSalgado);
        textBebida = (TextView) findViewById(R.id.textBebida);
        textBolo = (TextView) findViewById(R.id.textBolo);
        textCafe = (TextView) findViewById(R.id.textCafe);
        textPacoca = (TextView) findViewById(R.id.textPacoca);
        textPirulito = (TextView) findViewById(R.id.textPirulito);
        textBala = (TextView) findViewById(R.id.textBala);

        Nsalgado.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                textSalgado.setText(String.valueOf(progress));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        Nbebida.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                textBebida.setText(String.valueOf(progress));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        Nbolo.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                textBolo.setText(String.valueOf(progress));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        Ncafe.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                textCafe.setText(String.valueOf(progress));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        Npacoca.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                textPacoca.setText(String.valueOf(progress));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        Npirulito.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                textPirulito.setText(String.valueOf(progress));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        Nbala.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                textBala.setText(String.valueOf(progress));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


        confirma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Qtdsalgado = Nsalgado.getProgress();
                Qtdrefrigerante = Nbebida.getProgress();
                Qtdbolo = Nbolo.getProgress();
                Qtdcafe = Ncafe.getProgress();
                Qtdpacoca = Npacoca.getProgress();
                Qtdpirulito = Npirulito.getProgress();
                Qtdbala = Nbala.getProgress();
                conta = (Qtdrefrigerante*ValorRefri) + (ValorSalgado*Qtdsalgado);
                conta += (ValorBolo*Qtdbolo) + (ValorCafe*Qtdcafe);
                conta += (ValorPacoca*Qtdpacoca) + (ValorPirulito*Qtdpirulito) + (ValorBala*Qtdbala);



                valorfinal.setText(""+conta);
            }
        });

        botaoTroco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultado = Double.parseDouble(pag.getText().toString())-Double.parseDouble(valorfinal.getText().toString());
                campoTroco.setText(resultado.toString());
            }
        });
    }
}
