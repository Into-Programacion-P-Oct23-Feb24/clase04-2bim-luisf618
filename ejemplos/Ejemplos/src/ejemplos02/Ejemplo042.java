/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos02;

/**
 *
 * @author reroes
 */
public class Ejemplo042 {

    public static void main(String[] args) {
        // 

        int[][] arreglo1 = {{1, 2, 3}, {3, 2, 4}, {2, 6, 2}};
        int[][] arreglo2 = {{1, 2, 3}, {2, 2, 2}, {3, 1, 2}};
        int[][] arreglo3 = new int[3][3];
        int[][] arreglo4 = new int[3][3];
        // Se agrega una nueva variable para almacenar los nuevos valores

        for (int i = 0; i < arreglo1.length; i++) {
            for (int j = 0; j < arreglo1[i].length; j++) {
                arreglo3[i][j] = obtenerMultiplicacion(arreglo1[i][j],
                        arreglo2[i][j]);
            }
        }
        for (int i = 0; i < arreglo1.length; i++) {
            for (int j = 0; j < arreglo1[i].length; j++) {
                arreglo4[i][j] = obtenerSuma(arreglo1[i][j], arreglo2[i][j],
                        arreglo3[i][j]);
            }
        }
        /*
        Usando 2 ciclos repetitivos para ir recorriendo los arreglos e irlos
        enviando a los valores a la funcion obtener suma, para obtener los
        valores
        */
        obtenerReporte(arreglo1);
        obtenerReporte(arreglo2);
        obtenerReporte(arreglo3);
        obtenerReporte(arreglo4);
        // Se llama al procedimiento para imprimir los valores del nuevo arreglo
    }

    public static void obtenerReporte(int[][] arreglo1) {
        String cadena = "";
        for (int i = 0; i < arreglo1.length; i++) {
            for (int j = 0; j < arreglo1[i].length; j++) {
                cadena = String.format("%s%d\t", cadena,
                        arreglo1[i][j]);
            }
            cadena = String.format("%s\n", cadena);
        }
        System.out.println(cadena);
    }

    public static int obtenerMultiplicacion(int a, int b) {
        int operacion;
        operacion = a * b;
        return operacion;

    }

    public static int obtenerSuma(int a, int b, int c) {
        int suma;
        suma = a + b + c;
        return suma;
    }
    /* 
    En esta funcion se van recibiendo los valores de tipo entero y se los 
    almacena en una variable para luego retornar ese valor al metodo main
    */
}
