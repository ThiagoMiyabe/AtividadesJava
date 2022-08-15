package ExerciciosLista3;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        String nome,password;
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("Entre com o seu nome:");
            nome=sc.next();
            System.out.println("Entre com o seu password:");
            password=sc.next();

            if(nome.equals(password)){
                System.out.println("Erro! Password nao pode ser igual ao seu nome!");
            }

        }while(nome.equals(password));

        System.out.println("Ok!");
    }
}
