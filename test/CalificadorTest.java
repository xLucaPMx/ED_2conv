import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalificadorTest {

    @Test
    void testpath1() {
        assertTrue(Calificador.getAprobado(6.0, 7.0, 5.0, 5.0, 6.0, 9.0));
    }

    @Test
    void testPath2() {
        assertFalse(Calificador.getAprobado(6.0, 7.0, 4.0, 5.0, 6.0, 9.0));
    }

    @Test
    void testPath3() {
        assertFalse(Calificador.getAprobado(6.0, 4.0, 5.0, 5.0, 6.0, 9.0));
    }
}