package Modelos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class GestorMarca {
    private ArrayList<Marca> listaMarcas;

    public GestorMarca() {
        this.listaMarcas = new ArrayList<> ();
    }

    //Devuelvo una array(str) con los nombres de las marcas
    public String[] getListaMarcas() {
        String[] nombres = new String[listaMarcas.size()];
        for (int i = 0; i < listaMarcas.size(); i++) {
            nombres[i] = listaMarcas.get(i).getName();
        }
        return nombres;
    }

    //Devuelvo la lista de marcas como arraylist, con objetos tipo marca
    public ArrayList<Marca> getMarcas(){
        return listaMarcas;
    }

    public String[] getListaModelos(String nombreMarca) {
        String[] output = new String[0];
        for(int i=0; i<listaMarcas.size();) {
            output = new String[listaMarcas.get(i).getModelosMarca().size()];
            if(listaMarcas.get(i).getName().equals(nombreMarca)){
                output = listaMarcas.get(i).getListaModelos();
            }
        }
        return output;
    }

    public void agregarMarca(Marca marca){
        this.listaMarcas.add(marca);
    }

    @Override
    public String toString() {
        return "GestorMarca{" + "listaMarcas=" + listaMarcas + '}';
    }
}
