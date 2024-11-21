public class Vehiculo {
    private Modelo modelo;
    private double peso;
    private String patente;
    private int anioDeFabricacion;
    private int numeroDeChasis;
    private Cliente cliente;

    // constructors
    public Vehiculo() {
    }

    public Vehiculo(Modelo modelo, double peso, String patente, int anioDeFabricacion, int numeroDeChasis, Cliente cliente) {
        this.modelo = modelo;
        this.peso = peso;
        this.patente = patente;
        this.anioDeFabricacion = anioDeFabricacion;
        this.numeroDeChasis = numeroDeChasis;
        this.cliente = cliente;
    }

    // getters
    public Modelo getModelo() {return modelo;}
    public double getPeso() {return peso;}
    public String getPatente() {return patente;}
    public int getAnioDeFabricacion() {return anioDeFabricacion;}
    public int getNumeroDeChasis() {return numeroDeChasis;}
    public Cliente getCliente() {return cliente;}

    //setters
    public void setModelo(Modelo modelo) {this.modelo = modelo;}
    public void setPeso(double peso) {this.peso = peso;}
    public void setPatente(String patente) {this.patente = patente;}
    public void setAnioDeFabricacion(int anioDeFabricacion) {this.anioDeFabricacion = anioDeFabricacion;}
    public void setNumeroDeChasis(int numeroDeChasis) {this.numeroDeChasis = numeroDeChasis;}
    public void setCliente(Cliente cliente) {this.cliente = cliente;}
}