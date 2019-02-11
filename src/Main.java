
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jgonzalezar
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        File archivo = new File("x//j//a.txt");
        File archivo2 = new File("x");
        File archivo3 = new File("j");
        System.out.println(archivo.exists());
        System.out.println(archivo2.isDirectory());
        System.out.println(archivo.isFile());
        int x=0;
        /*if(archivo2.isDirectory()){
            String lista[] = archivo2.list();
            for (String nombre : lista) {
                System.out.println(nombre);
            }
        }*/
        Scanner leerarchivo = new Scanner (archivo);
        while(leerarchivo.hasNext()){
            if(leerarchivo.hasNextInt()){
                x+=leerarchivo.nextInt();
                System.out.println(x);
            }else{
            System.out.println(leerarchivo.next());
            }
        }
        //archivo.lis
    }
    
}
