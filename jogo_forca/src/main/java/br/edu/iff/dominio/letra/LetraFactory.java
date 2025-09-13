package br.edu.iff.dominio.letra;

public class LetraFactory {
    public Letra getLetra(char codigo) {
        return new LetraTexto(codigo); // padrão: retorna texto
    }

    public Letra getLetraEncoberta() {
        return new LetraTexto('_'); // pode ser underline como oculto
    }
}