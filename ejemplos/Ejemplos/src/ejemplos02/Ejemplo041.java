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
public class Ejemplo041 {

    public static void main(String[] args) {
        // 
        int resultado;
        String cadena;
        String cadena1;
        String cadena2;
        int[][] valor1 = {{1, 2, 3}, {3, 2, 4}, {2, 6, 2}};
        int[][] valor2 = {{1, 2, 3}, {2, 2, 2}, {3, 1, 2}};
        for (int f = 0; f < valor1.length; f++) {
            cadena1 = "";
            for (int c = 0; c < valor1[f].length; c++) {
                cadena1 = String.format("%s%s\t",
                        cadena1, valor1[f][c]);
            }
            System.out.printf("%s\n", cadena1);
        }
        System.out.printf("\n");
        for (int f = 0; f < valor1.length; f++) {
            cadena2 = "";
            for (int c = 0; c < valor1[f].length; c++) {
                cadena2 = String.format("%s%s\t",
                        cadena2, valor2[f][c]);
            }
            System.out.printf("%s\n", cadena2);
        }
        System.out.printf("\n");
        for (int f = 0; f < valor1.length; f++) {
            cadena = "";
            for (int c = 0; c < valor1[f].length; c++) {
                resultado = obtenerMultiplicacion(valor1[f][c], valor2[f][c]);
                cadena = String.format("%s%s\t",
                        cadena, resultado);
            }
            System.out.printf("%s\n", cadena);
        }

    }

    public static int obtenerMultiplicacion(int a, int b) {
        int mult;
        mult = a * b;
        return mult;
    }
}
