package ExerciciosLista2;

import java.util.Scanner;

public class AulaEx10SecondWeek {
    public static void main(String[] args) {
        int lado1, lado2, lado3;
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o primeiro lado: ");
        lado1 = sc.nextInt();
        System.out.println("Informe o segundo lado: ");
        lado2 = sc.nextInt();
        System.out.println("Informe o terceiro lado: ");
        lado3 = sc.nextInt();

        if (lado1 < lado2 + lado3 && lado2 < lado1 + lado3 && lado3 < lado1 + lado2) {
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("O triângulo é equilátero!");
            } else if (lado1 ==lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("O triângulo é isósceles!");
            } else {
                System.out.println("O triângulo é escaleno!");
            }
        }
    }
}
