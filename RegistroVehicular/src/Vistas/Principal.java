package Vistas;
import Modelos.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;


import Modelos.Models;
import Modelos.Marca;
import Modelos.GestorMarca;

public class Principal extends JFrame {
    private JPanel pnlPrincipal;
    private JButton buttonGuardar;
    private JTextField patenteTextField;
    private JTextField chasisTextField;
    private JTextField anioTextField;
    private JTextField pesoTextField;
    private JTextArea areaDatos;
    private JComboBox<String> comboMarcas;
    private JComboBox<String> comboModelos;
    private JTextField nombreClienteTextField;
    private JTextField apellidoClienteTextField;
    private JTextField dniClienteTextField;
    //Creo la clase gestora
    private GestorMarca gestor = getGestorMarca();

    public Principal() {
        // Configuración básica de la ventana
        setTitle("Registro de Vehículos");
        setSize(400, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Inicialización de componentes
        createUIComponents();

        // Asignar el panel principal como el contenido de la ventana
        setContentPane(pnlPrincipal);

        // Hacer visible la ventana
        setVisible(true);

        //Todo esto se realiza cuando apriteto el boton guardar
        buttonGuardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Crear el cliente
                Cliente cliente = new Cliente();
                cliente.setNombre(nombreClienteTextField.getText());
                cliente.setApellido(apellidoClienteTextField.getText());
                cliente.setDni(dniClienteTextField.getText());

                // Crear el objeto Vehiculo con los datos ingresados
                Vehiculo vehiculo = new Vehiculo();
                vehiculo.setPatente(patenteTextField.getText());
                vehiculo.setNumeroChasis(chasisTextField.getText());
                vehiculo.setAnioFabricacion(Integer.parseInt(anioTextField.getText()));
                vehiculo.setPeso(Double.parseDouble(pesoTextField.getText()));
                vehiculo.setMarca((String) comboMarcas.getSelectedItem());
                vehiculo.setModelo((String) comboModelos.getSelectedItem());

                // Limpiar campos después de guardar
                limpiarCampos();
            }
        });
    }

    private void createUIComponents() {
        // Inicializar pnlPrincipal
        pnlPrincipal = new JPanel();
        pnlPrincipal.setLayout(null);

        // Componentes de entrada
        // Campos para Cliente
        JLabel lblNombreCliente = new JLabel("Nombre:");
        lblNombreCliente.setBounds(20, 20, 150, 30);
        pnlPrincipal.add(lblNombreCliente);

        nombreClienteTextField = new JTextField();
        nombreClienteTextField.setBounds(150, 20, 200, 30);
        pnlPrincipal.add(nombreClienteTextField);

        JLabel lblApellidoCliente = new JLabel("Apellido:");
        lblApellidoCliente.setBounds(20, 60, 150, 30);
        pnlPrincipal.add(lblApellidoCliente);

        apellidoClienteTextField = new JTextField();
        apellidoClienteTextField.setBounds(150, 60, 200, 30);
        pnlPrincipal.add(apellidoClienteTextField);

        JLabel lblDniCliente = new JLabel("DNI:");
        lblDniCliente.setBounds(20, 100, 150, 30);
        pnlPrincipal.add(lblDniCliente);

        dniClienteTextField = new JTextField();
        dniClienteTextField.setBounds(150, 100, 200, 30);
        pnlPrincipal.add(dniClienteTextField);

        // Campo de texto para Patente
        JLabel lblPatente = new JLabel("Patente:");
        lblPatente.setBounds(20, 140, 150, 30);
        pnlPrincipal.add(lblPatente);

        patenteTextField = new JTextField();
        patenteTextField.setBounds(150, 140, 200, 30);
        pnlPrincipal.add(patenteTextField);

        // Campo de texto para Número de Chasis
        JLabel lblNumeroChasis = new JLabel("Número de Chasis:");
        lblNumeroChasis.setBounds(20, 180, 150, 30);
        pnlPrincipal.add(lblNumeroChasis);

        chasisTextField = new JTextField();
        chasisTextField.setBounds(150, 180, 200, 30);
        pnlPrincipal.add(chasisTextField);

        // Campo de texto para Año de Fabricación
        JLabel lblAnioFabricacion = new JLabel("Año de Fabricación:");
        lblAnioFabricacion.setBounds(20, 220, 150, 30);
        pnlPrincipal.add(lblAnioFabricacion);

        anioTextField = new JTextField();
        anioTextField.setBounds(150, 220, 200, 30);
        pnlPrincipal.add(anioTextField);

        // Campo de texto para Peso
        JLabel lblPeso = new JLabel("Peso (kg):");
        lblPeso.setBounds(20, 260, 150, 30);
        pnlPrincipal.add(lblPeso);

        pesoTextField = new JTextField();
        pesoTextField.setBounds(150, 260, 200, 30);
        pnlPrincipal.add(pesoTextField);

        // ComboBox para marcas
        JLabel lblMarca = new JLabel("Marca:");
        lblMarca.setBounds(20, 300, 150, 30);
        pnlPrincipal.add(lblMarca);

        comboMarcas = new JComboBox<>(gestor.getListaMarcas());
        comboMarcas.setBounds(150, 300, 200, 30);
        pnlPrincipal.add(comboMarcas);

        // ComboBox para modelos
        JLabel lblModelo = new JLabel("Modelo:");
        lblModelo.setBounds(20, 340, 150, 30);
        pnlPrincipal.add(lblModelo);

        comboModelos = new JComboBox<>();
        comboModelos.setBounds(150, 340, 200, 30);
        pnlPrincipal.add(comboModelos);

        // Acción para actualizar los modelos según la marca seleccionada
        comboMarcas.addActionListener(e -> {
            actualizarModelosSegunMarca();
        });

        // Botón para Guardar
        buttonGuardar = new JButton("Guardar");
        buttonGuardar.setBounds(20, 380, 330, 30);
        pnlPrincipal.add(buttonGuardar);

        // Área de texto para mostrar datos
        areaDatos = new JTextArea();
        areaDatos.setBounds(13, 420, 360, 180);
        areaDatos.setEditable(false);
        pnlPrincipal.add(areaDatos);
    }

    private static GestorMarca getGestorMarca() {
        GestorMarca gestor = new GestorMarca();
        //Ford
        Marca marca0 = new Marca("Ford");
        Models modelo0 = new Models("focus");
        Models modelo1 = new Models("Ranger");
        Models modelo2 = new Models("Fiesta");
        marca0.agregarModelos(modelo0);
        marca0.agregarModelos(modelo1);
        marca0.agregarModelos(modelo2);
        gestor.agregarMarca(marca0);
        //Toyota
        Marca marca1 = new Marca("Toyota");
        Models modelo3 = new Models("Corolla");
        Models modelo4 = new Models("Hilux");
        Models modelo5 = new Models("Camry");
        marca1.agregarModelos(modelo3);
        marca1.agregarModelos(modelo4);
        marca1.agregarModelos(modelo5);
        gestor.agregarMarca(marca1);
        //Chevrolet
        Marca marca2 = new Marca("Chevrolet");
        Models modelo6 = new Models("Cruze");
        Models modelo7 = new Models( "S10");
        Models modelo8 = new Models( "Onix");
        marca2.agregarModelos(modelo6);
        marca2.agregarModelos(modelo7);
        marca2.agregarModelos(modelo8);
        gestor.agregarMarca(marca2);
        return gestor;
    }

    private void actualizarModelosSegunMarca() {
        ArrayList<Marca> listaGestora = gestor.getMarcas();
        // Obtener la marca seleccionada
        String marcaSeleccionada = (String) comboMarcas.getSelectedItem();
        // Obtener modelos relacionados con la marca
        String[] modelos = new String[3];

        for(Marca marca:listaGestora){
            if (marca.getName().equals(marcaSeleccionada)){
                modelos = marca.getListaModelos();
            }
        }

        // Actualizar el ComboBox de modelos
        comboModelos.removeAllItems();
        for (String modelo : modelos) {
            comboModelos.addItem(modelo);
        }
    }

    private void limpiarCampos() {
        patenteTextField.setText("");
        chasisTextField.setText("");
        anioTextField.setText("");
        pesoTextField.setText("");
        nombreClienteTextField.setText("");
        apellidoClienteTextField.setText("");
        dniClienteTextField.setText("");
        comboMarcas.setSelectedIndex(0);
        comboModelos.setSelectedIndex(0);
    }

    public static void main(String[] args) {
        new Principal();
    }
}

