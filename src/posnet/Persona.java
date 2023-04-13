package posnet;

/**
 * La clase Persona representa una persona con información básica como DNI, 
 * nombre, apellido, teléfono y correo electrónico.
 */
public class Persona {

    private String DNI;
    private String nombre;
    private String apellido;
    private String telefono;
    private String mail;
    
    /**
    * Constructor de la clase Persona.
    *
    * @param DNI el DNI de la persona.
    * @param nombre el nombre de la persona.
    * @param apellido el apellido de la persona.
    * @param telefono el teléfono de la persona.
    * @param mail el correo electrónico de la persona.
    */
    public Persona(String DNI, String nombre, String apellido, String telefono, String mail){
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.mail = mail;
    }
    
    /**
    * Devuelve el nombre completo de la persona.
    *
    * @return el nombre y apellido concatenados como un String.
    */
    public String nombreCompleto(){
        return nombre + " " + apellido;
    }
}
