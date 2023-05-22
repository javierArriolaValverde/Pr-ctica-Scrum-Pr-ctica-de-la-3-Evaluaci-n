/* 
 * Clase 'Autoescuela'
 * -> Clase que almacena todo lo relativo a la autoescuela, y que maneja ficheros binarios.
 */
package autoescuela;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author camer
 */
public class Autoescuela implements Serializable {

    // Atributos de la clase 'Autoescuela'
    private static final long serialVersionUID = 1;
    private final String nombre = "Autoescuela IES Camas";
    private final String ubicacion = "C/ Programación en Java, 17";
    private List<Alumno> alumnos;
    private List<Profesor> profesores;
    private List<Vehiculo> vehiculos;
    private List<ExamenTeorico> examenesT;
    private List<ExamenPractico> examenesP;
    private List<Matricula> matriculas;

    // Constructor de la clase 'Autoescuela'
    public Autoescuela() {
        alumnos = new ArrayList();
        profesores = new ArrayList();
        vehiculos = new ArrayList();
        examenesT = new ArrayList();
        examenesP = new ArrayList();
        matriculas = new ArrayList();
    }

    public String getNombre() {
        return nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(List<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public List<Profesor> getProfesores() {
        return profesores;
    }

    public void setProfesores(List<Profesor> profesores) {
        this.profesores = profesores;
    }

    public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(List<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public List<ExamenTeorico> getExamenesT() {
        return examenesT;
    }

    public void setExamenesT(List<ExamenTeorico> examenesT) {
        this.examenesT = examenesT;
    }

    public List<ExamenPractico> getExamenesP() {
        return examenesP;
    }

    public void setExamenesP(List<ExamenPractico> examenesP) {
        this.examenesP = examenesP;
    }

    public List<Matricula> getMatriculas() {
        return matriculas;
    }

    public void setMatriculas(List<Matricula> matriculas) {
        this.matriculas = matriculas;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\nUbicación: " + ubicacion;
    }

    // Método guardarDatos(), que guarda los datos introducidos en nuestra aplicación en el fichero "autoescuela.dat"
    public static void guardarDatos(Autoescuela a) {
        try {
            ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream("autoescuela.dat"));
            salida.writeObject(a);
            salida.close();
        } catch (IOException ex) {
            System.err.println("Error al guardar los datos " + ex.getMessage());
        }
    }

    // Método cargarDatos(), que transfiere los datos almacenados en el fichero "autoescuela.dat" a nuestra aplicación 
    public static Autoescuela cargarDatos() {
        Autoescuela a;
        try {
            ObjectInputStream entrada = new ObjectInputStream(new FileInputStream("autoescuela.dat"));
            a = (Autoescuela) entrada.readObject();
            entrada.close();
        } catch (IOException | ClassNotFoundException ex) {
            a = new Autoescuela();
        }
        return a;
    }

}
