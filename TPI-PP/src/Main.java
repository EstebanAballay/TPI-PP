import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Creo una persona
        Personas persona1 = new Personas("Juan","Perez","DNI","3584367220","French 123","mailpersonal@yahoo.com");
        //creo un cliente con esa persona
        Cliente cliente1 = new Cliente(persona1,"Monotributista");

        //NO fue necesario que alguien carga marca y modelo

        Modelo modelo1 = new Modelo("Pulse");
        Marca fiat = new Marca(modelo1, "Fiat");

        //Crear vehiculo(por ahora funciona por una sola vez)
        Vehiculo vehiculo1 = new Vehiculo();

        Scanner entrada = new Scanner(System.in);  // Create a Scanner object

        System.out.println("Ingrese peso: ");
        double peso = entrada.nextDouble();
        vehiculo1.setPeso(peso);

        System.out.println("Ingrese numero de patente: ");
        String patente = entrada.nextLine();
        vehiculo1.setPatente(patente);

        System.out.println("Ingrese anio de fabricacion: ");
        int anio = entrada.nextInt();
        vehiculo1.setAnioDeFabricacion(anio);

        System.out.println("Ingrese numero de chasis: ");
        int chasis = entrada.nextInt();
        vehiculo1.setNumeroDeChasis(chasis);


        vehiculo1.setCliente(cliente1);
        vehiculo1.setModelo(modelo1);


        System.out.println("Marca: " + fiat.getNombre() + ", Modelo: " + modelo1.getNombre());
    }
}
