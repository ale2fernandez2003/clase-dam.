public class Alumno {
    
    // el nombre completo del alumno
    private String nombre;
    // el numero de matricula
    private String numeroMatricula;
    // la edad del alumno
    private int edad;

    /**
     * Crea un alumno nuevo
     */
    public Alumno(String nombreCompleto, String numeroMatriculaAlumno, int edadAlumno) {
        nombre = nombreCompleto;
        numeroMatricula = numeroMatriculaAlumno;
        edad = edadAlumno;
        if (nombreCompleto.length() < 3) {
            System.err.println("Error, necesita tenes 3 caracteres como minimo.");
        }
        if (numeroMatriculaAlumno.length() < 4) {
            System.err.println("Error, el número de matrícula del alumno necesita 4 caracteres como minimo.");
        }
    }

    /**
     * Devuelve el nombre completo del alumno
     */
    public String getNombre() {
        return nombre;
    }
    
    /**
     * Cambia el nombre del alumno
     */
    public void cambiarnombre(String nuevoNombre) {
        nombre = nuevoNombre;
    }
    
    /**
     * Imprime por pantalla los detalles del alumno
     */
    public void imprimeDetalles() {
        System.out.println(nombre + " (" + numeroMatricula + ") - " + edad + " aÃ±os");
    }
    
    /**
     * Devuelve el nombre de usuario que el alumno debe configurar
     * en su cuenta de Github en formato de 7 caracateres
     */
    public String getNombreUsuarioGithub() {
        return nombre.substring(0, 3) + numeroMatricula.substring(0, 4);
    }
    
    public boolean esMayorDeEdad() {
        return edad >= 18;
    }
    
    public void mostrarSiEsMayorDeEdad(){
        if(edad >= 18){
            System.out.println("El alumno es mayor de edad.");
        }
        else{
            System.out.println("El alumno es menor de edad.");
        }
    }
}
