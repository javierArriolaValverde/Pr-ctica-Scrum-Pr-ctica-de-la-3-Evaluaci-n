/*
 * Clase 'Persona'
 * -> Clase que almacena todo lo relativo a las personas que forman parte de la autoescuela, y que implementa la interfaz 'Comparable'
 */
package autoescuela;

import java.io.Serializable;

/**
 *
 * @author camer
 */
public class Persona implements Serializable, Comparable<Persona> {

    // Atributos de la clase 'Persona'
    private static final long serialVersionUID = 1;
    protected String nombre;
    protected String apellidos;
    protected int telefono;

    // Constructor de la clase 'Persona'
    public Persona(String nombre, String apellidos, int telefono) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\nApellidos: " + apellidos + "\nTeléfono: " + telefono;
    }

    // Método compareTo(), que devuelve -1, 0 ó 1 en función del resultado de la comparación (que, en este caso, es por apellidos)
    @Override
    public int compareTo(Persona p) {
        return apellidos.compareTo(p.apellidos);
    }
}
