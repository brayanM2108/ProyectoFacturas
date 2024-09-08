package co.edu.poli.tarea.model;
/**  @author Brayan Melo
 * */
 
/**
 * La clase FacturaAgua representa una factura de agua con detalles sobre el consumo de agua y su contribución.
 */
public class FacturaAgua extends FacturaGeneral implements Contribucion {

    /**
     * Consumo de aseo asociado a la factura de agua.
     */
    private double consumoAseo;

    /**
     * Constructor de la clase FacturaAgua que recibe varios parámetros para inicializar sus atributos.
     *
     * @param numeroFactura   El número de factura.
     * @param fecha           La fecha de la factura.
     * @param cliente         El cliente asociado a la factura.
     * @param subtotal        El subtotal de la factura.
     * @param total           El total de la factura.
     * @param pagoOportuno    El estado de pago oportuno de la factura.
     * @param fechaSuspension La fecha de suspensión de servicio asociada a la factura.
     * @param consumoAseo     El consumo de aseo en la factura de agua.
     */
    public FacturaAgua(int numeroFactura, String fecha, Cliente cliente, double subtotal, double total,
                       String pagoOportuno, String fechaSuspension, double consumoAseo) {
        super(numeroFactura, fecha, cliente, subtotal, total, pagoOportuno, fechaSuspension);
        this.consumoAseo = consumoAseo;
    }

    /**
     * Obtiene el consumo de aseo asociado a la factura de agua.
     *
     * @return El consumo de aseo.
     */
    public double getConsumoAseo() {
        return consumoAseo;
    }

    /**
     * Establece el consumo de aseo asociado a la factura de agua.
     *
     * @param consumoAseo El consumo de aseo a establecer.
     */
    public void setConsumoAseo(double consumoAseo) {
        this.consumoAseo = consumoAseo;
    }

    /**
     * Calcula el subsidio aplicable a la factura de agua según el estrato del cliente.
     *
     * @param estrato El estrato del cliente.
     * @return El valor del subsidio calculado.
     */
    @Override
    public double calcularSubsidio(int estrato) {
        if (estrato <= 3) {
            return 0.07;
        } else {
            return 0.02;
        }
    }

    /**
     * Consulta la tasa de contribución asociada a la factura de agua.
     *
     * @return La tasa de contribución.
     */
    @Override
    public double consultarTasa() {
        return 0.3;
    }

    /**
     * Devuelve una representación en cadena de la instancia de FacturaAgua,
     * incluyendo todos los atributos.
     *
     * @return Cadena que representa la instancia de FacturaAgua.
     */
    @Override
    public String toString() {
        return "FacturaAgua [consumoAseo=" + consumoAseo + ", getNumeroFactura()=" + getNumeroFactura()
                + ", getFecha()=" + getFecha() + ", getCliente()=" + getCliente() + ", getSubtotal()=" + getSubtotal()
                + ", getTotal()=" + getTotal() + ", getPagoOportuno()=" + getPagoOportuno() + ", getFechaSuspension()="
                + getFechaSuspension() + "]";
    }

    /**
     * Método protegido que muestra un mensaje específico para la subclase.
     *
     * @return El mensaje específico de la subclase.
     */
    protected String metodoProtegido() {
        return "Esta en la subclase y se llama " + getClass().getSimpleName();
    }
}
