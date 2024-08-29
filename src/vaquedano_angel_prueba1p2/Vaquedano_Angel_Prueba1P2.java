package vaquedano_angel_prueba1p2;

import java.util.Scanner;
import java.util.Random;
import java.util.InputMismatchException;

public class Vaquedano_Angel_Prueba1P2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Variables
        int tamanoArray;
        int tamanoPalindromos;
        //------------------

        Scanner lea = new Scanner(System.in);
        Random random = new Random();

        String palabras[] = {"radar", "level", "world", "civic", "java", "deified", "python", "rotor", "language", "madam", "refer", "stats", "noon", "hello", "moon", "wow", "racecar", "kayak", "apple", "deed"};

        for (int contadorLista = 0; contadorLista < palabras.length; contadorLista++) {
            System.out.println(" [" + contadorLista + "] " + palabras[contadorLista]);
        }
        
        //Array Palindromos
        int contadorPal = 0;

        for (int arrayPalindromos = 0; arrayPalindromos < palabras.length; arrayPalindromos++) {
            String palabraActual = palabras[arrayPalindromos];
            String palabraReversa = "";

            for (int contPalindromo = palabraActual.length() - 1; contPalindromo >= 0; contPalindromo--) {
                char letra = palabraActual.charAt(contPalindromo);
                palabraReversa += letra;
            }
            if (palabraActual.equals(palabraReversa)) {
                contadorPal++;
            }
        }
        
        String arregloPalindromos[] = new String[contadorPal];
        
        for (int espacioArray = 0; espacioArray < arregloPalindromos.length; espacioArray++) {

            for (int arrayPalindromos = 0; arrayPalindromos < palabras.length; arrayPalindromos++) {
                String palabraActual = palabras[arrayPalindromos];
                int posicion=0;
                String palabraReversa = "";

                for (int contPalindromo = palabraActual.length() - 1; contPalindromo >= 0; contPalindromo--) {
                    char letra = palabraActual.charAt(contPalindromo);
                    palabraReversa += letra;
                }
                if (palabraActual.equals(palabraReversa)) {
                    arregloPalindromos[posicion]=palabraActual;
                    posicion++;
                }
            }
        }
        
        while (true) {

            try {
                System.out.println("Favor ingrese el tamano del arreglo:");
                tamanoArray = lea.nextInt();
                if (tamanoArray >= 1) {
                    String arregloA[] = new String[tamanoArray];
                    String arregloB[] = new String[tamanoArray];

                    for (int palabrasRandom = 0; palabrasRandom < arregloA.length; palabrasRandom++) {
                        

                    }
                    for (int palabrasRandom = 0; palabrasRandom < arregloB.length; palabrasRandom++) {

                    }

                } else {
                    System.out.println("Favor ingrese un numero mayor a 0.");
                }

            } catch (InputMismatchException e) {
                System.out.println("Favor ingrese un caracter valido.");
                lea.next();
            }
        }

    }

}
