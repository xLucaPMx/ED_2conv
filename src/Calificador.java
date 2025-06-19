public class Calificador {
    public static boolean getAprobado(double c1, double t1, double e1,
                                      double c2, double t2, double e2) {
        double eva1, eva2;
        boolean aprobado;

        if (e1 < 5) {
            aprobado = false; // Si el examen 1 está suspenso, la evaluación también
        } else {
            eva1 = c1 * 0.1 + t1 * 0.3 + e1 * 0.6; // Cálculo de la evaluación 1
            if (eva1 < 5) {
                aprobado = false; // Examen 1 aprobado pero evaluación suspensa
            } else {
                if (e2 < 5) {
                    aprobado = false; // Si el examen 2 está suspenso, la evaluación también
                } else {
                    eva2 = c2 * 0.1 + t2 * 0.3 + e2 * 0.6;  // Cálculo de la evaluación 2
                    if (eva2 < 5) {
                        aprobado = false; // Examen 2 aprobado pero evaluación suspensa
                    } else {
                        // Ambas evaluaciones aprobadas
                        aprobado = true;
                    }
                }
            }
        }
        return aprobado;
    }
//    public static boolean getAprobadoRef(double c1, double t1, double e1, double c2, double t2, double e2){
//        boolean aprobado = false;
//        double eva1 = c1 * 0.1 + t1 * 0.3 + e1 * 0.6;
//        double eva2 = c2 * 0.1 + t2 * 0.3 + e2 * 0.6;
//
//        if (eva1 > 5 || eva2 > 5){
//            aprobado = true;
//        }
//        return aprobado;
//    }
    public static void main(String[] args) {
        // Ejemplo de uso
        double c1 = 6.0, t1 = 7.0, e1 = 4.0;
        double c2 = 5.0, t2 = 6.0, e2 = 9.0;

        boolean resultado = getAprobado(c1, t1, e1, c2, t2, e2);
        System.out.println("¿El estudiante está aprobado? " + resultado);
    }
}
