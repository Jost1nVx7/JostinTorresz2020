/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
//Jostin Torres C
package espoch.edu.ec.jostintorresz2020;

import java.util.Scanner;

public class JostinTorresZ2020 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float[] juego = new float[7];
        float totalPuntos;
        float promPuntuacion;
        float puntoAlto;
        float puntoBajo;
        int i = 0;
        float punto = 0;
        do {
            System.out.println("Ingrese los puntos de cada del dia " + (i + 1) + ": ");
            punto = scanner.nextFloat();
            if (punto > 0) {
                juego[i] = punto;
                i++;
            } else {
                System.out.println("El valor es negativo");
            }
        } while (i < 7);

        System.out.println(" ");

        System.out.println("Seleccione una Opciones del 1 al 5:");

        System.out.println(" ");

        System.out.println("1. Calcular el total de puntuaciones de la semana");
        System.out.println("2. Calcular el promedio de puntuaciones y mostrar los dias por encima y por debajo del promedio");
        System.out.println("3. Mostrar el dia con la puntuacion mas alta y el dia con la puntuacion mas baja");
        System.out.println("4. Calcular el total de puntaciones acumuladas durante los primeros cuatro dias y los ultimos 4 dias");
        System.out.println("5. Salir.");

        int opcion = scanner.nextInt();

        switch (opcion) {
                
            case 1:
                float suma = 0;
                System.out.println("Opcion 1: ");
                for (int j = 0; j <= 7; i++) {
                    suma = juego[i] + suma;
                }
                totalPuntos = suma;
                System.out.println("La puntaje total es: " + totalPuntos);
                break;
        default:

        }
    }
}
