package ExerciciosLista2;

import java.util.Scanner;

public class AulaEx2SecondWeek {
    public static void main(String[] args) {
        String nome, sexo, estadoCivil;
        int tempoCasada;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        nome = sc.next();
        System.out.println("Informe seu sexo [M-masculino, F-feminino]");
        sexo = sc.next();
        System.out.println("Informe o estado civil [S-Solteira ou C-Casada]");
        estadoCivil = sc.next();

        if (sexo.equals("F") && estadoCivil.equals("Casada")) {
            System.out.println("Informe o tempo de casada (anos)");
            tempoCasada = sc.nextInt();
        }
    }
}
