package ExerciciosLista3;

public class Ex04 {
    public static void main(String[] args) {
        int anos = 0;
        float a = 80000 , b = 200000;
        while  (a <= b){
            a = (float) (a * 0.03);
            b = (float) (b * 0.015);
            anos = (int) (anos + 1);
        }
        System.out.println("O país A iguala ou ultrapassa o B em " + anos + " anos!");
    }
}
