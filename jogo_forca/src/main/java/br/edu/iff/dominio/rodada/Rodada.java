package br.edu.iff.dominio.rodada;

import br.edu.iff.dominio.ObjetoDominioImpl;

public class Rodada extends ObjetoDominioImpl {
    
    private static int maxpalavras = 3;
    private static int maxErros = 10;
    private static int pontosQuandoDescobreTodasAsPalavras = 100;
    private static int pontosPorLetraEncoberta = 15;

    public static int getMaxpalavras() {
        return maxpalavras;
    }

    public static int getMaxErros() {
        return maxErros;
    }

    public static int getPontosQuandoDescobreTodasAsPalavras() {
        return pontosQuandoDescobreTodasAsPalavras;
    }

    public static int getPontosPorLetraEncoberta() {
        return pontosPorLetraEncoberta;
    }

    public static void setMaxpalavras(int maxpalavras) {
        Rodada.maxpalavras = maxpalavras;
    }

    public static void setMaxErros(int maxErros) {
        Rodada.maxErros = maxErros;
    }

    public static void setPontosQuandoDescobreTodasAsPalavras(int pontosQuandoDescobreTodasAsPalavras) {
        Rodada.pontosQuandoDescobreTodasAsPalavras = pontosQuandoDescobreTodasAsPalavras;
    }

    public static void setPontosPorLetraEncoberta(int pontosPorLetraEncoberta) {
        Rodada.pontosPorLetraEncoberta = pontosPorLetraEncoberta;
    }

    public Rodada(long id) {
        super(id);
    }


}
