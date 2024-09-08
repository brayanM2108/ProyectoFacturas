package co.edu.poli.tarea.model;
/**  @author Brayan Melo
 * */

/**
 * La clase Cliente representa a un cliente con información básica.
 */
import java.io.Serializable;
public class Cliente implements Serializable {

    /**
     * Nombre del cliente.
     */
    private String nombre;

    /**
     * Dirección del cliente.
     */
    private String direccion;

    /**
     * Ciudad del cliente.
     */
    private String ciudad;

    /**
     * Barrio del cliente.
     */
    private String barrio;

    /**
     * Número de teléfono del cliente.
     */
    private String telefono;

    /**
     * Número de cliente único.
     */
    private int numeroCliente;

    /**
     * Constructor predeterminado de la clase Cliente.
     */
    public Cliente() {
    }

    /**
     * Constructor de la clase Cliente que recibe todos los atributos como parámetros.
     *
     * @param nombre        El nombre del cliente.
     * @param direccion     La dirección del cliente.
     * @param ciudad        La ciudad del cliente.
     * @param barrio        El barrio del cliente.
     * @param telefono      El número de teléfono del cliente.
     * @param numeroCliente El número de cliente único.
     */
    public Cliente(String nombre, String direccion, String ciudad, String barrio, String telefono, int numeroCliente) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.barrio = barrio;
        this.telefono = telefono;
        this.numeroCliente = numeroCliente;
    }

    /**
     * Obtiene el nombre del cliente.
     *
     * @return El nombre del cliente.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del cliente.
     *
     * @param nombre El nombre del cliente.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la dirección del cliente.
     *
     * @return La dirección del cliente.
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Establece la dirección del cliente.
     *
     * @param direccion La dirección del cliente.
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * Obtiene la ciudad del cliente.
     *
     * @return La ciudad del cliente.
     */
    public String getCiudad() {
        return ciudad;
    }

    /**
     * Establece la ciudad del cliente.
     *
     * @param ciudad La ciudad del cliente.
     */
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    /**
     * Obtiene el barrio del cliente.
     *
     * @return El barrio del cliente.
     */
    public String getBarrio() {
        return barrio;
    }

    /**
     * Establece el barrio del cliente.
     *
     * @param barrio El barrio del cliente.
     */
    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    /**
     * Obtiene el número de teléfono del cliente.
     *
     * @return El número de teléfono del cliente.
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Establece el número de teléfono del cliente.
     *
     * @param telefono El número de teléfono del cliente.
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * Obtiene el número de cliente único.
     *
     * @return El número de cliente único.
     */
    public int getNumeroCliente() {
        return numeroCliente;
    }

    /**
     * Establece el número de cliente único.
     *
     * @param numeroCliente El número de cliente único.
     */
    public void setNumeroCliente(int numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    /**
     * Devuelve una representación en cadena de la instancia de Cliente,
     * incluyendo todos los atributos.
     *
     * @return Cadena que representa la instancia de Cliente.
     */
    @Override
    public String toString() {
        return "Cliente [nombre=" + nombre + ", direccion=" + direccion + ", ciudad=" + ciudad + ", barrio=" + barrio
                + ", telefono=" + telefono + ", numeroCliente=" + numeroCliente + "]";
    }
}
