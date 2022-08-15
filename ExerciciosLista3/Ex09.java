package ExerciciosLista3;

public class Ex09 {
    public static void main(String[] args) {
        System.out.println("Os números ímpares entre 1 e 50 são");
        for (int num = 1; num <= 50; num++) {
            if ((num % 2) == 1) {
                System.out.println(num);
            }
        }
    }
}
