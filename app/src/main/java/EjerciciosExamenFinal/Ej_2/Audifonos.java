package EjerciciosExamenFinal.Ej_2;

public class Audifonos extends Funcionalidad{
    public Audifonos(IMobile mobile, int costo, String marca) {
        super(mobile);
        setCosto(costo);
        setMarca(marca);
    }

    @Override
    public void operation(Funcionalidad funcionalidad){
        super.operation(this);
        infoFuncionalidad();
    }

    @Override
    public void infoFuncionalidad(){
        super.infoFuncionalidad();
        System.out.println("--- AUDIFONOS ---");
        System.out.println("* Costo: "+getCosto());
        System.out.println("* Marca: "+getMarca());
        System.out.println("-----------------");
    }
    
}
