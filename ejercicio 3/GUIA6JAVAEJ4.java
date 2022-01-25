/*
Escribir un programa en Java que juegue con el usuario a adivinar un número. La
computadora debe generar un número aleatorio entre 1 y 500, y el usuario tiene
que intentar adivinarlo. Para ello, cada vez que el usuario introduce un valor, la
computadora debe decirle al usuario si el número que tiene que adivinar es mayor
o menor que el que ha introducido el usuario. Cuando consiga adivinarlo, debe
indicárselo e imprimir en pantalla el número de veces que el usuario ha intentado
adivinar el número. Si el usuario introduce algo que no es un número, se debe
controlar esa excepción e indicarlo por pantalla. En este último caso también se
debe contar el carácter fallido como un intento.
 */
package guia6javaej4;

import java.util.Scanner;

public class GUIA6JAVAEJ4 {

    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int contexcep = 0;
        try {
            adivinarNum(contexcep);
        } catch (Exception e) {
            System.out.println(e.toString());
            contexcep++;

        }
    }

    public static void adivinarNum(int contexcep) throws Exception {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int clave = ((int) (Math.random() * 100));
        int contintentos = 1;
        System.out.println("INGRESE UN INTENTO");
        int intento = leer.nextInt();
        System.out.println(clave);
        do {

            if (clave != intento) {
                contintentos++;
                if (clave > intento) {
                    System.out.println("PRUEBE UN NUMERO MAYOR");
                } else {
                    System.out.println("PRUEBE UN NUMERO MENOR");
                }
            }
            System.out.println("INGRESE UN INTENTO");
            intento = leer.nextInt();
        } while (clave != intento);
        contintentos = contintentos + contexcep;
        System.out.println("ADIVINO EN " + contintentos + " INTENTOS");

    }

}
