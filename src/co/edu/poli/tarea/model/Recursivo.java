package co.edu.poli.tarea.model;
/**  @author Brayan Melo
 * */
 
/**
 * La clase Recursivo implementa el calculo del factorial de un numero utilizando un enfoque recursivo.
 */
public class Recursivo implements Funcion {

    /**
     * Calcula el factorial de un numero entero utilizando un enfoque recursivo.
     *
     * @param n El numero entero para calcular el factorial.
     * @return El resultado del cálculo del factorial.
     * @throws IllegalArgumentException Si se pasa un número negativo como argumento.
     */
    @Override
    public int calcularFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("El factorial no está definido para números negativos.");
        }
        if (n == 0) {
            return 1;
        } else {
            return n * calcularFactorial(n - 1);
        }
    }
    public double serieMclaurin(double x) {
    	
    	return serieMclaurin(x,10);
    }

	private double serieMclaurin(double x, int n) {
		if (n==0)
			return x;
		else {
			return Math.pow(-1, n)* Math.pow(x, 2*n+1)/calcularFactorial(2*n+1)+serieMclaurin(x, n-1);
		}
	}
}
