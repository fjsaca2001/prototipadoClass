package Taller1;
import java.util.Random;
public class EjemploMedio {
    public static void main(String[] args) {
        int[] values = random(100);
        for (int i = 0; i < values.length; i++) {
            int index = (values[i] == 80) ? i : -1;
        }
    }
    static int[] random(int n){
        int[] arreglo = new int[n];
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = new Random().nextInt(100);
        }
        return arreglo;
    }
}
