package Lista8;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matriz[][] = new int[5][5];
        int x;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.println("Digite o "+(j+1)+"º número da "+(i+1)+" linha: ");
                matriz[i][j] = sc.nextInt();
            }
        }
        System.out.println("Digite o número que deseja procurar: ");
        x = sc.nextInt();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[i][j] == x) {
                    System.out.println("Número encontrado na posição matriz["+i+"]["+j+"]");
                    break;
                } else if (i == 4 && j == 4 && matriz[i][j] != x) {
                    System.out.println("Número não encontrado.");
                }
            }
        }
    }
}
