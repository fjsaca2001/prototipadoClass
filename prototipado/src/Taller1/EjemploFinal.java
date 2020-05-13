package Taller1;
import java.util.Arrays;
import java.util.Random;
public class EjemploFinal {
    public static void main(String[] args) {
        int[] values = random(50);
        Arrays.sort(values);
        System.out.println(Arrays.binarySearch(values, 80));
    }
    static int[] random(int n){
        int[] arreglo = new int[n];
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = new Random().nextInt(100);
        }
        return arreglo;
    }
}
