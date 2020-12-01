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
public class problema4 {
    public static void main(String[] args) {        
        int numerador = 1;
        int contadorDenominador = 3;
        String cadena = "";
        double operacion = 0;
        cadena = String.format("%s%d", cadena, numerador);
        operacion = operacion + numerador;
        for (int contador = 1; contador <= 7; contador++) {
            if ((contador % 2) == 0){
                cadena = String.format("%s + %d/%d",cadena,numerador,
                        contadorDenominador);
                operacion = operacion + (double)numerador/contadorDenominador;
            } else {
                cadena = String.format("%s - %d/%d",cadena,numerador,
                        contadorDenominador);
                operacion = operacion - (double)numerador/contadorDenominador;
            }
            contadorDenominador = contadorDenominador + 2;
        }
        cadena = String.format("%s = %.2f",cadena, operacion);
        System.out.printf("%s\n", cadena);
    }
}