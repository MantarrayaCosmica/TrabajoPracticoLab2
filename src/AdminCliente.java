import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class AdminCliente implements Serializable {

    //atrubutos
    private ArrayList<Cliente> listaClientes = new ArrayList<>();
    private Activos archivo = new Activos();

    public AdminCliente(){
        this.listaClientes=new ArrayList<>();

    }

    public void agregarCliente(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Apellido: ");
        String apellido = sc.nextLine();
        System.out.println("DNI: ");
        int dni = sc.nextInt();
        sc.nextLine();
        System.out.println("Direccion: ");
        String direccion = sc.nextLine();
        Cliente cliente = new Cliente(nombre,apellido,dni,direccion);
        this.listaClientes.add(cliente);
    }

    public void listarClientes(){
        for (Cliente cliente:listaClientes) {
            System.out.println(cliente.imprimirInformacion());
        }
    }

    public void buscarCliente(){
        Scanner sc = new Scanner(System.in);
        System.out.println("DNI de cliente buscado: ");
        String nombreBuscado = sc.nextLine();
        for (Cliente cliente:listaClientes) {
            if (cliente.getNombre().equals(nombreBuscado)){
                cliente.imprimirInformacion();
                break;
            }
        }
    }

    public void eliminarCliente(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Dni de cliente que desea Eliminar: ");
        int dniBuscado = sc.nextInt();
        for (Cliente cliente:listaClientes) {
            if(cliente.getDni() == dniBuscado){
                listaClientes.remove(cliente);
                break;
            }
        }
    }


}
