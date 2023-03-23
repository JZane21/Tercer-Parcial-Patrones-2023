package EjerciciosExamenFinal.Ej_1;

public abstract class ZonaBase {
    private String nombre;
    private int numeroHabitantes;
    private int poa;

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getNumeroHabitantes() {
        return numeroHabitantes;
    }
    public void setNumeroHabitantes(int numeroHabitantes) {
        this.numeroHabitantes = numeroHabitantes;
    }
    public int getPoa() {
        return poa;
    }
    public void setPoa(int poa) {
        this.poa = poa;
    }

    public ZonaBase(String nombre, int numeroHabitantes, int poa) {
        this.nombre = nombre;
        this.numeroHabitantes = numeroHabitantes;
        this.poa = poa;
    }

    public abstract void operation();
    public abstract void add(ZonaBase zonaBase);
    public abstract void remove(ZonaBase zonaBase);
    public abstract ZonaBase obtener(int position);
}
