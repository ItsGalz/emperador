 
package mx.itson.emperador.negocio;

/**
*Contiene metodos para trabajar con tipos de dato String.
*@autor Gael Viveros
*/

public class Operacion {
    /**   
    * Separa una cadena de texto a partir de la expresion guien medio.
    *@param valor cadena de texto que sera separada a partir de la expresion dada.
    *@return Array de string donde cada posicion representa una division de la cadena de texto.
    */


    public String [] separar(String valor){
       String[] elementos = valor.split("-");
              return elementos;
       
 }
       
}                     