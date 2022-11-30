package ResolucionParcial2;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Archivo implements Impresion{
    @Override
    public void imprimir(String texto) {

        //escribir dentro del archivo

        File file = new File("contactos.txt");

        String nuevotexto="";

        if (file.exists()){
            nuevotexto += guardartexto();
        }

        nuevotexto += texto;

        try {
            FileWriter escritura = new FileWriter("contactos.txt");
            for (int i=0;i<nuevotexto.length();i++){
                escritura.write(nuevotexto.charAt(i));
            }
            escritura.write("\n");
            escritura.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //metodo q trae lo que tenia el texto guardado sin borrar al escribir algo nuevo
    private String guardartexto(){
        String nuevoTexto="";
        try {

            FileReader entrada = new FileReader("contactos.txt");
            int caracter = entrada.read();
            char letra = (char) caracter;

            while (caracter != -1){
                nuevoTexto += letra;
                caracter = entrada.read();
                letra = (char) caracter;

            }
            entrada.close();

        }catch (Exception e){
            e.printStackTrace();
        }

        return nuevoTexto;
    }

    //leer
    public void leer(){
        FileReader entrada = null;
        try {
            //entrada = new FileReader("D:\\Luis\\TSP\\Laboratorio de programacion 2\\Ronda 2\\prueba.txt");
            entrada = new FileReader("archivo.txt");

            int caracter = entrada.read();
            char letra = (char)caracter;

            while (caracter != -1){
                System.out.print(letra);
                caracter = entrada.read();
                letra = (char)caracter;
            }

            entrada.close();
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("El archivo no existe, debe de escribirlo para crearlo.");
        }
    }
    //limpiar
    // Este metodo limpia el archivo dejandolo en blanco
    public void limpiar(){
        try {
            FileWriter escritura = new FileWriter("archivo.txt");

            escritura.write("");

            escritura.close();
        } catch (Exception e){
            System.out.println("El archivo no existe aun!");
        }
    }

}
