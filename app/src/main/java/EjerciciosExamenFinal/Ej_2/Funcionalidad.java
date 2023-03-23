package EjerciciosExamenFinal.Ej_2;

public class Funcionalidad implements IMobile{
    private int costo;
    public int getCosto() {
        return costo;
    }
    public void setCosto(int costo) {
        this.costo = costo;
    }

    private String marca;
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    private IMobile mobile;
    public IMobile getMobile() {
        return mobile;
    }
    public void setMobile(IMobile mobile) {
        this.mobile = mobile;
    }

    public Funcionalidad(IMobile mobile) {
        this.mobile = mobile;
    }

    @Override
    public void operation(Funcionalidad funcionalidad) {
        mobile.operation(funcionalidad);
        System.out.println("--- AGREGANDO FUNCIONALIDAD ---");
    }

    public void infoFuncionalidad(){
        System.out.println("--- Funcionalidad ---");
    }
    
}
