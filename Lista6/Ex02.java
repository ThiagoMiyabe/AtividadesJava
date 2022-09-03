package Lista6;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] vetor = new int[5];
        int maior = 0, menor = 0, soma = 0;
        double media;

        for (int i = 0; i < 5; i++) {
            System.out.println("Insira o " + (i + 1) + " numero:");
            vetor[i] = sc.nextInt();
            if (i == 0) {
                maior = vetor[i];
                menor = vetor[i];
            } else {
                if (vetor[i] > maior) {
                    maior = vetor[i];
                } else if (vetor[i] < menor) {
                    menor = vetor[i];
                }
            }
        }
        media = soma / 5;
        for (int i = 0; i < 5; i++) {
            soma = soma + vetor[i];
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(vetor[i]);
        }
        System.out.println("O maior valor é o: " + maior);
        System.out.println("O menor valor é o: " + menor);
        System.out.println("A media dos valores é de: " + media);
    }
}
