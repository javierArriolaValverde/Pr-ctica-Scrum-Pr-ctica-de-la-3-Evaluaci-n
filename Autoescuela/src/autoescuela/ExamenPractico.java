/*
 * Clase 'ExamenPractico'
 * -> Clase que almacena todo lo relativo a los exámenes prácticos de los alumnos de la autoescuela, y que hereda de la clase 'Examen'
 */
package autoescuela;

/**
 *
 * @author camer
 */
public class ExamenPractico extends Examen {

    // Atributos de la clase 'Examen'
    private Profesor acompaniante;

    // Constructor de la clase 'Examen'
    public ExamenPractico(Alumno alumno, String fecha, String hora, String lugar, String calificacion, Profesor acompaniante) {
        super(alumno, fecha, hora, lugar, calificacion);
        this.acompaniante = acompaniante;
    }

    public Profesor getAcompaniante() {
        return acompaniante;
    }

    public void setAcompaniante(Profesor acompaniante) {
        this.acompaniante = acompaniante;
    }

    @Override
    public String toString() {
        return super.toString() + "\nDatos del profesor acompañante:\n" + acompaniante;
    }

}
