package co.edu.poli.tarea.model;
/**  @author Brayan Melo
 * */
 
/**
 * La clase Electrodomestico representa un electrodoméstico con información sobre su consumo de energía.
 */
import java.io.Serializable;

public class Electrodomestico implements Serializable{

    /**
     * Constructor predeterminado de la clase Electrodomestico.
     */
    public Electrodomestico() {
    }

    /**
     * Constructor de la clase Electrodomestico que recibe el número de serie, el nombre y el consumo de kWh.
     *
     * @param serial      El número de serie del electrodoméstico.
     * @param nombre      El nombre del electrodoméstico.
     * @param kwhConsumido El consumo de energía en kWh del electrodoméstico.
     */
    public Electrodomestico(int serial, String nombre, double kwhConsumido) {
        this.serial = serial;
        this.nombre = nombre;
        this.kwhConsumido = kwhConsumido;
    }

    /**
     * Calcula el consumo total de energía de un conjunto de electrodomésticos dados.
     *
     * @param kwhConsumidoTotal Un arreglo que contiene el consumo de energía en kWh de varios electrodomésticos.
     * @return El consumo total de energía en kWh.
     */
    public double calcularConsumo(double[] kwhConsumidoTotal) {
        double total = 0;
        
        for (int i = 0; i < kwhConsumidoTotal.length; i++) {
            total += kwhConsumidoTotal[i];
        }
        
        return total;
    }

    /**
     * Obtiene el número de serie del electrodoméstico.
     *
     * @return El número de serie del electrodoméstico.
     */
    public int getSerial() {
        return serial;
    }

    /**
     * Establece el número de serie del electrodoméstico.
     *
     * @param serial El número de serie del electrodoméstico.
     */
    public void setSerial(int serial) {
        this.serial = serial;
    }

    /**
     * Obtiene el nombre del electrodoméstico.
     *
     * @return El nombre del electrodoméstico.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del electrodoméstico.
     *
     * @param nombre El nombre del electrodoméstico.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el consumo de energía en kWh del electrodoméstico.
     *
     * @return El consumo de energía en kWh.
     */
    public double getKwhConsumido() {
        return kwhConsumido;
    }

    /**
     * Establece el consumo de energía en kWh del electrodoméstico.
     *
     * @param kwhConsumido El consumo de energía en kWh.
     */
    public void setKwhConsumido(double kwhConsumido) {
        this.kwhConsumido = kwhConsumido;
    }

    /**
     * Devuelve una representación en cadena de la instancia de Electrodomestico,
     * incluyendo todos los atributos.
     *
     * @return Cadena que representa la instancia de Electrodomestico.
     */
    @Override
    public String toString() {
        return "Electrodomestico [serial=" + serial + ", nombre=" + nombre + ", kwhConsumido=" + kwhConsumido + "]";
    }

    /**
     * Número de serie del electrodoméstico.
     */
    private int serial;

    /**
     * Nombre del electrodoméstico.
     */
    private String nombre;

    /**
     * Consumo de energía en kWh del electrodoméstico.
     */
    private double kwhConsumido;
}
