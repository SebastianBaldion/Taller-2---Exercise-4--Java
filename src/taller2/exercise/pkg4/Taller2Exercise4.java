
package taller2.exercise.pkg4;

/**
 *
 * @author Sebastian Baldion
 */
public class Taller2Exercise4 {

    public static void main(String[] args) {
        int[] A = {6, 101, 8, 10};
        int i, j;
        int n = 4;
        int Maximo = Math.abs(A[0] - A[2]);
        
        for (i = 0; i < n; i++) {
            for (j = 0; j < i; j++) {
                if (i != j) {
                    int diferencia = Math.abs(A[i] - A[j]);
                    if (diferencia > Maximo) {
                        Maximo = diferencia;
                    }
                }
            }
        }
        System.out.println("La entre dos valores (MIN / MAX) es: \n" + Maximo);
    }
    
}
