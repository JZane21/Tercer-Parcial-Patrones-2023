package EjerciciosExamenFinal.Ej_2;

public class Mobile implements IMobile{
    private double AndroidVersion;
    private double MemoriaRam;
    private String Store;
    private int NumeroChips;
    private double BuildVersion;
    private double costo;

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public double getAndroidVersion() {
        return AndroidVersion;
    }

    public void setAndroidVersion(double androidVersion) {
        this.AndroidVersion = androidVersion;
    }

    public double getMemoriaRam() {
        return MemoriaRam;
    }

    public void setMemoriaRam(double memoriaRam) {
        this.MemoriaRam = memoriaRam;
    }

    public String getStore() {
        return Store;
    }

    public void setStore(String store) {
        this.Store = store;
    }

    public int getNumeroChips() {
        return NumeroChips;
    }

    public void setNumeroChips(int numeroChips) {
        this.NumeroChips = numeroChips;
    }

    public double getBuildVersion() {
        return BuildVersion;
    }

    public void setBuildVersion(double buildVersion) {
        this.BuildVersion = buildVersion;
    }

    @Override
    public void operation(Funcionalidad funcionalidad) {
        if(funcionalidad instanceof Ram){
            Ram aux = (Ram) funcionalidad;
            double memoriaAnterior = getMemoriaRam();
            setMemoriaRam(aux.getCapacidad() + memoriaAnterior);
        }
        
    }

    public void infoTelefono(){
        System.out.println("--- Mobile ---");
        System.out.println(AndroidVersion);
        System.out.println(MemoriaRam);
        System.out.println(Store);
        System.out.println(NumeroChips);
        System.out.println(BuildVersion);
        System.out.println(costo);
    }

}
