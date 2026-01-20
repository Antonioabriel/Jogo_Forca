public class BonecoImagem implements Boneco {

    private static BonecoImagem soleInstance = null;
   
    private BonecoImagem() {}
     
    public static BonecoImagem getSoleInstance() {
        if (soleInstance == null) {
            soleInstance = new BonecoImagem();
        }
        return soleInstance;
    }

    @Override
    public void exibir(Object contexto, int partes) {
        System.out.println("Exibindo boneco em imagem com " + partes + " partes.");
    }
}