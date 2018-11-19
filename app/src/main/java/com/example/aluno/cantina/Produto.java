package com.example.aluno.cantina;

import com.orm.SugarRecord;

public class Produto extends SugarRecord{

    private String nome;
    private double valor;

    // Sugar ORM precisa de um construtor vazio
    // Sem isso, o framework não funciona

    public Produto() {

    }

    // Gets e sets para manipular os atributos privados

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString(){
        return nome + " valor: R$ " + valor;
    }
}


