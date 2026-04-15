import java.util.Scanner;

public class Ex3MediaNotas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double[] notasVetor = new double[4];
        double media, somador = 0;

        for(int i = 0; i < notasVetor.length; i++) {
            System.out.println("Digite a nota " + (i + 1) + ": ");
            notasVetor[i] = sc.nextDouble();

            somador += notasVetor[i];
        }

        System.out.println("Notas digitadas:");

        for(double nota: notasVetor) {
            System.out.println(nota);
        }

        media = somador / notasVetor.length;
        System.out.println("A média das notas foram: " + media);



        sc.close();
    }
}