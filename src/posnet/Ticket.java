package posnet;

/**
 * La clase Ticket representa un ticket generado a partir de una transacción 
 * de pago con tarjeta de crédito.
 * 
 * Contiene información sobre el titular de la tarjeta, el monto total de 
 * la transacción y el monto de cada cuota.
*/
public class Ticket {

    private String nombreApellido;
    private double montoTotal;
    private double montoPorCuota;
    
    /**
     * Constructor de la clase Ticket.
     * 
     * @param nombreApellido el nombre y apellido del titular de la tarjeta
     * @param montoTotal el monto total de la transacción
     * @param montoPorCuota el monto de cada cuota
    */
    public Ticket(String nombreApellido, double montoTotal, double montoPorCuota){
        this.nombreApellido = nombreApellido;
        this.montoTotal = montoTotal;
        this.montoPorCuota = montoPorCuota;
    }

    /**
     * Devuelve una representación en forma de cadena de caracteres del 
     * objeto Ticket.
     * 
     * @return una representación en forma de cadena de caracteres del 
     * objeto Ticket
    */
    @Override
    public String toString() {
        return "Ticket{" + "nombreApellido=" + nombreApellido + ", montoTotal=" 
                + montoTotal + ", montoPorCuota=" + montoPorCuota + '}';
    }
}
