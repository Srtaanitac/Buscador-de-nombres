package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTabbedPane;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.Rectangle;
import javax.swing.border.TitledBorder;
import javax.swing.JComboBox;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Dimension;
import javax.swing.SwingConstants;

public class UI extends JFrame {

	private JPanel contentPane;
	private JTextField textField_2;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UI frame = new UI();
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
	public UI() {
		setBackground(new Color(199, 21, 133));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 479, 373);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 105, 180));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBorder(null);
		tabbedPane.setBackground(new Color(135, 206, 250));
		contentPane.add(tabbedPane, "name_2335970024516702");
		
		JPanel alta = new JPanel();
		alta.setPreferredSize(new Dimension(70, 70));
		alta.setBackground(new Color(176, 224, 230));
		tabbedPane.addTab("ALTA", null, alta, null);
		alta.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNombre = new JLabel("NOMBRE");
		lblNombre.setPreferredSize(new Dimension(42, 150));
		lblNombre.setForeground(new Color(0, 0, 128));
		lblNombre.setHorizontalAlignment(SwingConstants.CENTER);
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 25));
		alta.add(lblNombre, BorderLayout.NORTH);
		
		JPanel panel_3 = new JPanel();
		alta.add(panel_3, BorderLayout.CENTER);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		textField = new JTextField();
		textField.setBackground(new Color(224, 255, 255));
		textField.setPreferredSize(new Dimension(6, 30));
		panel_3.add(textField, BorderLayout.NORTH);
		textField.setColumns(10);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(176, 224, 230));
		panel_3.add(panel_4, BorderLayout.CENTER);
		panel_4.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_1 = new JLabel("DIRECCI\u00D3N");
		lblNewLabel_1.setForeground(new Color(0, 0, 128));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setPreferredSize(new Dimension(20, 70));
		lblNombre.setPreferredSize(new Dimension(42, 70));
		lblNombre.setForeground(new Color(0, 0, 128));
		lblNombre.setHorizontalAlignment(SwingConstants.CENTER);
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 25));
		panel_4.add(lblNewLabel_1, BorderLayout.NORTH);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(176, 224, 230));
		panel_4.add(panel_5, BorderLayout.CENTER);
		panel_5.setLayout(new BorderLayout(0, 0));
		
		textField_1 = new JTextField();
		textField_1.setBackground(new Color(224, 255, 255));
		textField_1.setPreferredSize(new Dimension(6, 30));
		panel_5.add(textField_1, BorderLayout.NORTH);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("INTRODUCIR");
		btnNewButton.setPreferredSize(new Dimension(97, 40));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setForeground(new Color(25, 25, 112));
		btnNewButton.setBackground(new Color(135, 206, 250));
		panel_5.add(btnNewButton, BorderLayout.SOUTH);
		
		JPanel Buscar = new JPanel();
		Buscar.setBackground(new Color(176, 224, 230));
		tabbedPane.addTab("BUSCAR", null, Buscar, null);
		Buscar.setLayout(new BorderLayout(0, 0));
		
		JPanel BuscaNombre_1 = new JPanel();
		BuscaNombre_1.setPreferredSize(new Dimension(70, 70));
		BuscaNombre_1.setBorder(null);
		BuscaNombre_1.setBackground(new Color(176, 224, 230));
		Buscar.add(BuscaNombre_1, BorderLayout.NORTH);
		
		JLabel BuscaNombre = new JLabel("Busca tu Nombre:");
		BuscaNombre.setBackground(new Color(176, 224, 230));
		BuscaNombre.setPreferredSize(new Dimension(180, 46));
		BuscaNombre.setForeground(new Color(25, 25, 112));
		BuscaNombre.setFont(new Font("Tahoma", Font.BOLD, 20));
		BuscaNombre_1.add(BuscaNombre);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(176, 224, 230));
		Buscar.add(panel, BorderLayout.CENTER);
		panel.setLayout(new BorderLayout(0, 0));
		
		JComboBox comboBox = new JComboBox();
		comboBox.setForeground(new Color(218, 112, 214));
		comboBox.setBackground(new Color(224, 255, 255));
		panel.add(comboBox, BorderLayout.NORTH);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(176, 224, 230));
		panel.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("DIRECCI\u00D3N");
		lblNewLabel.setForeground(new Color(25, 25, 112));
		lblNewLabel.setPreferredSize(new Dimension(57, 90));
		lblNewLabel.setBackground(new Color(224, 255, 255));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 21));
		panel_1.add(lblNewLabel, BorderLayout.NORTH);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(null);
		panel_2.setBackground(new Color(176, 224, 230));
		panel_1.add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		textField_2 = new JTextField();
		textField_2.setPreferredSize(new Dimension(6, 30));
		textField_2.setBackground(new Color(224, 255, 255));
		textField_2.setEditable(false);
		panel_2.add(textField_2, BorderLayout.NORTH);
		textField_2.setColumns(10);
	}
}
