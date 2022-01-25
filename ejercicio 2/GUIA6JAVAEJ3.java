/*
Defina una clase llamada DivisionNumero. En el método main utilice un Scanner
para leer dos números en forma de cadena. A continuación, utilice el método
parseInt() de la clase Integer, para convertir las cadenas al tipo int y guardarlas en
dos variables de tipo int. Por ultimo realizar una división con los dos numeros y
mostrar el resultado.
Todas estas operaciones puede tirar excepciones a manejar, el ingreso por
teclado puede causar una excepción de tipo InputMismatchException, el método
Integer.parseInt() si la cadena no puede convertirse a entero, arroja una
NumberFormatException y además, al dividir un número por cero surge una
ArithmeticException. Manipule todas las posibles excepciones utilizando bloques
try/catch para las distintas excepciones
 */
package guia6javaej3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GUIA6JAVAEJ3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int resultado = 0;
        try {
            System.out.println("INGRESE EL PRIMERO NUMERO");
            String num1 = leer.next();
            System.out.println("INGRESE EL SEGUNDO");
            String num2 = leer.next();
            int numero1 = Integer.parseInt(num1);
            int numero2 = Integer.parseInt(num2);
            resultado = numero1 / numero2;
        } catch (InputMismatchException e) {
            System.out.println("ERROR, DEBE INGRESAR UN NUMERO");
        } catch (NumberFormatException e) {
            System.out.println("ERROR, NO PUEDE CONVERTIRSE A ENTERO");
        } catch (ArithmeticException e) {
            System.out.println("NO PUEDE DIVIDIRSE POR CERO");
        } finally {
            System.out.println("AHORA SI SIN ERRORES");
            System.out.println(resultado);
        }
    }

}
