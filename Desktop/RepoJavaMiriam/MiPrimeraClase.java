/*Crea una clase de tu parte del proyecto y crea un programa de prueba que la utilice, para ver que funcionan bien los métodos creados.
Si quieres poner herencia tendrán que ser al menos 2 clases.

@autor Miriam Guisado Pérez 
@fecha 20/12/2023
*/

package PROYECTO;

import java.util.*;

class Pelicula {

    public int codigo;
    public int duracion;
    public String tituloPelicula;

    public Pelicula(int codigo, int duracion, String tituloPelicula) {
        this.codigo = codigo;
        this.duracion = duracion;
        this.tituloPelicula = tituloPelicula;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public int getDuracion() {
        return this.duracion;
    }

    public String getTituloPelicula() {
        return this.tituloPelicula;
    }

    public void mostrarDetalles() {
        System.out.println("ID: " + this.codigo);
        System.out.println("Duración: " + this.duracion + " minutos");
        System.out.println("Título: " + this.tituloPelicula);
    }
}

class ContratacionPelicula extends Pelicula {
    private double precioPelicula;

    public ContratacionPelicula(int codigo, int duracion, String tituloPelicula, double precioPelicula) {
        super(codigo, duracion, tituloPelicula);
        this.precioPelicula = precioPelicula;
    }

    public double getPrecioPelicula() {
        return this.precioPelicula;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles de Contratación de Película:");
        System.out.println("ID: " + this.codigo);
        System.out.println("Duración: " + this.duracion + " minutos");
        System.out.println("Título: " + this.tituloPelicula);
        System.out.println("Precio de la Película: " + this.precioPelicula +" euros");
    }
}

class ContratacionPaquete extends Pelicula {
    private String nombrePaquete;

    public ContratacionPaquete(int codigo, int duracion,String tituloPelicula, String nombrePaquete) {
        super(codigo, duracion, tituloPelicula);
        this.nombrePaquete = nombrePaquete;
    }

    public String getNombrePaquete() {
        return nombrePaquete;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles de Contratación de Paquete:");
        System.out.println("ID: " + this.codigo);
        System.out.println("Duración: " + this.duracion + " minutos");
        System.out.println("Título: " + this.tituloPelicula);
        System.out.println("Nombre del Paquete: " + nombrePaquete);
    }
}

public class MiPrimeraClase {
    public static void main(String[] args) {
        // Contratación de película
        ContratacionPelicula contratacionPelicula1 = new ContratacionPelicula(1, 130
        
        , "Shrek",50.5);

        // Contratación de paquete
        ContratacionPaquete contratacionPaquete1 = new ContratacionPaquete(2, 30,"Shrek", "Paquete Premium");

        // Detalles de las contrataciones
        contratacionPelicula1.mostrarDetalles();
        System.out.println();  // Salto de línea 
        contratacionPaquete1.mostrarDetalles();
    }
}