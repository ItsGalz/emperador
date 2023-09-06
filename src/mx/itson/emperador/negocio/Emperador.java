
package mx.itson.emperador.negocio;

import java.util.Scanner;



public class Emperador {

    
    public static void main(String[] args) {
        

        System.out.println("Ingrese los datos de los alumnos");
        Scanner entrada = new Scanner (System.in);
        String alumnos = entrada.nextLine();

        String [] resultado = alumnos.split(",");

        for (String r : resultado){
            //System.out.println(r);
            String [] alumno = r.split(" ");
            String id = alumno[0];
            String primerNombre = alumno[3];
            String primelApellido = alumno[1];
            System.out.println("ID: "+id+" - "+primerNombre+" "+primelApellido);
        }

       
        



    }
    
}
