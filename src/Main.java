import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        AdminCliente adminCliente;
        Archivo archivo = new Archivo();
        int opcion = 0;
        Scanner sc = new Scanner(System.in);

        if (archivo.leer()==null){
            adminCliente= new AdminCliente();
        }else {
            adminCliente = archivo.leer();
        }

        /*try{
           ObjectOutputStream escribiendoFichero=new ObjectOutputStream(new FileOutputStream("ArchivoClientes.txt"));

            escribiendoFichero.writeObject(adminCliente);
            escribiendoFichero.close();

           ObjectInputStream recuperandoFichero=new ObjectInputStream(new FileInputStream("ArchivoClientes.txt"));
            AdminCliente adminCliente1=(AdminCliente) recuperandoFichero.readObject();
            recuperandoFichero.close();

       } catch (FileNotFoundException e) {
           e.printStackTrace();
       } catch (IOException e) {
           e.printStackTrace();
       } catch (ClassNotFoundException e) {
           e.printStackTrace();
       }*/

        do {

            System.out.println("1)Crear Cliente");
            System.out.println("2)Listar Clientes");
            System.out.println("3)Buscar por DNI y listar sus datos");
            System.out.println("4)Buscar y eliminar cliente");
            System.out.println("5)Salir");
            opcion = sc.nextInt();
            switch (opcion){

                case 1:
                    System.out.println("ingrese datos del CLiente\n");
                    adminCliente.agregarCliente();
                    break;
                case 2:
                    System.out.println("Lista de clientes:\n");
                    adminCliente.listarClientes();
                    break;
                case 3:
                    System.out.println("Ingrese DNI:\n");
                    adminCliente.buscarCliente();
                    break;
                case 4:
                    System.out.println("Ingrese DNI del Cliente a eliminar\n");
                    adminCliente.eliminarCliente();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Opcion Incorrecta");
                    break;
            }

        }while (opcion != 5);

        archivo.guardar(adminCliente);
    }
}
