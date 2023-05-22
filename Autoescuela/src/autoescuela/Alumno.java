/*
 * Clase 'Alumno'
 * -> Clase que almacena todo lo relativo a los alumnos de la autoescuela, y que hereda de la clase 'Persona'
 */
package autoescuela;

/**
 *
 * @author camer
 */
public class Alumno extends Persona {

    // Atributos de la clase 'Alumno'
    private final String dni;
    private String domicilio;
    private final String fechaDeNacimiento;

    // Constructor de la clase 'Alumno'
    public Alumno(String nombre, String apellidos, int telefono, String dni, String domicilio, String fechaDeNacimiento) {
        super(nombre, apellidos, telefono);
        this.dni = dni;
        this.domicilio = domicilio;
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public String getDni() {
        return dni;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    @Override
    public String toString() {
        return super.toString() + "\nDNI: " + dni + "\nDomicilio: " + domicilio + "\nFecha de nacimiento: " + fechaDeNacimiento;
    }

}
