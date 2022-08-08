package ExerciciosLista2;

import java.util.Scanner;

public class AulaEx5SecondWeek {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um número, podendo ser positivo ou negativo:");
        num = sc.nextInt();

        if (num >= 0) {
            System.out.println("O dobro do número informado é: " + (num*2));
        } else {
            System.out.println("O triplo do número informado é: " + (num*3));
        }
    }
}
