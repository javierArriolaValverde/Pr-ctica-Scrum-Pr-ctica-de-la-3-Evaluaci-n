/*
 * Clase 'Examen'
 * -> Clase que almacena todo lo relativo a los exámenes de los alumnos de la autoescuela, y que implementa la interfaz 'Comparable'
 */
package autoescuela;

import java.io.Serializable;

/**
 *
 * @author camer
 */
public class Examen implements Serializable, Comparable<Examen> {

    // Atributos de la clase 'Examen'
    private static final long serialVersionUID = 1;
    protected final Alumno alumno;
    protected String fecha;
    protected String hora;
    protected String lugar;
    protected String calificacion;

    // Constructor de la clase 'Examen'
    public Examen(Alumno alumno, String fecha, String hora, String lugar, String calificacion) {
        this.alumno = alumno;
        this.fecha = fecha;
        this.hora = hora;
        this.lugar = lugar;
        this.calificacion = calificacion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(String calificacion) {
        this.calificacion = calificacion;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    @Override
    public String toString() {
        return "Fecha: " + fecha + "\nHora: " + hora + "\nLugar: " + lugar + "\nCalificacion: " + calificacion;
    }

    // Método compareTo(), que devuelve -1, 0 ó 1 en función del resultado de la comparación (que, en este caso, es por fecha)
    @Override
    public int compareTo(Examen e) {
        return fecha.compareTo(e.fecha);
    }
}
