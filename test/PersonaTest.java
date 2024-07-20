import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonaTest {
    Persona juan = new Persona("Juan", "Perez", 15);
    @Test
    public void siElNombreEstaCompleto(){

        assertEquals("Perez, Juan",juan.nombreCompleto());
    }

    @Test
    public void esMayorDeEdad(){
        assertFalse(juan.mayorDeEdad());
    }

}