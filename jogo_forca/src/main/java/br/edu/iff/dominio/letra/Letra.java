package br.edu.iff.dominio.letra;

public abstract class Letra {
    private char codigo;

    protected Letra(char codigo) {
        this.codigo = codigo;
    }

    public char getCodigo() {
        return codigo;
    }

    public abstract void exibir(Object contexto);

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Letra)) return false;
        Letra outra = (Letra) obj;
        return codigo == outra.codigo;
    }

    @Override
    public int hashCode() {
        return Character.hashCode(codigo);
    }

    @Override
    public String toString() {
        return String.valueOf(codigo);
    }
}