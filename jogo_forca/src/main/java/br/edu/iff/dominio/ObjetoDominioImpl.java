package br.edu.iff.dominio;

public abstract class ObjetoDominiolmpl implements ObjetoDominio {

    private long id;

    public ObjetoDominiolmpl(long id) {
        this.id = id;
    }

    @Override
    public long getId() {
        return this.id;
    }
}