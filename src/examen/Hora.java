
package examen;

/**
 * Clase con el metodo para comprobar si la hora introcida es valida.
 */
public class Hora {
    public static boolean horaValida;

    /**
     *
     * @param segundos Segundos a introducir que no sea <0
     * @param minutos Minutos a introducir que no sean <0
     * @param horas Horas a introducir que no sean <0
     * @return Return false o true en funcion de si los datos introducidos son correctos
     */
    public static boolean validarHora(int segundos, int minutos, int horas) {
        horaValida = true;
        if ((horas >= 0) && (minutos >= 0) && (segundos >= 0)) {
            if (horas > 23) {
                horaValida = false;
            } else if (minutos > 59) {
                horaValida = false;
            } else if (segundos > 59) {
                horaValida = false;
            }
        } else {
            horaValida = false;
        }
        return horaValida;
    }
}
