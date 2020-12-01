/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea;
import java.util.Scanner;
import java.util.Locale;
/**
 *
 * @author Nixon
 */
public class problema1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String nombreJugador;
        String posicion;
        String cadenaFinal = "";
        String totalEdades = "";
        int salir;
        double estatura;
        int edad;
        boolean bandera = true;
        int sumaEdades = 0;
        double sumaEstaturas = 0.0;
        int contador = 0;
        double promedioEdad;
        double promedioEstatura;
        cadenaFinal = String.format("%s%s\n", cadenaFinal,
                "Listado de Jugadores");
        do {
            System.out.println("Ingrese el nombre del jugador");
            nombreJugador = entrada.nextLine();
            System.out.println("Cual es la posición que juega en el campo?");
            posicion = entrada.nextLine();
            System.out.println("Cual es la edad del jugador?");
            edad = entrada.nextInt();
            System.out.println("Cuale es la estatura del jugador?");
            estatura = entrada.nextDouble();
            sumaEstaturas = sumaEstaturas + estatura;
            sumaEdades = sumaEdades + edad;
            contador = contador + 1;
            cadenaFinal = String.format("%s%d. %s - %s-, edad %d, estatura "
                    + "%.2f\n",
                    cadenaFinal,contador,nombreJugador,
                    posicion,edad,estatura);
            totalEdades = String.format("%s%d\n", totalEdades, edad);
            entrada.nextLine();
            System.out.println("Si no hay mas jugadores que añadir escriba "
                    + "cualquier numero mayor a 1");
            salir = entrada.nextInt();
            entrada.nextLine();
            if(salir > 0){
                bandera = false;
            }
        } while (bandera);
        promedioEdad = (double)sumaEdades/contador;
        promedioEstatura = sumaEstaturas/contador;
        cadenaFinal = String.format("%sListado de Edades\n%s"
                + "Promedio de edades: %.2f\nPromedio de estaturas: %.2f\n",
                cadenaFinal,totalEdades,promedioEdad,promedioEstatura);
        System.out.printf("%s\n", cadenaFinal);
    }
}