/*
 * Generar la serie: +1/1-1/3+1/5-1/7+1/9 
 */
package ejemplos07;

/**
 *
 * @author reroes
 */
public class Ejemplo02 {

    /**
     * @args
     */
    public static void main(String[] args) {
        // variables 
        int numerador = 1;
        int denominador = 1;
        int contador = 1;
        
        do {
            if((contador%2)==0){
                System.out.printf("%s%d/%d", "-", numerador, denominador);
            }else{
                System.out.printf("%s%d/%d", "+", numerador, denominador);
            }
            contador = contador + 1;
            denominador = denominador + 2;
        }while (contador<=5);
        System.out.println();
       
    }
    
}
