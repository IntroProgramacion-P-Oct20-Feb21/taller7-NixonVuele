/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea;

/**
 *
 * @author Nixon
 */
public class problema3 {
    public static void main(String[] args) {
        int numero=1;
        int num2=-1;
        String cadenaFinal = "";
        for (int contador=1;contador <=6; contador++){
            num2=num2+2;
            numero = numero+ num2;
            cadenaFinal = String.format("%s%d ", cadenaFinal,numero);
        }
    System.out.printf("%s\n", cadenaFinal);
    }
}