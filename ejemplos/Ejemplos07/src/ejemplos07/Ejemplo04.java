/*
 * * Generar una solución que permita ingresar jugadores de fútbol; por cada jugador se debe solicitar:
	-	Nombre el jugador
	- 	Posición en el campo de juego
	- 	Edad
	- 	Estatura
	
    El ciclo de ingreso de información deberá terminar cuando el usuario lo decida.
    Se debe imprimer el siguiente reporte (usar una cadena de acumulación):

    > Listado de Jugadores
    1. Alexander Dominguez -Arquero-, edad 32, estatura 1.95
    2. Xavier Arreaga -Defensa-, edad 24, estatura 1.85
    3. Moisés Caicedo -Mediocentro-, edad 19, estatura 1.88
    4. Ángel Mena -Delantero-, edad 32, estatura 1.75
    5. Michael Estrada -Delantero-, edad 27, estatura 1.93
    Promedio de edades:  26.8
    Promedio de estaturas: 1.87
 */
package ejemplos07;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String cadenaReporte = "";
        String nombreJugador;
        String posicionCampo;
        double estatura;
        int edad;
        boolean bandera = true;
        String salir;
        // variable acumuladoras
        int sumaEdades = 0;
        double sumaEstaturas = 0.0;
        // contador para saber el número de iteraciones
        int contadorIteraciones = 0;
        // variables para promedio
        int promedioEdad;
        double promedioEstatura;
        cadenaReporte = String.format("%s%s\n", cadenaReporte, 
                "Listado de Jugadores");
        
        do {
            System.out.println("Ingrese el nombre del Jugador: ");
            nombreJugador = entrada.nextLine();
            System.out.println("Ingrese la posición en el campo: ");
            posicionCampo = entrada.nextLine();
            System.out.println("Ingrese la edad del Jugador: ");
            edad = entrada.nextInt();
            System.out.println("Ingrese la estatura del jugador: ");
            estatura = entrada.nextDouble();
            
            // sumo la edad a sumaEdades
            sumaEdades = sumaEdades + edad;
            // sumo la estatura a sumaEstaturas
            sumaEstaturas = sumaEstaturas + estatura;
            // agrego una iteración
            contadorIteraciones = contadorIteraciones + 1;
            
            // Ejmplo 1. Alexander Dominguez -Arquero-, edad 32, estatura 1.95
            cadenaReporte = String.format("%s%d.) %s -%s-, edad %d, "
                    + "estatura %.2f\n",
                    cadenaReporte,
                    contadorIteraciones,
                    nombreJugador,
                    posicionCampo,
                    edad,
                    estatura);
            
            entrada.nextLine();
            System.out.println("Desea salir del ciclo; digite: si");
            salir = entrada.nextLine();
            if(salir.equals("si")){
                bandera = false;
            }
        } while (bandera);
        
        promedioEdad = sumaEdades/contadorIteraciones;
        promedioEstatura = sumaEstaturas/contadorIteraciones;
        // Promedio de edades:  ?
        cadenaReporte = String.format("%sPromedio de edades: %d\n", 
                cadenaReporte, promedioEdad);
        // Promedio de estaturas: ?
        cadenaReporte = String.format("%sPromedio de estaturas: %.2f\n", 
                cadenaReporte, promedioEstatura);
        // presentación de cadena final
        System.out.printf("%s\n", cadenaReporte);
        
    }
}
