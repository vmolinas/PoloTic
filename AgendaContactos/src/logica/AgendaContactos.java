package logica;

import igu.Agenda;

/**
 * @author victor
 */

/**
 * Se necesita un programa para gestionar los contactos de una agenda electrónica.
 *   a. En la agenda se debe permitir ingresar los siguientes datos: dni, nombre, apellido, fecha
 *      de nacimiento, teléfono y dirección (cada uno en su correspondiente textField).
 *   b. Se necesitan almacenar los datos de 10 personas. Para ello se propone la utilización de
 *      1 vector para almacenar los valores de cada uno de los campos (teniendo en cuenta
 *      que pueden existir distintos tipos de datos), en donde cada índice indicará los datos de
 *      una determinada persona en todos los vectores 
 */
public class AgendaContactos {

    
    public static void main(String[] args) {
        
        // Inicializar y posicionarlo en el centro de la pantalla
        Agenda pantalla = new Agenda();
        pantalla.setVisible(true);
        pantalla.setLocationRelativeTo(null);

    }
    
}