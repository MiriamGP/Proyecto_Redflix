/*
 * Autor: Alfred Thomas Comanescu
 */


public class Series extends Contenido {

    private int temporadas;

    //CONSTRUCTOR
    public Series(String titulo, int duracion, int temporadas, String genero){

        super(titulo, duracion, genero);
        this.temporadas = temporadas; 
    }

    //METODOS
    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }


    


}
