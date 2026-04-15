import java.util.Scanner;

public class Ex4Consoantes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroConsoantes = 0;

        char[] vetorCaracteres = new char[10];

        for(int i = 0; i < vetorCaracteres.length; i++) {
            System.out.println("Digite o caracter " + (i + 1) + ": ");
            vetorCaracteres[i] = sc.next().charAt(0);
        }

        System.out.println("--- CONSOANTES DIGITADOS ---");
        for(char caractere: vetorCaracteres) {
            if(caractere != 'a' && caractere != 'e' && caractere != 'i' && caractere != 'o' && caractere != 'u') {
                System.out.print(caractere + " ");
                numeroConsoantes++;
            }
        }

        System.out.println("\nNúmero total de consoantes: " + numeroConsoantes);

        sc.close();
    }
}
