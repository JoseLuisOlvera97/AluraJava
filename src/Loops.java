import java.util.Scanner;

public class Loops {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double nota = 0;
        double mediaevaluaziones = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Escribe la nota que le darias a la pelicula matrix");
            nota = teclado.nextDouble();
            mediaevaluaziones = mediaevaluaziones + nota;
        }
        System.out.println("La media de evaluaciones para la pelicula matriz es " + mediaevaluaziones / 3);
    }
}
