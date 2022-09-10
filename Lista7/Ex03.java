package Lista7;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> numerosImpares = new ArrayList<>();
        List<Integer> numerosPares = new ArrayList<>();

        int numero, somaPar = 0;

        for (int i = 0; i < 6; i++) {
            System.out.println("Insira o "+(i+1)+"° numero: ");
            numero = sc.nextInt();
            if (numero % 2 == 0){
                numerosPares.add(numero);
                somaPar += numero;
            }else{
                numerosImpares.add(numero);
            }
        }
        System.out.println("Números pares digitados: " + numerosPares);
        System.out.println("Soma dos números pares: " + somaPar);
        System.out.println("Números ímpares digitados: " + numerosImpares);
        System.out.println("Quantidade de ímpares digitados: " + numerosImpares.size());
    }
}
