package co.edu.poli.tarea.model;
/**  @author Brayan Melo
 * */
 
/**
 * La clase abstracta FacturaGeneral proporciona una estructura base para las facturas y define los atributos y métodos comunes.
 */
import java.io.Serializable;

public abstract class FacturaGeneral implements Serializable {

    /**
     * Número de factura.
     */
    private int numeroFactura;

    /**
     * Fecha de la factura.
     */
    private String fecha;

    /**
     * Cliente asociado a la factura.
     */
    private Cliente cliente;

    /**
     * Subtotal de la factura.
     */
    private double subtotal;

    /**
     * Total de la factura.
     */
    private double total;

    /**
     * Estado de pago oportuno de la factura.
     */
    private String pagoOportuno;

    /**
     * Fecha de suspensión de servicio asociada a la factura.
     */
    private String fechaSuspension;

    /**
     * Obtiene el número de factura.
     *
     * @return El número de factura.
     */
    public int getNumeroFactura() {
        return numeroFactura;
    }

    /**
     * Establece el número de factura.
     *
     * @param numeroFactura El número de factura a establecer.
     */
    public void setNumeroFactura(int numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    /**
     * Obtiene la fecha de la factura.
     *
     * @return La fecha de la factura.
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * Establece la fecha de la factura.
     *
     * @param fecha La fecha de la factura a establecer.
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * Obtiene el cliente asociado a la factura.
     *
     * @return El cliente asociado a la factura.
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * Establece el cliente asociado a la factura.
     *
     * @param cliente El cliente a establecer.
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * Obtiene el subtotal de la factura.
     *
     * @return El subtotal de la factura.
     */
    public double getSubtotal() {
        return subtotal;
    }

    /**
     * Establece el subtotal de la factura.
     *
     * @param subtotal El subtotal de la factura a establecer.
     */
    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    /**
     * Obtiene el total de la factura.
     *
     * @return El total de la factura.
     */
    public double getTotal() {
        return total;
    }

    /**
     * Establece el total de la factura.
     *
     * @param total El total de la factura a establecer.
     */
    public void setTotal(double total) {
        this.total = total;
    }

    /**
     * Obtiene el estado de pago oportuno de la factura.
     *
     * @return El estado de pago oportuno de la factura.
     */
    public String getPagoOportuno() {
        return pagoOportuno;
    }

    /**
     * Establece el estado de pago oportuno de la factura.
     *
     * @param pagoOportuno El estado de pago oportuno de la factura a establecer.
     */
    public void setPagoOportuno(String pagoOportuno) {
        this.pagoOportuno = pagoOportuno;
    }

    /**
     * Obtiene la fecha de suspensión de servicio asociada a la factura.
     *
     * @return La fecha de suspensión de servicio.
     */
    public String getFechaSuspension() {
        return fechaSuspension;
    }

    /**
     * Establece la fecha de suspensión de servicio asociada a la factura.
     *
     * @param fechaSuspension La fecha de suspensión de servicio a establecer.
     */
    public void setFechaSuspension(String fechaSuspension) {
        this.fechaSuspension = fechaSuspension;
    }

    /**
     * Método protegido que muestra un mensaje específico para la subclase.
     *
     * @return El mensaje específico de la subclase.
     */
    protected String metodoProtegido() {
        return "Esta en la superclase y se llama " + getClass().getSimpleName();
    }

    /**
     * Calcula el subsidio aplicable a la factura según el estrato del cliente.
     *
     * @param estrato El estrato del cliente.
     * @return El valor del subsidio calculado.
     */
    public abstract double calcularSubsidio(int estrato);

    /**
     * Informa sobre la fecha de corte de la factura.
     *
     * @return La fecha de corte.
     */
    public String informeFechaCorte() {
        return "La fecha de corte es 22/09/2023";
    }

    /**
     * Calcula la retribución según una función y una elección dada.
     *
     * @param funcion   La función para el cálculo.
     * @param eleccion  La elección específica.
     * @return El valor de la retribución calculado.
     */
    public int calcularRetribucion(Funcion funcion, int eleccion) {
        return funcion.calcularFactorial(eleccion) * 4 / 1000;
    }

    /**
     * Devuelve una representación en cadena de la instancia de FacturaGeneral,
     * incluyendo todos los atributos.
     *
     * @return Cadena que representa la instancia de FacturaGeneral.
     */
    @Override
    public String toString() {
        return "FacturaGeneral [numeroFactura=" + numeroFactura + ", fecha=" + fecha + ", cliente=" + cliente
                + ", subtotal=" + subtotal + ", total=" + total + ", pagoOportuno=" + pagoOportuno
                + ", fechaSuspension=" + fechaSuspension + "]";
    }

    /**
     * Constructor de la clase FacturaGeneral que recibe varios parámetros para inicializar sus atributos.
     *
     * @param numeroFactura   El número de factura.
     * @param fecha           La fecha de la factura.
     * @param cliente         El cliente asociado a la factura.
     * @param subtotal        El subtotal de la factura.
     * @param total           El total de la factura.
     * @param pagoOportuno    El estado de pago oportuno de la factura.
     * @param fechaSuspension La fecha de suspensión de servicio asociada a la factura.
     */
    public FacturaGeneral(int numeroFactura, String fecha, Cliente cliente, double subtotal, double total,
			String pagoOportuno, String fechaSuspension) {
		super();
		this.numeroFactura = numeroFactura;
		this.fecha = fecha;
		this.cliente = cliente;
		this.subtotal = subtotal;
		this.total = total;
		this.pagoOportuno = pagoOportuno;
		this.fechaSuspension = fechaSuspension;
		
	}
/**Constructor por defecto de la clase FacturaGeneral**/
	public FacturaGeneral() {
		// TODO Auto-generated constructor stub
	}
}