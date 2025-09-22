package br.edu.iff.dominio.rodada;

import br.edu.iff.dominio.ObjetoDominioImpl;
import br.edu.iff.dominio.letra.Letra;
import br.edu.iff.dominio.palavra.Palavra;

public class Item extends ObjetoDominioImpl{
    private boolean[] posicoesDescobertas;
    private String palavraArriscada = null;
    private Palavra palavra;

    public Item(long id,Palavra palavra) {
        super(id);
        this.palavra = palavra;
        this.posicoesDescobertas = new boolean[palavra.getPalavra().length()];
    }

    public Letra getErrosEncontrados() {
        
        return null;
    }

    public boolean[] getPosicoesDescobertas() {
        return posicoesDescobertas;
    }

    public String getPalavraArriscada() {
        return palavraArriscada;
    }

    public int getTamanhoPalavra() {
        return palavra.getPalavra().length();
    }

    public void setPalavraArriscada(String palavraArriscada) {
        this.palavraArriscada = palavraArriscada;
    }

    public void exibir(Object contexto) {
        palavra.exibir(contexto, posicoesDescobertas);
    }

    public boolean acertou() {
        return palavra.comparar(palavraArriscada);
    }
}
