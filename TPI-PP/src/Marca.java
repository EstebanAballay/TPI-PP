public class Marca {
    String nombre;
    Modelo modelo;

    public Marca(Modelo modelo, String nombre) {
        this.modelo = modelo;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }


    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}