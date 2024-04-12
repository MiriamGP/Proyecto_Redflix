/*
 * Autor: Alfred Thomas Comanescu
 */

public class TestContenido {

    //MAIN
    public static void main(String[] args) {

            /* Si en caso de ser adminitrador podemos crear una secuencia donde él pueda añadir contenido y almacenarlo 
            * para a si el usuario introduciendo una de las 3 caracteristicas(título, duración o 
            * genero, salgan las peliculas siguiendo las caracteristicas. )
            * En este caso he introducido uno ejemplo para cada caso.
            */
            
        Pelicula pelicula = new Pelicula("Fast & Furious 8", 149, "Acción");
        Series serie = new Series("Stranger Things", 50, 3, "Misterio");

        System.out.println("\n\n Pelicula: " + pelicula.getTitulo() + "\n Duracion de la pelicula "+ pelicula.getDuracion() +" minutos \n Género: " + pelicula.getGenero() + "\n\n");
        System.out.println(" Serie: " + serie.getTitulo() + "\n Duracion media por capitulo: " + serie.getDuracion() + " minutos \n Numero de temporadas: " + serie.getTemporadas() + "\n Genero: "+ serie.getGenero());
    }
}
    
