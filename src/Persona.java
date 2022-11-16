import java.io.Serializable;

public class Persona implements Serializable {

    //atributos
    private String nombre;
    private String apellido;
    private int dni;
    private String direccion;

    //constructor
    public Persona(String nombre,String apellido,int dni,String direccion){

        this.nombre=nombre;
        this.apellido=apellido;
        this.dni=dni;
        this.direccion=direccion;

    }
    //getters and setter

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getDni() {
        return dni;
    }

    public String getDireccion() {
        return direccion;
    }

    //metodos


}
