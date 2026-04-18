import java.util.Scanner;

public class Ex7VetorMath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma = 0, multiplicacao = 1;

        int[] vetorNumeros = new int[5];

        for(int i = 0; i < vetorNumeros.length; i++) {
            System.out.println("Digite o número " + (i + 1) + ": ");
            vetorNumeros[i] = sc.nextInt();
            soma += vetorNumeros[i];
            multiplicacao *= vetorNumeros[i];
        }

        System.out.println("\nResultado final da SOMA: " + soma);
        System.out.println("Resultado final da MULTIPLICAÇÃO: " + multiplicacao);

        sc.close();
    }
}
