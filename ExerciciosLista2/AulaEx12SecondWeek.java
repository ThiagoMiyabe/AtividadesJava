package ExerciciosLista2;

import java.util.Scanner;

public class AulaEx12SecondWeek {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        int chamada, n1, n2, n3;
        float mE, mA;
        System.out.println("Informe seu número da chamada: ");
        chamada = (int) ler.nextInt ();
        System.out.println("Informe sua primeira nota: ");
        n1 = (int) ler.nextInt ();
        System.out.println("Informe sua segunda nota: ");
        n2 = (int) ler.nextInt ();
        System.out.println("Informe sua terceira nota: ");
        n3 = (int) ler.nextInt ();
        mE = (float) (n1 + n2 + n3) / 3;
        System.out.println("Sua média dos exercicios foi de: " + mE);
        mA = (float) (n1 + n2) * 2 + (n3) * 3 + (mE) / 7;
        System.out.println("Sua média de aproveitamento foi de: " + mA);
        if (mA > 90){
            System.out.println("Conceito A! Aprovado!");
        }
        if (mA < 90 && mA >= 75 ){
            System.out.println("Conceito B! Aprovado!");
        }
        if (mA < 75 && mA >= 60){
            System.out.println("Conceito C! Aprovado!");
        }
        if (mA < 60 && mA >= 40){
            System.out.println("Conceito D! Reprovado!");
        }
        if (mA < 40){
            System.out.println("Conceito E! Reprovado!");
        }
        System.out.println("Seu número da chamada: " + chamada);
        System.out.println("Notas:" + n1 + "," +  n2 + "," + n3);
        System.out.println("Média dos exercicios: " + mE);
        System.out.println("Média do aproveitamento: " + mA);
    }
}
