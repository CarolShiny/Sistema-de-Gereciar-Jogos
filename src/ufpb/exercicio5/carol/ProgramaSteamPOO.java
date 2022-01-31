package ufpb.exercicio5.carol;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

public class ProgramaSteamPOO {
	public static void main (String [] args) {
		JFrame janela = new SteamPOOGUI();
		janela.setVisible(true);
		
		WindowListener fechadorDeJanelaPrincipal = new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}		
		};
		janela.addWindowListener(fechadorDeJanelaPrincipal);
		}
}
