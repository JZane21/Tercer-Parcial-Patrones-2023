package EjerciciosExamenFinal.Ej_2;

public class Ram extends Funcionalidad{
    private double capacidad;
    public double getCapacidad() {
        return capacidad;
    }
    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }


    public Ram(IMobile mobile, int costo, String marca, double capacidad) {
        super(mobile);
        setCosto(costo);
        setMarca(marca);
        setCapacidad(capacidad);
    }

    @Override
    public void operation(Funcionalidad funcionalidad){
        super.operation(this);
        infoFuncionalidad();
    }

    @Override
    public void infoFuncionalidad(){
        super.infoFuncionalidad();
        System.out.println("------ RAM ------");
        System.out.println("* Costo: "+getCosto());
        System.out.println("* Marca: "+getMarca());
        System.out.println("* Capacidad"+capacidad);
        System.out.println("-----------------");
    }
    
}
