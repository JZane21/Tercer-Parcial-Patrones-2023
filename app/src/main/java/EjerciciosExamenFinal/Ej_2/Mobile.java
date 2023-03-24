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
        System.out.println("<><><><><><>");
        if(funcionalidad instanceof Ram){
            Ram aux = (Ram) funcionalidad;
            double memoriaAnterior = getMemoriaRam();
            System.out.println("RAM ORIGINAL: "+memoriaAnterior);
            setMemoriaRam(aux.getCapacidad() + memoriaAnterior);
            System.out.println("NUEVA RAM: "+getMemoriaRam());
        }
        double aux = getCosto();
        System.out.println("COSTO ORIGINAL: "+aux);
        setCosto(aux+funcionalidad.getCosto());
        System.out.println("NUEVO COSTO: "+getCosto());
        System.out.println("<><><><><><>");
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
