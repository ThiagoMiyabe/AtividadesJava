package ExerciciosLista3;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int anos = 0;
        float a, b;
        System.out.println("Informe o número de hab. do país A: ");
        a = (float) sc.nextFloat ();
        System.out.println("Informe o número de hab. do país B: ");
        b = (float) sc.nextFloat ();
        while (a <= b) {
            a = (float) (a * 0.03);
            b = (float) (b * 0.0015);
            anos = (int) (anos + 1);
        }
        System.out.println("O país A iguala ou ultrapassa o país B em " + anos + " anos!");
    }
}
