package EjerciciosExamenFinal.Ej_3;

import java.util.Vector;

public class Escuela implements Sistema{
    private Vector<RedSocial> redesSociales = new Vector<>();
    private String nombre;
    private int capacidad;
    private Vector<Estudiante> estudiantes = new Vector<>();
    private String requisitos;
    
    public Vector<RedSocial> getRedesSociales() {
        return redesSociales;
    }

    public void setRedesSociales(Vector<RedSocial> redesSociales) {
        this.redesSociales = redesSociales;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public Vector<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(Vector<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public String getRequisitos() {
        return requisitos;
    }

    public void setRequisitos(String requisitos) {
        this.requisitos = requisitos;
    }

    @Override
    public void datosSistema(int index) {
        this.redesSociales.get(index).datosSistema(this);
    }
}
