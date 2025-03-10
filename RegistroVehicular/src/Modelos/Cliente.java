package Modelos;

public class Cliente {
    private String nombre;
    private String apellido;
    private String dni;

    // Constructor vacío
    public Cliente() {}

    // Constructor con parámetros
    public Cliente(String nombre, String apellido, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Cliente: " + "\n" + nombre + " " + apellido + "\n" + "DNI:" + dni;
    }
}
