public class BonecoTexto implements Boneco {

    private static BonecoTexto soleInstance = null;
   
    private BonecoTexto() {}
     
    public static BonecoTexto getSoleInstance() {
        if (soleInstance == null) {
            soleInstance = new BonecoTexto();
        }
        return soleInstance;
    }


    @Override
    public void exibir(Object contexto, int partes) {
        System.out.println("Exibindo boneco em texto com " + partes + " partes.");
    }
}