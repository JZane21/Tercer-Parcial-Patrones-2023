package EjerciciosExamenFinal.Ej_1;

import java.util.Vector;

public class Departamento extends ZonaBase{
    private int numeroPersonasDepartamento;
    public int getNumeroPersonasDepartamento() {
        return numeroPersonasDepartamento;
    }
    public void setNumeroPersonasDepartamento(int numeroPersonasDepartamento) {
        this.numeroPersonasDepartamento = numeroPersonasDepartamento;
    }

    private Vector<ZonaBase> vectorZonas = new Vector<>();

    public Departamento(String nombre, int numeroHabitantes, int poa) {
        super(nombre, numeroHabitantes, poa);
    }

    @Override
    public void operation() {
        System.out.println("====== Departamento ======");
        System.out.println("* Nombre: "+getNombre());
        System.out.println("* Numero Habitantes: "+numeroPersonasDepartamento);
        System.out.println("* POA: "+getPoa());
        System.out.println("* URBANIZACIONES:");
        vectorZonas.forEach(i->i.operation());
        System.out.println("==========================");
    }

    @Override
    public void add(ZonaBase zonaBase) {
        vectorZonas.add(zonaBase);
        int aux1 = getNumeroPersonasDepartamento();
        Urbanizacion u = (Urbanizacion) zonaBase;
        setNumeroPersonasDepartamento(aux1+u.getNumeroPersonasUrbanizacion());
        setNumeroHabitantes(getNumeroPersonasDepartamento());
    }

    @Override
    public void remove(ZonaBase zonaBase) {
        vectorZonas.remove(zonaBase);
        int aux1 = getNumeroPersonasDepartamento();
        Urbanizacion u = (Urbanizacion) zonaBase;
        setNumeroPersonasDepartamento(aux1-u.getNumeroPersonasUrbanizacion());
        setNumeroHabitantes(getNumeroPersonasDepartamento());
    }

    @Override
    public ZonaBase obtener(int position) {
        return vectorZonas.get(position);
    }
}
