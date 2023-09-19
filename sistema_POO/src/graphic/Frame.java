package graphic;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.JPanel;

public class Frame extends JFrame {
	
	public int horasExe;
	
	public Frame() {
		
		getContentPane().setBackground(new Color(240, 255, 240));
		setBounds(100, 100, 700, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Sistema de Control de Especies");
		lblNewLabel.setFont(new Font("Sylfaen", Font.PLAIN, 24));
		lblNewLabel.setBounds(193, 11, 320, 41);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Horas de Corrimiento: " + horasExe);
		lblNewLabel_1.setFont(new Font("Sylfaen", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(358, 311, 213, 41);
		getContentPane().add(lblNewLabel_1);
		
		// ------------------ Botones admins --------------- //
		JButton btnNewButton = new JButton("SINAC");
		btnNewButton.setBackground(new Color(32, 178, 170));
		btnNewButton.setBounds(10, 205, 251, 41);
		btnNewButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Estado ventana2 = new Estado("SINAC");
				ventana2.setVisible(true);
			}
		});
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("MINAE");
		btnNewButton_1.setBackground(new Color(32, 178, 170));
		btnNewButton_1.setBounds(10, 257, 251, 41);
		btnNewButton_1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Estado ventana2 = new Estado("MINAE");
				ventana2.setVisible(true);
				
			}
		});
		getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Manejo Vida Silvestre");
		btnNewButton_2.setBackground(new Color(32, 178, 170));
		btnNewButton_2.setBounds(10, 309, 251, 41);
		btnNewButton_2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Estado ventana2 = new Estado("Sistema Manejo VS");
				ventana2.setVisible(true);
			}
		});
		
		getContentPane().add(btnNewButton_2);
		
		
		
	}
}
