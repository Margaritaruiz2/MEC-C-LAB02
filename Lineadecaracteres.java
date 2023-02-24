package laboratorio22;

import java.util.Scanner;

public class Lineadecaracteres {

    public static void main(String[] args) {
        // Leer una línea de caracteres
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese una línea de caracteres: ");
        String linea = sc.nextLine();

        // Sustituir las vocales por el carácter que más se repita
        char[] caracteres = linea.toCharArray();
        int[] conteo = new int[128]; // Un arreglo para contar la frecuencia de cada carácter
        for (char c : caracteres) {
            if ("aeiouAEIOU".indexOf(c) >= 0) {
                // Si el carácter es una vocal, no lo contamos para la frecuencia
                continue;
            }
            conteo[c]++;
        }
        char caracter_mas_comun = ' ';
        int maximo = 0;
        for (int i = 0; i < conteo.length; i++) {
            if (conteo[i] > maximo) {
                maximo = conteo[i];
                caracter_mas_comun = (char) i;
            }
        }
        for (int i = 0; i < caracteres.length; i++) {
            if ("aeiouAEIOU".indexOf(caracteres[i]) >= 0) {
                // Si el carácter es una vocal, lo sustituimos por el carácter más común
                caracteres[i] = caracter_mas_comun;
            }
        }

        // Invertir el orden de las letras y mostrar el resultado
        String resultado = new StringBuilder(new String(caracteres)).reverse().toString();
        System.out.println("Resultado: " + resultado);
    }
}
