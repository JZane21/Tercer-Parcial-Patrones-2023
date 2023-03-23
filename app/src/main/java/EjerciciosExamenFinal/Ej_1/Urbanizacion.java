package EjerciciosExamenFinal.Ej_1;

import java.util.Vector;

public class Urbanizacion extends ZonaBase{
    private int numeroPersonasUrbanizacion;
    public int getNumeroPersonasUrbanizacion() {
        return numeroPersonasUrbanizacion;
    }
    public void setNumeroPersonasUrbanizacion(int numeroPersonasUrbanizacion) {
        this.numeroPersonasUrbanizacion = numeroPersonasUrbanizacion;
    }

    private Vector<ZonaBase> vectorZonas = new Vector<>();

    public Urbanizacion(String nombre, int numeroHabitantes, int poa) {
        super(nombre, numeroHabitantes, poa);
    }

    @Override
    public void operation() {
        System.out.println("<><><> Urbanizacion <><><>");
        System.out.println("* Nombre: "+getNombre());
        System.out.println("* Numero Habitantes: "+numeroPersonasUrbanizacion);
        System.out.println("* POA: "+getPoa());
        System.out.println("* ZONAS:");
        vectorZonas.forEach(i->i.operation());
        System.out.println("<><><><><><><><><><><><><>");
    }

    @Override
    public void add(ZonaBase zonaBase) {
        vectorZonas.add(zonaBase);
        int aux1 = getNumeroPersonasUrbanizacion();
        setNumeroPersonasUrbanizacion(aux1+zonaBase.getNumeroHabitantes());
        setNumeroHabitantes(getNumeroPersonasUrbanizacion());
    }

    @Override
    public void remove(ZonaBase zonaBase) {
        vectorZonas.remove(zonaBase);
        int aux2 = getNumeroPersonasUrbanizacion();
        setNumeroPersonasUrbanizacion(aux2-zonaBase.getNumeroHabitantes());
        setNumeroHabitantes(getNumeroPersonasUrbanizacion());
    }

    @Override
    public ZonaBase obtener(int position) {
        return vectorZonas.get(position);
    }
    
}
