package ejerciciosciclos;

/**
 *Mostrar por pantalla todos los números primos que hay entre 1 y 200
 * @author Jesús David Tovar Rojas
 */
public class cicloEjercicioMedio3 {
    public static void main(String[] args) {
        
        for (int numero = 2; numero <= 200; numero++) {  
            boolean esPrimo = true; 
            for (int divisor = 2; divisor < numero; divisor++) {
                if (numero % divisor == 0) {
                    esPrimo = false;
                    break;
                }
            }
            if (esPrimo) {
                System.out.println(numero);
            }
        }
    }
}