import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalificadorTestParamCsv {

    @ParameterizedTest
    @CsvFileSource(resources = "/datos_calificador.csv", numLinesToSkip = 1)

    void allTest(double c1, double t1, double e1, double c2, double t2, double e2, boolean expected) {
        assertEquals(expected, Calificador.getAprobado(c1, t1, e1, c2, t2, e2));
    }
}
