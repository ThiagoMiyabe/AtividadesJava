package ExerciciosLista2;

import java.util.Scanner;

public class AulaEx9SecondWeek {
    public static void main(String[] args) {
        float altura;
        double fHomem, fMulher;
        String sexo;
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe sua altura: ");
        altura = sc.nextFloat();
        System.out.println("Informe seu sexo [M-Masculino, F-Feminino]");
        sexo = sc.next();

        fHomem = (float) (72.7*altura)-58;
        fMulher = (float) (62.1*altura)-44.7;

        if (sexo.equals("M")) {
            System.out.println("O seu peso ideal seria de " + fHomem);
        } if (sexo.equals("F")) {
            System.out.println("O seu peso ideal seria de " +fMulher);
        }
    }
}
