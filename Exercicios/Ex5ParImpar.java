import java.util.Scanner;

public class Ex5ParImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] vetorNumeros = new int[5];
        int[] vetorPares = new int[5];
        int[] vetorImpares = new int[5];

        for(int i = 0; i < vetorNumeros.length; i++) {
            System.out.println("Digite o número " + (i + 1) + ": ");
            vetorNumeros[i] = sc.nextInt();

            if(vetorNumeros[i] % 2 == 0) {
                vetorPares[i] = vetorNumeros[i];
            } else {
                vetorImpares[i] = vetorNumeros[i];
            }
        }

        System.out.println("--- Vetor Números ---");
        for(int numero: vetorNumeros) {
            System.out.print(numero + " ");
        }

        System.out.println("\n--- Vetor Pares ---");
        for(int numero: vetorPares) {
            System.out.print(numero + " ");
        }

        System.out.println("\n--- Vetor Impares ---");
        for(int numero: vetorImpares) {
            System.out.print(numero + " ");
        }


        sc.close();
    }
}
