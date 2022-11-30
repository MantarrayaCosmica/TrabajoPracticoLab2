package ResolucionParcial2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        Contacto contacto = new Contacto();
        Archivo archivo = new Archivo();
        boolean salir = false;
        int opcion=0;

        do {
            boolean termino = false;
            do {
                System.out.println("----Menu----");
                System.out.println("1) Nuevo contacto");
                System.out.println("2) Listar todos los contactos");
                System.out.println("3) Buscar contacto por Nombre o Apellido");
                System.out.println("4) Buscar contacto por DNI");
                System.out.println("5) Eliminar contacto por DNI");
                System.out.println("6) Imprimir en un archivo");
                System.out.println("7) Editar contacto");
                System.out.println("99) Salir");

                try {
                    opcion = sc.nextInt();
                    termino = true;
                }catch ( InputMismatchException e ){
                    System.out.println("Ingrese un numero como Opcion!");

                }
                sc.nextLine();
            }while (!termino);

            switch (opcion){
                case 1:contacto.nuevoContacto();
                    break;
                case 2:contacto.listarContactos();
                    break;
                case 3:contacto.buscarNombre_Apellido();
                    break;
                case 4:contacto.buscarDni();
                    break;
                case 5:contacto.eliminarDni();
                    break;
                case 6:archivo.imprimir(contacto.listaContactos.toString());
                    break;
                case 7:contacto.editarContacto();
                    break;
                case 99:
                    salir = true;
                    break;
                default:
                    System.out.println("Opcion incorrecta!");
            }

        }while (!salir);


    }
}
