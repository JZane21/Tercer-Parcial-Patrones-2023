package EjerciciosExamenFinal.Ej_3;

import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Colegio colegio = new Colegio();
        colegio.setCapacidad(10);
        Vector<Estudiante> estudiantes = new Vector<>();
        estudiantes.add(new Estudiante("e - 1"));
        estudiantes.add(new Estudiante("e - 2"));
        estudiantes.add(new Estudiante("e - 3"));
        colegio.setEstudiantes(estudiantes);
        colegio.setNombre("Colegio 1");
        Vector<RedSocial> redSocials = new Vector<>();
        redSocials.add(new Facebook());
        redSocials.add(new Twitter());
        redSocials.add(new Whatsapp());
        colegio.setRedesSociales(redSocials);
        colegio.setRequisitos("REQUISITOS");

        colegio.datosSistema(0);
        colegio.datosSistema(1);
        colegio.datosSistema(2);

    }
}
