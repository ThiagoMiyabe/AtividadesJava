package ExerciciosLista3;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        int num1, num2, num3, num4, num5, soma;
        double media;
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe 5 números: ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();
        num4 = sc.nextInt();
        num5 = sc.nextInt();

        soma = num1 + num2 + num3 + num4 + num5;
        media = (num1 + num2 + num3 + num4 + num5) / 5;

        System.out.println("A soma dos números é: " + soma);
        System.out.println("A média dos números é: " + media);

    }
}
