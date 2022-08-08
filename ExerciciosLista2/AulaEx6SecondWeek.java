package ExerciciosLista2;

import java.util.Scanner;

public class AulaEx6SecondWeek {
    public static void main(String[] args) {
        int num1, num2, num3;
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o primeiro número: ");
        num1 = sc.nextInt();
        System.out.println("Informe o segundo número: ");
        num2 = sc.nextInt();
        System.out.println("Informe o terceiro número: ");
        num3 = sc.nextInt();

        if (num1 > num2 && num2 > num3) {
            System.out.println("A ordem decrescente dos números é " + num1 + "," + num2 + "," + num3 + ".");
        } if ( num1 > num3 && num3 > num2) {
            System.out.println("A ordem decrescente dos números é " + num1 + "," + num3 + "," + num2 + ".");
        } if (num2 > num1 && num1 > num3) {
            System.out.println("A ordem decrescente dos números é " + num2 + "," + num1 + "," + num3 + ".");
        } if (num2 > num3 && num3 > num1) {
            System.out.println("A ordem decrescente dos números é " + num2 + "," + num3 + "," + num1 + ".");
        } if (num3 > num2 && num2 > num1) {
            System.out.println("A ordem decrescente dos números é " + num3 + "," + num2 + "," + num1 + ".");
        } if (num3 > num1 && num1 > num2) {
            System.out.println("A ordem decrescente dos números é " + num3 + "," + num1 + "," + num2 + ".");
        }
    }
}
