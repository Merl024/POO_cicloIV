
package tiposDeDatos;

public class TiposDatos {
    /* Tipos de datos */

    /* ############ Primitivos ############ */
    /* Enteros - valor default = 0*/
    byte tipoByte = 127; // Valor maximo que se le puede mandar
    short tipoShort = 32767; // Valor maximo que se le puede mandar
    int tipoInt = 2147483647; // Valor maximo que se le puede mandar
    long tipoLong = 9223372036854775807L; // Valor maximo que se le puede mandar y despues de sobrepasar ciertos digitos, se pone l al final

    /* Flotantes - valor default = 0.0 */
    /* Por default los decimales se especifican como double, por eso al float se le tiene que especificar. */
    float tipoFloat = 3.34F; // Valor maximo que se le puede mandar, f para indicar que es float
    double tipoDouble = 9.44434; // Valor maximo que se le puede mandar, sin especificar que es double

    /* Caracteres - valor default = \u0000*/
    char uniCode = 'A';

    /* Booleano - valor default = False */
    boolean tipoBoolean = true;

    /* ############ No primitivos ############ */
    /* Cadenas */
    String cadena = null; // Valor default = ausencia de referencia de un objeto

}   
