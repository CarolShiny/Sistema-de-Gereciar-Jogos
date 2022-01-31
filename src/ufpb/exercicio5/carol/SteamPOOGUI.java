package ufpb.exercicio5.carol;

import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class SteamPOOGUI extends JFrame{
	
	public SteamPOOGUI () {
		setTitle("Gerenciador de Jogos Steam");
		setSize(400,400);
		setLocation(150,150);
		setResizable(false);
		getContentPane().setBackground(Color.darkGray);
		}
	
	public static void main (String [] args) {
		JFrame janela = new SteamPOOGUI();
		janela.setVisible(true);
		
	WindowListener fechadorDeJanelaPrincipal = new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				JOptionPane.showMessageDialog(janela, "Vou fechar o programa");
			}		
		};
		//WindowListener fechadorDeJanelaPrincipal = new FechadorDeJanelaPrincipal(janela);
		janela.addWindowListener(fechadorDeJanelaPrincipal);
		}
	

}
