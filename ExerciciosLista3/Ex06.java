package ExerciciosLista3;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int op;
        System.out.println("Gostaria de ver o vetor em pé ou deitado?" + "\n" + "1 - Em pé" + "\n" + "2 - Deitado");
        op = (int) sc.nextInt ();
        switch(op) {
            case 1:
                for (int i = 1; i <= 20; i = i + 1){
                    System.out.println(i);
                }
                break;
            case 2:
                for (int j = 1; j <= 20; j = j + 1){
                    System.out.print (j + ", ");
                }
                break;
        }
    }
}
