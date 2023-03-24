package EjerciciosExamenFinal.Ej_3;

public class Whatsapp implements RedSocial{
    
    @Override
    public void datosSistema(Object objeto) {
        System.out.println("--- whatsappp ---");
        if(objeto instanceof Colegio){
            Colegio aux = (Colegio) objeto;
            System.out.println("--- Datos Colegio ---");
            System.out.println(aux.getCapacidad());
            System.out.println(aux.getNombre());
            System.out.println(aux.getRequisitos());
            aux.getEstudiantes()
            .forEach(i->System.out.println(i.getName()));
            System.out.println(aux.getRedesSociales());
        }else if(objeto instanceof Escuela){
            Escuela aux = (Escuela) objeto;
            System.out.println("--- Datos Escuela ---");
            System.out.println(aux.getCapacidad());
            System.out.println(aux.getNombre());
            System.out.println(aux.getRequisitos());
            aux.getEstudiantes()
            .forEach(i->System.out.println(i.getName()));
            System.out.println(aux.getRedesSociales());
        }else{
            Universidad aux = (Universidad) objeto;
            System.out.println("--- Datos Universidad ---");
            System.out.println(aux.getCapacidad());
            System.out.println(aux.getNombre());
            System.out.println(aux.getRequisitos());
            aux.getEstudiantes()
            .forEach(i->System.out.println(i.getName()));
            System.out.println(aux.getRedesSociales());
        }
        
    }

}
