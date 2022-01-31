package ufpb.exercicio5.carol;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class SteamPOOGUIV2 extends JFrame{
	
	JLabel linha1, linha2;
	ImageIcon contatImg = new ImageIcon("./imgs/jogos_digitais.jpg");
	
	public SteamPOOGUIV2 () {
		setTitle("Gerenciador de Jogos Steam");
		setSize(600,500);
		setLocation(150,150);
		setResizable(false);
		getContentPane().setBackground(Color.black);
		linha1 = new JLabel("Meu Gerenciador de Jogos", JLabel.CENTER);
		linha1.setForeground(Color.PINK);
		linha1.setFont(new Font("Serif", Font.BOLD, 24));
		linha2 = new JLabel(contatImg, JLabel.CENTER);
		getContentPane().setLayout(new GridLayout(3,1));
		this.add(linha1);
		this.add(linha2);
		}
	
	public static void main (String [] args) {
		JFrame janela = new SteamPOOGUIV2();
		janela.setVisible(true);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
