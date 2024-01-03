/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos01;

/**
 *
 * @author reroes
 */
public class Ejemplo01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        // String miCiudad = obtenerCiudadMayuscula("Loja");
        // System.out.printf("%s\n", miCiudad);
        obtenerMultiplicacion(7, 50);
        /*
        Solo se invoca al procedimiento, ya que al tener void en el inicio no va
        a retornar nigun valor, por lo que solo es un procedimiento y no una
        funcion que va a devolver algun tipo de valor
        */
        String miMensaje = obtenerMultiplicacionDos(7, 50);
        System.out.printf("%s", miMensaje);
        /*
        Aqui si se asigna una variable a la funcion ya que si va a retornar un
        valor de algun tipo, en este caso de tipo cadena, y luego se lo presenta
        ya que no se lo presenta en la funcion
        */
    }

    public static String obtenerCiudadMayuscula(String m) {
        String m2 = m.toUpperCase();
        return m2;
    }

    public static void obtenerMultiplicacion(int tabla, int limite) {
        String cadena = "";
        int mult;
        for (int i = 1; i <= limite; i++) {
            mult = tabla * i;
            cadena = String.format("%s%d x %d = %d\n",
                    cadena, tabla, i, mult);

        }
        System.out.printf("%s", cadena);
    }

    public static String obtenerMultiplicacionDos(int tabla, int limite) {
        String cadena = "";
        int mult;
        for (int i = 1; i <= limite; i++) {
            mult = tabla * i;
            cadena = String.format("%s%d x %d = %d\n",
                    cadena, tabla, i, mult);

        }
        return cadena;
    }

    public static String obtenerNombre() {
        return "Luis";
    }

}
