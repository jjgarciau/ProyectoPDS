//Generated by GuiGenie - Copyright (c) 2004 Mario Awad.
//Home Page http://guigenie.cjb.net - Check often for new versions!
import java.awt.*;
import java.awt.event.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import  javax.swing.*;
//import javax.swing.event.*;

public class MainInterfaz extends JPanel {
    private Estudiante usuarioActual;
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
        String[] listMisReunionItems = {};

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

        //Prueba Usuario
        //Estudiante estudiante = new Estudiante("Juan", "Perez", "prueba@eafit.edu.co", 1000264476, "admin", "Estudiante");
        Monitor estudiante = new Monitor("Juan", "Perez", "correo", 1000264476, "admin", "Monitor", "Matematicas");


        //Verificar si el usuario es un monitor para mostrar las opciones de crear reunión
        if(estudiante.getTipoUsuario().equals("Monitor")){
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

            btnCrearReunion.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e){
                  String fechaHoraNuevoReunion = cuadroTxtFechaReunion.getText();
                  String lugarNuevoReunion = cuadroTxtLugarReunion.getText();
                  String maxEstudiantesNuevoReunion = cuadroTxtMaxEstudiantes.getText();
                  if(!maxEstudiantesNuevoReunion.equals("")&&!fechaHoraNuevoReunion.equals("")){
                      try {
                          // Convertir maxEstudiantesNuevoReunion de String a int
                          int maxEstudiantesNuevoReunionInt = Integer.parseInt(maxEstudiantesNuevoReunion);
          
                          // Convertir fechaHoraNuevoReunion de String a Date
                          SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");
                          Date fechaHoraNuevoReunionDate = dateFormat.parse(fechaHoraNuevoReunion);
          
                          // Crear la reunión con los datos convertidos
                          Reunion nuevaReunion = new Reunion(lugarNuevoReunion, fechaHoraNuevoReunionDate, estudiante, maxEstudiantesNuevoReunionInt);
                          DefaultListModel<String> model = new DefaultListModel<>();
                          for (int i = 0; i < listMisReunion.getModel().getSize(); i++) {
                              model.addElement(listMisReunion.getModel().getElementAt(i).toString());
                          }
                          model.addElement("Reu " + nuevaReunion.getLugar() + " " + nuevaReunion.getFechaHora() + " " + nuevaReunion.getMaxEstudiantes());
                          listMisReunion.setModel(model);
          
                          // Aquí puedes agregar la lógica para guardar la reunión en la base de datos o en una lista
          
                          JOptionPane.showMessageDialog(null, "Reunión creada exitosamente");
                      } catch (NumberFormatException ex) {
                          JOptionPane.showMessageDialog(null, "El número máximo de estudiantes debe ser un número entero");
                      } catch (ParseException ex) {
                          JOptionPane.showMessageDialog(null, "La fecha y hora deben tener el formato dd/MM/yyyy HH:mm");
                      }
                  } else {
                      JOptionPane.showMessageDialog(null, "Información faltante o errónea");
                  }           
                }  
              });//Fin Evento btnCrearReunion

            btnEditarReunion.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    //Editar reunión
                    if(listMisReunion.getSelectedIndex() != -1){
                        String fechaHoraNuevoReunion = cuadroTxtFechaReunion.getText();
                        String lugarNuevoReunion = cuadroTxtLugarReunion.getText();
                        String maxEstudiantesNuevoReunion = cuadroTxtMaxEstudiantes.getText();
                        if(!maxEstudiantesNuevoReunion.equals("")&&!fechaHoraNuevoReunion.equals("")){
                            try {
                                // Convertir maxEstudiantesNuevoReunion de String a int
                                int maxEstudiantesNuevoReunionInt = Integer.parseInt(maxEstudiantesNuevoReunion);
                
                                // Convertir fechaHoraNuevoReunion de String a Date
                                SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");
                                Date fechaHoraNuevoReunionDate = dateFormat.parse(fechaHoraNuevoReunion);
                
                                // Crear la reunión con los datos convertidos
                                Reunion nuevaReunion = new Reunion(lugarNuevoReunion, fechaHoraNuevoReunionDate, estudiante, maxEstudiantesNuevoReunionInt);
                                DefaultListModel<String> model = new DefaultListModel<>();
                                for (int i = 0; i < listMisReunion.getModel().getSize(); i++) {
                                    model.addElement(listMisReunion.getModel().getElementAt(i).toString());
                                }
                                model.setElementAt("Reu " + nuevaReunion.getLugar() + " " + nuevaReunion.getFechaHora() + " " + nuevaReunion.getMaxEstudiantes(), listMisReunion.getSelectedIndex());
                                listMisReunion.setModel(model);
                
                                // Aquí puedes agregar la lógica para guardar la reunión en la base de datos o en una lista
                
                                JOptionPane.showMessageDialog(null, "Reunión editada exitosamente");
                            } catch (NumberFormatException ex) {
                                JOptionPane.showMessageDialog(null, "El número máximo de estudiantes debe ser un número entero");
                            } catch (ParseException ex) {
                                JOptionPane.showMessageDialog(null, "La fecha y hora deben tener el formato dd/MM/yyyy HH:mm");
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Información faltante o errónea");
                        }           
                    } else {
                        JOptionPane.showMessageDialog(null, "Selecciona una reunión para editar");
                    }
                }
            });
            btnEliminarReunion.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e){
                    //Eliminar reunión
                    if(listMisReunion.getSelectedIndex() != -1){
                        DefaultListModel<String> model = new DefaultListModel<>();
                        // Mostrar ventana emergente con eleccion
                        int respuesta = JOptionPane.showConfirmDialog(null, "¿Estás seguro de que quieres salir de la reunión?", "Confirmar", JOptionPane.YES_NO_OPTION);
                
                        // Lógica para salirse de la reunión si se presiona "Aceptar"
                        if (respuesta == JOptionPane.YES_OPTION) {
                            for (int i = 0; i < listMisReunion.getModel().getSize(); i++) {
                                if(i != listMisReunion.getSelectedIndex()){
                                    model.addElement(listMisReunion.getModel().getElementAt(i).toString());
                                }
                            }
                            listMisReunion.setModel(model);
                            JOptionPane.showMessageDialog(null, "Reunión eliminada exitosamente");
                        }      
                    } else {
                        JOptionPane.showMessageDialog(null, "Selecciona una reunión para eliminar");
                    }
                }
            });
              
        }//Fin if

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
                ((Window) getRootPane().getParent()).dispose();
            }
        });

        /* btnCrearReunion.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e){
            String fechaHoraNuevoReunion = cuadroTxtFechaReunion.getText();
            String lugarNuevoReunion = cuadroTxtLugarReunion.getText();
            String maxEstudiantesNuevoReunion = cuadroTxtMaxEstudiantes.getText();
            if(!maxEstudiantesNuevoReunion.equals("")&&!fechaHoraNuevoReunion.equals("")){
                try {
                    // Convertir maxEstudiantesNuevoReunion de String a int
                    int maxEstudiantesNuevoReunionInt = Integer.parseInt(maxEstudiantesNuevoReunion);
    
                    // Convertir fechaHoraNuevoReunion de String a Date
                    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");
                    Date fechaHoraNuevoReunionDate = dateFormat.parse(fechaHoraNuevoReunion);
    
                    // Crear la reunión con los datos convertidos
                    Reunion nuevaReunion = new Reunion(lugarNuevoReunion, fechaHoraNuevoReunionDate, monitor, maxEstudiantesNuevoReunionInt);
    
                    // Aquí puedes agregar la lógica para guardar la reunión en la base de datos o en una lista
    
                    JOptionPane.showMessageDialog(null, "Reunión creada exitosamente");
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "El número máximo de estudiantes debe ser un número entero");
                } catch (ParseException ex) {
                    JOptionPane.showMessageDialog(null, "La fecha y hora deben tener el formato dd/MM/yyyy HH:mm");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Información faltante o errónea");
            }           
          }  
        }); */
    }

    public void buscarReunion() {
        //Buscar reunión
    }
    /* public boolean verificarTipoUsuario(Estudiante estudiante){
        if(estudiante.getTipoUsuario().equals("Estudiante")){
            return true;
        }
        return false;

    } */


    public static void main (String[] args) {
        JFrame frame = new JFrame ("MainInterfaz");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add (new MainInterfaz());
        frame.pack();
        frame.setVisible (true);
    }
}
