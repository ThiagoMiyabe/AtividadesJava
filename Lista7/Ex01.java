package Lista7;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] vetorA = new int[10];
        int [] vetorB = new int[10];
        int [] vetorC = new int[10];
        double var;

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Digite o "+(i+1)+"º número do vetor A: ");
            vetorA[i] = sc.nextInt();
        }
        System.out.println();
        for (int i = 0; i < vetorB.length; i++) {
            System.out.println("Digite o "+(i+1)+"° número do vetor B: ");
            vetorB[i] = sc.nextInt();
        }
        System.out.println("------------------------");
        for (int i = 0; i < vetorC.length; i++) {
            var = (vetorA[i] - (vetorB[i]*vetorA[i]));
            System.out.println("Vetor C: " + var);
        }
    }
}
