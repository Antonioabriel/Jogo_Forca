import br.edu.iff.dominio.ObjetoDominiolmpl;

public class Tema extends ObjetoDominiolmpl {

    private String nome;

    private Tema (long id, String nome) 
    {
        super(id);
        this.nome = nome;
    }

    public static Tema criar(long id, String nome) 
    {
        return new Tema(id, nome);
    }

    public static Tema reconstituir(long id, String nome) 
    {
        return new Tema(id, nome);
    }

     public String getNome() 
    {
        return nome;
    }

    public void setNome(String nome) 
    {
        this.nome = nome;
    }
}