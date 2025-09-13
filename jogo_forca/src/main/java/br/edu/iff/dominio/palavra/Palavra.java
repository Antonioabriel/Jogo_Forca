package br.edu.iff.dominio.palavra;

import java.util.Objects;

import br.edu.iff.dominio.letra.LetraFactory;

public class Palavra {
    private LetraFactory letraFactory;
    private String palavra;
    private Tema tema;

    public Palavra(String palavra, String temaStr, Tema tema) {
        this.palavra = palavra;
        this.tema = tema;
    }

    public void setLetraFactory(LetraFactory letraFactory) {
        this.letraFactory = letraFactory;
    }

    public LetraFactory getLetraFactory() {
        return letraFactory;
    }

    public String getPalavra() {
        return palavra;
    }

    public Tema getTema() {
        return tema;
    }

    public void exibir(Object contexto, boolean[] posicoes) {
        // TODO implementar exibição da palavra com base nas posições
    }

    public boolean comparar(String palavra) {
        return Objects.equals(this.palavra, palavra);
    }

    public String getArrumada() {
        // TODO retornar versão formatada da palavra
        return palavra;
    }

    @Override
    public String toString() {
        return palavra + " (" + tema + ")";
    }
}