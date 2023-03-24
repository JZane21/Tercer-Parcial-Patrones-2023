package EjerciciosExamenFinal.Ej_2;

public class Main {
    public static void main(String[] args) {
        Huawei android = new Huawei();
        android.setAndroidVersion(10.0);
        android.setBuildVersion(102.0);
        android.setCosto(1203.0);
        android.setMemoriaRam(256.0);
        android.setNumeroChips(3);
        android.setStore("APP STORE");
        
        Audifonos audifonos = 
        new Audifonos(android, 10, "SAMSUNG");
        audifonos.operation(audifonos);
        
        Ram ram = 
        new Ram(android, 20, "XIAOMI", 109);
        ram.operation(ram);
        
        Cargador cargador = 
        new Cargador(android, 30, "HUAWEI", 100);
        cargador.operation(cargador);

        android.infoTelefono();
    }
}
