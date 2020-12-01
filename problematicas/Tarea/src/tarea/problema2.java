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
public class problema2 {
    public static void main(String[] args) {
        int numero;
        String cadenaFinal = "";
        for (int contador=1;contador <= 10; contador++){
            numero = (contador * contador)+contador;
            cadenaFinal = String.format("%s%d ", cadenaFinal,numero);
        }
        System.out.printf("%s\n", cadenaFinal);
    }
}