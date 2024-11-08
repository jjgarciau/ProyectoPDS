//Generated by GuiGenie - Copyright (c) 2004 Mario Awad.
//Home Page http://guigenie.cjb.net - Check often for new versions!

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
//import javax.swing.event.*;

public class MainInterfaz extends JPanel {
    private JButton btnSalirReunion;
    private JButton btnPerfil;
    private JLabel txtInfoPersonal;
    private JList listReunionInscritas;
    private JLabel txtReunionInscritas;
    private JLabel txtReunionDisponible;
    private JList listReunionDisponible;
    private JTextField cuadroTxtBuscarReunion;
    private JButton btnInscribirReunion;
    private JButton btnCrearReunion;
    private JTextField cuadroTxtFechaReunion;
    private JTextField cuadroTxtLugarReunion;
    private JLabel txtFechaReunion;
    private JLabel txtNuevaReunion;
    private JLabel txtLugarReunion;
    private JList listMisReunion;
    private JButton btnEditarReunion;
    private JTextField cuadroTxtMaxEstudiantes;
    private JLabel txtMaxEstudiantes;
    private JButton btnGuardarReunion;
    private JButton btnEliminarReunion;

    public MainInterfaz() {
        //construct preComponents
        String[] listReunionInscritasItems = {"Reunión 1", "Reunión 2", "Reunión 3", "Reunión 4"};
        String[] listReunionDisponibleItems = {"Reunión dispo 1  (Monitor/Materia,Fecha/hora, Lugar)	", "Reunión dispo 2  (Monitor/Materia,Fecha/hora, Lugar)	", "Reunión dispo 3  (Monitor/Materia,Fecha/hora, Lugar)	", "Reunión dispo 4  (Monitor/Materia,Fecha/hora, Lugar)", "Reunión dispo 5  (Monitor/Materia,Fecha/hora, Lugar)	", "Reunión dispo 6  (Monitor/Materia,Fecha/hora, Lugar)", "Reunión dispo 7  (Monitor/Materia,Fecha/hora, Lugar)", "..."};
        String[] listMisReunionItems = {"Mi reunión 1  (Fecha/hora, Lugar)", "Mi reunión 2  (Fecha/hora, Lugar)", "Mi reunión 3  (Fecha/hora, Lugar)"};

        //construct components
        btnSalirReunion = new JButton ("Salirse de la reunión");
        btnPerfil = new JButton ("P");
        txtInfoPersonal = new JLabel ("Informacion Personal");
        listReunionInscritas = new JList (listReunionInscritasItems);
        txtReunionInscritas = new JLabel ("Reuniones inscritas");
        txtReunionDisponible = new JLabel ("Reuniones Disponibles");
        listReunionDisponible = new JList (listReunionDisponibleItems);
        cuadroTxtBuscarReunion = new JTextField (5);
        btnInscribirReunion = new JButton ("Inscribirse a reunión");
        btnCrearReunion = new JButton ("Crear reunión");
        cuadroTxtFechaReunion = new JTextField (5);
        cuadroTxtLugarReunion = new JTextField (5);
        txtFechaReunion = new JLabel ("Fecha de la reunión");
        txtNuevaReunion = new JLabel ("Nueva Reunión");
        txtLugarReunion = new JLabel ("Lugar de la reunión");
        listMisReunion = new JList (listMisReunionItems);
        btnEditarReunion = new JButton ("Editar reunión");
        cuadroTxtMaxEstudiantes = new JTextField (5);
        txtMaxEstudiantes = new JLabel ("Max Estudiantes");
        btnGuardarReunion = new JButton ("Guardar reunión");
        btnEliminarReunion = new JButton ("Eliminar reunión");

        //set components properties
        cuadroTxtBuscarReunion.setToolTipText ("Buscar reunión");

        //adjust size and set layout
        setPreferredSize (new Dimension (946, 571));
        setLayout (null);

        //add components
        add (btnSalirReunion);
        add (btnPerfil);
        add (txtInfoPersonal);
        add (listReunionInscritas);
        add (txtReunionInscritas);
        add (txtReunionDisponible);
        add (listReunionDisponible);
        add (cuadroTxtBuscarReunion);
        add (btnInscribirReunion);
        add (btnCrearReunion);
        add (cuadroTxtFechaReunion);
        add (cuadroTxtLugarReunion);
        add (txtFechaReunion);
        add (txtNuevaReunion);
        add (txtLugarReunion);
        add (listMisReunion);
        add (btnEditarReunion);
        add (cuadroTxtMaxEstudiantes);
        add (txtMaxEstudiantes);
        add (btnGuardarReunion);
        add (btnEliminarReunion);

        //set component bounds (only needed by Absolute Positioning)
        btnSalirReunion.setBounds (590, 170, 235, 25);
        btnPerfil.setBounds (860, 30, 47, 40);
        txtInfoPersonal.setBounds (720, 30, 130, 34);
        listReunionInscritas.setBounds (590, 85, 235, 80);
        txtReunionInscritas.setBounds (590, 55, 115, 25);
        txtReunionDisponible.setBounds (90, 95, 136, 25);
        listReunionDisponible.setBounds (90, 180, 300, 250);
        cuadroTxtBuscarReunion.setBounds (90, 135, 300, 30);
        btnInscribirReunion.setBounds (90, 445, 300, 25);
        btnCrearReunion.setBounds (740, 295, 115, 25);
        cuadroTxtFechaReunion.setBounds (585, 255, 130, 30);
        cuadroTxtLugarReunion.setBounds (725, 255, 130, 30);
        txtFechaReunion.setBounds (590, 230, 115, 25);
        txtNuevaReunion.setBounds (590, 195, 90, 30);
        txtLugarReunion.setBounds (725, 230, 115, 25);
        listMisReunion.setBounds (585, 335, 270, 65);
        btnEditarReunion.setBounds (585, 415, 270, 25);
        cuadroTxtMaxEstudiantes.setBounds (690, 295, 45, 25);
        txtMaxEstudiantes.setBounds (585, 295, 100, 25);
        btnGuardarReunion.setBounds (585, 475, 270, 25);
        btnEliminarReunion.setBounds (585, 445, 270, 25);

        //Evento salirse de la reunión
        btnSalirReunion.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {              

                // Mostrar ventana emergente con eleccion
                int respuesta = JOptionPane.showConfirmDialog(null, "¿Estás seguro de que quieres salir de la reunión?", "Confirmar", JOptionPane.YES_NO_OPTION);
                
                // Lógica para salirse de la reunión si se presiona "Aceptar"
                if (respuesta == JOptionPane.YES_OPTION) {
                    JOptionPane.showMessageDialog(null, "Saliste de la reunión");
                }
            } 
        });

        btnInscribirReunion.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {              

                // Mostrar ventana emergente con eleccion
                int respuesta = JOptionPane.showConfirmDialog(null, "¿Estás seguro de que te quieres inscribir la reunión?", "Confirmar", JOptionPane.YES_NO_OPTION);
                
                // Lógica para inscribirse   la reunión si se presiona "Aceptar"
                if (respuesta == JOptionPane.YES_OPTION) {
                    JOptionPane.showMessageDialog(null, "Inscripción exitosa");
                }
            } 
        });
        btnPerfil.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = new JFrame ("interfazActualizarInformación");
                frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
                frame.getContentPane().add (new InterfazActualizarInformacion());
                frame.pack();
                frame.setVisible (true);
            }
        });
    }

    public void buscarReunion() {
        //Buscar reunión
    }


    public static void main (String[] args) {
        JFrame frame = new JFrame ("MainInterfaz");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add (new MainInterfaz());
        frame.pack();
        frame.setVisible (true);
    }
}
