/*
 * Clase 'Profesor'
 * -> Clase que almacena todo lo relativo a los profesores de la autoescuela, y que hereda de la clase 'Persona' 
 */
package autoescuela;

/**
 *
 * @author camer
 */
public class Profesor extends Persona {

    // Atributos de la clase Persona
    private final int numeroDeLicencia;

    // Constructor de la clase Persona
    public Profesor(String nombre, String apellidos, int telefono, int numeroDeLicencia) {
        super(nombre, apellidos, telefono);
        this.numeroDeLicencia = numeroDeLicencia;
    }

    public int getNumeroDeLicencia() {
        return numeroDeLicencia;
    }

    @Override
    public String toString() {
        return super.toString() + "\nNúmero de licencia: " + numeroDeLicencia;
    }

}
