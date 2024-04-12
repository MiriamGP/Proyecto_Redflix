/*En esta segunda entrega el programa principal o alguna clase tendrá que tener:

- Un array o un arrayList de objetos.
- Herencia.
- Tratamiento de cadenas.
- Si es posible vectores o matrices.

@autor Miriam Guisado Pérez 
@fecha 25/02/24
*/

package PROYECTO;

import java.util.*;

//Creación de la clase abstracta Contratacion
abstract class Contratacion {
    protected int codigo;
    protected int duracion;
    protected String tituloPelicula;

//Definición de los atributos en la clase Contratacion
    public Contratacion(int codigo, int duracion, String tituloPelicula) {
        this.codigo = codigo;
        this.duracion = duracion;
        this.tituloPelicula = tituloPelicula;
    }

    //Getters y Setters
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getTituloPelicula() {
        return tituloPelicula;
    }

    public void setTituloPelicula(String tituloPelicula) {
        this.tituloPelicula = tituloPelicula;
    }

    // Método abstracto para mostrar detalles de la contratación
    public abstract void mostrarDetalles();
}

// Clase para representar la contratación de una película
class ContratacionPelicula extends Contratacion {
    private double precioPelicula;

    // Constructor de la clase ContratacionPelicula
    public ContratacionPelicula(int codigo, int duracion, String tituloPelicula, double precioPelicula) {
        super(codigo, duracion, tituloPelicula);
        this.precioPelicula = precioPelicula;
    }

    // Get y Set
    public double getPrecioPelicula() {
        return precioPelicula;
    }

    public void setPrecioPelicula(double precioPelicula) {
        this.precioPelicula = precioPelicula;
    }

    // Método para mostrar detalles de la contratación de película
    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles de Contratación de Película:");
        System.out.println("ID: " + codigo);
        System.out.println("Duración: " + duracion + " minutos");
        System.out.println("Título: " + tituloPelicula);
        System.out.println("Precio de la Película: " + precioPelicula);
    }
}

// Clase para representar la contratación de un paquete
class ContratacionPaquete extends Contratacion {
    private String nombrePaquete;

    // Constructor de la clase ContratacionPaquete
    public ContratacionPaquete(int codigo, int duracion, String tituloPelicula, String nombrePaquete) {
        super(codigo, duracion, tituloPelicula);
        this.nombrePaquete = nombrePaquete;
    }

    // Get y Set
    public String getNombrePaquete() {
        return nombrePaquete;
    }
    public void setNombrePaquete(String nombrePaquete) {
        this.nombrePaquete = nombrePaquete;
    }
 
    // Método para mostrar detalles de la contratación de paquete
    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles de Contratación de Paquete:");
        System.out.println("ID: " + codigo);
        System.out.println("Duración: " + duracion + " minutos");
        System.out.println("Título: " + tituloPelicula);
        System.out.println("Nombre del Paquete: " + nombrePaquete);
    }
}

// Clase principal
public class Entrega2Proyecto {
    public static void main(String[] args) {
        ArrayList<Contratacion> contrataciones = new ArrayList<>();

        //Película
        ContratacionPelicula contratacionPelicula1 = new ContratacionPelicula(1, 130, "Shrek", 50.5);
        contrataciones.add(contratacionPelicula1);

        //Paquete con contenido "exclusivo"
        ContratacionPaquete contratacionPaquete1 = new ContratacionPaquete(2, 30, "Shrek", "Paquete Premium");
        contrataciones.add(contratacionPaquete1);

        //Detalle de contrataciones
        for (Contratacion contratacion : contrataciones) {
            contratacion.mostrarDetalles();
            System.out.println();  
        }
    }
}

    

