package EjerciciosExamenFinal.Ej_2;

public class Cargador extends Funcionalidad{
    private int tamano;
    public int getTamano() {
        return tamano;
    }
    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public Cargador(IMobile mobile, double costo, String marca, int tamano) {
        super(mobile);
        setCosto(tamano);
        setMarca(marca);
        setTamano(tamano);
    }

    @Override
    public void operation(Funcionalidad funcionalidad){
        super.operation(this);
        infoFuncionalidad();
    }

    @Override
    public void infoFuncionalidad(){
        super.infoFuncionalidad();
        System.out.println("---- Cargador ----");
        System.out.println("* Costo: "+getCosto());
        System.out.println("* Marca: "+getMarca());
        System.out.println("* Tamano"+tamano);
        System.out.println("------------------");
    }
    
}
