package co.edu.poli.tarea.model;
/**  @author Brayan Melo
 * */
import java.util.Arrays;

/**
 * La clase Accion representa una colección de FacturaGeneral y proporciona
 * métodos para gestionar estas facturas.
 */
public class Accion {

    /**
     * Arreglo de FacturaGeneral que almacena las facturas.
     */
    private FacturaGeneral[] facturas;

    /**
     * Constructor predeterminado de la clase Accion.
     * Inicializa el arreglo de facturas con una capacidad predeterminada de 5.
     */
    public Accion() {
        facturas = new FacturaGeneral[5];
    }

    /**
     * Obtiene el arreglo de facturas almacenado en la instancia de Accion.
     *
     * @return Arreglo de FacturaGeneral.
     */
    public FacturaGeneral[] getFacturas() {
        return facturas;
    }

    /**
     * Establece el arreglo de facturas en la instancia de Accion.
     *
     * @param facturas Arreglo de FacturaGeneral que se asignará.
     */
    public void setFacturas(FacturaGeneral[] facturas) {
        this.facturas = facturas;
    }

    /**
     * Agrega una FacturaGeneral al arreglo de facturas si hay espacio disponible.
     *
     * @param a FacturaGeneral que se va a agregar.
     * @return "guardado" si se agregó correctamente, "esta lleno el arreglo" si el arreglo está lleno.
     */
    public String create(FacturaGeneral a) {
        for (int i = 0; i < facturas.length; i++) {
            if (facturas[i] == null) {
                facturas[i] = a;
                return "guardado";
            }
        }
        return "esta lleno el arreglo";
    }

    /**
     * Busca y devuelve una FacturaGeneral en el arreglo de facturas
     * basándose en su número de factura.
     *
     * @param numeroFactura Número de factura a buscar.
     * @return La FacturaGeneral encontrada o null si no se encuentra.
     */
    public FacturaGeneral read(int numeroFactura) {
        for (int i = 0; i < facturas.length; i++) {
            if (facturas[i] != null && facturas[i].getNumeroFactura() == numeroFactura) {
                return facturas[i];
            }
        }
        return null;
    }

    /**
     * Elimina una FacturaGeneral del arreglo de facturas
     * basándose en su número de factura.
     *
     * @param numeroFactura Número de factura a eliminar.
     * @return La FacturaGeneral eliminada o null si no se encuentra.
     */
    public FacturaGeneral delete(int numeroFactura) {
        FacturaGeneral cuenta_b = null;
        for (int i = 0; i < facturas.length; i++) {
            if (facturas[i] != null && facturas[i].getNumeroFactura() == numeroFactura) {
                cuenta_b = facturas[i];
                facturas[i] = null;
                return cuenta_b;
            }
        }
        return cuenta_b;
    }

    /**
     * Actualiza una FacturaGeneral en el arreglo de facturas
     * basándose en su número de factura.
     *
     * @param x            La nueva FacturaGeneral que se va a asignar.
     * @param numeroFactura Número de factura a actualizar.
     * @return "Actualizado" si se actualizó correctamente, "No actualizacion" si no se encontró la factura.
     */
    public String update(FacturaGeneral x, int numeroFactura) {
        for (int i = 0; i < facturas.length; i++) {
            if (facturas[i] != null && facturas[i].getNumeroFactura() == numeroFactura) {
                facturas[i] = x;
                return "Actualizado";
            }
        }
        return "No actualizacion";
    }

    /**
     * Devuelve una representación en cadena de la instancia de Accion,
     * incluyendo la lista de facturas almacenadas.
     *
     * @return Cadena que representa la instancia de Accion.
     */
    @Override
    public String toString() {
        return "Accion [facturas=" + Arrays.toString(facturas) + "]";
    }
    
    public String readall () {
        String s="";
        for (int i = 0; i < facturas.length; i++) {
            s+=facturas[i]+"\n";
        }
        return s;
    }

	public Accion(FacturaGeneral[] fact) {
		facturas = fact;
	}
    

}
