package co.edu.poli.tarea.model;

public class RecursionCola implements Funcion{

	@Override
	public int calcularFactorial(int numeroFactorial) {
		// TODO Auto-generated method stub
		return recursionCola(numeroFactorial, numeroFactorial);
	}
	
	private int recursionCola (int a, int b) {
		if (a==1)
			return b;
		else {
			return recursionCola(a-1, a*b);
		}
		
	}
	
	@Override
	public double serieMclaurin(double x) {
	    return serieMclaurin(x, 10, 0, 0);
	}

	private double serieMclaurin(double x, int n, int terminoActual, double resultado) {
	    if (n == 0) {
	        return resultado;
	    } else {
	        double term = Math.pow(-1, n) * Math.pow(x, 2 * n + 1) / calcularFactorial(2 * n + 1);
	        resultado += term;
	        return serieMclaurin(x, n - 1, terminoActual + 1, resultado);
	    }

	
	}

	

		
		
	}

	

