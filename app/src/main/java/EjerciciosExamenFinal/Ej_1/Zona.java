package EjerciciosExamenFinal.Ej_1;

public class Zona extends ZonaBase{

    public Zona(String nombre, int numeroHabitantes, int poa) {
        super(nombre, numeroHabitantes, poa);
    }

    @Override
    public void operation() {
        System.out.println("--- Zona ---");
        System.out.println("* Nombre: "+getNombre());
        System.out.println("* Numero Habitantes: "+getNumeroHabitantes());
        System.out.println("* POA: "+getPoa());
        System.out.println("------------");
    }

    @Override
    public void add(ZonaBase zonaBase) {
        System.out.println("--- COMANDO INACEPTABLE ---");
    }

    @Override
    public void remove(ZonaBase zonaBase) {
        System.out.println("--- COMANDO INACEPTABLE ---");
    }

    @Override
    public ZonaBase obtener(int position) {
        System.out.println("--- COMANDO INACEPTABLE ---");
        return null;
    }
    
}
