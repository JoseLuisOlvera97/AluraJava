import java.util.Scanner;

public class Lectura {

    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);
        System.out.println("Escribe el nombre de tu pelicula favorita");
        String pelicula = Teclado.nextLine();
        System.out.println("Ahora escribe la fecha de lanzamiento");
        int fechadelanzamineto = Teclado.nextInt();
        System.out.println("Que nota le das a esta pelicula");
        double nota = Teclado.nextDouble();
        System.out.println(pelicula);
        System.out.println(fechadelanzamineto);
        System.out.println(nota);
    }
}
