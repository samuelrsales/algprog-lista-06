import java.util.Scanner;

public class Ex6MediaAlunos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] vetorMedias = new double[20];
        double[] vetorNotas = new double[4];
        
        for(int i = 0; i < vetorMedias.length; i++) {
            double soma = 0;

            for(int nota = 0; nota < vetorNotas.length; nota++) {
                System.out.println("Digite sua nota " + (nota + 1) + ": ");
                vetorNotas[nota] = sc.nextDouble();
                soma += vetorNotas[nota];
            }

            vetorMedias[i] = soma / 4;

        }

        System.out.println("--- ALUNOS APROVADOS ---");
        for (int i = 0; i < vetorMedias.length; i++) {
            if(vetorMedias[i] >= 7.0) {
                System.out.println("ALUNO " + (i + 1) + " (APROVADO) | Média: " + vetorMedias[i]);
            }
        }

        sc.close();
    }
}
