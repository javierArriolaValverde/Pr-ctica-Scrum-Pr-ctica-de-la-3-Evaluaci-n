/*
 * Clase 'Matricula'
 * -> Clase que almacena todo lo relativo a las matrículas de los alumnos de la autoescuela, y que implementa la interfaz 'Comparable'
 */
package autoescuela;

import java.io.Serializable;

/**
 *
 * @author camer
 */
public class Matricula implements Serializable, Comparable<Matricula> {

    // Atributos de la clase 'Matricula'
    private static final long serialVersionUID = 1;
    private final Alumno alumno;
    private final String fecha;
    private boolean pagado;

    // Constructor de la clase 'Matricula'
    public Matricula(Alumno alumno, String fecha, boolean pagado) {
        this.alumno = alumno;
        this.fecha = fecha;
        this.pagado = pagado;
    }

    public String getFecha() {
        return fecha;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public boolean isPagado() {
        return pagado;
    }

    public void setPagado(boolean pagado) {
        this.pagado = pagado;
    }

    @Override
    public String toString() {
        return "Datos del alumno matriculado:\n" + alumno + "\nFecha de matriculación: " + fecha + "\nPagada: " + (pagado == true ? "Sí" : "No");
    }

    // Método compareTo(), que devuelve -1, 0 ó 1 en función del resultado de la comparación (que, en este caso, es por apellidos de los alumnnos)
    @Override
    public int compareTo(Matricula m) {
        return alumno.getApellidos().compareTo(m.getAlumno().getApellidos());
    }

}
