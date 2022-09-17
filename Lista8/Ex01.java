package Lista8;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matriz[][] = new int[4][4];
        int numeroMaiorQue10 = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.println("Digite um número: ");
                matriz[i][j] = sc.nextInt();
                if (matriz[i][j] > 10 ) {
                    numeroMaiorQue10++;
                }
            }
        }
        System.out.println("Existem "+numeroMaiorQue10+" números maior que 10.");
    }
}
