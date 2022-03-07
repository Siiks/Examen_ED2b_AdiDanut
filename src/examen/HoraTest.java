package examen;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Clase con valores de prueba
 */
public class HoraTest {


    @Test
    void CP1() {
        Hora x = new Hora();
        assertFalse(x.validarHora(5, 5, -1));

    }
    @Test
    void CP2() {
        Hora x = new Hora();
        assertFalse(x.validarHora(5, -5, 5));

    }
    @Test
    void CP3() {
        Hora x = new Hora();
        assertFalse(Hora.validarHora(-5, 5, 5));

    }
    @Test
    void CP4() {
        Hora x = new Hora();
        assertTrue(x.validarHora(5, 5, 5));

    }
}