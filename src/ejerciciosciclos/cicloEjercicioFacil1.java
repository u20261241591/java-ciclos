//3.a.2. Programa que muestre los números del 1 al 100, pero sin mostrar los múltiplos de 7.
package ejerciciosciclos;

/**
 * @author Jesús David Tovar Rojas
 */
public class cicloEjercicioFacil1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i%7 != 0){ //el residuo de i debe ser diferente de 0
                System.out.println(i);
            }
        }
    }
}