package ExerciciosLista2;

import java.util.Scanner;

public class AulaEx4SecondWeek {
    public static void main(String[] args) {
        int A, B, C1, C2;
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um valor inteiro para A: ");
        A = sc.nextInt();
        System.out.println("Informe um valor inteiro para B: ");
        B = sc.nextInt();

        C1 = A+B;
        C2 = A*B;

        if (A == B) {
            System.out.println("A soma de A e B é: " + C1);
        } else {
            System.out.println("A multiplicação de A por B é: " + C2);
        }
    }
}
