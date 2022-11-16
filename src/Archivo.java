import java.io.*;

public class Archivo {

    private File ruta = new File("archivoClientes.txt");

    public AdminCliente leer(){

        try {
            ObjectInputStream flujoEntrada = new ObjectInputStream(new FileInputStream(ruta));

            AdminCliente adminCliente= (AdminCliente) flujoEntrada.readObject();

            return adminCliente;
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return null;
    }

    public void guardar(AdminCliente adminCliente){

        try {
            ObjectOutputStream flujoSalida = new ObjectOutputStream(new FileOutputStream(ruta));

            flujoSalida.writeObject(adminCliente);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
