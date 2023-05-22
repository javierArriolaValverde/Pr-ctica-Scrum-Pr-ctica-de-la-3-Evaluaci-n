/*
 * Clase 'Vehiculo'
 * -> Clase que almacena todo lo relativo a los veh�culos de la autoescuela, y que implementa la interfaz 'Comparable'
 */
package autoescuela;

import java.io.Serializable;

/**
 *
 * @author camer
 */
public class Vehiculo implements Serializable, Comparable<Vehiculo> {

    // Atributos de la clase 'Vehiculo'
    private static final long serialVersionUID = 1;
    private final String modelo;
    private String color;
    private final String matricula;

    // Constructor de la clase 'Vehiculo'
    public Vehiculo(String modelo, String color, String matricula) {
        this.modelo = modelo;
        this.color = color;
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMatricula() {
        return matricula;
    }

    @Override
    public String toString() {
        return "Modelo: " + modelo + "\nColor: " + color + "\nMatr�cula: " + matricula;
    }

    // M�todo compareTo(), que devuelve -1, 0 � 1 en funci�n del resultado de la comparaci�n (que, en este caso, es por matr�cula)
    @Override
    public int compareTo(Vehiculo v) {
        return matricula.compareTo(v.matricula);
    }
}
