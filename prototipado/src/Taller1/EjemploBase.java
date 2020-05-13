package Taller1;
import java.util.Random;
public class EjemploBase {
    public static void main(String[] args) {
        int[] values = random(50);
        for (int i = 0; i <10000000; i++) {
            int index = -1;
            for (int j = 0; j < values.length; j++) {
                index = (values[j] == 80) ? j : -1;
            }
            break;
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
