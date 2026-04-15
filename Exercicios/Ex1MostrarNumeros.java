import java.util.Scanner;

public class Ex1MostrarNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] numerosVetor = new int[5];

        for(int i = 0; i < numerosVetor.length; i++) {
            System.out.println("Digite o número " + (i + 1) + ": ");
            numerosVetor[i] = sc.nextInt();
        }

        System.out.println("Números escolhidos:");
        for(int i = 0; i < numerosVetor.length; i++) {
            
            if (i == (numerosVetor.length - 1)) {
                System.out.print(numerosVetor[i] + ".");
            } else {
                System.out.print(numerosVetor[i] + ", ");
            }
        }

        sc.close();
    }
}