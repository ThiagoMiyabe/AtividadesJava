package ExerciciosLista2;

import java.util.Scanner;

public class AulaEx1SecondWeek {
    public static void main(String[] args) {
        int A, B, C, soma;
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira um valor para A: ");
        A = sc.nextInt();
        System.out.println("Insira um valor para B: ");
        B = sc.nextInt();
        System.out.println("Insira um valor para C: ");
        C = sc.nextInt();

        soma = A+B;

        if (soma < C) {
            System.out.println("A soma de A+B é: " + soma);
        } else {
            System.out.println("Não foi possível inicializar o programa");
        }
    }
}
