/*
Definir una Clase que contenga algún tipo de dato de tipo array y agregue el
código para generar y capturar una excepción ArrayIndexOutOfBoundsException.
 */
package guia6javaej1;

import java.util.ArrayList;

public class GUIA6JAVAEJ1 {

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList();
        try {
        System.out.println(nums.get(2));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("ERROR, NO SE ENCUENTRA ESA POSICION");
            e.toString();
        } finally {
            System.out.println("FIN EJERCICIO");
        }
    } 

}
