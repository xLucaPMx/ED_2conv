import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalificadorTestParam {

    @ParameterizedTest
    @CsvSource({
            "6.0, 7.0, 4.0, 5.0, 5.0, 9.0, false",
            "6.0, 7.0, 9.0, 5.0, 6.0, 4.0, false",
            "6.0, 7.0, 5.0, 5.0, 6.0, 4.0, false",
            "6.0, 4.0, 5.0, 5.0, 6.0, 6.0, false",
            "6.0, 4.0, 7.0, 5.0, 6.0, 9.0, true"
    })
    void allTest(double c1, double t1, double e1, double c2, double t2, double e2, boolean expected) {
        assertEquals(expected, Calificador.getAprobado(c1, t1, e1, c2, t2, e2));
    }
}
