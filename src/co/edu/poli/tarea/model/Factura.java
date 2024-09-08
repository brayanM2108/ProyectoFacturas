package co.edu.poli.tarea.model;
/**  @author Brayan Melo
 * */
 

/**
 * La clase Factura representa una factura específica con detalles sobre el consumo y los electrodomésticos asociados.
 */


public class Factura extends FacturaGeneral {
	
	/**
     * Constructor de la clase Factura que recibe varios parámetros para inicializar sus atributos.
     *
     * @param numeroFactura   El número de factura.
     * @param fecha           La fecha de la factura.
     * @param cliente         El cliente asociado a la factura.
     * @param subtotal        El subtotal de la factura.
     * @param total           El total de la factura.
     * @param pagoOportuno    El estado de pago oportuno de la factura.
     * @param fechaSuspension La fecha de suspensión de servicio asociada a la factura.
     * @param consumo         El consumo de energía asociado a la factura.
     * @param electrodomestico  Un arreglo de electrodomésticos asociados a la factura.
     */
    public Factura(int numeroFactura, String fecha, Cliente cliente, double subtotal, double total, String pagoOportuno,
                   String fechaSuspension, ConsumoEnergia consumo, Electrodomestico[] electrodomestico) {
        super(numeroFactura, fecha, cliente, subtotal, total, pagoOportuno, fechaSuspension);
        this.consumo = consumo;
        this.electrodomestico = electrodomestico;
    }

    /**
     * Consumo de energía asociado a la factura.
     */
    private ConsumoEnergia consumo;

    /**
     * Arreglo de electrodomésticos asociados a la factura.
     */
    private Electrodomestico[] electrodomestico;

    /**
     * Obtiene el arreglo de electrodomésticos asociados a la factura.
     *
     * @return El arreglo de electrodomésticos.
     */
    public Electrodomestico[] getElectrodomestico() {
        return electrodomestico;
    }

    /**
     * Establece el arreglo de electrodomésticos asociados a la factura.
     *
     * @param electrodomestico El arreglo de electrodomésticos a establecer.
     */
    public void setElectrodomestico(Electrodomestico[] electrodomestico) {
        this.electrodomestico = electrodomestico;
    }

    /**
     * Calcula el consumo total de energía de los electrodomésticos asociados a la factura.
     *
     * @return El consumo total de energía en kWh.
     */
    public double calcularConsumo() {
        double total = 0;

        for (int i = 0; i < electrodomestico.length; i++) {
            total += electrodomestico[i].getKwhConsumido();
        }

        return total;
    }

    /**
     * Calcula el consumo total de energía de los electrodomésticos cuyo consumo está en el rango [valorMin, valorMax].
     *
     * @param valorMin El valor mínimo del consumo en kWh.
     * @param valorMax El valor máximo del consumo en kWh.
     * @return El consumo total de energía en kWh de los electrodomésticos en el rango especificado.
     */
    public double calcularConsumo(int valorMin, int valorMax) {
        double total = 0;

        for (int i = 0; i < electrodomestico.length; i++) {
            if (electrodomestico[i].getKwhConsumido() >= valorMin && electrodomestico[i].getKwhConsumido() <= valorMax) {
                total += electrodomestico[i].getKwhConsumido();
            }
        }

        return total;
    }

    /**
     * Calcula el subsidio aplicable a la factura según el estrato del cliente.
     *
     * @param estrato El estrato del cliente.
     * @return El valor del subsidio calculado.
     */
    @Override
    public double calcularSubsidio(int estrato) {
        if (estrato <= 3) {
            return 0.08;
        } else {
            return 0.03;
        }
    }
}
