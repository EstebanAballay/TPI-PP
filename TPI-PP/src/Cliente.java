public class Cliente extends Personas
{
    private String condicionIVA;

    public Cliente(String nombre, String apellido, String tipoDocumento, String telefono, String domicilio, String mail, Vehiculo vehiculo)
    {
        super(nombre, apellido, tipoDocumento, telefono, domicilio, mail);
    }

    public Cliente(Personas Persona,String condicionIVA)
    {
        super();
        this.condicionIVA = condicionIVA;
    }

    public String getCondicionIVA() {return condicionIVA;}
    public void setCondicionIVA(String condicionIVA) {this.condicionIVA = condicionIVA;}

    @Override
    public String toString() {
        return super.toString();
    }
}
