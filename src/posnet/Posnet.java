package posnet;

/**
 * Clase que modela un dispositivo POSNET que procesa 
 * pagos con tarjetas de crédito.
 */
public class Posnet {
    
    /** Recargo por cuota en porcentaje */
    public static final double RECARGO_POR_CUOTA = 0.03;
    /** Cantidad mínima de cuotas permitidas */
    public static final int MIN_CANT_CUOTAS = 1;
    /** Cantidad máxima de cuotas permitidas */
    public static final int MAX_CANT_CUOTAS = 6;

    /**
     * Realiza el proceso de efectuar un pago con una tarjeta de crédito.
     * 
     * @param tarjeta la tarjeta de crédito con la que se desea realizar el pago.
     * @param montoAAbonar el monto que se desea abonar.
     * @param cantCuotas la cantidad de cuotas en las que se desea abonar.
     * @return un objeto Ticket si el pago fue exitoso, o null en caso contrario.
     */
    public Ticket efectuarPago(TarjetaDeCredito tarjeta, double montoAAbonar, int cantCuotas){
        Ticket elTicket = null;
        
        if(datosValidos(tarjeta, montoAAbonar, cantCuotas)){
            double montoFinal = montoAAbonar + montoAAbonar * recargoSegunCuotas(cantCuotas);
            if(tarjeta.tieneSaldoDisponible(montoFinal)){
                tarjeta.descontar(montoFinal);
                String nomApe= tarjeta.nombreCompletoDeTitular();
                double montoPorCuota = montoFinal / cantCuotas;
                elTicket = new Ticket(nomApe, montoFinal, montoPorCuota);
                
            }
        }
        
        return elTicket;
    }
    
     /**
     * Verifica que los datos ingresados sean válidos para realizar un pago.
     * @param tarjeta la tarjeta de crédito con la que se desea realizar el pago.
     * @param monto el monto que se desea abonar.
     * @param cant la cantidad de cuotas en las que se desea abonar.
     * @return true si los datos son válidos, false en caso contrario.
     */
    private boolean datosValidos(TarjetaDeCredito tarjeta, double monto, int cant){
        boolean esTarjetaValida = tarjeta != null;
        boolean esMontoValido = monto > 0;
        boolean cantCuotasValidas = cant >= MIN_CANT_CUOTAS && cant <= MAX_CANT_CUOTAS;
                
        return esTarjetaValida && esMontoValido && cantCuotasValidas;
    }
    
    /**
     * Calcula el recargo en porcentaje según la cantidad de cuotas elegidas.
     * @param cantCuotas la cantidad de cuotas en las que se desea abonar.
     * @return el recargo en porcentaje.
     */
    private double recargoSegunCuotas(int cantCuotas){
        
        return (cantCuotas - 1) * RECARGO_POR_CUOTA;
    }
}

