package View;

import java.awt.Container;
import java.awt.Font;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Calculadora extends JFrame{
	
	

	JTextField txtVisor = new JTextField();
	
	JButton btnMC = new JButton("MC");
	JButton btnMR = new JButton("MR");
	JButton btnMS = new JButton("MS");
	JButton btnMais = new JButton("M+");
	JButton btnMenos = new JButton("M-");
	JButton btnSeta = new JButton("<--");
	JButton btnCe = new JButton("CE");
	JButton btnC = new JButton("C");
	JButton btnMaiseMenos = new JButton("+-");
	JButton btnRaiz = new JButton("V");
	JButton btn7 = new JButton("7");
	JButton btn8 = new JButton("8");
	JButton btn9 = new JButton("9");
	JButton btnBarra = new JButton("/");
	JButton btnPorcetagem = new JButton("%");
	JButton btn4 = new JButton("4");
	JButton btn5 = new JButton("5");
	JButton btn6 = new JButton("6");
	JButton btnMultiplica = new JButton("*");
	JButton btn1barrax = new JButton("1/x");
	JButton btn1 = new JButton("1");
	JButton btn2 = new JButton("2");
	JButton btn3 = new JButton("3");
	JButton btnMenoos = new JButton("-");
	JButton btnIgual = new JButton("=");
	JButton btn0 = new JButton("0");
	JButton btnVirgula = new JButton(",");
	JButton btnMaais = new JButton("+");
	
	
	
	public Calculadora() {
		super("Calculadora");
		
		Container paine = this.getContentPane();
		paine.setLayout(null);
		
		txtVisor.setBounds(20, 30, 188, 50);
		paine.add(txtVisor);
		
		btnMC.setBounds(20, 85 , 34, 27);
		btnMC.setFont( new Font( "Arial", Font.PLAIN, 12 ) );
		btnMC.setMargin(new Insets(1,1,1,1));
		paine.add(btnMC);
	
		
		btnMR.setBounds(58, 85 , 34, 27);
		btnMR.setFont(new Font("Arial" ,Font.PLAIN, 12));
		btnMR.setMargin(new Insets(1,1,1,1));
		paine.add(btnMR);
		
		
		btnMS.setBounds(96, 85, 34, 27);
		btnMS.setFont(new Font("Arial" ,Font.PLAIN, 12));
		btnMS.setMargin(new Insets(1,1,1,1));
		paine.add(btnMS);
		
		btnMais.setBounds(134, 85 , 34, 27);
		btnMais.setFont(new Font("Arial" ,Font.PLAIN, 12));
		btnMais.setMargin(new Insets(1,1,1,1));
		paine.add(btnMais);
		
		btnMenos.setBounds(172, 85 , 34, 27);
		btnMenos.setFont(new Font("Arial" ,Font.PLAIN, 12));
		btnMenos.setMargin(new Insets(1,1,1,1));
		paine.add(btnMenos);
		
		btnSeta.setBounds(20, 116 , 34, 27);
		btnSeta.setFont(new Font("Arial" ,Font.PLAIN, 12));
		btnSeta.setMargin(new Insets(1,1,1,1));
		paine.add(btnSeta);
		
		btnCe.setBounds(58, 116 , 34, 27);
		btnCe.setFont(new Font("Arial" ,Font.PLAIN, 12));
		btnCe.setMargin(new Insets(1,1,1,1));
		paine.add(btnCe);
		
		btnC.setBounds(96, 116 , 34, 27);
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtVisor.setText("0");
			}
		});
		btnC.setFont(new Font("Arial" ,Font.PLAIN, 12));
		btnC.setMargin(new Insets(1,1,1,1));
		paine.add(btnC);
		
		btnMaiseMenos.setBounds(134, 116 , 34, 27);
		btnMaiseMenos.setFont(new Font("Arial" ,Font.PLAIN, 7));
		btnMR.setMargin(new Insets(1,1,1,1));
		paine.add(btnMaiseMenos);
		
		btnRaiz.setBounds(172, 116 , 34, 27);
		btnRaiz.setFont(new Font("Arial" ,Font.PLAIN, 12));
		btnRaiz.setMargin(new Insets(1,1,1,1));
		paine.add(btnRaiz);
		
		btn7.setBounds(20, 149 , 34, 27);
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				//System.out.println("7");
				if(txtVisor.getText().equals("0")) {
					 txtVisor.setText(txtVisor.getText() + "7");
				}else {
					txtVisor.setText("7");
				}
				
				
			}
		});
	
		btn7.setFont(new Font("Arial" ,Font.PLAIN, 12));
		btn7.setMargin(new Insets(1,1,1,1));
		paine.add(btn7);
		
		
		btn8.setBounds(58, 149 , 34, 27);
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				//System.out.println("7");
				if(txtVisor.getText().equals("0")) {
					 txtVisor.setText(txtVisor.getText() + "8");
				}else {
					txtVisor.setText("8");
				}
				
				
			}
		});
		btn8.setFont(new Font("Arial" ,Font.PLAIN, 12));
		btn8.setMargin(new Insets(1,1,1,1));
		paine.add(btn8);
		
		btn9.setBounds(96, 149 , 34, 27);
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				//System.out.println("7");
				if(txtVisor.getText().equals("9")) {
					 txtVisor.setText(txtVisor.getText() + "9");
				}else {
					txtVisor.setText("7");
				}
				
				
			}
		});
		btn9.setFont(new Font("Arial" ,Font.PLAIN, 12));
		btn9.setMargin(new Insets(1,1,1,1));
		paine.add(btn9);
		
		btnBarra.setBounds(134, 149 , 34, 27);
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				//System.out.println("7");
				if(txtVisor.getText().equals("0")) {
					 txtVisor.setText(txtVisor.getText() + "/");
				}else {
					txtVisor.setText("7");
				}
				
				
			}
		});
		btnBarra.setFont(new Font("Arial" ,Font.PLAIN, 12));
		btnBarra.setMargin(new Insets(1,1,1,1));
		paine.add(btnBarra);
		
		btnPorcetagem.setBounds(172, 149 , 34, 27);
		btnPorcetagem.setFont(new Font("Arial" ,Font.PLAIN, 12));
		btnPorcetagem.setMargin(new Insets(1,1,1,1));
		paine.add(btnPorcetagem);
		
		btn4.setBounds(20, 182 , 34, 27);
		btn4.setFont(new Font("Arial" ,Font.PLAIN, 12));
		btn4.setMargin(new Insets(1,1,1,1));
		paine.add(btn4);
		
		btn5.setBounds(58, 182 , 34, 27);
		btn5.setFont(new Font("Arial" ,Font.PLAIN, 12));
		btn5.setMargin(new Insets(1,1,1,1));
		paine.add(btn5);
		
		btn6.setBounds(96, 182 , 34, 27);
		btn6.setFont(new Font("Arial" ,Font.PLAIN, 12));
		btn6.setMargin(new Insets(1,1,1,1));
		paine.add(btn6);
		
		btnMultiplica.setBounds(134, 182 , 34, 27);
		btnMultiplica.setFont(new Font("Arial" ,Font.PLAIN, 12));
		btnMultiplica.setMargin(new Insets(1,1,1,1));
		paine.add(btnMultiplica);
		
		btn1barrax.setBounds(172, 182 , 34, 27);
		btn1barrax.setFont(new Font("Arial" ,Font.PLAIN, 12));
		btn1barrax.setMargin(new Insets(1,1,1,1));
		paine.add(btn1barrax);
		
		btn1.setBounds(20, 215 , 34, 27);
		btn1.setFont(new Font("Arial" ,Font.PLAIN, 12));
		btn1.setMargin(new Insets(1,1,1,1));
		paine.add(btn1);
		
		btn2.setBounds(58, 215 , 34, 27);
		btn2.setFont(new Font("Arial" ,Font.PLAIN, 12));
		btn2.setMargin(new Insets(1,1,1,1));
		paine.add(btn2);
		
		btn3.setBounds(96, 215 , 34, 27);
		btn3.setFont(new Font("Arial" ,Font.PLAIN, 12));
		btn3.setMargin(new Insets(1,1,1,1));
		paine.add(btn3);
		
		btnMenoos.setBounds(134, 215 , 34, 27);
		btnMenoos.setFont(new Font("Arial" ,Font.PLAIN, 12));
		btnMenoos.setMargin(new Insets(1,1,1,1));
		paine.add(btnMenoos);
		
		btnIgual.setBounds(172, 215 , 34, 60);
		btnIgual.setFont(new Font("Arial" ,Font.PLAIN, 12));
		btnIgual.setMargin(new Insets(1,1,1,1));
		paine.add(btnIgual);
		
		btn0.setBounds(20, 248 , 68, 27);
		paine.add(btn0);
		
		btnVirgula.setBounds(96, 248 , 34, 27);
		btnVirgula.setFont(new Font("Arial" ,Font.PLAIN, 12));
		btnVirgula.setMargin(new Insets(1,1,1,1));
		paine.add(btnVirgula);
		
		btnMaais.setBounds(134,248,34,27);
		btnMaais.setFont(new Font("Arial" ,Font.PLAIN, 12));
		btnMaais.setMargin(new Insets(1,1,1,1));
		paine.add(btnMaais);
		
	
		
		
		
		this.setSize(228,322);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		
		
		
	}
	public static void main(String args[]) {
		Calculadora calc = new Calculadora();	

	}

}
