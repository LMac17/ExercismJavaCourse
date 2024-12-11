/**
 * Clase que demuestra los tipos de variables en Java.
 * Incluye variables locales y de instancia.
 */
package Variables;

public class TiposVariables {

    // Variable de instancia
    private int variableDeInstancia;

    /**
     * Constructor de la clase TiposVariables.
     * Inicializa la variable de instancia.
     * 
     * @param valorInicial El valor inicial para la variable de instancia.
     */
    public TiposVariables(int valorInicial) {
        this.variableDeInstancia = valorInicial;
    }

    /**
     * Método que demuestra el uso de una variable local.
     * 
     * @param incremento El valor a incrementar a la variable de instancia.
     * @return El nuevo valor de la variable de instancia después del incremento.
     */
    public int incrementarVariable(int incremento) {
        // Variable local
        int resultado = this.variableDeInstancia + incremento;
        return resultado;
    }

    /**
     * Método principal para ejecutar la demostración.
     * 
     * @param args Argumentos de la línea de comandos.
     */
    public static void main(String[] args) {
        // Crear una instancia de TiposVariables
        TiposVariables ejemplo = new TiposVariables(10);

        // Usar el método incrementarVariable
        int nuevoValor = ejemplo.incrementarVariable(5);

        // Imprimir el resultado
        System.out.println("El nuevo valor de la variable de instancia es: " + nuevoValor);
        System.out.println("Valor inicial de la variable de instancia es: " + ejemplo.variableDeInstancia
                + " y el nuevo valor (con incremento) es: " + nuevoValor);
    }
}