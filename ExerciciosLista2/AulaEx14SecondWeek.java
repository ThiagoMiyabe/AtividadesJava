package ExerciciosLista2;

import java.util.Scanner;

public class AulaEx14SecondWeek {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        int lado;
        float cm, areaQuadrado;
        System.out.println("Informe o número de lados: ");
        lado = (int) ler.nextInt ();
        System.out.println("Informe a quantidade em centimetros: ");
        cm = (float) ler.nextFloat ();
        areaQuadrado = cm*cm;
        if (lado == 3) {
            System.out.println("Triangulo");
        } else if (lado == 4){
            System.out.println("Quadrado" + " Com " + areaQuadrado + " cm²");
        } else if (lado == 5){
            System.out.println("Pentagono");
        } else if (lado < 3){
            System.out.println ("Não é um poligono");
        } else if (lado > 5){
            System.out.println("Poligono não identificado!");
        }
    }
}
