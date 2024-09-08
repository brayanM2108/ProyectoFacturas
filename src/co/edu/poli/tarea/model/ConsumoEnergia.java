package co.edu.poli.tarea.model;
/**  @author Brayan Melo
 * */
 
import java.util.Arrays;

/**
 * La clase ConsumoEnergia representa información sobre el consumo de energía eléctrica.
 */
import java.io.Serializable;

public class ConsumoEnergia implements Serializable{
	
    /**
     * Constructor predeterminado de la clase ConsumoEnergia.
     *  @param periodoFacturado   El período facturado para el consumo de energía (por ejemplo, "2023-10-01").
 * @param diasFacturados     El número de días incluidos en el período de facturación.
 * @param consumoDiario      El consumo diario de energía en kilovatios por hora (kWh).
 * @param valorDiario        El valor diario del consumo de energía en la moneda local.
 * @param consusmoDiario     El consumo diario en unidades de medida personalizadas.
 * @param energiaFacturada   La cantidad total de energía facturada en kilovatios hora (kWh).
 * @param historialConsumo   Un arreglo de enteros que representa el historial de consumo diario.
     */
	 public ConsumoEnergia(String periodoFacturado, int diasFacturados, double consumoDiario, double valorDiario,
				double consusmoDiario, int energiaFacturada, int[] historialConsumo) {
			super();
			this.periodoFacturado = periodoFacturado;
			this.diasFacturados = diasFacturados;
			this.consumoDiario = consumoDiario;
			this.valorDiario = valorDiario;
			this.consusmoDiario = consusmoDiario;
			this.energiaFacturada = energiaFacturada;
			this.historialConsumo = historialConsumo;
		}

    /**
     * Período facturado para el consumo de energía.
     */
    private String periodoFacturado;

   

	/**
     * Número de días facturados en el período.
     */
    private int diasFacturados;

    /**
     * Consumo diario promedio en kWh.
     */
    private double consumoDiario;

    /**
     * Valor diario del consumo en la moneda local.
     */
    private double valorDiario;

    /**
     * Consumo total en kWh para el día.
     */
    private double consusmoDiario;

    /**
     * Valor del costo por kWh aplicado.
     */
    public static double valorkwhAplicado;

    /**
     * Energía eléctrica total facturada en kWh.
     */
    private int energiaFacturada;

    /**
     * Historial de consumo de energía almacenado en un arreglo.
     */
    private int historialConsumo[];

    /**
     * Obtiene el período facturado.
     *
     * @return El período facturado.
     */
    public String getPeriodoFacturado() {
        return periodoFacturado;
    }

    /**
     * Establece el período facturado.
     *
     * @param periodoFacturado El período facturado a establecer.
     */
    public void setPeriodoFacturado(String periodoFacturado) {
        this.periodoFacturado = periodoFacturado;
    }

    /**
     * Obtiene el número de días facturados en el período.
     *
     * @return El número de días facturados.
     */
    public int getDiasFacturados() {
        return diasFacturados;
    }

    /**
     * Establece el número de días facturados en el período.
     *
     * @param diasFacturados El número de días facturados a establecer.
     */
    public void setDiasFacturados(int diasFacturados) {
        this.diasFacturados = diasFacturados;
    }

    /**
     * Obtiene el consumo diario promedio en kWh.
     *
     * @return El consumo diario promedio.
     */
    public double getConsumoDiario() {
        return consumoDiario;
    }

    /**
     * Establece el consumo diario promedio en kWh.
     *
     * @param consumoDiario El consumo diario promedio a establecer.
     */
    public void setConsumoDiario(double consumoDiario) {
        this.consumoDiario = consumoDiario;
    }

    /**
     * Obtiene el valor diario del consumo en la moneda local.
     *
     * @return El valor diario del consumo.
     */
    public double getValorDiario() {
        return valorDiario;
    }

    /**
     * Establece el valor diario del consumo en la moneda local.
     *
     * @param valorDiario El valor diario del consumo a establecer.
     */
    public void setValorDiario(double valorDiario) {
        this.valorDiario = valorDiario;
    }

    /**
     * Obtiene el consumo total en kWh para el día.
     *
     * @return El consumo total diario.
     */
    public double getConsusmoDiario() {
        return consusmoDiario;
    }

    /**
     * Establece el consumo total en kWh para el día.
     *
     * @param consusmoDiario El consumo total diario a establecer.
     */
    public void setConsusmoDiario(double consusmoDiario) {
        this.consusmoDiario = consusmoDiario;
    }

    /**
     * Obtiene el valor del costo por kWh aplicado.
     *
     * @return El valor del costo por kWh aplicado.
     */
    public static double getValorkwhAplicado() {
        return valorkwhAplicado;
    }

    /**
     * Establece el valor del costo por kWh aplicado.
     *
     * @param valorkwhAplicado El valor del costo por kWh aplicado a establecer.
     */
    public static void setValorkwhAplicado(double valorkwhAplicado) {
        ConsumoEnergia.valorkwhAplicado = valorkwhAplicado;
    }

    /**
     * Obtiene la energía eléctrica total facturada en kWh.
     *
     * @return La energía eléctrica total facturada.
     */
    public int getEnergiaFacturada() {
        return energiaFacturada;
    }

    /**
     * Genera y devuelve un número de factura único para su uso en facturación.
     *
     * @return Un número de factura único como un entero.
     */
    public static int generarNumeroFactura() {
    	int numeroFactura = 1000;
    	return numeroFactura++;}
    }
