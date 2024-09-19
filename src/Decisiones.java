public class Decisiones {

    public static void main(String[] args) {
        int fechaDeLanzamiento = 1999;
        boolean incluidoEnElPlan = true;
        double notaDeLaPelicula = 8.2;
        String tipoplan = "Plus";
//      probador
        if (fechaDeLanzamiento >= 2022){
            System.out.println("Peliculas mas Populares");
        }else {
            System.out.println("Pelicula retro que aun vale la pena ver");
        }

        if (incluidoEnElPlan && tipoplan.equals("Plus")){
            System.out.println("Disfrute la pelicula");
        }else{
            System.out.println("Pelicula no disponible en su plan actual");
        }
    }
}
