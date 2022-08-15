package ExerciciosLista3;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String nome = null; String sexo = null; String EC = null;
        int idade, sal;
        System.out.println("Informe seu nome:");
        nome = sc.next ();
        while (nome.length () <= 3) {
            System.out.println("Inválido! Tamanho insuficiente!");
            nome = sc.next ();
        }
        System.out.println("Informe sua idade: ");
        idade = (int) sc.nextInt ();
        if (idade >= 0 || idade <= 150){
        } else {
            System.out.println("ERROR!");
            idade = (int) sc.nextInt ();
        }
        System.out.println("Informe seu salário: ");
        sal = (int) sc.nextInt ();
        if  (sal == 0 || sal <= 0){
            System.out.println("ERROR! Salário tem que ser maior qeue 0!");
            sal = (int) sc.nextInt ();
        }
        System.out.println("Informe seu sexo: " + "\n" + "F - Feminino" + "\n" + "M - Masculino");
        sexo = sc.nextLine ();
        if (sexo.equals("F") || sexo.equals ("M")){
        } else {
            System.out.println("ERROR!");
        }
        System.out.println("Informe seu estado civil: " + "\n" + "C - Casado" + "\n" + "S - Solteiro" + "\n" + "V - Viúvo" + "\n" + "D - Divorciado");
        EC = sc.nextLine ();
        if  (EC.equals ("C") || EC.equals ("S") || EC.equals ("V") || EC.equals ("D")){
        } else {
            System.out.println("ERROR!");
        }
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: " + sal);
        System.out.println("Sexo: " + sexo);
        System.out.println("Estado Civil: " + EC);
    }
}
