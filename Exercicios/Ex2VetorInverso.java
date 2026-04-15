import java.util.Scanner;

public class Ex2VetorInverso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] numerosVetor = new int[10];

        for(int i = 0; i < numerosVetor.length; i++) {
            System.out.println("Digite o número " + (i + 1) + ": ");
            numerosVetor[i] = sc.nextInt();
        }

        System.out.println("Números escolhidos (Inverso):");
        for(int i = numerosVetor.length - 1; i >= 0; i--) {
            
            if (i == (numerosVetor.length - 10)) {
                System.out.print(numerosVetor[i] + ".");
            } else {
                System.out.print(numerosVetor[i] + ", ");
            }
        }

        sc.close();
    }
}
