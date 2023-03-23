package EjerciciosExamenFinal.Ej_1;

public class Main {
    public static void main(String[] args) {
        Zona z1 = new Zona("zona - 1", 10, gRand()*10);
        Zona z2 = new Zona("zona - 2", 20, gRand()*10);
        
        Zona z3 = new Zona("zona - 3", 30, gRand()*10);
        Zona z4 = new Zona("zona - 4", 40, gRand()*10);

        Zona z5 = new Zona("zona - 5", 50, gRand()*10);
        Zona z6 = new Zona("zona - 6", 60, gRand()*10);

        Zona z7 = new Zona("zona - 7", 70, gRand()*10);
        Zona z8 = new Zona("zona - 8", 80, gRand()*10);

        Urbanizacion u1 = 
        new Urbanizacion("urb - 1", 0, gRand()*10);
        Urbanizacion u2 = 
        new Urbanizacion("urb - 2", 0, gRand()*10);

        u1.add(z1);
        u1.add(z2);
        u2.add(z3);
        u2.add(z4);

        Urbanizacion u3 = 
        new Urbanizacion("urb - 3", 0, gRand()*10);
        Urbanizacion u4 = 
        new Urbanizacion("urb - 4", 0, gRand()*10);

        u3.add(z5);
        u3.add(z6);
        u4.add(z7);
        u4.add(z8);

        Departamento d1 =
        new Departamento("dep - 1", 0, gRand()*10);
        Departamento d2 =
        new Departamento("dep - 2", 0, gRand()*10);

        d1.add(u1);
        d1.add(u2);

        d2.add(u3);
        d2.add(u4);

        Pais pais = new Pais("Pais - 1", 0, gRand()*10);

        pais.add(d1);
        pais.add(d2);

        pais.operation();
    }

    public static int gRand(){
        return (int) (Math.random()*100);
    }
}
