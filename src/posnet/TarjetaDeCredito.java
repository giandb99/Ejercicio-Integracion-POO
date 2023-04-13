package posnet;

/**
* Esta clase representa una tarjeta de crédito con 
* la que se pueden realizar pagos.
*/
public class TarjetaDeCredito {
    
    private String entidadBancaria;
    private String nroTarjeta;
    private double saldo;
    private EntidadFinanciera entidadFinanciera;
    private Persona titular;

    /**
    * Constructor de la clase TarjetaDeCredito.
    * 
    * @param entidadBancaria La entidad bancaria a la que pertenece la tarjeta.
    * @param nroTarjeta El número de la tarjeta.
    * @param saldo El saldo disponible en la tarjeta.
    * @param titular La persona titular de la tarjeta.
    * @param entidadFinanciera La entidad financiera a la que pertenece la tarjeta.
    */
    public TarjetaDeCredito(String entidadBancaria, String nroTarjeta, double saldo, Persona titular, EntidadFinanciera entidadFinanciera){
        this.entidadBancaria = entidadBancaria;
        this.nroTarjeta = nroTarjeta;
        this.saldo = saldo;
        this.titular = titular;
        this.entidadFinanciera = entidadFinanciera;
    }
    
    /**
    * Verifica si la tarjeta tiene saldo disponible para realizar
    * un pago por un determinado monto.
    * 
    * @param monto El monto del pago que se desea realizar.
    * @return true si la tarjeta tiene saldo disponible, false en caso contrario.
    */
    public boolean tieneSaldoDisponible(double monto){
        return saldo >= monto;
    }
    
    /**
    * Descuenta un determinado monto del saldo de la tarjeta.
    * 
    * @param monto el monto a descontar.
    */
    public void descontar(double monto){
        saldo -= monto;
    }
    
    /**
    * Devuelve el nombre completo de la persona titular de la tarjeta.
    * 
    * @return El nombre completo de la persona titular de la tarjeta.
    */
    public String nombreCompletoDeTitular(){
        return titular.nombreCompleto();
    }

    /**
    * Devuelve una representación en forma de cadena de la instancia 
    * actual de la clase TarjetaDeCredito.
    * 
    * @return una cadena que contiene información detallada de la tarjeta
    * de crédito
    */
    @Override
    public String toString() {
        return "TarjetaDeCredito{" + "entidadBancaria=" + entidadBancaria +
                ", nroTarjeta=" + nroTarjeta + ", saldo=" + saldo + 
                ", entidadFinanciera=" + entidadFinanciera + ", titular=" +
                titular + '}';
    }
}