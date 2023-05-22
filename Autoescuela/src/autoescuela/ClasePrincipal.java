/*
 * Clase 'ClasePrincipal'
 * -> Clase que contiene el m�todo main()
 * 
 * Se pide construir una aplicaci�n de gesti�n. Esta deber� estar escrita en Java, disponer de 
 * interfaz gr�fica o men�s de texto, manejar la gesti�n de objetos mediante colecciones y almacenar 
 * la informaci�n necesaria en ficheros. Tambi�n se realizar�n b�squedas y ordenaciones de datos. Se 
 * valorar� el uso de Streams y expresiones lambda en algunos de estos procesos. Se valorar� la 
 * funcionalidad de la aplicaci�n y el uso de las t�cnicas de programaci�n vistas en clase.
 * El c�digo deber� ser claro y tener comentarios donde sea necesario. Posteriormente a la entrega 
 * habr� que defender la pr�ctica para explicar su funcionamiento y demostrar la autor�a.
 */
package autoescuela;

import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author camer
 */
public class ClasePrincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Autoescuela autoescuela = Autoescuela.cargarDatos();
        System.out.println(autoescuela);
        int opcion;
        while ((opcion = menu()) != 1) {
            switch (opcion) {
                case 2:
                    mostrarAlumnos(autoescuela);
                    break;
                case 3:
                    introducirAlumno(autoescuela);
                    break;
                case 4:
                    modificarAlumno(autoescuela);
                    break;
                case 5:
                    eliminarAlumno(autoescuela);
                    break;
                case 6:
                    ordenarAlumnosPorApellidosNombre(autoescuela);
                    break;
                case 7:
                    mostrarProfesores(autoescuela);
                    break;
                case 8:
                    introducirProfesor(autoescuela);
                    break;
                case 9:
                    modificarProfesor(autoescuela);
                    break;
                case 10:
                    eliminarProfesor(autoescuela);
                    break;
                case 11:
                    ordenarProfesoresPorApellidos(autoescuela);
                    break;
                case 12:
                    mostrarVehiculos(autoescuela);
                    break;
                case 13:
                    introducirVehiculo(autoescuela);
                    break;
                case 14:
                    modificarVehiculo(autoescuela);
                    break;
                case 15:
                    eliminarVehiculo(autoescuela);
                    break;
                case 16:
                    ordenarVehiculosPorMatricula(autoescuela);
                    break;
                case 17:
                    mostrarMatriculas(autoescuela);
                    break;
                case 18:
                    introducirMatricula(autoescuela);
                    break;
                case 19:
                    modificarMatricula(autoescuela);
                    break;
                case 20:
                    eliminarMatricula(autoescuela);
                    break;
                case 21:
                    ordenarMatriculasPorApellidos(autoescuela);
                    break;
                case 22:
                    mostrarExamenesTeoricos(autoescuela);
                    break;
                case 23:
                    introducirExamenTeorico(autoescuela);
                    break;
                case 24:
                    modificarExamenTeorico(autoescuela);
                    break;
                case 25:
                    eliminarExamenTeorico(autoescuela);
                    break;
                case 26:
                    ordenarExamenesTeoricosPorFecha(autoescuela);
                    break;
                case 27:
                    mostrarExamenesPracticos(autoescuela);
                    break;
                case 28:
                    introducirExamenPractico(autoescuela);
                    break;
                case 29:
                    modificarExamenPractico(autoescuela);
                    break;
                case 30:
                    eliminarExamenPractico(autoescuela);
                    break;
                case 31:
                    ordenarExamenesPracticosPorFecha(autoescuela);
                    break;
                case 32:
                    mostrarDatos(autoescuela);
                    break;
            }
        }
        Autoescuela.guardarDatos(autoescuela);
    }

    // M�todo menu(), que muestra en la consola las diferentes funciones que tiene nuestra aplicaci�n
    public static int menu() {
        System.out.println();
        System.out.println("-------------------------------------------------------------");
        System.out.println("                          M E N �");
        System.out.println("-------------------------------------------------------------");
        System.out.println(" 1 - Salir de la aplicaci�n");
        System.out.println(" 2 - Mostrar los alumnos de la autoescuela");
        System.out.println(" 3 - Introducir un alumno nuevo");
        System.out.println(" 4 - Modificar los datos de un alumno");
        System.out.println(" 5 - Eliminar un alumno");
        System.out.println(" 6 - Ordenar los alumnos por apellidos y, despu�s, por nombre");
        System.out.println(" 7 - Mostrar los profesores de la autoescuela");
        System.out.println(" 8 - Introducir un profesor nuevo");
        System.out.println(" 9 - Modificar los datos de un profesor");
        System.out.println("10 - Eliminar un profesor");
        System.out.println("11 - Ordenar los profesores por apellidos");
        System.out.println("12 - Mostrar los veh�culos de la autoescuela");
        System.out.println("13 - Introducir un veh�culo nuevo");
        System.out.println("14 - Modificar los datos de un veh�culo");
        System.out.println("15 - Eliminar un veh�culo");
        System.out.println("16 - Ordenar los veh�culos por matr�cula");
        System.out.println("17 - Mostrar las matr�culas de los alumnos de la autoescuela");
        System.out.println("18 - Introducir una matr�cula nueva");
        System.out.println("19 - Modificar los datos de una matr�cula");
        System.out.println("20 - Eliminar una matr�cula");
        System.out.println("21 - Ordenar las matr�culas por apellidos");
        System.out.println("22 - Mostrar el registro de los ex�menes te�ricos");
        System.out.println("23 - Introducir un examen te�rico nuevo");
        System.out.println("24 - Modificar los datos de un examen te�rico");
        System.out.println("25 - Eliminar un examen te�rico");
        System.out.println("26 - Ordenar los ex�menes te�ricos por fecha");
        System.out.println("27 - Mostrar el registro de los ex�menes pr�cticos");
        System.out.println("28 - Introducir un examen pr�ctico nuevo");
        System.out.println("29 - Modificar los datos de un examen pr�ctico");
        System.out.println("30 - Eliminar un examen pr�ctico");
        System.out.println("31 - Ordenar los ex�menes pr�cticos por fecha");
        System.out.println("32 - Mostrar todos los datos de la autoescuela");
        Scanner sc = new Scanner(System.in, "ISO-8859-1");
        int opcion = 1;
        do {
            try {
                opcion = sc.nextInt();
            } catch (InputMismatchException e) {
                System.err.println("Error. Por favor, 3introduzca un valor comprendido entre el 1 y el 32.");
            }
        } while (opcion < 1 || opcion > 32);
        System.out.println();
        return opcion;
    }

    // M�todo mostrarAlumnos(), que muestra los alumnos almacenados en la aplicaci�n (si los hubiera)
    public static void mostrarAlumnos(Autoescuela autoescuela) {
        List<Alumno> alumnos = autoescuela.getAlumnos();
        if (alumnos.isEmpty()) {
            System.out.println("No hay alumnos que mostrar.");
        } else {
            System.out.println("Alumnos");
            System.out.println("-------");
            int i = 1;
            for (Alumno a : alumnos) {
                System.out.println(i + " - " + a);
                i++;
            }
        }
    }

    // M�todo introducirAlumno(), que registra un nuevo alumno en la aplicaci�n
    public static void introducirAlumno(Autoescuela autoescuela) {
        Scanner sc = new Scanner(System.in, "ISO-8859-1");
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Apellidos: ");
        String apellidos = sc.nextLine();
        System.out.print("Tel�fono (xxxxxxxxx): ");
        try {
            int telefono = sc.nextInt();
            telefono = comprobarTelefono(telefono);
            sc.nextLine();
            System.out.print("DNI: ");
            String dni = sc.nextLine();
            dni = comprobarDni(dni);
            System.out.print("Domicilio: ");
            String domicilio = sc.nextLine();
            System.out.print("Fecha de nacimiento (yyyy/MM/dd): ");
            String fechaNac = sc.nextLine();
            Alumno alumnoNuevo = new Alumno(nombre, apellidos, telefono, dni.toUpperCase(), domicilio, fechaNac);
            autoescuela.getAlumnos().add(alumnoNuevo);
        } catch (InputMismatchException e) {
            System.err.println("Error. Por favor, introduzca un n�mero de tel�fono v�lido.");
        }
    }

    // M�todo modificarAlumno(), que permite modificar algunos datos de un alumno almacenado (si lo hubiera)
    public static void modificarAlumno(Autoescuela autoescuela) {
        Scanner sc = new Scanner(System.in, "ISO-8859-1");
        List<Alumno> alumnos = autoescuela.getAlumnos();
        if (alumnos.isEmpty()) {
            System.out.println("No hay alumnos que modificar.");
        } else {
            mostrarAlumnos(autoescuela);
            System.out.print("Introduzca el �ndice del alumno cuyos datos quiere modificar: ");
            int indice = sc.nextInt();
            try {
                Alumno alumno = alumnos.get(indice - 1);
                int respuesta = -1;
                while (respuesta != 0) {
                    System.out.println("Qu� datos quiere modificar? Elija una opci�n:");
                    System.out.println("0 - Ninguno m�s");
                    System.out.println("1 - Nombre");
                    System.out.println("2 - Apellidos");
                    System.out.println("3 - Tel�fono");
                    System.out.println("4 - Domicilio");
                    try {
                        respuesta = sc.nextInt();
                        switch (respuesta) {
                            case 0:
                                break;
                            case 1:
                                sc.nextLine();
                                System.out.print("Introduzca el nuevo nombre del alumno: ");
                                String nombre = sc.nextLine();
                                alumno.setNombre(nombre);
                                break;
                            case 2:
                                sc.nextLine();
                                System.out.print("Introduzca los nuevos apellidos del alumno: ");
                                String apellidos = sc.nextLine();
                                alumno.setApellidos(apellidos);
                                break;
                            case 3:
                                System.out.print("Introduzca el nuevo tel�fono (xxxxxxxxx) del alumno: ");
                                try {
                                    int telefono = sc.nextInt();
                                    telefono = comprobarTelefono(telefono);
                                    sc.nextLine();
                                    alumno.setTelefono(telefono);
                                    break;
                                } catch (InputMismatchException e) {
                                    System.err.println("Error. Por favor, introduzca un n�mero de tel�fono v�lido.");
                                }
                            case 4:
                                sc.nextLine();
                                System.out.print("Introduzca el nuevo domicilio del alumno: ");
                                String domicilio = sc.nextLine();
                                alumno.setDomicilio(domicilio);
                                break;
                            default:
                                System.out.println("Introduzca una opci�n comprendida entre el 0 y el 4.");
                                break;
                        }
                    } catch (InputMismatchException e) {
                        System.err.println("Error. Por favor, introduzca un valor comprendido entre el 0 y el 4.");
                    }
                }
            } catch (IndexOutOfBoundsException e) {
                System.err.println("No existe el alumno " + indice + ".");
            }
        }
    }

    // M�todo eliminarAlumno(), que eliminina un alumno almacenado (si lo hubiera)
    public static void eliminarAlumno(Autoescuela autoescuela) {
        Scanner sc = new Scanner(System.in, "ISO-8859-1");
        if (autoescuela.getAlumnos().isEmpty()) {
            System.out.println("No hay alumnos que eliminar.");
        } else {
            mostrarAlumnos(autoescuela);
            System.out.print("Introduzca el �ndice del alumno a eliminar: ");
            int i = sc.nextInt();
            try {
                autoescuela.getAlumnos().remove(i - 1);
            } catch (IndexOutOfBoundsException e) {
                System.err.println("No existe el alumno " + i + ".");
            }
        }
    }

    // M�todo ordenarAlumnosPorApellidosNombre(), que ordena los alumnos de la autoescuela (si los hubiera y fueran m�s de uno) por apellidos y, despu�s, por nombre
    public static void ordenarAlumnosPorApellidosNombre(Autoescuela autoescuela) {
        List<Alumno> alumnos = autoescuela.getAlumnos();
        if (alumnos.isEmpty()) {
            System.out.println("No hay alumnos que ordenar.");
        } else {
            if (alumnos.size() == 1) {
                System.out.println("La autoescuela solo tiene almacenado un alumno.");
            } else {
                // Expresi�n lambda:
                Collections.sort(alumnos, (a1, a2) -> (a1.getApellidos() + a1.getNombre()).compareTo(a2.getApellidos() + a2.getNombre()));
                mostrarAlumnos(autoescuela);
            }
        }
    }

    // M�todo mostrarProfesores(), que muestra los profesores almacenados en la aplicaci�n (si los hubiera)
    public static void mostrarProfesores(Autoescuela autoescuela) {
        List<Profesor> profesores = autoescuela.getProfesores();
        if (profesores.isEmpty()) {
            System.out.println("No hay profesores que mostrar.");
        } else {
            System.out.println("Profesores");
            System.out.println("----------");
            int i = 1;
            for (Profesor p : profesores) {
                System.out.println(i + " - " + p);
                i++;
            }
        }
    }

    // M�todo introducirProfesor(), que registra un profesor en la aplicaci�n
    public static void introducirProfesor(Autoescuela autoescuela) {
        Scanner sc = new Scanner(System.in, "ISO-8859-1");
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Apellidos: ");
        String apellidos = sc.nextLine();
        System.out.print("Tel�fono (xxxxxxxxx): ");
        try {
            int telefono = sc.nextInt();
            telefono = comprobarTelefono(telefono);
            sc.nextLine();
            System.out.print("N�mero de licencia: ");
            int numeroLicencia = sc.nextInt();
            Profesor profesorNuevo = new Profesor(nombre, apellidos, telefono, numeroLicencia);
            autoescuela.getProfesores().add(profesorNuevo);
        } catch (InputMismatchException e) {
            System.err.println("Error. Por favor, introduzca los datos apropiados.");
        }
    }

    // M�todo modificarProfesor(), que permite modificar algunos datos de un profesor (si lo hubiera)
    public static void modificarProfesor(Autoescuela autoescuela) {
        Scanner sc = new Scanner(System.in, "ISO-8859-1");
        List<Profesor> profesores = autoescuela.getProfesores();
        if (profesores.isEmpty()) {
            System.out.println("No hay profesores que modificar.");
        } else {
            mostrarProfesores(autoescuela);
            System.out.print("Introduzca el �ndice del profesor cuyos datos quiere modificar: ");
            int indice = sc.nextInt();
            try {
                Profesor profesor = profesores.get(indice - 1);
                int respuesta = -1;
                while (respuesta != 0) {
                    System.out.println("Qu� datos quiere modificar? Elija una opci�n:");
                    System.out.println("0 - Ninguno m�s");
                    System.out.println("1 - Nombre");
                    System.out.println("2 - Apellidos");
                    System.out.println("3 - Tel�fono");
                    try {
                        sc.nextLine();
                        respuesta = sc.nextInt();
                        switch (respuesta) {
                            case 0:
                                break;
                            case 1:
                                sc.nextLine();
                                System.out.print("Introduzca el nuevo nombre del alumno: ");
                                String nombre = sc.nextLine();
                                profesor.setNombre(nombre);
                                break;
                            case 2:
                                sc.nextLine();
                                System.out.print("Introduzca los nuevos apellidos del alumno: ");
                                String apellidos = sc.nextLine();
                                profesor.setApellidos(apellidos);
                                break;
                            case 3:
                                System.out.print("Introduzca el nuevo tel�fono (xxxxxxxxx) del alumno: ");
                                try {
                                    int telefono = sc.nextInt();
                                    telefono = comprobarTelefono(telefono);
                                    sc.nextLine();
                                    profesor.setTelefono(telefono);
                                    break;
                                } catch (InputMismatchException e) {
                                    System.err.println("Error. Por favor, introduzca un n�mero de tel�fono v�lido.");
                                }
                            default:
                                System.out.println("Introduzca una opci�n comprendida entre el 0 y el 39.");
                                break;
                        }
                    } catch (InputMismatchException e) {
                        System.err.println("Error. Por favor, introduzca un valor comprendido entre el 0 y el 3.");
                    }
                }
            } catch (IndexOutOfBoundsException e) {
                System.err.println("No existe el profesor " + indice + ".");
            }
        }
    }

    // M�todo eliminarProfesor(), que eliminina un profesor almacenado (si lo hubiera)
    public static void eliminarProfesor(Autoescuela autoescuela) {
        Scanner sc = new Scanner(System.in, "ISO-8859-1");
        if (autoescuela.getProfesores().isEmpty()) {
            System.out.println("No hay profesores que eliminar.");
        } else {
            mostrarProfesores(autoescuela);
            System.out.print("Introduzca el �ndice del profesor a eliminar: ");
            int i = sc.nextInt();
            try {
                autoescuela.getProfesores().remove(i - 1);
            } catch (IndexOutOfBoundsException e) {
                System.err.println("No existe el profesor " + i + ".");
            }
        }
    }

    // M�todo ordenarProfesoresPorApellidos(), que ordena los profesores de la autoescuela (si los hubiera y fueran m�s de uno) por apellidos
    public static void ordenarProfesoresPorApellidos(Autoescuela autoescuela) {
        List<Profesor> profesores = autoescuela.getProfesores();
        if (profesores.isEmpty()) {
            System.out.println("No hay profesores que ordenar.");
        } else {
            if (profesores.size() == 1) {
                System.out.println("La autoescuela solo tiene almacenado un profesor.");
            } else {
                Collections.sort(profesores);
                mostrarProfesores(autoescuela);
            }
        }
    }

    // M�todo mostrarVehiculos(), que muestra los veh�culos almacenados en la aplicaci�n (si los hubiera)
    public static void mostrarVehiculos(Autoescuela autoescuela) {
        List<Vehiculo> vehiculos = autoescuela.getVehiculos();
        if (vehiculos.isEmpty()) {
            System.out.println("No hay veh�culos que mostrar.");
        } else {
            System.out.println("Veh�culos");
            System.out.println("---------");
            int i = 1;
            for (Vehiculo v : vehiculos) {
                System.out.println(i + " - " + v);
                i++;
            }
        }
    }

    // M�todo introducirVehiculo(), que registra un veh�culo en la aplicaci�n
    public static void introducirVehiculo(Autoescuela autoescuela) {
        Scanner sc = new Scanner(System.in, "ISO-8859-1");
        System.out.print("Modelo: ");
        String modelo = sc.nextLine();
        System.out.print("Color: ");
        String color = sc.nextLine();
        System.out.print("Matr�cula: ");
        String matricula = sc.nextLine();
        matricula = comprobarMatricula(matricula);
        Vehiculo vehiculoNuevo = new Vehiculo(modelo, color, matricula);
        autoescuela.getVehiculos().add(vehiculoNuevo);
    }

    // M�todo modificarVehiculo(), que permite modificar el color de un veh�culo almacenado (si lo hubiera)
    public static void modificarVehiculo(Autoescuela autoescuela) {
        Scanner sc = new Scanner(System.in, "ISO-8859-1");
        List<Vehiculo> vehiculos = autoescuela.getVehiculos();
        if (vehiculos.isEmpty()) {
            System.out.println("No hay veh�culos que modificar.");
        } else {
            mostrarVehiculos(autoescuela);
            System.out.print("Introduzca el �ndice del veh�culo cuyos datos quiere modificar: ");
            int indice = sc.nextInt();
            try {
                Vehiculo vehiculo = vehiculos.get(indice - 1);
                sc.nextLine();
                System.out.print("Introduzca el nuevo color del veh�culo: ");
                String color = sc.nextLine();
                vehiculo.setColor(color);
            } catch (IndexOutOfBoundsException e) {
                System.err.println("No existe el veh�culo " + indice + ".");
            }
        }
    }

    // M�todo eliminarVehiculo(), que elimina un veh�culo almacenado (si lo hubiera)
    public static void eliminarVehiculo(Autoescuela autoescuela) {
        Scanner sc = new Scanner(System.in, "ISO-8859-1");
        if (autoescuela.getVehiculos().isEmpty()) {
            System.out.println("No hay veh�culos que eliminar.");
        } else {
            mostrarVehiculos(autoescuela);
            System.out.print("Introduzca el �ndice del veh�culo a eliminar: ");
            int i = sc.nextInt();
            try {
                autoescuela.getVehiculos().remove(i - 1);
            } catch (IndexOutOfBoundsException e) {
                System.err.println("No existe el veh�culo " + i + ".");
            }
        }
    }

    // M�todo ordenarVehiculosPorMatricula(), que ordena los veh�culos de la autoescuela (si los hubiera y fuesen m�s de uno) por matr�cula
    public static void ordenarVehiculosPorMatricula(Autoescuela autoescuela) {
        List<Vehiculo> vehiculos = autoescuela.getVehiculos();
        if (vehiculos.isEmpty()) {
            System.out.println("No hay veh�culos que ordenar.");
        } else {
            if (vehiculos.size() == 1) {
                System.out.println("La autoescuela solo tiene almacenado un veh�culo.");
            } else {
                Collections.sort(vehiculos);
                mostrarVehiculos(autoescuela);
            }
        }
    }

    // M�todo mostrarMatriculas(), que muestra las matr�culas registradas en la aplicaci�n (si las hubiera)
    public static void mostrarMatriculas(Autoescuela autoescuela) {
        List<Matricula> matriculas = autoescuela.getMatriculas();
        if (matriculas.isEmpty()) {
            System.out.println("No hay matr�culas que mostrar.");
        } else {
            System.out.println("Matr�culas");
            System.out.println("----------");
            int i = 1;
            for (Matricula m : matriculas) {
                System.out.println(i + " - " + m);
                i++;
            }
        }
    }

    // M�todo introducirMatricula(), que registra una matr�cula en la aplicaci�n
    public static void introducirMatricula(Autoescuela autoescuela) {
        Scanner sc = new Scanner(System.in, "ISO-8859-1");
        mostrarAlumnos(autoescuela);
        System.out.print("Introduzca el �ndice del alumno cuya matr�cula quiere registrar: ");
        int indice = sc.nextInt();
        try {
            List<Alumno> alumnos = autoescuela.getAlumnos();
            Alumno alumno = alumnos.get(indice - 1);
            Date fechaHoy = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
            String fecha = sdf.format(fechaHoy);
            sc.nextLine();
            System.out.print("�Ha pagado el alumno " + indice + " el importe de la matr�cula? (S/N): ");
            String respuesta = sc.nextLine();
            respuesta = respuesta.toUpperCase();
            boolean pagado;
            if (respuesta.equals("S")) {
                pagado = true;
            } else {
                if (respuesta.equals("N")) {
                    pagado = false;
                } else {
                    while (!respuesta.equals("S") && !respuesta.equals("N")) {
                        System.out.print("Introduzca una respuesta acorde con la pregunta anterior (es decir, S/N): ");
                        respuesta = sc.nextLine();
                        respuesta = respuesta.toUpperCase();
                    }
                    if (respuesta.equals("S")) {
                        pagado = true;
                    } else {
                        pagado = false;
                    }
                }
            }
            Matricula matriculaNueva = new Matricula(alumno, fecha, pagado);
            autoescuela.getMatriculas().add(matriculaNueva);
        } catch (IndexOutOfBoundsException e) {
            System.err.println("No existe el alumno " + indice + ".");
        }
    }

    // M�todo modificarMatricula(), que permite modificar un dato de una matr�cula (si la hubiera)
    public static void modificarMatricula(Autoescuela autoescuela) {
        Scanner sc = new Scanner(System.in, "ISO-8859-1");
        List<Matricula> matriculas = autoescuela.getMatriculas();
        if (matriculas.isEmpty()) {
            System.out.println("No hay matr�culas que modificar.");
        } else {
            mostrarMatriculas(autoescuela);
            System.out.print("Introduzca el �ndice de la matr�cula cuyos datos quiere modificar: ");
            int indice = sc.nextInt();
            try {
                Matricula matricula = matriculas.get(indice - 1);
                boolean pagado;
                if (matricula.isPagado()) {
                    pagado = false;
                    System.out.println("La matr�cula aparecer� desde este momento como no pagada.");
                } else {
                    pagado = true;
                    System.out.println("La matr�cula aparecer� desde este momento como pagada.");
                }
                matricula.setPagado(pagado);
            } catch (IndexOutOfBoundsException e) {
                System.err.println("No existe la matr�cula " + indice + ".");
            }
        }
    }

    // M�todo eliminarMatricula(), que elimina la matr�cula de uno de los alumnos almacenados (si la hubiera)
    public static void eliminarMatricula(Autoescuela autoescuela) {
        Scanner sc = new Scanner(System.in, "ISO-8859-1");
        if (autoescuela.getMatriculas().isEmpty()) {
            System.out.println("No hay matr�culas que eliminar.");
        } else {
            mostrarMatriculas(autoescuela);
            System.out.print("Introduzca el �ndice de la matr�cula a eliminar: ");
            int i = sc.nextInt();
            try {
                autoescuela.getMatriculas().remove(i - 1);
            } catch (IndexOutOfBoundsException e) {
                System.err.println("No existe la matr�cula " + i + ".");
            }
        }
    }

    // M�todo ordenarMatriculasPorApellidos(), que ordena las matr�culas de los alumnos de la autoescuela (si las hubiera y fuesen m�s de una) por apellidos
    public static void ordenarMatriculasPorApellidos(Autoescuela autoescuela) {
        List<Matricula> matriculas = autoescuela.getMatriculas();
        if (matriculas.isEmpty()) {
            System.out.println("No hay matr�culas que ordenar.");
        } else {
            if (matriculas.size() == 1) {
                System.out.println("La autoescuela solo tiene almacenada una matr�cula.");
            } else {
                Collections.sort(matriculas);
                mostrarMatriculas(autoescuela);
            }
        }
    }

    // M�todo mostrarExamenesTeoricos(), que muestra los ex�menes te�ricos almacenadas en la aplicaci�n (si los hubiera)
    public static void mostrarExamenesTeoricos(Autoescuela autoescuela) {
        List<ExamenTeorico> examenesT = autoescuela.getExamenesT();
        if (examenesT.isEmpty()) {
            System.out.println("No hay ex�menes te�ricos que mostrar.");
        } else {
            System.out.println("Ex�menes te�ricos:");
            System.out.println("------------------");
            int i = 1;
            for (ExamenTeorico et : examenesT) {
                System.out.println(i + " - " + et);
                i++;
            }
        }
    }

    // M�todo introducirExamenTeorico(), que registra un examen te�rico en la aplicaci�n
    public static void introducirExamenTeorico(Autoescuela autoescuela) {
        Scanner sc = new Scanner(System.in, "ISO-8859-1");
        mostrarAlumnos(autoescuela);
        System.out.print("Introduzca el �ndice del alumno cuyo examen te�rico quiere registrar: ");
        int indice = sc.nextInt();
        try {
            List<Alumno> alumnos = autoescuela.getAlumnos();
            Alumno alumno = alumnos.get(indice - 1);
            sc.nextLine();
            System.out.print("Fecha (yyyy/MM/dd) del examen te�rico: ");
            String fecha = sc.nextLine();
            System.out.print("Hora (HH:mm) del examen te�rico: ");
            String hora = sc.nextLine();
            System.out.print("Lugar del examen te�rico: ");
            String lugar = sc.nextLine();
            System.out.print("Calificaci�n (APTO/NO APTO) del examen te�rico: ");
            String calificacion = sc.nextLine();
            calificacion = comprobarCalificacion(calificacion);
            System.out.print("N�mero de fallos del examen te�rico: ");
            try {
                int numeroFallos = sc.nextInt();
                ExamenTeorico examenTNuevo = new ExamenTeorico(alumno, fecha, hora, lugar, calificacion, numeroFallos);
                autoescuela.getExamenesT().add(examenTNuevo);
            } catch (InputMismatchException e) {
                System.err.println("Error. Por favor, introduzca un n�mero de fallos v�lido.");
            }
        } catch (IndexOutOfBoundsException e) {
            System.err.println("No existe el alumno " + indice + ".");
        }
    }

    // M�todo modificarExamenTeorico(), que permite modificar algunos datos de un examen te�rico (si lo hubiera)
    public static void modificarExamenTeorico(Autoescuela autoescuela) {
        Scanner sc = new Scanner(System.in, "ISO-8859-1");
        List<ExamenTeorico> examenesT = autoescuela.getExamenesT();
        if (examenesT.isEmpty()) {
            System.out.println("No hay ex�menes te�ricos que modificar.");
        } else {
            mostrarExamenesTeoricos(autoescuela);
            System.out.print("Introduzca el �ndice del examen te�rico cuyos datos quiere modificar: ");
            int indice = sc.nextInt();
            try {
                ExamenTeorico examenT = examenesT.get(indice - 1);
                int respuesta = -1;
                while (respuesta != 0) {
                    System.out.println("Qu� datos quiere modificar? Elija una opci�n:");
                    System.out.println("0 - Ninguno m�s");
                    System.out.println("1 - Fecha");
                    System.out.println("2 - Hora");
                    System.out.println("3 - Lugar de celebraci�n");
                    System.out.println("4 - Calificaci�n");
                    System.out.println("5 - N�mero de fallos");
                    try {
                        respuesta = sc.nextInt();
                        switch (respuesta) {
                            case 0:
                                break;
                            case 1:
                                sc.nextLine();
                                System.out.print("Introduzca la nueva fecha (dd/MM/yyyy) del examen te�rico: ");
                                String fecha = sc.nextLine();
                                examenT.setFecha(fecha);
                                break;
                            case 2:
                                sc.nextLine();
                                System.out.print("Introduzca la nueva hora (HH:mm) del examen te�rico: ");
                                String hora = sc.nextLine();
                                examenT.setHora(hora);
                                break;
                            case 3:
                                sc.nextLine();
                                System.out.print("Introduzca el nuevo lugar en el que se va a celebrar el examen te�rico: ");
                                String lugar = sc.nextLine();
                                examenT.setLugar(lugar);
                                break;
                            case 4:
                                sc.nextLine();
                                System.out.print("Introduzca la nueva calificaci�n (APTO/NO APTO) del examen te�rico: ");
                                String calificacion = sc.nextLine();
                                calificacion = comprobarCalificacion(calificacion);
                                examenT.setCalificacion(calificacion);
                                break;
                            case 5:
                                System.out.print("Introduzca el nuevo n�mero de fallos del examen te�rico: ");
                                try {
                                    int numeroFallos = sc.nextInt();
                                    examenT.setNumeroDeFallos(numeroFallos);
                                    break;
                                } catch (InputMismatchException e) {
                                    System.err.println("Error. Por favor, introduzca un n�mero de fallos v�lido.");
                                }
                            default:
                                System.out.println("Introduzca una opci�n comprendida entre el 0 y el 5.");
                                break;
                        }
                    } catch (InputMismatchException e) {
                        System.err.println("Error. Por favor, introduzca un valor comprendido entre el 0 y el 5.");
                    }
                }
            } catch (IndexOutOfBoundsException e) {
                System.err.println("No existe el examen te�rico " + indice + ".");
            }
        }
    }

    // M�todo eliminarExamenTeorico(), que eliminina un examen te�rico almacenado (si lo hubiera)
    public static void eliminarExamenTeorico(Autoescuela autoescuela) {
        Scanner sc = new Scanner(System.in, "ISO-8859-1");
        if (autoescuela.getExamenesT().isEmpty()) {
            System.out.println("No hay ex�menes te�ricos que eliminar.");
        } else {
            mostrarExamenesTeoricos(autoescuela);
            System.out.print("Introduzca el �ndice del examen te�rico a eliminar: ");
            int i = sc.nextInt();
            try {
                autoescuela.getExamenesT().remove(i - 1);
            } catch (IndexOutOfBoundsException e) {
                System.err.println("No existe el examen te�rico " + i + ".");
            }
        }
    }

    // M�todo ordenarExamenesTeoricosPorFecha(), que ordena los ex�menes te�ricos de los alumnnos de la autoescuela (si los hubiera y fuesen m�s de uno) por fecha
    public static void ordenarExamenesTeoricosPorFecha(Autoescuela autoescuela) {
        List<ExamenTeorico> examenesT = autoescuela.getExamenesT();
        if (examenesT.isEmpty()) {
            System.out.println("No hay ex�menes te�ricos que ordenar.");
        } else {
            if (examenesT.size() == 1) {
                System.out.println("La autoescuela solo tiene almacenado un examen te�rico.");
            } else {
                Collections.sort(examenesT);
                mostrarExamenesTeoricos(autoescuela);
            }
        }
    }

    // M�todo mostrarExamenesPracticos(), que muestra los ex�menes pr�cticos almacenados en la aplicaci�n (si los hubiera)
    public static void mostrarExamenesPracticos(Autoescuela autoescuela) {
        List<ExamenPractico> examenesP = autoescuela.getExamenesP();
        if (examenesP.isEmpty()) {
            System.out.println("No hay ex�menes pr�cticos que mostrar.");
        } else {
            System.out.println("Ex�menes pr�cticos:");
            System.out.println("-------------------");
            int i = 1;
            for (ExamenPractico ep : examenesP) {
                System.out.println(i + " - " + ep);
                i++;
            }
        }
    }

    // M�todo introducirExamenPractico(), que registra un examen pr�ctico en la aplicaci�n
    public static void introducirExamenPractico(Autoescuela autoescuela) {
        Scanner sc = new Scanner(System.in, "ISO-8859-1");
        mostrarAlumnos(autoescuela);
        System.out.print("Introduzca el �ndice del alumno cuyo examen pr�ctico quiere registrar: ");
        int indice = sc.nextInt();
        try {
            List<Alumno> alumnos = autoescuela.getAlumnos();
            Alumno alumno = alumnos.get(indice - 1);
            System.out.print("Fecha (yyyy/MM/dd) del examen pr�ctico: ");
            sc.nextLine();
            String fecha = sc.nextLine();
            System.out.print("Hora (HH:mm) del examen pr�ctico: ");
            String hora = sc.nextLine();
            System.out.print("Lugar del examen pr�ctico: ");
            String lugar = sc.nextLine();
            System.out.print("Calificaci�n (APTO/NO APTO) del examen pr�ctico: ");
            String calificacion = sc.nextLine();
            calificacion = comprobarCalificacion(calificacion);
            System.out.println();
            mostrarProfesores(autoescuela);
            System.out.print("Introduzca el �ndice del profesor que acompa�� al alumno " + indice + " al examen pr�ctico: ");
            int i = sc.nextInt();
            try {
                List<Profesor> profesores = autoescuela.getProfesores();
                Profesor profesor = profesores.get(indice - 1);
                ExamenPractico examenPNuevo = new ExamenPractico(alumno, fecha, hora, lugar, calificacion, profesor);
                autoescuela.getExamenesP().add(examenPNuevo);
            } catch (IndexOutOfBoundsException e) {
                System.err.println("No existe el profesor " + i + ".");
            }
        } catch (IndexOutOfBoundsException e) {
            System.err.println("No existe el alumno " + indice + ".");
        }
    }

    // M�todo modificarExamenPractico(), que permite modificar algunos datos de un examen pr�ctico almacenado (si lo hubiera)
    public static void modificarExamenPractico(Autoescuela autoescuela) {
        Scanner sc = new Scanner(System.in, "ISO-8859-1");
        List<ExamenPractico> examenesP = autoescuela.getExamenesP();
        if (examenesP.isEmpty()) {
            System.out.println("No hay ex�menes pr�cticos que modificar.");
        } else {
            mostrarExamenesPracticos(autoescuela);
            System.out.print("Introduzca el �ndice del examen pr�ctico cuyos datos quiere modificar: ");
            int indice = sc.nextInt();
            try {
                ExamenPractico examenP = examenesP.get(indice - 1);
                int respuesta = -1;
                while (respuesta != 0) {
                    System.out.println("Qu� datos quiere modificar? Elija una opci�n:");
                    System.out.println("0 - Ninguno m�s");
                    System.out.println("1 - Fecha");
                    System.out.println("2 - Hora");
                    System.out.println("3 - Lugar de celebraci�n");
                    System.out.println("4 - Calificaci�n");
                    System.out.println("5 - Profesor acompa�ante");
                    try {
                        respuesta = sc.nextInt();
                        switch (respuesta) {
                            case 0:
                                break;
                            case 1:
                                sc.nextLine();
                                System.out.print("Introduzca la nueva fecha (yyyy/MM/dd) del examen te�rico: ");
                                String fecha = sc.nextLine();
                                examenP.setFecha(fecha);
                                break;
                            case 2:
                                sc.nextLine();
                                System.out.print("Introduzca la nueva hora (HH:mm) del examen te�rico: ");
                                String hora = sc.nextLine();
                                examenP.setHora(hora);
                                break;
                            case 3:
                                sc.nextLine();
                                System.out.print("Introduzca el nuevo lugar en el que se va a celebrar el examen te�rico: ");
                                String lugar = sc.nextLine();
                                examenP.setLugar(lugar);
                                break;
                            case 4:
                                sc.nextLine();
                                System.out.print("Introduzca la nueva calificaci�n (APTO/NO APTO) del examen te�rico: ");
                                String calificacion = sc.nextLine();
                                calificacion = comprobarCalificacion(calificacion);
                                examenP.setCalificacion(calificacion);
                                break;
                            case 5:
                                System.out.println();
                                mostrarProfesores(autoescuela);
                                System.out.print("Introduzca el �ndice del profesor que actuar� ahora como acompa�ante: ");
                                try {
                                    int i = sc.nextInt();
                                    List<Profesor> profesores = autoescuela.getProfesores();
                                    Profesor profesor = profesores.get(i - 1);
                                    examenP.setAcompaniante(profesor);
                                    break;
                                } catch (InputMismatchException e) {
                                    System.out.println("");
                                }
                            default:
                                System.out.println("Introduzca una opci�n comprendida entre el 0 y el 5.");
                                break;
                        }
                    } catch (InputMismatchException e) {
                        System.err.println("Error. Por favor, introduzca un valor comprendido entre el 0 y el 5.");
                    }
                }
            } catch (IndexOutOfBoundsException e) {
                System.err.println("No existe el examen pr�ctico " + indice + ".");
            }
        }
    }

    // M�todo eliminarExamenPractico(), que eliminina un examen pr�ctico almacenado (si lo hubiera)
    public static void eliminarExamenPractico(Autoescuela autoescuela) {
        Scanner sc = new Scanner(System.in, "ISO-8859-1");
        if (autoescuela.getExamenesP().isEmpty()) {
            System.out.println("No hay ex�menes pr�cticos que eliminar.");
        } else {
            mostrarExamenesPracticos(autoescuela);
            System.out.print("Introduzca el �ndice del examen pr�ctico a eliminar: ");
            int i = sc.nextInt();
            try {
                autoescuela.getExamenesP().remove(i - 1);
            } catch (IndexOutOfBoundsException e) {
                System.err.println("No existe el examen pr�ctico " + i + ".");
            }
        }
    }

    // M�todo ordenarExamenesPracticosPorFecha(), que ordena los ex�menes pr�cticos de los alumnos de la autoescuela (si los hubiera y fuesen m�s de uno) por fecha
    public static void ordenarExamenesPracticosPorFecha(Autoescuela autoescuela) {
        List<ExamenPractico> examenesP = autoescuela.getExamenesP();
        if (examenesP.isEmpty()) {
            System.out.println("No hay ex�menes pr�cticos que ordenar.");
        } else {
            if (examenesP.size() == 1) {
                System.out.println("La autoescuela solo tiene almacenado un examen pr�ctico.");
            } else {
                Collections.sort(examenesP);
                mostrarExamenesPracticos(autoescuela);
            }
        }
    }

    // M�todo mostrarDatos(), que muestra todos los datos que almacena nuestra aplicaci�n
    public static void mostrarDatos(Autoescuela autoescuela) {
        System.out.println(autoescuela.toString());
        System.out.println();
        mostrarAlumnos(autoescuela);
        System.out.println();
        mostrarProfesores(autoescuela);
        System.out.println();
        mostrarVehiculos(autoescuela);
        System.out.println();
        mostrarExamenesTeoricos(autoescuela);
        System.out.println();
        mostrarExamenesPracticos(autoescuela);
        System.out.println();
        mostrarMatriculas(autoescuela);
    }

    // M�todo comprobarTelefono(), que se encarga de almacenar un tel�fono v�lido
    public static int comprobarTelefono(int telefono) {
        Scanner sc = new Scanner(System.in, "ISO-8859-1");
        while (telefono < 100000000 || telefono > 999999999) {
            System.out.print("Introduzca un n�mero de tel�fono v�lido (es decir, compuesto por nueve n�meros): ");
            try {
                telefono = sc.nextInt();
            } catch (InputMismatchException e) {
                System.err.println("Error. Por favor, introduzca un n�mero de tel�fono v�lido.");
            }
        }
        return telefono;
    }

    // M�todo comprobarDni(), que se encarga de almacenar un DNI v�lido
    public static String comprobarDni(String dni) {
        Scanner sc = new Scanner(System.in, "ISO-8859-1");
        while (dni.length() != 9 || Character.isLetter(dni.charAt(8)) == false) {
            System.out.print("Introduzca un DNI v�lido (es decir, compuesto por ocho n�meros y una letra): ");
            dni = sc.nextLine();
        }
        String numero;
        String numerosDni = "";
        String[] numerosValidos = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        for (int i = 0; i < dni.length() - 1; i++) {
            numero = dni.substring(i, i + 1);
            for (int j = 0; j < numerosValidos.length; j++) {
                if (numero.equals(numerosValidos[j])) {
                    numerosDni += numerosValidos[j];
                }
            }
        }
        if (numerosDni.length() != 8) {
            dni = "13";
            comprobarDni(dni);
        }
        return dni.toUpperCase();
    }

    // M�todo comprobarMatricula(), que se encarga de almacenar una matr�cula v�lida   
    public static String comprobarMatricula(String matricula) {
        Scanner sc = new Scanner(System.in, "ISO-8859-1");
        while (matricula.length() != 7 || Character.isLetter(matricula.charAt(4)) == false || Character.isLetter(matricula.charAt(5)) == false || Character.isLetter(matricula.charAt(6)) == false) {
            System.out.print("Introduzca una matr�cula v�lida (es decir, compuesta por cuatro n�meros y tres letras): ");
            matricula = sc.nextLine();
        }
        String numero;
        String numerosMatricula = "";
        String[] numerosValidos = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        for (int i = 0; i < matricula.length() - 1; i++) {
            numero = matricula.substring(i, i + 1);
            for (int j = 0; j < numerosValidos.length; j++) {
                if (numero.equals(numerosValidos[j])) {
                    numerosMatricula += numerosValidos[j];
                }
            }
        }
        if (numerosMatricula.length() != 4) {
            matricula = "";
            comprobarMatricula(matricula);
        }
        return matricula.toUpperCase();
    }

    // M�todo comprobarCalificacion(), que se encarga de almacenar una calificaci�n v�lida
    public static String comprobarCalificacion(String calificacion) {
        Scanner sc = new Scanner(System.in, "ISO-8859-1");
        calificacion = calificacion.toUpperCase();
        while (!calificacion.equals("APTO") && !calificacion.equals("NO APTO")) {
            System.out.print("Introduzca APTO o NO APTO, seg�n haya sido la calificaci�n: ");
            calificacion = sc.nextLine();
            calificacion = calificacion.toUpperCase();
        }
        return calificacion;
    }

}
