package Modelos;

public class Vehiculo {
    private String patente;
    private String numeroChasis;
    private int anioFabricacion;
    private double peso;
    private String marca;
    private String modelo;

    // Constructor vacío
    public Vehiculo() {
    }

    // Getters y Setters
    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getNumeroChasis() {
        return numeroChasis;
    }

    public void setNumeroChasis(String numeroChasis) {
        this.numeroChasis = numeroChasis;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    // Método toString para mostrar los datos del vehículo
    @Override
    public String toString() {
        return "Vehículo:" +
                "\nPatente: " + patente +
                "\nNúmero de Chasis: " + numeroChasis +
                "\nAño de Fabricación: " + anioFabricacion +
                "\nPeso: " + peso + " kg" +
                "\nMarca: " + marca +
                "\nModelo: " + modelo;
    }
}

