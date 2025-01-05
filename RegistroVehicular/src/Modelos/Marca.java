package Modelos;

import java.util.ArrayList;
import java.util.List;

public class Marca {
    private final String name;
    private ArrayList<Models> listaModelos;

    public Marca(String name) {
        this.name = name;
        this.listaModelos = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    //Devuelve la lista de modelos como arrayList
    public ArrayList<Models> getModelosMarca(){
        return listaModelos;
    }

    //Devuelve la lista de modelos como array de strings
    public String[] getListaModelos() {
        String[] nombres = new String[listaModelos.size()];
        for (int i = 0; i < listaModelos.size(); i++) {
            nombres[i] = listaModelos.get(i).getName();
        }
        return nombres;
    }

    public void agregarModelos(Models modelo)
    {
        this.listaModelos.add(modelo);
    }
}
