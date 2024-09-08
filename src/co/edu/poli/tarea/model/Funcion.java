package co.edu.poli.tarea.model;
/**  @author Brayan Melo
 * */
 
/**
 *
 * La interfaz Funcion define el contrato para calcular el factorial de un número entero.
 */
public interface Funcion {

    /**
     * Calcula el factorial de un número entero.
     *
     * @param numeroFactorial El número entero para calcular el factorial.
     * @return El resultado del cálculo del factorial.
     */
    int calcularFactorial(int numeroFactorial);
    
    double serieMclaurin(double x);
}
