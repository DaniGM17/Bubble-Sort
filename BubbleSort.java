import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author dania
 */
public class BubbleSort {

    public static BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
    public static String entrada;

    public static int[] leerArreglo(int n) throws IOException {
        int[] a = new int[n];
        System.out.println("--------------------------------------------------");
        for (int i = 0; i < a.length; i++) {
            System.out.println("Escriba el valor [" + i + "]: ");
            entrada = bufer.readLine();
            a[i] = Integer.parseInt(entrada);
        }
        return a;
    }

    public static int[] bubbleSort(int[] listaD) {
        boolean ordenado;
        int mantener;
        do {
            ordenado = false;
            for (int i = 0; i < listaD.length - 1; i++) {
                if (listaD[i] > listaD[i + 1]) {
                    mantener = listaD[i];
                    listaD[i] = listaD[i + 1];
                    listaD[i + 1] = mantener;
                    ordenado = true;
                }
            }
        } while (ordenado);
        return listaD;
    }

    public static void imprimirArreglo(int[] a) {
        System.out.println("-------------------------");
        System.out.println("Lista ordenada");
        for (int i = 0; i < a.length; i++) {
            System.out.printf("%4d", a[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) throws IOException {
        int[] array, bubbleSort;
        int t;
        System.out.println("Programa que ordena la lista de números");
        System.out.println("Escribe la longitud de la lista a ingresar: ");
        entrada = bufer.readLine();
        t = Integer.parseInt(entrada);

        array = leerArreglo(t);
        array = bubbleSort(array);
        imprimirArreglo(array);
    }

}
