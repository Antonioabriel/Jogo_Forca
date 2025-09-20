package br.edu.iff.dominio.letra;

public class LetraFactoryImpl implements LetraFactory {
    private Letra[] pool; // cache das letras
    private Letra encoberta;

    public LetraFactoryImpl() {
        this.pool = new Letra[26]; // 'a' até 'z'
        this.encoberta = null;     // pode configurar depois
    }

    @Override
    public final Letra getLetra(char codigo) {
        if (codigo < 'a' || codigo > 'z') {
            throw new IllegalArgumentException("Código inválido: " + codigo);
        }

        int i = codigo - 'a';
        Letra result = this.pool[i];

        if (result == null) {
            result = this.criarLetra(codigo); // método de criação
            this.pool[i] = result;
        }

        return result;
    }

    @Override
    public Letra getLetraEncoberta() {
        if (this.encoberta == null) {
            this.encoberta = new LetraTexto('_'); // underline para letra escondida
        }
        return this.encoberta;
    }

    // pode ser sobrescrito se quiser criar LetraTexto ou LetraImagem
    protected Letra criarLetra(char codigo) {
        return new LetraTexto(codigo);
    }
}

