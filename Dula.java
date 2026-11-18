package calcu;


import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Dula {

	private JFrame frmEduardoHenriqueRodrigues;
	private JTextField JTFResultado;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JButton btnNewButton_4;
	private JButton btnNewButton_5;
	private JButton btnNewButton_6;
	private JButton btnNewButton_7;
	private JButton btnNewButton_8;
	private JButton btnNewButton_9;
	private JButton btnSomar;
	private JButton btnSubtracao;
	private JButton btnMultiplicacao;
	private JButton btnDivisao;
	private JButton btnPotencia;
	private JButton btnIgual;
	private JButton btnNewButton_15;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dula window = new Dula();
					window.frmEduardoHenriqueRodrigues.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Dula() {
		initialize();
	}
	double valor1, valor2;
	String op;

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmEduardoHenriqueRodrigues = new JFrame();
		frmEduardoHenriqueRodrigues.setTitle("Eduardo Henrique Rodrigues da Silva Andrade 0024896");
		frmEduardoHenriqueRodrigues.getContentPane().setBackground(new Color(107, 102, 205));
		frmEduardoHenriqueRodrigues.getContentPane().setLayout(null);
		
		JTFResultado = new JTextField();
		JTFResultado.setFont(new Font("Arial Black", Font.BOLD, 60));
		JTFResultado.setBounds(10, 10, 426, 113);
		frmEduardoHenriqueRodrigues.getContentPane().add(JTFResultado);
		JTFResultado.setColumns(10);
		
		JButton btnNewButton = new JButton("1");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTFResultado.setText(JTFResultado.getText() + "1");
			}
		});
		btnNewButton.setBounds(37, 170, 66, 72);
		frmEduardoHenriqueRodrigues.getContentPane().add(btnNewButton);
		
		btnNewButton_1 = new JButton("2");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTFResultado.setText(JTFResultado.getText() + "2");
			}
		});
		btnNewButton_1.setBounds(126, 170, 66, 72);
		frmEduardoHenriqueRodrigues.getContentPane().add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("3");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTFResultado.setText(JTFResultado.getText() + "3");
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnNewButton_2.setBounds(216, 170, 66, 72);
		frmEduardoHenriqueRodrigues.getContentPane().add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("4");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTFResultado.setText(JTFResultado.getText() + "4");
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnNewButton_3.setBounds(37, 264, 66, 72);
		frmEduardoHenriqueRodrigues.getContentPane().add(btnNewButton_3);
		
		btnNewButton_4 = new JButton("5");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTFResultado.setText(JTFResultado.getText() + "5");
			}
		});
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnNewButton_4.setBounds(126, 264, 66, 72);
		frmEduardoHenriqueRodrigues.getContentPane().add(btnNewButton_4);
		
		btnNewButton_5 = new JButton("6");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTFResultado.setText(JTFResultado.getText() + "6");
			}
		});
		btnNewButton_5.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnNewButton_5.setBounds(216, 264, 66, 72);
		frmEduardoHenriqueRodrigues.getContentPane().add(btnNewButton_5);
		
		btnNewButton_6 = new JButton("7");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTFResultado.setText(JTFResultado.getText() + "7");
			}
		});
		btnNewButton_6.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnNewButton_6.setBounds(37, 360, 66, 72);
		frmEduardoHenriqueRodrigues.getContentPane().add(btnNewButton_6);
		
		btnNewButton_7 = new JButton("8");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTFResultado.setText(JTFResultado.getText() + "8");
			}
		});
		btnNewButton_7.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnNewButton_7.setBounds(126, 360, 66, 72);
		frmEduardoHenriqueRodrigues.getContentPane().add(btnNewButton_7);
		
		btnNewButton_8 = new JButton("9");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTFResultado.setText(JTFResultado.getText() + "9");
			}
		});
		btnNewButton_8.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnNewButton_8.setBounds(216, 360, 66, 72);
		frmEduardoHenriqueRodrigues.getContentPane().add(btnNewButton_8);
		
		btnNewButton_9 = new JButton("0");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTFResultado.setText(JTFResultado.getText() + "0");
			}
		});
		btnNewButton_9.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnNewButton_9.setBounds(126, 456, 66, 72);
		frmEduardoHenriqueRodrigues.getContentPane().add(btnNewButton_9);
		
		btnSomar = new JButton("+");
		btnSomar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!JTFResultado.getText().isEmpty()) {
					valor1 = Double.parseDouble(JTFResultado.getText());
					JTFResultado.setText("");
					op = "soma";
				}
			}
		});
		btnSomar.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnSomar.setBounds(329, 221, 66, 41);
		frmEduardoHenriqueRodrigues.getContentPane().add(btnSomar);
		
		btnSubtracao = new JButton("-");
		btnSubtracao.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnSubtracao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!JTFResultado.getText().isEmpty()) {
					valor1 = Double.parseDouble(JTFResultado.getText());
					JTFResultado.setText("");
					op = "subtracao";
				}
			}
		});
		btnSubtracao.setBounds(329, 280, 66, 41);
		frmEduardoHenriqueRodrigues.getContentPane().add(btnSubtracao);
		
		btnMultiplicacao = new JButton("*");
		btnMultiplicacao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!JTFResultado.getText().isEmpty()) {
					valor1 = Double.parseDouble(JTFResultado.getText());
					JTFResultado.setText("");
					op = "multiplicacao";
				}
			}
		});
		btnMultiplicacao.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnMultiplicacao.setBounds(329, 340, 66, 41);
		frmEduardoHenriqueRodrigues.getContentPane().add(btnMultiplicacao);
		
		btnDivisao = new JButton("/");
		btnDivisao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!JTFResultado.getText().isEmpty()) {
					valor1 = Double.parseDouble(JTFResultado.getText());
					JTFResultado.setText("");
					op = "divisao";
				}
			}
		});
		btnDivisao.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnDivisao.setBounds(329, 391, 66, 41);
		frmEduardoHenriqueRodrigues.getContentPane().add(btnDivisao);

		// POTENCIA: ex. 2 ^ 3 = 8
		btnPotencia = new JButton("^");
		btnPotencia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!JTFResultado.getText().isEmpty()) {
					valor1 = Double.parseDouble(JTFResultado.getText());
					JTFResultado.setText("");
					op = "potencia";
				}
			}
		});
		btnPotencia.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnPotencia.setBounds(37, 456, 66, 72);
		frmEduardoHenriqueRodrigues.getContentPane().add(btnPotencia);
		
		btnIgual = new JButton("=");
		btnIgual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!JTFResultado.getText().isEmpty() && op != null) {
					valor2 = Double.parseDouble(JTFResultado.getText());
					
					if ("soma".equals(op)) {
						JTFResultado.setText(String.valueOf(valor1 + valor2));
					}
					if ("subtracao".equals(op)) {
						JTFResultado.setText(String.valueOf(valor1 - valor2));
					}
					if ("multiplicacao".equals(op)) {
						JTFResultado.setText(String.valueOf(valor1 * valor2));
					}
					if ("divisao".equals(op)) {
						if (valor2 == 0) {
							JTFResultado.setText("Erro");
						} else {
							JTFResultado.setText(String.valueOf(valor1 / valor2));
						}
					}
					if ("potencia".equals(op)) {
						JTFResultado.setText(String.valueOf(Math.pow(valor1, valor2)));
					}
					op = null;
				}
			}
		});
		btnIgual.setFont(new Font("Tahoma", Font.PLAIN, 35));
		btnIgual.setBounds(320, 460, 85, 56);
		frmEduardoHenriqueRodrigues.getContentPane().add(btnIgual);
		
		btnNewButton_15 = new JButton("C");
		btnNewButton_15.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnNewButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTFResultado.setText("");
				valor1 = 0;
				valor2 = 0;
				op = null;
			}
		});
		btnNewButton_15.setBounds(329, 170, 66, 41);
		frmEduardoHenriqueRodrigues.getContentPane().add(btnNewButton_15);
		
		JButton btnVirgula = new JButton(",");
		btnVirgula.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!JTFResultado.getText().contains(".")) {
					JTFResultado.setText(JTFResultado.getText() + ".");
				}
			}
		});
		btnVirgula.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnVirgula.setBounds(216, 456, 66, 72);
		frmEduardoHenriqueRodrigues.getContentPane().add(btnVirgula);
		frmEduardoHenriqueRodrigues.setBackground(Color.DARK_GRAY);
		frmEduardoHenriqueRodrigues.setBounds(100, 100, 460, 589);
		frmEduardoHenriqueRodrigues.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}