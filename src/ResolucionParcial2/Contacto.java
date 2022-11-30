package ResolucionParcial2;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;

public class Contacto extends Persona {

    Scanner sc = new Scanner(System.in);
    ArrayList<Contacto> listaContactos= new ArrayList<>();
    //ArrayList<Contacto> conciden = new ArrayList<>();

    public Contacto(){}

    public Contacto(String nombre, String apellido, int dni, String telefono, String email) {
        super(nombre, apellido, dni, telefono, email);
    }

    public void nuevoContacto(){

        try {

            System.out.println("Ingrese Nombre");
            String nombre = sc.nextLine();
            System.out.println("ingrese Apellido");
            String apellido = sc.nextLine();
            System.out.println("ingrese telefono");
            String telefono = sc.nextLine();
            System.out.println("ingrese email");
            String email = sc.nextLine();
            System.out.println("ingrese dni");
            int dni = sc.nextInt();
            sc.nextLine();

            listaContactos.add(new Contacto(nombre, apellido, dni, telefono, email));

        }catch ( InputMismatchException e){
            System.out.println("Ingreso mal los datos");
        }

    }

    public void listarContactos(){

        for (Contacto contacto:listaContactos) {
            System.out.println(contacto.toString());
        }
        System.out.println("Existen "+listaContactos.size()+" Contactos");

    }

    public void buscarNombre_Apellido() {


        System.out.println("Ingrese Nombre o Apellido");
        String buscar = sc.nextLine();
        //coincideNom_o_Ap(buscar);

        for (Contacto contacto : listaContactos) {
            if (contacto.getNombre().equals(buscar) || contacto.getApellido().equals(buscar)) {
                System.out.println(contacto.toString());
            }else {
                System.out.println("No se encontraron Contactos");
            }
        }

    }

    public void buscarDni() {
        boolean termino = false;
        do {
            try {
                System.out.println("Ingrese DNI");
                int dni = sc.nextInt();
                for (Contacto contacto : listaContactos) {
                    if (contacto.getDni() == dni) {
                        System.out.println(contacto.toString());
                    } else {
                        System.out.println("NO se encontraron contactos");
                    }
                    termino= true;
                }
            } catch (InputMismatchException e) {
                System.out.println("Ingrese el dato correctamente!");
                sc.nextLine();
            }
        }while (!termino);

    }

    public void eliminarDni(){
        boolean termino = false;
        do {
            try {
                System.out.println("Ingrese DNI");
                int dni = sc.nextInt();
                for (Contacto contacto : listaContactos) {
                    if (contacto.getDni() == dni) {
                        listaContactos.remove(contacto);
                        System.out.println("Se elimino exitosamente su Contacto");
                    } else {
                        System.out.println("No se encontro su Contacto");
                    }
                    termino=true;
                }
            } catch (InputMismatchException e) {
                System.out.println("ingrese el dato correctamente!");
            }
        }while (!termino);
    }

    public void editarContacto(){
        boolean termino= false;

        do {

            try {

                System.out.println("Ingrese Dni para editar el contacto");
                int buscado = sc.nextInt();
                sc.nextLine();
                for (Contacto contacto : listaContactos) {
                    if (contacto.getDni() == buscado) {
                        System.out.println("Ingrese nuevo nombre");
                        String nombre = sc.nextLine();
                        System.out.println("INgrese nuevo Apellido");
                        String apellido = sc.nextLine();
                        System.out.println("Ingrese nuevo telefono");
                        String telefono = sc.nextLine();
                        System.out.println("ingrese nuevo Email");
                        String email = sc.nextLine();
                        System.out.println("ingrese nuevo DNI");
                        int dni = sc.nextInt();

                        listaContactos.remove(contacto);
                        listaContactos.add(new Contacto(nombre, apellido, dni, telefono, email));

                        termino = true;

                    } else {
                        System.out.println("No se encontro su Contacto");
                    }

                    termino=true;
                }
            } catch (InputMismatchException e) {
                System.out.println("Debe ingresar numeros!");
            }

        }while (!termino);
    }

    /*public boolean coincideNom_o_Ap (String nombre_o_apellido){

this.setNombre(nombre);
        this.setApellido(apellido);
        this.setDni(dni);
        this.setTelefono(telefono);
        this.setEmail(email);



        return Objects.equals(this.getNombre(),nombre_o_apellido) || Objects.equals(this.getApellido(),nombre_o_apellido);
    }*/



}