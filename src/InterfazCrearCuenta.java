//Generated by GuiGenie - Copyright (c) 2004 Mario Awad.
//Home Page http://guigenie.cjb.net - Check often for new versions!

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
//import javax.swing.event.*;

public class InterfazCrearCuenta extends JPanel {
    private Estudiante usuarioActual;
    private  JButton btnAtrasCC;
    private JButton btnCrearCuenta;
    private JPasswordField pssNuevaContraseña;
    private JPasswordField pssNuevaContraseña2;
    private JTextField cuadroTxtNombresNuevo;
    private JTextField cuadroTxtApellidosNuevo;
    private JTextField cuadroTxtIdEpikNuevo;
    private JTextField cuadroTxtCorreoInstitucionalNuevo;
    private JLabel txtNombres;
    private JLabel txtApellidos;
    private JLabel txtIdEpik;
    private JLabel txtCorreoInstitucional;
    private JLabel txtContraseña;
    private JLabel txtConfirmarContraseña;

    public InterfazCrearCuenta() {
        //construct components
        btnAtrasCC = new JButton ("Atras");
        btnCrearCuenta = new JButton ("Crear cuenta");
        pssNuevaContraseña = new JPasswordField (5);
        pssNuevaContraseña2 = new JPasswordField (5);
        cuadroTxtNombresNuevo = new JTextField (5);
        cuadroTxtApellidosNuevo = new JTextField (5);
        cuadroTxtIdEpikNuevo = new JTextField (5);
        cuadroTxtCorreoInstitucionalNuevo = new JTextField (5);
        txtNombres = new JLabel ("Nombres");
        txtApellidos = new JLabel ("Apellidos");
        txtIdEpik = new JLabel ("Id de Epik");
        txtCorreoInstitucional = new JLabel ("Correo Institucional");
        txtContraseña = new JLabel ("Contraseña");
        txtConfirmarContraseña = new JLabel ("Confirmación contraseña");

        //adjust size and set layout
        setPreferredSize (new Dimension (946, 571));
        setLayout (null);

        //add components
        add(btnAtrasCC);
        add (btnCrearCuenta);
        add (pssNuevaContraseña);
        add (pssNuevaContraseña2);
        add (cuadroTxtNombresNuevo);
        add (cuadroTxtApellidosNuevo);
        add (cuadroTxtIdEpikNuevo);
        add (cuadroTxtCorreoInstitucionalNuevo);
        add (txtNombres);
        add (txtApellidos);
        add (txtIdEpik);
        add (txtCorreoInstitucional);
        add (txtContraseña);
        add (txtConfirmarContraseña);

        //set component bounds (only needed by Absolute Positioning)
        btnAtrasCC.setBounds (10, 10, 75, 25);
        btnCrearCuenta.setBounds (275, 445, 340, 40);
        pssNuevaContraseña.setBounds (170, 300, 200, 30);
        pssNuevaContraseña2.setBounds (545, 300, 200, 30);
        cuadroTxtNombresNuevo.setBounds (170, 100, 200, 30);
        cuadroTxtApellidosNuevo.setBounds (545, 100, 200, 30);
        cuadroTxtIdEpikNuevo.setBounds (170, 200, 200, 30);
        cuadroTxtCorreoInstitucionalNuevo.setBounds (545, 200, 200, 30);
        txtNombres.setBounds (170, 70, 115, 25);
        txtApellidos.setBounds (545, 70, 100, 25);
        txtIdEpik.setBounds (170, 170, 100, 25);
        txtCorreoInstitucional.setBounds (545, 170, 120, 25);
        txtContraseña.setBounds (170, 270, 100, 25);
        txtConfirmarContraseña.setBounds (545, 270, 150, 25);


        //Evento crear cuenta
        btnCrearCuenta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Tomar texto de los cuadros de texto
                String nombresNuevo = cuadroTxtNombresNuevo.getText();
                String apellidosNuevo = cuadroTxtApellidosNuevo.getText();
                String correoNuevo = cuadroTxtCorreoInstitucionalNuevo.getText();
                String idEpikNuevo = cuadroTxtIdEpikNuevo.getText();
                String contrasenaNuevo = new String(pssNuevaContraseña.getPassword());
                String contrasenaConfirmarNuevo = new String(pssNuevaContraseña2.getPassword());
                if(!idEpikNuevo.equals("")){
                    int idEpikNuevoInt = Integer.parseInt(idEpikNuevo);
                    if ((!nombresNuevo.equals(""))&&(!apellidosNuevo.equals(""))&&(!correoNuevo.equals(""))&&(!idEpikNuevo.equals(""))&&(!contrasenaNuevo.equals(""))&&(contrasenaNuevo.equals(contrasenaConfirmarNuevo))){
                    
                    //Crear estudiante
                    Estudiante nuevoEstudiante = new Estudiante(nombresNuevo, apellidosNuevo, correoNuevo, idEpikNuevoInt, contrasenaNuevo, "Estudiante");

                    //Abrir ventana de inicio de sesion
                    JFrame interfazIS = new JFrame ("interfazInicioSesion");
                    //frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
                    interfazIS.getContentPane().add (new InterfazInicioSesion());
                    interfazIS.pack();
                    interfazIS.setVisible (true);
                    ((Window) getRootPane().getParent()).dispose();
                    }else{
                    JOptionPane.showMessageDialog(null, "Información faltante o erroenea");
                }
                }else{
                    JOptionPane.showMessageDialog(null, "Información faltante o erroenea");
                }
                
                

                
            } 
        });
        //Boton atras
        btnAtrasCC.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JFrame interfazIS = new JFrame ("interfazInicioSesion");
                //frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
                interfazIS.getContentPane().add (new InterfazInicioSesion());
                interfazIS.pack();
                interfazIS.setVisible (true);
                ((Window) getRootPane().getParent()).dispose();
            }
        });
    }

    


    public static void main (String[] args) {
        JFrame frame = new JFrame ("InterfazInicioSesion");
        frame.setDefaultCloseOperation (JFrame.DISPOSE_ON_CLOSE);
        frame.getContentPane().add (new InterfazInicioSesion());
        frame.pack();
        frame.setVisible (true);
    } 
}
