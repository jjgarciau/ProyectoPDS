//Generated by GuiGenie - Copyright (c) 2004 Mario Awad.
//Home Page http://guigenie.cjb.net - Check often for new versions!

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class InterfazInicioSesion extends JPanel {
    private JButton btnCrearCuenta;
    private JButton btnIniciarSesion;
    private JTextField ingresoUsuario;
    private JPasswordField ingresoContraseña;

    public InterfazInicioSesion() {
        //construct components
        btnCrearCuenta = new JButton ("Crear cuenta");
        btnIniciarSesion = new JButton ("Inicio sesión");
        ingresoUsuario = new JTextField (5);
        ingresoContraseña = new JPasswordField (5);

        //Prueba Usuario
        Estudiante estudiante = new Estudiante("Juan", "Perez", "prueba@eafit.edu.co", 1000264476, "admin");
        //Fin prueba usuario

        //adjust size and set layout
        setPreferredSize (new Dimension (946, 571));
        setLayout (null);

        //add components
        add (btnCrearCuenta);
        add (btnIniciarSesion);
        add (ingresoUsuario);
        add (ingresoContraseña);

        //set component bounds (only needed by Absolute Positioning)
        btnCrearCuenta.setBounds (275, 335, 340, 40);
        btnIniciarSesion.setBounds (275, 280, 340, 40);
        ingresoUsuario.setBounds (275, 165, 340, 40);
        ingresoContraseña.setBounds (275, 220, 340, 40);


        //Evento iniciar sesion
        btnIniciarSesion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String usuario = ingresoUsuario.getText();
                String contraseña = new String(ingresoContraseña.getPassword());

                // Lógica para iniciar sesión 
                if ((usuario.equals(estudiante.getCorreoInstitucional())||usuario.equals(String.valueOf(estudiante.getIdEpik())))&& contraseña.equals(estudiante.getContraseña())) {
                    JOptionPane.showMessageDialog(null, "Inicio de sesión exitoso");
                    JFrame frame = new JFrame ("interfazCrearCuenta");
                frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
                frame.getContentPane().add (new MainInterfaz());
                frame.pack();
                frame.setVisible (true);
                } else {
                    JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos");
                }
            } 
        });

        //Evento crear cuenta
        btnCrearCuenta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = new JFrame ("interfazCrearCuenta");
                frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
                frame.getContentPane().add (new InterfazCrearCuenta());
                frame.pack();
                frame.setVisible (true);
            } 
        });


    }


    public static void main (String[] args) {
        JFrame frame = new JFrame ("interfazInicioSesion");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add (new InterfazInicioSesion());
        frame.pack();
        frame.setVisible (true);
    }
}
