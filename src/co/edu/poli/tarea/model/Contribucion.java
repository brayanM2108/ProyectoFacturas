package co.edu.poli.tarea.model;
/**  @author Brayan Melo
 * */
 
/**
 * La interfaz Contribucion define el contrato para calcular la tasa de contribución.
 */
public interface Contribucion {

    /**
     * Método que debe ser implementado para consultar la tasa de contribución.
     *
     * @return El valor de la tasa de contribución.
     */
    public double consultarTasa();
}
