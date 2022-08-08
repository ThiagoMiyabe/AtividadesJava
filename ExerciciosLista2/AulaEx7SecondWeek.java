package ExerciciosLista2;

import java.util.Scanner;

public class AulaEx7SecondWeek {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um número: ");
        num = sc.nextInt();

        if (num % 2 == 0){
            System.out.println("Seu número é: " +num);
            System.out.println("Seu número somado com 5 é: " + (num+5));
        } else {
            System.out.println("Seu número é: " +num);
            System.out.println("Seu número somado com 8 é: " + (num+8));
        }
    }
}
