package posnet;

/**
 * La clase Principal es el punto de entrada de la aplicación.
 * 
 * En este programa se crea una instancia de Posnet, una instancia de Persona y
 * una instancia de TarjetaDeCredito para simular un pago.
 * 
 * Se realiza un pago con el objeto Posnet y se genera un Ticket con los 
 * datos del pago.
 * 
 * Luego se imprimen por consola el estado de la TarjetaDeCredito antes y 
 * después del pago, y los datos del Ticket generado.
*/
public class Principal {

    /**
     * El método main es el punto de entrada de la aplicación.
     * 
     * En este método se crean una instancia de Posnet, una instancia de
     * Persona y una instancia de TarjetaDeCredito.
     * 
     * Luego se realiza un pago de 10000 en 5 cuotas utilizando el objeto
     * Posnet y la instancia de TarjetaDeCredito.
     * 
     * Se genera un Ticket con los datos del pago.
     * 
     * Se imprimen por consola el estado de la TarjetaDeCredito antes y después
     * del pago, y los datos del Ticket generado.
    */
    public static void main(String args[]) {
        
        // Crea una instancia de Posnet
        Posnet posnet = new Posnet();
        // Crea una instancia de Persona
        Persona p = new Persona("12312312","Pepe","Gomez","1112345678","pepe@fakemail.com");
        // Crea una instancia de TarjetaDeCredito
        TarjetaDeCredito t = new TarjetaDeCredito("FakeBank","1234567890123456", 15000, p, EntidadFinanciera.BIRZA);
                
        // Imprime el estado de la TarjetaDeCredito antes del pago
        System.out.println("Tarjeta antes del pago");
        System.out.println(t);
        
        // Realiza el pago con Posnet y genera un Ticket
        System.out.println("Ticket tras pagar...");
        Ticket ticketGenerado = posnet.efectuarPago(t, 10000, 5);
        // Imprime los datos del Ticket generado
        System.out.println(ticketGenerado);
        
        // Imprime el estado de la TarjetaDeCredito después del pago
        System.out.println("Tarjeta despues del pago");
        System.out.println(t);
    }
}
