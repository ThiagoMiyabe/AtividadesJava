package ExerciciosLista2;

import java.util.Scanner;

public class AulaEx13SecondWeek {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        int lado;
        float cm, areaQuadrado;
        double areaTriangulo;
        System.out.println("Informe o número de lados: ");
        lado = (int) ler.nextInt ();
        System.out.println("Informe a medida do lado em centimetros: ");
        cm = (float) ler.nextFloat ();
        areaTriangulo = (((Math.sqrt(3)) / 4) * lado * lado);
        areaQuadrado = cm*cm;
        if (lado == 3) {
            System.out.println("Triangulo" + " Com " + areaTriangulo + " cm²");
        } else if (lado == 4){
            System.out.println("Quadrado" + " Com " + areaQuadrado + " cm²");
        } else if (lado == 5){
            System.out.println("Pentagono");
        }
    }
}
