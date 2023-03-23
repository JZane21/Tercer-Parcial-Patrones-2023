package EjerciciosExamenFinal.Ej_1;

import java.util.Vector;

public class Pais extends ZonaBase{
    private int numeroPersonasPais;
    public int getNumeroPersonasPais() {
        return numeroPersonasPais;
    }
    public void setNumeroPersonasPais(int numeroPersonasPais) {
        this.numeroPersonasPais = numeroPersonasPais;
    }

    private Vector<ZonaBase> vectorZonas = new Vector<>();

    public Pais(String nombre, int numeroHabitantes, int poa) {
        super(nombre, numeroHabitantes, poa);
    }

    @Override
    public void operation() {
        System.out.println("++++++++ Pais ++++++++");
        System.out.println("* Nombre: "+getNombre());
        System.out.println("* Numero Habitantes: "+numeroPersonasPais);
        System.out.println("* POA: "+getPoa());
        System.out.println("* DEPARTAMENTOS:");
        vectorZonas.forEach(i->i.operation());
        System.out.println("++++++++++++++++++++++");
    }

    @Override
    public void add(ZonaBase zonaBase) {
        vectorZonas.add(zonaBase);
        int aux1 = getNumeroPersonasPais();
        Departamento u = (Departamento) zonaBase;
        setNumeroPersonasPais(aux1+u.getNumeroPersonasDepartamento());
        setNumeroHabitantes(getNumeroPersonasPais());
    }

    @Override
    public void remove(ZonaBase zonaBase) {
        vectorZonas.remove(zonaBase);
        int aux1 = getNumeroPersonasPais();
        Departamento u = (Departamento) zonaBase;
        setNumeroPersonasPais(aux1-u.getNumeroPersonasDepartamento());
        setNumeroHabitantes(getNumeroPersonasPais());
    }

    @Override
    public ZonaBase obtener(int position) {
        return vectorZonas.get(position);
    }
}
