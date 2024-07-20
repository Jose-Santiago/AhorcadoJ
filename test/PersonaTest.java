import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonaTest {
    @Test
    public void siElNombreEstaCompleto(){
        Persona juan = new Persona("Juan", "Perez", 15);
        assertEquals("Perez, Juan",juan.nombreCompleto());
        assertFalse(juan.mayorDeEdad());
    }

}