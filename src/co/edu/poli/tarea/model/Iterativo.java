package co.edu.poli.tarea.model;
/**  @author Brayan Melo
 * */
 
/**
 * La clase Iterativo implementa el cálculo del factorial de un número utilizando un enfoque iterativo.
 */
public class Iterativo implements Funcion {

    /**
     * Calcula el factorial de un número entero utilizando un enfoque iterativo.
     *
     * @param n El número entero para calcular el factorial.
     * @return El resultado del cálculo del factorial.
     * @throws IllegalArgumentException Si se pasa un número negativo como argumento.
     */
    @Override
    public int calcularFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("El factorial no está definido para números negativos.");
        }
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

	@Override
	public double serieMclaurin(double x) {
		int n = 10;
		double resultado = 0;
		double dividendo = 1;
		double divisor = 1;
		double factorialSigno = 1;
			for (int i = 0; i <= n; i++) {
				dividendo = Math.pow(x, ((2*i)+1));
				divisor = (double)(calcularFactorial((2*1)+1));
				factorialSigno = Math.pow(-1, i);
		}
		resultado += (dividendo/divisor)* factorialSigno;
		return resultado;
	} 
}
