package ExerciciosLista3;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n;
        System.out.println("Informe sua nota: ");
        n = (int) sc.nextInt ();
        if (n >= 1 || n <= 10){
            System.out.println("Sua nota é de: " + n);
        } else {
            System.out.println("Valor inválido");
        }
    }
}
