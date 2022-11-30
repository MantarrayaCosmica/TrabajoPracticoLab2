package ResolucionParcial2;

public class Persona {

    String nombre;
    String apellido;
    String telefono;
    String email;
    int dni;

    public Persona(){}

    public Persona(String nombre,String apellido,int dni,String telefono,String email){

        this.nombre=nombre;
        this.apellido=apellido;
        this.dni=dni;
        this.telefono=telefono;
        this.email=email;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Nombre:"+nombre+"\n"+
                "Apellido: "+apellido+"\n"+
                "DNI: "+dni+"\n"+
                "Telefono: "+telefono+"\n"+
                "Email: "+email;
    }
}
