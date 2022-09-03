package Lista6;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int qtdNegativo = 0, soma = 0;
        int [] vetor = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Insira o " + (i + 1) + " numero:");
            vetor[i] = sc.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            if (vetor[i] < 0) {
                qtdNegativo++;
            }
        }
        for (int i = 0; i < 10; i++) {
            if (vetor[i] > 0) {
                soma = soma + vetor[i];
            }
        }
        System.out.println("Quantidade de numeros negativos: " + qtdNegativo);
        System.out.println("A soma dos numeros positivos desse vetor é: " + soma);
    }
}
