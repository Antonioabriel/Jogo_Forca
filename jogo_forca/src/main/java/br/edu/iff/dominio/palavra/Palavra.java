package br.edu.iff.dominio.palavra;

import br.edu.iff.dominio.ObjetoDominioImpl;
import br.edu.iff.dominio.letra.Letra;
import br.edu.iff.dominio.letra.LetraFactory;
import br.edu.iff.dominio.tema.Tema;

public class Palavra extends ObjetoDominioImpl {
    private String palavra;
    private Tema tema;
    private Letra[] letras;

    public Palavra(long id, String palavra, Tema tema, LetraFactory letraFactory) {
        super(id);
        this.palavra = palavra.toLowerCase();
        this.tema = tema;
        this.letras = new Letra[palavra.length()];

        for (int i = 0; i < palavra.length(); i++) {
            this.letras[i] = letraFactory.getLetra(palavra.charAt(i));
        }
    }

    public int getTamanho() {
        return letras.length;
    }

    public Letra getLetra(int posicao) {
        return letras[posicao];
    }

    public Letra[] getLetras() {
        return letras;
    }

    public Tema getTema() {
        return tema;
    }

    /** Exibe todas as letras sem restrição */
    public void exibir(Object contexto) {
        for (Letra l : letras) {
            l.exibir(contexto);
        }
        System.out.println();
    }

    /** Exibe as letras de acordo com as posições descobertas */
    public void exibir(Object contexto, boolean[] posicoesDescobertas) {
        for (int i = 0; i < letras.length; i++) {
            if (posicoesDescobertas[i]) {
                letras[i].exibir(contexto);
            } else {
                // Exibe a letra encoberta
                //new LetraTexto('_').exibir(contexto);
            }
        }
        System.out.println();
    }

    public boolean comparar(String outra) {
        return this.palavra.equalsIgnoreCase(outra);
    }

    @Override
    public String toString() {
        return palavra + " (" + tema + ")";
    }
}
