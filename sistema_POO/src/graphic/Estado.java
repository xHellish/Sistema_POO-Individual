package graphic;

import sistema_POO.Admin;
import sistema_POO.Main;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class Estado extends JFrame {
	
	TecnoFrame tecnologies = new TecnoFrame();
	
	// Paneles y labels
    private JPanel panelPrincipal;
    private JLabel labelPoblacion1;
    private JComboBox<String> comboBoxHabitat;
    private JLabel labelNumero1;
    private JLabel labelNumero2;
    private JLabel labelNumero3;
    private JLabel labelNumero4;
    private JLabel labelNumero5;
    private JLabel labelHorasExe;
    
    int contadorHorasEx = 0; 
    
    
    // Poblaciones de cada especie.
    String seleccion;
    int pobla1;
    int pobla2;
    int pobla3;
    int pobla4;
    int pobla5;
    
    public Estado(Admin AdminActual) {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 700, 400);
        panelPrincipal = new JPanel();
        panelPrincipal.setBackground(new Color(204, 255, 204));
        panelPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(panelPrincipal);
        panelPrincipal.setLayout(null);

        JPanel panelPoblacion = new JPanel();
        panelPoblacion.setBounds(472, 129, 202, 187);
        panelPrincipal.add(panelPoblacion);

        JPanel panelNumeros = new JPanel();
        panelNumeros.setBounds(241, 129, 221, 174);
        panelPrincipal.add(panelNumeros);
        panelNumeros.setLayout(null);

        // ComboBox para seleccionar el hábitat
        comboBoxHabitat = new JComboBox<>();
        comboBoxHabitat.setBackground(new Color(51, 153, 153));
        comboBoxHabitat.setFont(new Font("Sylfaen", Font.PLAIN, 20));
        comboBoxHabitat.setBounds(10, 129, 221, 48);
        comboBoxHabitat.addItem("Zona Montañosa");
        comboBoxHabitat.addItem("Bosque tropical");
        comboBoxHabitat.addItem("Manglar");
        comboBoxHabitat.addItem("Costas y playas");
        panelPrincipal.add(comboBoxHabitat);

        // Etiquetas para números
        labelNumero1 = new JLabel(" #1");
        labelNumero1.setBounds(10, 11, 201, 32);
        labelNumero1.setBackground(new Color(255, 255, 255));
        labelNumero1.setFont(new Font("Sylfaen", Font.PLAIN, 20));
        panelNumeros.add(labelNumero1);

        labelNumero2 = new JLabel(" #2");
        labelNumero2.setFont(new Font("Sylfaen", Font.PLAIN, 20));
        labelNumero2.setBackground(Color.WHITE);
        labelNumero2.setBounds(10, 42, 201, 32);
        panelNumeros.add(labelNumero2);

        labelNumero3 = new JLabel(" #3");
        labelNumero3.setFont(new Font("Sylfaen", Font.PLAIN, 20));
        labelNumero3.setBackground(Color.WHITE);
        labelNumero3.setBounds(10, 75, 201, 32);
        panelNumeros.add(labelNumero3);

        labelNumero4 = new JLabel(" #4");
        labelNumero4.setFont(new Font("Sylfaen", Font.PLAIN, 20));
        labelNumero4.setBackground(Color.WHITE);
        labelNumero4.setBounds(10, 108, 201, 32);
        panelNumeros.add(labelNumero4);

        labelNumero5 = new JLabel(" #5");
        labelNumero5.setFont(new Font("Sylfaen", Font.PLAIN, 20));
        labelNumero5.setBackground(Color.WHITE);
        labelNumero5.setBounds(10, 141, 201, 32);
        panelNumeros.add(labelNumero5);
        
        // Inicialización.
        labelNumero1.setText("Carpintero");
        labelNumero2.setText("Quetsal");
        labelNumero3.setText("Tucán");
        labelNumero4.setText("Rana");
        labelNumero5.setText("Serpiente");
        
        // Otras etiquetas
        JLabel labelTitulo = new JLabel("Estado de las Especies:");
        labelTitulo.setFont(new Font("Sylfaen", Font.PLAIN, 24));
        labelTitulo.setBounds(10, 11, 234, 48);
        panelPrincipal.add(labelTitulo);

        JLabel labelHabitat = new JLabel("Hábitat");
        labelHabitat.setFont(new Font("Sylfaen", Font.PLAIN, 24));
        labelHabitat.setBounds(10, 88, 221, 33);
        panelPrincipal.add(labelHabitat);

        JLabel labelPoblacion = new JLabel("Población");
        labelPoblacion.setFont(new Font("Sylfaen", Font.PLAIN, 24));
        labelPoblacion.setBounds(241, 88, 221, 33);
        panelPrincipal.add(labelPoblacion);

        JLabel labelProblemas = new JLabel("Problemas");
        labelProblemas.setFont(new Font("Sylfaen", Font.PLAIN, 24));
        labelProblemas.setBounds(472, 88, 221, 33);
        panelPrincipal.add(labelProblemas);
        
        JLabel labelNombreAdmin = new JLabel(AdminActual.nombre);
        labelNombreAdmin.setFont(new Font("Tahoma", Font.PLAIN, 20));
        labelNombreAdmin.setBounds(254, 11, 189, 48);
        panelPrincipal.add(labelNombreAdmin);

        // Botones
        JButton botonTecnologias = new JButton("Tecnologías");
        botonTecnologias.setFont(new Font("Sylfaen", Font.PLAIN, 15));
        botonTecnologias.setBackground(new Color(0, 204, 204));
        botonTecnologias.setBounds(10, 317, 221, 33);
        panelPrincipal.add(botonTecnologias);

        JButton botonProfesionales = new JButton("Profesionales");
        botonProfesionales.setFont(new Font("Sylfaen", Font.PLAIN, 15));
        botonProfesionales.setBackground(new Color(0, 204, 204));
        botonProfesionales.setBounds(241, 317, 221, 33);
        panelPrincipal.add(botonProfesionales);

        JButton botonComunicaciones = new JButton("Comunicaciones");
        botonComunicaciones.setFont(new Font("Sylfaen", Font.PLAIN, 15));
        botonComunicaciones.setBackground(new Color(0, 204, 204));
        botonComunicaciones.setBounds(453, 11, 221, 33);
        panelPrincipal.add(botonComunicaciones);

        JButton botonAcciones = new JButton("Acciones");
        botonAcciones.setBackground(new Color(255, 182, 193));
        botonAcciones.setBounds(472, 327, 202, 23);
        botonAcciones.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Acción");
                tecnologies.setVisible(true);
            }
        });
        panelPrincipal.add(botonAcciones);
        labelHorasExe = new JLabel("Horas de ejecución: ");
        labelHorasExe.setFont(new Font("Sylfaen", Font.PLAIN, 18));
        labelHorasExe.setBounds(10, 31, 234, 48);
        labelHorasExe.setText("Horas de ejecución: 0");
        panelPrincipal.add(labelHorasExe);

        // ComboBox ActionListener
        comboBoxHabitat.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                seleccion = comboBoxHabitat.getSelectedItem().toString();

                if ("Zona Montañosa".equals(seleccion)) {
                    labelNumero1.setText("Carpintero");
                    labelNumero2.setText("Quetsal");
                    labelNumero3.setText("Tucán");
                    labelNumero4.setText("Rana");
                    labelNumero5.setText("Serpiente");

                } else if ("Bosque tropical".equals(seleccion)) {
                    labelNumero1.setText("Tucán");
                    labelNumero2.setText("Quetsal");
                    labelNumero3.setText("Lagarto");
                    labelNumero4.setText("Rana");
                    labelNumero5.setText("Orquídea");

                } else if ("Manglar".equals(seleccion)) {
                    labelNumero1.setText("Cocodrilo");
                    labelNumero2.setText("Iguana");
                    labelNumero3.setText("Mapache");
                    labelNumero4.setText("Mono");
                    labelNumero5.setText("Cangrejo");

                } else if ("Costas y playas".equals(seleccion)) {
                    labelNumero1.setText("Tortuga");
                    labelNumero2.setText("Gaviota");
                    labelNumero3.setText("Cocodrilo");
                    labelNumero4.setText("Palmera");
                    labelNumero5.setText("Molusco");
                }
            }
        });
    }

    // Métodos
    public void acciones() {
    	tecnologies.setVisible(true);
    }
    
    public void timerExe() {
    	// ------------------- Marcador de tiempo cada 2 segundos (ticks) -------------- //
        
        Timer timer = new Timer();
        TimerTask tarea = new TimerTask() {
            @Override
            public void run() {
                contadorHorasEx++; 
                labelHorasExe.setText("Horas de ejecución: " + contadorHorasEx);
            }
        };
        
        timer.schedule(tarea, 1000, 1000); 
    }
}

