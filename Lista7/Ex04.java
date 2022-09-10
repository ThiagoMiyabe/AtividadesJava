package Lista7;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        // Falta o nao conter numeros repetidos
        Scanner sc = new Scanner(System.in);

        int [] vetorA = new int[10];
        int [] vetorB = new int[10];
        String uniao[] = new String[20];
        int ind = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o "+(i+1)+"º número do vetor A: ");
            vetorA[i] = sc.nextInt();
        }
        for (int j = 0; j < 10; j++) {
            System.out.println("Digite o "+(j+1)+"º número do vetor B: ");
            vetorB[j] = sc.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            boolean achou = false;
            for(int j = 0; j < uniao.length; j++) {
                if(uniao[j] == null) {
                    break;
                }
                if(vetorA[i] == Integer.parseInt(uniao[j])) {
                    achou = true;
                }
            }
            if(!achou) {
                uniao[ind] = String.valueOf(vetorA[i]);
                ind++;
            }
        }
        for (int i = 0; i < 10; i++) {
            boolean achou = false;
            for(int j = 0; j < uniao.length; j++) {
                if(uniao[j] == null) {
                    break;
                }
                if(vetorB[i] == Integer.parseInt(uniao[j])) {
                    achou = true;
                }
            }
            if(!achou) {
                uniao[ind] = String.valueOf(vetorB[i]);
                ind++;
            }
        }

        for(String numero: uniao) {
            if(numero != null) {
                System.out.println(numero);
            }
        }
    }
}
