package br.edu.iff.dominio.rodada;

import br.edu.iff.dominio.ObjetoDominioImpl;
import br.edu.iff.dominio.letra.Letra;
import br.edu.iff.dominio.palavra.Palavra;
import java.util.ArrayList;
import java.util.List;


public class Item extends ObjetoDominioImpl {
    private boolean[] posicoesDescobertas;
    private String palavraArriscada = null;
    private Palavra palavra;

    static Item criar(long id, Palavra palavra) {
        return new Item(id, palavra);
    }

    public static Item reconstituir(long id, Palavra palavra, boolean[] posicoesDescobertas, String palavraArriscada) {
        return new Item(id, palavra, posicoesDescobertas, palavraArriscada);
    }

    public Item(long id,Palavra palavra) {
        super(id);
        this.palavra = palavra;
      //this.posicoesDescobertas = new boolean[palavra.getTamanho()];

    }

    public Item (long id, Palavra palavra, boolean[] posicoesDescobertas, String palavraArriscada) {
        super(id);
        this.palavra = palavra;
        this.posicoesDescobertas = posicoesDescobertas;
        this.palavraArriscada = palavraArriscada;
    }

    public Palavra getPalavra() {
        return palavra;
    }   

    public Letra[] getLetrasDescobertas() {
        List<Letra> letrasDescobertas = new ArrayList<>();
        for (int i = 0; i < posicoesDescobertas.length; i++) {
            if (posicoesDescobertas[i]) {
                letrasDescobertas.add(palavra.getLetra(i));
            }
        }
        return letrasDescobertas.toArray(new Letra[0]);
    }

    public Letra[] getLetrasEncobertas() {
        List<Letra> letrasEncobertas = new ArrayList<>();
        for (int i = 0; i < posicoesDescobertas.length; i++) {
            if (!posicoesDescobertas[i]) {
                letrasEncobertas.add(palavra.getLetra(i));
            }
        }
        return letrasEncobertas.toArray(new Letra[0]);
    }

    public int qtdeLetrasEncobertas() {
        int contador = 0;
        for (boolean descoberta : posicoesDescobertas) {
            if (!descoberta) {
                contador++;
            }
        }
        return contador;
    }

    public int calcularPontosLetrasEncobertas(int valorPorLetraEncoberta) {
        return qtdeLetrasEncobertas() * valorPorLetraEncoberta;
    }

    public boolean descobriu() {

        boolean arriscouEAcertou = arriscou() && acertou();

        boolean naoTemLetrasEncobertas = qtdeLetrasEncobertas() == 0;

        return arriscouEAcertou || naoTemLetrasEncobertas;
    }

    public void exibir(Object contexto) {
        palavra.exibir(contexto, posicoesDescobertas);
    }

    public String getPalavraArriscada() {
        return palavraArriscada;
    }

    void tentar(char codigo) {
        int[] posicoes = palavra.tentar(codigo);

        for (int pos : posicoes) {
            this.posicoesDescobertas[pos] = true;
        }
    }

    void arriscar(String palavra) {
        this.palavraArriscada = palavra;
    }

    boolean arriscou() {
        return this.palavraArriscada != null;
    }

    boolean acertou() {
        if (!arriscou()) {
            return false;
        }
        return palavra.comparar(this.palavraArriscada);
    }
}
    