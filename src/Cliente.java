import java.io.Serializable;
import java.util.ArrayList;

public class Cliente extends Persona implements Informe, Serializable {

    //atributos
    ArrayList<Activos> listaActivos = new ArrayList<>();
    Archivo archivo;

    //contructor
    public Cliente(String nombre, String apellido, int dni, String direccion) {
        super(nombre, apellido, dni, direccion);

    }


    //metodos

    public void añadirActivo(Activos activos){

        this.listaActivos.add(activos);
    }

    public Activos mostrarActivo(String nombre){
        for (Activos activo: listaActivos) {
            if(activo.getNombre().equals(nombre)){
                return activo;
            }
        }
        return null;
    }

    @Override
    public String imprimirInformacion() {
        return "Cliente\n"+"Nombre: "+getNombre()+"\nApellido: "+getApellido()+
                "\nDNI: "+getDni()+"\nDireccion: "+getDireccion()+
                "\nActivos: "+this.listaActivos;
    }

}
