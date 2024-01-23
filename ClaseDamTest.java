

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class ClaseDamTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ClaseDamTest
{
    /**
     * Default constructor for test class ClaseDamTest
     */
    public ClaseDamTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
        ClaseDam clase = new ClaseDam(30);

        Alumno alumno1 = new Alumno("Javier Garcia", "4567", 21);
        Alumno alumno2 = new Alumno("Laura Gómez", "2238", 19);
        Alumno alumno3 = new Alumno("Estefanía Sáenz", "9987", 22);
        Alumno alumno4 = new Alumno("Rodrigo Cifuentes", "2290", 19);
        Alumno alumno5 = new Alumno("Mauro López", "3387", 20);
        
        clase.matricularAlumno(alumno1);
        clase.matricularAlumno(alumno2);
        clase.matricularAlumno(alumno3);
        clase.matricularAlumno(alumno4);
        clase.matricularAlumno(alumno5);

        clase.setCentro("Instituto San Andres");
        clase.setTutor("Profesor Miguel Bayon");
        clase.setAula("Aula 101");

        clase.imprimeDetalles();
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }
}
