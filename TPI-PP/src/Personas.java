public class Personas
{
    private String nombre;
    private String apellido;
    private String tipoDocumento;
    private String telefono;
    private String domicilio;
    private String mail;

    //Constructor
    public Personas(String nombre, String apellido, String tipoDocumento, String telefono, String domicilio, String mail) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipoDocumento = tipoDocumento;
        this.telefono = telefono;
        this.domicilio = domicilio;
        this.mail = mail;
    }

    public Personas() {

    }

    //Getters
    public String getNombre() {return nombre;}
    public String getApellido() {return apellido;}
    public String getTipoDocumento() {return tipoDocumento;}
    public String getTelefono() {return telefono;}
    public String getDomicilio() {return domicilio;}
    public String getMail() {return mail;}
    //Setters
    public void setNombre(String nombre) {this.nombre = nombre;}
    public void setApellido(String apellido) {this.apellido = apellido;}
    public void setTipoDocumento(String tipoDocumento) {this.tipoDocumento = tipoDocumento;}
    public void setTelefono(String telefono) {this.telefono = telefono;}
    public void setDomicilio(String domicilio) {this.domicilio = domicilio;}
    public void setMail(String mail) {this.mail = mail;}
}
