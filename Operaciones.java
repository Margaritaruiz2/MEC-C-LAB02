

import java.util.Arrays;
import java.util.Random;
import java.util.HashMap;
import java.util.Scanner;

public class Operaciones {

    public static void main(String[] args) {
        // Pedir al usuario el tamaño del arreglo
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el tamaño del arreglo: ");
        int n = sc.nextInt();
        
        // Crear un arreglo de tamaño n y llenarlo con números aleatorios
        int[] arr = new int[n];
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            arr[i] = rand.nextInt(100); // Generar números aleatorios entre 0 y 99
        }
        
        // Imprimir el arreglo generado
        System.out.println("Arreglo generado: " + Arrays.toString(arr));
        
        // Calcular la media
        double media = 0;
        for (int i = 0; i < n; i++) {
            media += arr[i];
        }
        media /= n;
        System.out.println("Media: " + media);
        
        // Calcular la mediana
        Arrays.sort(arr);
        double mediana = 0;
        if (n % 2 == 0) {
            mediana = (arr[n/2 - 1] + arr[n/2]) / 2.0;
        } else {
            mediana = arr[n/2];
        }
        System.out.println("Mediana: " + mediana);
        
        // Calcular la varianza
        double varianza = 0;
        for (int i = 0; i < n; i++) {
            varianza += Math.pow(arr[i] - media, 2);
        }
        varianza /= n;
        System.out.println("Varianza: " + varianza);
        
        // Calcular la desviación estándar
        double desviacion = Math.sqrt(varianza);
        System.out.println("Desviación estándar: " + desviacion);
        
        // Calcular la moda
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxCount = 0, moda = -1;
        for (int i = 0; i < n; i++) {
            int count = map.getOrDefault(arr[i], 0) + 1;
            map.put(arr[i], count);
            if (count > maxCount) {
                maxCount = count;
                moda = arr[i];
            }
        }
        System.out.println("Moda: " + moda);
    }

}
