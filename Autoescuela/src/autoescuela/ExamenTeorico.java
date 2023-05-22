/*
 * Clase 'ExamenTeorico'
 * -> Clase que almacena todo lo relativo a los exámenes teóricos de los alumnos de la autoescuela, y que hereda de la clase 'Examen'
 */
package autoescuela;

/**
 *
 * @author camer
 */
public class ExamenTeorico extends Examen {

    // Atributos de la clase 'Examen'
    private int numeroDeFallos;

    // Constructor de la clase 'Examen'
    public ExamenTeorico(Alumno alumno, String fecha, String hora, String lugar, String calificacion, int numeroDeFallos) {
        super(alumno, fecha, hora, lugar, calificacion);
        this.numeroDeFallos = numeroDeFallos;
    }

    public int getNumeroDeFallos() {
        return numeroDeFallos;
    }

    public void setNumeroDeFallos(int numeroDeFallos) {
        this.numeroDeFallos = numeroDeFallos;
    }

    @Override
    public String toString() {
        return super.toString() + "\nNúmero de fallos: " + numeroDeFallos;
    }
}
