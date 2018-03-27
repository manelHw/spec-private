package ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLayeredPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import dev.Confiturerie;
public class mainWindow extends JFrame {

	private JPanel contentPane;
	private JPanel nombreValve;
	private JLabel lblNombreValve;
	private JTextField textFieldNombreValve;
	private JPanel panelBocaux;
	private JLabel labelNomreBocaux;
	private JTextField textFieldNombreBocaux;
	private JPanel panelEtiqueteuse;
	private JLabel labelNombreEtiqueteuse;
	private JTextField textFieldEtiqueteuse;
	private JButton btnExécution;
	public JTextArea textAreaLog;
	private Confiturerie confiturerie;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mainWindow frame = new mainWindow();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public mainWindow() {
		setTitle("Confiturerie");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		nombreValve = new JPanel();
		nombreValve.setBounds(5, 48, 424, 30);
		contentPane.add(nombreValve);
		nombreValve.setLayout(null);
		
		lblNombreValve = new JLabel("Nombre de valves");
		lblNombreValve.setBounds(30, 8, 179, 14);
		nombreValve.add(lblNombreValve);
		
		textFieldNombreValve = new JTextField();
		textFieldNombreValve.setBounds(298, 5, 86, 20);
		textFieldNombreValve.setColumns(10);
		nombreValve.add(textFieldNombreValve);
		
		panelEtiqueteuse = new JPanel();
		panelEtiqueteuse.setBounds(5, 89, 424, 30);
		contentPane.add(panelEtiqueteuse);
		panelEtiqueteuse.setLayout(null);
		
		labelNombreEtiqueteuse = new JLabel("Nombre d'\u00E9tiqueteuses");
		labelNombreEtiqueteuse.setBounds(34, 8, 175, 14);
		panelEtiqueteuse.add(labelNombreEtiqueteuse);
		
		textFieldEtiqueteuse = new JTextField();
		textFieldEtiqueteuse.setColumns(10);
		textFieldEtiqueteuse.setBounds(296, 5, 86, 20);
		panelEtiqueteuse.add(textFieldEtiqueteuse);
		
		btnExécution = new JButton("Commencer l'ex\u00E9cution");
		btnExécution.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Integer nb=Integer.valueOf(textFieldNombreBocaux.getText());
				Integer nv=Integer.valueOf(textFieldNombreValve.getText());
				Integer ne=Integer.valueOf(textFieldEtiqueteuse.getText());


				Confiturerie confiturerie=new Confiturerie(nb,nv,ne);
				textAreaLog.setText("nombre de bocaux " +textFieldNombreBocaux.getText() +"\n"+"nombre de valves "+textFieldNombreValve.getText() +"\n"+ "nombre d'étiqueteuses "+textFieldEtiqueteuse.getText());
				confiturerie.start();			}
		});
		btnExécution.setBounds(116, 130, 171, 23);
		contentPane.add(btnExécution);
		
		textAreaLog = new JTextArea();
		textAreaLog.setBounds(5, 164, 424, 86);
		contentPane.add(textAreaLog);
		
		panelBocaux = new JPanel();
		panelBocaux.setBounds(5, 11, 424, 30);
		contentPane.add(panelBocaux);
		panelBocaux.setLayout(null);
		
		labelNomreBocaux = new JLabel("Nombre de bocaux");
		labelNomreBocaux.setBounds(33, 8, 176, 14);
		panelBocaux.add(labelNomreBocaux);
		
		textFieldNombreBocaux = new JTextField();
		textFieldNombreBocaux.setColumns(10);
		textFieldNombreBocaux.setBounds(297, 5, 86, 20);
		panelBocaux.add(textFieldNombreBocaux);
	}
}
