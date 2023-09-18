package graphic;
import sistema_POO.Main;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class Estado extends JFrame {

	private JPanel contentPane;

	public Estado(String nombreAdmin) {
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 700, 400);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 255, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(472, 129, 202, 187);
		contentPane.add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(241, 129, 221, 174);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		// ------------ Hábitats --------------- //
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(new Color(51, 153, 153));
		comboBox.setFont(new Font("Sylfaen", Font.PLAIN, 20));
		comboBox.setBounds(10, 129, 221, 48);
		comboBox.addItem("Zona Montañosa");
		comboBox.addItem("Bosque tropical");
		comboBox.addItem("Manglar");
		comboBox.addItem("Sabana");
		contentPane.add(comboBox);
		
		// --------------- Labels ----------------- //
		JLabel lblNewLabel_1_1_1 = new JLabel(" #");
		lblNewLabel_1_1_1.setBounds(10, 11, 18, 32);
		panel_1.add(lblNewLabel_1_1_1);
		lblNewLabel_1_1_1.setBackground(new Color(255, 255, 255));
		lblNewLabel_1_1_1.setFont(new Font("Sylfaen", Font.PLAIN, 24));
		
		JLabel lblNewLabel = new JLabel("Estado de las Especies:");
		lblNewLabel.setFont(new Font("Sylfaen", Font.PLAIN, 24));
		lblNewLabel.setBounds(10, 11, 234, 48);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Hábitat");
		lblNewLabel_1.setFont(new Font("Sylfaen", Font.PLAIN, 24));
		lblNewLabel_1.setBounds(10, 88, 221, 33);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Población");
		lblNewLabel_1_1.setFont(new Font("Sylfaen", Font.PLAIN, 24));
		lblNewLabel_1_1.setBounds(241, 88, 221, 33);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Problemas");
		lblNewLabel_1_1_2.setFont(new Font("Sylfaen", Font.PLAIN, 24));
		lblNewLabel_1_1_2.setBounds(472, 88, 221, 33);
		contentPane.add(lblNewLabel_1_1_2);
		
		JLabel lblNewLabel_2 = new JLabel(nombreAdmin);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(254, 11, 189, 48);
		contentPane.add(lblNewLabel_2);
		
		// ------------------ Botones --------------------- //
		JButton btnNewButton = new JButton("Tecnologías");
		btnNewButton.setFont(new Font("Sylfaen", Font.PLAIN, 15));
		btnNewButton.setBackground(new Color(0, 204, 204));
		btnNewButton.setBounds(10, 317, 221, 33);
		contentPane.add(btnNewButton);
		
		JButton btnProfesionales = new JButton("Profesionales");
		btnProfesionales.setFont(new Font("Sylfaen", Font.PLAIN, 15));
		btnProfesionales.setBackground(new Color(0, 204, 204));
		btnProfesionales.setBounds(241, 317, 221, 33);
		contentPane.add(btnProfesionales);
		
		JButton btnComunicaciones = new JButton("Comunicaciones");
		btnComunicaciones.setFont(new Font("Sylfaen", Font.PLAIN, 15));
		btnComunicaciones.setBackground(new Color(0, 204, 204));
		btnComunicaciones.setBounds(453, 11, 221, 33);
		contentPane.add(btnComunicaciones);
		
		JButton btnNewButton_1 = new JButton("Acciones");
		btnNewButton_1.setBackground(new Color(255, 182, 193));
		btnNewButton_1.setBounds(472, 327, 202, 23);
		btnNewButton_1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				System.out.println("Acción");
			}
		});
		contentPane.add(btnNewButton_1);
		
	}
}
